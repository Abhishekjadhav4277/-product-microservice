package com.project.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
		@RequestMapping("hellocustomer")
	String welcometoservice() {
		return "Welcome customer";
	}

	@RequestMapping("listproductinformation")
	Products productsinfo() {
		Products productsinfo = new Products(1, "Dell Lattitude 5420", "Laptop", "electronics", 50000);
		return productsinfo;
	}

}