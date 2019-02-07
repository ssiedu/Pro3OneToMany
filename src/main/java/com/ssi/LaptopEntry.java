package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LaptopEntry {

	public static void main(String[] args) {

		Laptop l1=new Laptop("L111","HCL","I3-4GB",40000); l1.setEmp(new Emp(111));
		Laptop l2=new Laptop("L112","HCL","I5-8B",50000); l2.setEmp(new Emp(111));
		Laptop l3=new Laptop("L113","Dell","I5-12GB",60000); l3.setEmp(new Emp(111));
		Laptop l4=new Laptop("L114","Lenovo","I7-16GB",70000); l4.setEmp(new Emp(112));
		Laptop l5=new Laptop("L115","Sony","I7-16GB",80000); l5.setEmp(new Emp(112));
		
		
		Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(l1); session.save(l2); 
		session.save(l3); session.save(l4);
		session.save(l5);
		tr.commit();
		System.out.println("Laptop Details Stored");
		session.close();

	}

}
