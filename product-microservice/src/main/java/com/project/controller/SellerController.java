package com.project.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class SellerController {

	@RequestMapping("productinformation")
	Products productsinfo1() {
		Products productsinfo1 = new Products(1, "Dell Lattitude 5420", "Laptop", "electronics", 50000);
		return productsinfo1;

	}

	@RequestMapping("listproductsinformation")
	ArrayList<Products> productinfoAll() {
		ArrayList<Products> listproducts = new ArrayList<Products>();
		Products products1 = new Products(2, "Asus tuf", "Laptop", "Electronics", 70000);
		Products products2 = new Products(3, "Denim", "Jeans", "Clothing", 1200);
		Products products3 = new Products(4, "Roadstar", "Shirt", "Clothing", 1000);
		Products products4 = new Products(5, "EyeLiner", "Makeup", "Beauty", 600);
		Products products5 = new Products(6, "Foundation", "Makeup", "Beauty", 900);
		listproducts.add(products1);
		listproducts.add(products2);
		listproducts.add(products3);
		listproducts.add(products4);
		listproducts.add(products5);
		
		return listproducts;
}

}