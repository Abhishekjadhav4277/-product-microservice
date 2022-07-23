package com.project.controller;

public class Products {
	int productid;
	String productname;
	String producttype;
	String productcategory;
	int productpricerange;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int productid, String productname, String producttype, String productcategory,
			int productpricerange) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.producttype = producttype;
		this.productcategory = productcategory;
		this.productpricerange = productpricerange;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProducttype() {
		return producttype;
	}

	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public int getProductpricerange() {
		return productpricerange;
	}

	public void setProductpricerange(int productpricerange) {
		this.productpricerange = productpricerange;
	}

	@Override
	public String toString() {
		return "Products [productid=" + productid + ", productname=" + productname + ", producttype=" + producttype
				+ ", productcategory=" + productcategory + ", productpricerange=" + productpricerange + "]";
	}
}
