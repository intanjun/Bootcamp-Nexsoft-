package Day1;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		/*
		System.out.println("Hello World");
		*/
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
			
		int a = 10;
		int b = 5;
		int hasil = a%b;
		System.out.println(hasil);
			
		int hasilbagi = a/b;
		System.out.println("Hasil Bagi " +a+ "dan" +b+ " =" +a/b);
				
		double c = 10;
		double d = 3;
		double hasil1 = 3.335;
		System.out.printf("%.2f",hasil1);
				
		//Masukkan Nama =
		//Tahun Mulai Bekerja =
		//Berapa tahun dia bekerja sampai tahun sekarang =
				
		String nama;
		int kerja;
				
		System.out.print("Masukkan Nama       : ");
		nama=input.nextLine();
		System.out.print("Tahun Mulai Bekerja : ");
		kerja=input.nextInt();
				
		System.out.println("----------------------------");
		System.out.println("Nama        : "+nama);
		System.out.println("Tahun Masuk : "+kerja+" tahun");
		System.out.println("Lama Kerja  : "+(2022-kerja)+" tahun");	
		System.out.println("----------------------------");	
	}
}
