package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchEmp {

	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		Emp emp=session.get(Emp.class, 112);
		System.out.println(emp.getEcode());
		System.out.println(emp.getEname());
		System.out.println(emp.getDesg());
		System.out.println(emp.getSal());
		List<Laptop> list=emp.getLaptops();
		for(Laptop l:list){
			System.out.println(l.getLcode()+","+l.getBrand()+","+l.getSpec()+","+l.getPrice());
		}
		session.close();
	}

}
