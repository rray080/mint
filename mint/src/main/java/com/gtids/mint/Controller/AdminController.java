/**
 * 
 */
package com.gtids.mint.Controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gtids.mint.dao.DepartmentDao;
import com.gtids.mint.dao.EmployeeDao;
import com.gtids.mint.model.Department;
import com.gtids.mint.model.Employee;
import com.gtids.mint.model.User;

/**
 * @author {Rakesh K Ray}
 * @create Date : 03-Aug-2019 8:06:09 pm
 * 
 *         contain all admin job. Add department, add employee, search employee,
 *         fetch all employee, fetch all department
 */
@Controller
public class AdminController {

	@Autowired
	DepartmentDao deptDao;

	@Autowired
	EmployeeDao empDao;

	/**
	 * check for session validation. true if session exist else false
	 * 
	 * @param session
	 * @return
	 */
	private String checkAdminSession(User user) {

		if (user == null)
			return "login";
		else if (user.getRoleId() == 1)
			return "admin";
		else if (user.getRoleId() == 2)
			return "employee";
		else if (user.getRoleId() == 3)
			return "manager";
		return "login";
	}

	/**
	 * @param model
	 * @param req
	 * @return forward page to new department page
	 */
	@RequestMapping("/newDept")
	public String newDept(Model model, HttpServletRequest req) {
		User user = (User) req.getSession().getAttribute("USERAUTH");
		String type = checkAdminSession(user);
		if (type.equals("admin")) {
			model.addAttribute("dept", new Department());
			return "admNewDept";
		} else {
			model.addAttribute("error", "You are not autorised");
			model.addAttribute("user", new User());
			return type;
		}
	}

	/**
	 * save the data in database if success else show error msg
	 * 
	 * @param dept
	 * @param model
	 * @return
	 */
	@RequestMapping("/addDept")
	public String addDept(@ModelAttribute("dept") Department dept, Model model, HttpServletRequest req) {
		User user = (User) req.getSession().getAttribute("USERAUTH");
		String type = checkAdminSession(user);
		if (type.equals("admin")) {
			dept.setUserId(user.getUserId());
			dept.setCreateTime(new Date());
			dept = deptDao.save(dept);
			System.out.println("......................." + dept.getDeptId() + ".........................");
			if (dept.getDeptId() == 0)
				model.addAttribute("msg", "Something Wrong! Try again");
			else
				model.addAttribute("msg", "Record Saved");
			model.addAttribute("dept", new Department());
			return "admNewDept";
		} else {
			model.addAttribute("error", "You are not autorised");
			model.addAttribute("user", new User());
			return type;
		}
	}

	@RequestMapping("/newEmp")
	public String newEmp(Model model, HttpServletRequest req) {
		User user = (User) req.getSession().getAttribute("USERAUTH");
		String type = checkAdminSession(user);
		if (type.equals("admin")) {
			model.addAttribute("depts", deptDao.findAll());
			model.addAttribute("emp", new Employee());
			return "admNewEmp";
		} else {
			model.addAttribute("error", "You are not autorised");
			model.addAttribute("user", new User());
			return type;
		}

	}
	
	@RequestMapping("/addEmp")
	public String addEmp(@ModelAttribute("emp") Employee emp, Model model, HttpServletRequest req) {
		User user = (User) req.getSession().getAttribute("USERAUTH");
		String type = checkAdminSession(user);
		if (type.equals("admin")) {
			emp.setUserId(user.getUserId());
			emp.setCreateTime(new Date());
			emp = empDao.save(emp);
			System.out.println("......................." + emp.getEmpCode() + ".........................");
			if (emp.getEmpCode() == 0)
				model.addAttribute("msg", "Something Wrong! Try again");
			else
				model.addAttribute("msg", "Record Saved");
			model.addAttribute("depts", deptDao.findAll());
			model.addAttribute("dept", new Department());
			return "admNewEmp";
		} else {
			model.addAttribute("error", "You are not autorised");
			model.addAttribute("user", new User());
			return type;
		}
	}
	
	@RequestMapping("/allEmp")
	public String allEmp(Model model, HttpServletRequest req) {
		User user = (User) req.getSession().getAttribute("USERAUTH");
		String type = checkAdminSession(user);
		if (type.equals("admin")) {
			model.addAttribute("emps", empDao.findAll());
			return "admAllEmp";
		} else {
			model.addAttribute("error", "You are not autorised");
			model.addAttribute("user", new User());
			return type;
		}

	}

}
