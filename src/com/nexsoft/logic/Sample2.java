package com.nexsoft.logic;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Sample2 {

	public static void main(String[] args) {
		/*
		Laki" penghasilam 7jt Blm menikah  -> pajak 10%
		Laki" penghasilan 7jt menikah -> pajak 5%
		Tidak wajib pajak <7jt
		perempuan penghasilan 7jt blm menikah 7%
		perempuan penghasilan 7jt menikah -> pajak 4%
		Tidak wajib pajak <7jt
		CLUE : gunakan kondisi berdasarkan penghasilan untuk -> lebih efisien
		*/
		Scanner input = new Scanner(System.in);
		DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
      //Pengaturan format number
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        /*
		int gaji, gender,status;
		double pajak;

		System.out.println("------------Keterangan :----------------- ");
		System.out.println("Gender : 1. Laki-laki | 2. Perempuan");
		System.out.println("Status : 1. Menikah   | 2. Belum menikah");
		System.out.println("------------------------------------------");
		System.out.print("Masukkan Gender      :  ");
		gender = input.nextInt();
		System.out.print("Masukkan penghasilam :  ");
		gaji = input.nextInt();
		System.out.print("Masukkan Status      :  ");
		status = input.nextInt();
		
		if(gender==1) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Anda seorang Laki-laki");
		} else {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Anda seorang Perempuan");
		}
		
		if(gaji > 7000000) {
			if(status==1 && gender==1) {
				pajak = gaji*0.05;
				System.out.println("Dengan pajak yang harus dibayarkan ialah "+kursIndonesia.format(pajak));
			}else if (status==1 && gender ==2){
				pajak = gaji *0.4;
				System.out.println("Dengan pajak yang harus dibayarkan ialah "+kursIndonesia.format(pajak));
			}else if(status==2 && gender==1) {
				pajak = gaji*0.1;
				System.out.println("Dengan pajak yang harus dibayarkan ialah "+kursIndonesia.format(pajak));
			}else if (status==2 && gender ==2){
				pajak = gaji *0.07;
				System.out.println("Dengan pajak yang harus dibayarkan ialah "+kursIndonesia.format(pajak));
			}else {
				System.out.println("Inputan Salah");
			}
		} else{
			System.out.println("Anda tidak wajib pajak");
		}
		*/
        new Sample2().luasSegitiga(2, 4); //buka dari file lain juga bisa say :)
	}
        public static void luasSegitiga(int alas,int tinggi) { 
        	double luas = 0.5 * alas * tinggi;
        	System.out.println("Luas Segitiga adalah "+luas);
        }
	}
