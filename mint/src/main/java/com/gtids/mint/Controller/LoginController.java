package com.gtids.mint.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gtids.mint.MintApplication;
import com.gtids.mint.dao.UserDao;
import com.gtids.mint.model.User;

/**
 * @author rakesh Date : 27-Jul-2019
 */
//@RestController
//@RequestMapping(value = MintApplication.BASE_URI+"/login")
@Controller
@SessionAttributes(names = "USERAUTH")
public class LoginController {

	@Autowired
	UserDao userDao;

	@RequestMapping(value = "/")
	public String viewHomePage(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	@RequestMapping(value = "/login")
	public String loginCheck(@ModelAttribute("user") User user, HttpSession session, Model model) {
		user = userDao.checkLogin(user);
		if (user.getUserId() != 0) {
			session.setAttribute("USERAUTH", user);
			if (user.getRoleId() == 1)
				return "admin";
			else if (user.getRoleId() == 2)
				return "employee";
			else
				return "manager";
		}else {
			model.addAttribute("loginError", "UserName or password is invalid");
			return "login";
		}
	}
	
	@RequestMapping(value="/logout")
	public String logout(Model model, HttpServletRequest req) {
		req.getSession().invalidate();
		return "redirect:/";
	}
}
