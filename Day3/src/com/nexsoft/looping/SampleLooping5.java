package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping5 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		/*int i=0, sum=0;
		while(i<5){
			i++;
			sum += i;
			if(i==2) break;
			System.out.print(i+ " \n");
		}
		//System.out.println("Totatlnya : "+sum);
		
		
		for(int a=0; a<10; a++) {
			if(a==4) { 
				continue;
			}
		System.out.println(a);
		}
		
		while(true) {
			System.out.print("Close ? Pilih ya/tidak  ");
			String jawab = input.nextLine();
			if(jawab.equalsIgnoreCase("ya")) {
				break;
			}
			System.out.println("Terima Kasih");
		}
		*/
		//gunakan if dan break ketika input angka 0
		while(true) {
			System.out.print("Masukan Angka :  ");
			int jawab = input.nextInt();
			if(jawab == 0) {
				break;
			}
			System.out.println("Terima Kasih");
		}
		
	}
}
	

