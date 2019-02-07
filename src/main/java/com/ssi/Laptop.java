package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private String lcode;
	private String brand;
	private String spec;
	private int price;
	
	@ManyToOne
	private Emp emp;
	
	public String getLcode() {
		return lcode;
	}
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [lcode=" + lcode + ", brand=" + brand + ", spec=" + spec
				+ ", price=" + price + "]";
	}
	public Laptop(String lcode, String brand, String spec, int price) {
		super();
		this.lcode = lcode;
		this.brand = brand;
		this.spec = spec;
		this.price = price;
	}
	public Laptop(String lcode) {
		super();
		this.lcode = lcode;
	}
	public Laptop() {
		super();
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
}
