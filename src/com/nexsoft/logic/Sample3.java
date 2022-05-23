package com.nexsoft.logic;

public class Sample3 {

	public static void main(String[] args) {
		//Substring
		String teks1 = "nexsoft juara";
		System.out.println(teks1.substring(12,13)); //Untuk mengambil kata A
		System.out.println(teks1.substring(1,4));   //Untuk mengambil kata EXS
		System.out.println(teks1.substring(4,7));   //Untuk mengambil kata OFT
		
		//NIM Mahasiswa
		String nim = "20180102006";
		//4 digit pertama tahun masuk
		//2 digit fakultas
		//2 digit prodi
		//3 digit no.ururt
		String tahunMasuk, fakultas, prodi, noUrut;
		tahunMasuk = nim.substring(0, 4);
		fakultas = nim.substring(4, 6);
		prodi = nim.substring(6, 8);
		noUrut = nim.substring(8, 11);
		
		System.out.println("Tahun Masuk Mahasiswa   = "+tahunMasuk);
		System.out.println("Kode Fakultas Mahasiswa = "+fakultas);
		System.out.println("Kode Prodi Mahasiswa    = "+prodi);
		System.out.println("No Urut Mahasiswa       = "+noUrut);
	
		System.out.println(teks1.contains("sol")); 
		//contains bisa digunakan untuk menacari kata tersebut dalam suatu kalimat, susunan katanya sama 
		
		String message = "Error Username atau Password Invalid";
		if(message.contains("Invalid")) {
			System.out.println("Berhasil");
		}else {
			System.out.println("Failed");
		}
		
		String nama1 = "dono", nama2 = "doyok";
		System.out.println(nama1.compareTo(nama2)); //Cek ASCII Table
		
		}
}
