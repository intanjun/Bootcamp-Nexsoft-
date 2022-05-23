package com.nexsoft.decision;

public class SampleDecision2 {

	public static void main(String[] args) {
		//Mencari predikat siswa 
		  int nilai = 55;
		  if(nilai >=90 && nilai <=100 ) {
			  System.out.println("Nilai A");
		  }else if(nilai >=85 && nilai <90){
			  System.out.println("Nilai B");
		  }else if(nilai >=75 && nilai <85){
			  System.out.println("Nilai C");
		  }else {
			  System.out.println("Nilai D");
		  }
	}
	
}
