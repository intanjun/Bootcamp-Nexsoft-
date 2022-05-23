package com.nexsoft.logic;

import java.util.Random;

public class SampleMath {

	public static void main(String[] args) {
		double random = Math.random();
		
		System.out.println("Angka Random: "+random);
		
		int max = 10, min = 1, range = max-min+1;
		
		for(int i=0; i<10; i++) {
			int randomInt = (int)(Math.random()*range)+min;
		System.out.print(randomInt);
		}
		System.out.println();
		double nilai = Math.sqrt(range); //range bisa diganti dengan angka langsung
		System.out.println(nilai);
		
		double nilai2 = Math.pow(3,  4); //fungsinya adalah pangkat 3^4 = 81
		System.out.println(nilai2);
		
		Random angkaRandom = new Random();
		for(int i=0; i<10; i++) {
			int randomNumber = angkaRandom.nextInt(100);
			System.out.println(randomNumber);
		}
	}
}
