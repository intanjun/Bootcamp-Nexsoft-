package com.nexsoft.looping;

public class SampleLooping3 {

	public static void main(String[] args) {
		//TODO 
		/*
		for(int i=0; i<5; i++) { //looping 0-4 tapi berdasarkan tiap angka looping dalam j
			for(int j=0; j<5; j++) {
				System.out.println(i+" "+j);
			}
		}
		
		for(int i=1; i<=4; i++) { //looping 0-4 tapi berdasarkan tiap angka looping dalam j
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5; i>=1; i--) { //looping 0-4 tapi berdasarkan tiap angka looping dalam j
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=4; i++) { //looping 0-4 tapi berdasarkan tiap angka looping dalam j
			for(int j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		for(int i=4; i>=1; i--) { //looping 0-4 tapi berdasarkan tiap angka looping dalam j
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=10; i>=1; i--) {
			for(int j=2; j<=i; j++) {
				if(j%2==0) {
					System.out.print(j);
				}else {
					System.out.print(" * ");
				}
			}
			System.out.println("");
		}
		*/
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
			}else {
				System.out.print("");
			}
			//sum+=i;
		}
		System.out.println("Total = "+sum);
}
}

