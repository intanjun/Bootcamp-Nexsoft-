package com.nexsoft.decision;

import java.util.Scanner;

public class SampleDecision3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		int hari = 9;
		
		switch (hari) {
		case 1:
			System.out.println("Senin");
			break;
		case 2:
			System.out.println("Selasa");
			break;
		case 3:
			System.out.println("Rabu");
			break;
		case 4:
			System.out.println("Kamis");
			break;
		case 5:
			System.out.println("Jumat");
			break;
		case 6:
			System.out.println("Sabtu");
			break;
		case 7:
			System.out.println("minggu");
			break;
		default:
			System.out.println("Tidak Ada Hari Tersebut");
			break;
		}
		
		String browser;
		System.out.println("Input nama browser : ");
		browser = input.next(); 
		String pilihbrowser = browser.toLowerCase();
		
		switch (pilihbrowser) {
		case "firefox":
			System.out.println("Open forefox");
			break;
		case "chrome":
			System.out.println("Open chrome");
			break;
		default:
			System.out.println("Tidak ada browser laim :)");
			break;
		}
		
		char huruf ='Z';
		switch (huruf) {
		case 'A':
			System.out.println("Huruf vokal");
			break;
		case 'I':
			System.out.println("Huruf vokal");
			break;
		case 'U':
			System.out.println("Huruf vokal");
			break;
		case 'E':
			System.out.println("Huruf vokal");
			break;
		case 'O':
			System.out.println("Huruf vokal");
			break;
		default:
			System.out.println("Huruf konsonan");
			break;
		}
		
		
		//Daftar Menu
		//TODO : 1
		int rumus;
		
		System.out.println("-----------------------");
		System.out.println("Rumus bangun datar");
		System.out.println("1. Persegi ");
		System.out.println("2. Persegi Panjang");
		System.out.println("3. Segitiga");
		System.out.printf("Pilih rumus bangun datar : ");
		rumus = input.nextInt(); 
		System.out.println("-----------------------");
		int sisi, p, l, a, t, rumus1, rumus2; 
		double rumus3;
		
		switch (rumus) {
		case 1:
			System.out.println("Rumus Persegi");
			System.out.printf("Sisi : ");
			sisi = input.nextInt(); 
			rumus1 = sisi^2;
			System.out.println("-----------------------");
			System.out.printf("Luas : "+rumus1);
			break;
		case 2:
			System.out.println("Rumus Persegi Panjang");
			System.out.printf("Panjang : ");
			p = input.nextInt(); 
			System.out.printf("Lebar   : ");
			l = input.nextInt();
			rumus2 = p*l;
			System.out.println("-----------------------");
			System.out.printf("Luas    : "+rumus2);
			break;
		case 3:
			System.out.println("Rumus Segitiga");
			System.out.printf("Alas   : ");
			a = input.nextInt(); 
			System.out.printf("Tinggi : ");
			t = input.nextInt();
			rumus3 = (a*t)/2;
			System.out.println("-----------------------");
			System.out.printf("Luas   : "+rumus3);
			break;
		default:
			break;
		}
				
		//Input kelas, jam,
		String kelas, pilihkelas;
		int jam;
		System.out.printf("Masukkan Kelas : ");
		kelas = input.next();
		pilihkelas = kelas.toUpperCase();
		System.out.printf("Masukkan Jam   : ");
		jam = input.nextInt();
		System.out.println("-------------------------------------------");
		switch (pilihkelas) {
		case "IA":
			System.out.println(" Kelas  : IA");
			switch (jam) {
			case 9:
				System.out.println(" Matkul : Statistik");
				break;
			case 10:
				System.out.println(" Matkul : Pemrograman Java");
				break;
			default:
				System.out.println(" Matkul : Jadwal Tidak Tersedia di jam "+jam);
				break;
			}
			break;
		case "IB":
			System.out.println("Kelas  : IB");
			switch (jam) {
			case 9:
				System.out.println(" Matkul : Bahasa Indonesia");
				break;
			case 10:
				System.out.println(" Matkul : Praktikum Java");
				break;
			default:
				System.out.println(" Matkul : Jadwal Tidak Tersedia di jam "+jam);
				break;
			}
			break;
		default:
			System.out.println(" Matkul : Tidak ada kelas");
			break;
		}
		System.out.println("-------------------------------------------");
		*/
		//Sistem tilang 
		
		boolean sim = false;
		
		if(sim==true) {
			System.out.println("Tidak ditilang");
		}else {
			System.out.println("Anda ditilang");
		}
		
		}
}
