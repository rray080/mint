package com.gtids.mint.Controller;

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
		model.addAttribute("login", new User());
		return "login";
	}

	@RequestMapping(value = "/login")
	public String test(@ModelAttribute("user") User user) {
		user = userDao.checkLogin(user);
		if (user.getRoleId() == 1)
			return "test";
		else if (user.getRoleId() == 2)
			return "";
		else
			return "";
	}
}
