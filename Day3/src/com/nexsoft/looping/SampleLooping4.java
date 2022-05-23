package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		//while
		int x=0;
		while (x<5) {
			System.out.println(x);
			++x;
		}
		//do while
		int y=0;
		do {
			System.out.print(y+ " ");
			y++;
		} while(y<5);

		System.out.println();
		//Jika input 0 maka berhenti
		
		int angka, sum=0;
		System.out.print("Masukkan Angka : ");
		angka = input.nextInt();
		System.out.println();
		while(angka>=0) {
			System.out.print("Masukkan Angka : ");
			angka = input.nextInt();
			//System.out.println("Berhenti");
			sum +=angka;
		}
		//input.close();
		System.out.println("Total : "+sum);
		*/
		
		//ketika input ya maka berhenti
		String masukan;
		boolean masukannya=true;
		int hitung;
		while(running) {
		System.out.print("Apakah anda ingin mengakhiri program? (y/t)");
		masukan = input.nextLine();
		System.out.println();
		while(masukannya.equalsIgnoreCase("y")) {
			masukannya=false;
		}
			System.out.print("Masukkan pilihan : ");
			masukan = input.nextLine();
		}
		}
	}