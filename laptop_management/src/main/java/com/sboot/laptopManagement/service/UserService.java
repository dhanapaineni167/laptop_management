package com.sboot.laptopManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sboot.laptopManagement.dao.LaptopDao;
import com.sboot.laptopManagement.dao.PurchaseDao;
import com.sboot.laptopManagement.dao.UserDao;
import com.sboot.laptopManagement.entity.Laptop;
import com.sboot.laptopManagement.entity.Purchase;
import com.sboot.laptopManagement.entity.User;

public class UserService {
	@Autowired
	UserDao udao;
	
	@Autowired
	LaptopDao ldao;
	
	@Autowired
	PurchaseDao pdao;

	public String registerUser(User u1) {

		udao.save(u1);
		return "User registration got successful";
	}

	public User viewUser(int uId) {
		for (User u : udao.findAll()) {
			if (u.getUid() == uId) {
				return u;
			}
		}
		return null;

	}

	public boolean checkUserLogin(int uid, String password) {
		User u = viewUser(uid);
		return password.equals(u.getPassword());

	}

	public String purchaseLaptop(int lid, int uid) {
		Laptop l = ldao.findById(lid).orElse(null);
		User u = udao.findById(uid).orElse(null);
		if (l != null && u != null) {
			pdao.save(new Purchase(lid, uid, (l.getLcost() + 500)));
			return "Purchase COmpleted";
		}
		return "Invalid Input";
	}
	
	public List<Purchase> viewPurchaseList() {
		return pdao.findAll();
	}
	
	public Purchase getPurchseData(int pid) {
		return pdao.findById(pid).orElse(null);
	}
}
