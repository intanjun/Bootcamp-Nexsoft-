package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		int nilaiAwal, nilaiAkhir;
		System.out.printf("Masukkan Nilai Awal  : ");
		nilaiAwal = input.nextInt();
		System.out.printf("Masukkan Nilai Akhir : ");
		nilaiAkhir = input.nextInt();
		System.out.println("--------------------------");
		for(int i=nilaiAwal; i<=nilaiAkhir; i++) {
			System.out.printf(i+ " ");
		}
		System.out.println("");
		System.out.println("--------------------------");
		
		
		int jumlah =3;
		String nama[] = new String[3];
		
		//System.out.println("Masukkan jumlah Siswa : ");
		//jumlah = input.nextInt();
		System.out.println("Masukkan nama Siswa   : ");
		for(int i=0; i<jumlah; i++) {
			nama[i] = input.nextLine();
		}
		System.out.println("------------------------------");
		for(String i : nama) {
			System.out.println(i);
		}
		
		int jumlah ;
		String nama[] = new String[100];
		
		System.out.println("Masukkan jumlah Siswa : ");
		jumlah = input.nextInt();
		System.out.println("Masukkan nama Siswa   : ");
		for(int i=0; i<jumlah; i++) {
			nama[i] = input.nextLine();
		}
		System.out.println("------------------------------");
		for(String i : nama) {
			System.out.println(i);
		}
		*/
		int jumlah =3;
		int nilai[] = new int[jumlah];
		
		//System.out.println("Masukkan jumlah Siswa : ");
		//jumlah = input.nextInt();
		System.out.println("Masukkan nilai Siswa   : ");
		for(int i=0; i<nilai.length; i++) {
			nilai[i] = input.nextInt();
		}
		System.out.println("------------------------------");
		int sum=0, rata=0;
		for(int i : nilai) {
			System.out.print(i+" |");
			sum+=i;
			rata= sum/jumlah;
		}
		System.out.println("------------------------");
		System.out.println("Jumlah Nilai    : "+sum);
		System.out.println("Rata-rata kelas : "+rata);
		System.out.println("------------------------");
		
		
		int angka=10;
		for(int i=1; i<angka; i=i+2) {
			System.out.printf(i+ " * ");
		}
		
		
		
	}
}
