package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchLaptop {
	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		Laptop laptop=session.get(Laptop.class, "L111");
		System.out.println(laptop.getLcode());
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getSpec());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getEmp());
		session.close();
	}

}
