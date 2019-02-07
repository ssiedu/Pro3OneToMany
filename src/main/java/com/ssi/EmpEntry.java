package com.ssi;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {
		
		
		Emp e1=new Emp();
		e1.setEcode(111); e1.setEname("AAA"); e1.setSal(25000); e1.setDesg("SE");
/*		ArrayList<Laptop> list1=new ArrayList<Laptop>();
		list1.add(new Laptop("L111"));
		list1.add(new Laptop("L112"));
		list1.add(new Laptop("L113"));
		e1.setLaptops(list1);
*/		
/*		ArrayList<Laptop> list2=new ArrayList<Laptop>();
		list2.add(new Laptop("L114"));
		list2.add(new Laptop("L115"));
*/		
		Emp e2=new Emp(112,"BBB","TL",50000);
		
		Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2);
		tr.commit();
		System.out.println("Laptop Details Stored");
		session.close();
	}

}
