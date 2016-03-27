package com.sst.java;

public class PatientDao {
	String createPatient(Patient p){
		System.out.println("Patient dao calling");
		System.out.println(p.toString());
		System.out.println("patient enede");
		return "SUCCESS";
		
	}
}
