package com.sboot.laptopManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sboot.laptopManagement.entity.User;
import com.sboot.laptopManagement.service.UserService;

public class UserController {
	@Autowired
    UserService us; 
	
	@RequestMapping("registerUser")
	@ResponseBody
	public String addLaptop(User u)
	{
		return us.registerUser(u);
	}
	
	@RequestMapping("signin")
	public String addLaptop(int uid, String password)
	{
		if(us.checkUserLogin(uid, password))
			return "index.jsp";
		else
			return "signin.jsp";	
	}
	
	@RequestMapping("purchaseLaptop")
	public String purchase(int uid, int pid) {
		return us.purchaseLaptop(pid, uid);
	}
	
	@RequestMapping("purchaselist")
	public ModelAndView getpurchaselist() {
		ModelAndView mav = new ModelAndView("purchaselist.jsp");
		mav.addObject("list", us.viewPurchaseList());
		return mav;
	}
	
}
