package com.nexsoft.decision;

import java.util.Calendar;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class SampleDecision1 {
  public static void main(String[] args) {
	  Scanner input = new Scanner (System.in);
	  DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
      DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
	  /*
	//jika number >2 maka dijalankan
	  int num =3; //Int primitif 
	  if (num >2) {
		  int x=10*num-2;
		  System.out.println("x = " +x);
	  }
	  //mengecek kesamaan kata menggunakan equalsIgnoreCase
	  String kata1= "Nexsoft";
	  String kata2= "nexsofT";
	  if (kata1.equalsIgnoreCase(kata2)) {
		  System.out.println("Kata Sama");
	  }else {
		  System.out.println("Kata Tidak Sama");
	  }
	  //mengecek kesamaan angka
	  Integer num1 =10;
	  Integer num2= 10; //Integer non primitif
	  
	  if(num1.equals(num2)) {
		  System.out.println("Angka Sama"); 
	  }else {
		  System.out.println("Angka Tidak Sama");
	  }
	  //Int primitif digunakan saat tidak dimanipulasi/melakukan validasi (biasamya menggunakan ==) Sedangkan 
	  //Integer non primitif digunakan untuk validasi suatu bilangan  
  
	  //Pilih firefox maka hasilnya jalankan firefox 
	  
	  
	  String inputbrowser;
	  String browser = "Firefox";
	  
	  System.out.printf("Masukkan browser : ");
	  inputbrowser= input.nextLine();
	  if(inputbrowser.equalsIgnoreCase(browser)) {
		  System.out.println("Jalankan browser firefox");
	  }else {
		  System.out.println("Inputan tidak dikenali");
	  }
	  //Mencari bilangan ganjil/genap
	  int angka = 7;
	  if(angka%2==0) {
		  System.out.println("Bialngan Genap");
	  }else {
		  System.out.println("Bilangan Ganjil");
	  }
	  
	  String error;
	  System.out.printf("Browser Error/Tidak (Y/N): ");
	  error= input.nextLine();
	  if(error=="Y") {
		  System.out.println("Screenshot browser");
	  }else {
		  System.out.println("jalankan Browser");
	  }
	  
	  
	  //Sample 2 - if majemuk
	  //Melakukan validasi inputan nilai dari 0-100
	  int nilai;
	  //TO-DO nilai A >90, nilai B >84, nilai C >74, nilai D <75
	  
	  System.out.printf("Masukkan Nilai: ");
	  nilai= input.nextInt();
	  if(nilai >=90 && nilai <=100 ) {
		  System.out.println("Nilai A");
	  }else if(nilai >=85 && nilai <90){
		  System.out.println("Nilai B");
	  }else if(nilai >=75 && nilai <85){
		  System.out.println("Nilai C");
	  }else if(nilai<75 && nilai>0){ 
		  System.out.println("Nilai D");
	  }else {
		  System.out.println("Masukkan nilai sesuai range");
	  }
	  
	  //TODO : Selamat Pagi = 00-11.59, Selamat Siang=12-16, selamt Sore
	  Calendar waktu = Calendar.getInstance();
	  int hour = waktu.get(Calendar.HOUR_OF_DAY);
	  	    
	  System.out.printf("Masukkan Waktu: ");
	  hour= input.nextInt();
	  if(hour >= 0 && hour<12) {
		  System.out.println("Selamat Pagi");
	  }else if(hour >=12 && hour<16){
		  System.out.println("Selamat Siang");
	  }else if(hour >=16 && hour<18){
		  System.out.println("Selamat Sore");
	  }else {
		  System.out.println("Selamat Malam");
	  }
	  
	  //Sistem tilang ganjil genap
	  int platno;
	  int tgl;
	  
	  System.out.printf("Masukkan Plat Nomor: ");
	  platno= input.nextInt();
	  System.out.printf("Masukkan Tanggal   : ");
	  tgl= input.nextInt();
	  if(platno%2==0 && tgl%2==0){
		  System.out.println("-----------------------------------------");
		  System.out.println("Tidak Melanggar, Genap boleh jalan terus");
		  System.out.println("-----------------------------------------");
	  } else if(platno%2==1 && tgl%2==1){
		  System.out.println("------------------------------------");
		  System.out.println("Tidak Melanggar, Ganjil boleh Jalan");
		  System.out.println("------------------------------------");
	  }else {
		  System.out.println("----------------------------");
		  System.out.println("Melanggar,Tidak Boleh Jalan");
		  System.out.println("----------------------------");
	  }
	 
	  //Sistem donor darah
	  //TODO : usia = 18-49, bb = >55
	  int usia, bb;
	  
	  System.out.printf("Masukkan Usia          : ");
	  usia= input.nextInt();
	  System.out.printf("Masukkan Berat Badan   : ");
	  bb= input.nextInt();
	  if(usia>17 && usia<50){
		  if(bb>55) {
			  System.out.println("---------------------------------------------------");
			  System.out.println("Boleh Donor Darah, usia dan berat badan memenuhi :)");
			  System.out.println("---------------------------------------------------");
		  }else {
			  System.out.println("--------------------------------------------------------------------");
			  System.out.println("Tidak Boleh Donor Darah, karena berat badan tidak memenuhi syarat :(");
			  System.out.println("--------------------------------------------------------------------");
		  }
	  } else {
		  if(bb>55) {
			  System.out.println("-------------------------------------------------------------");
			  System.out.println("Tidak Boleh Donor Darah, karena usia tidak memenuhi syarat :(");
			  System.out.println("-------------------------------------------------------------");
		  }else {
			  System.out.println("-----------------------------------------------------------------------------");
			  System.out.println("Tidak Boleh Donor Darah, karena usia dan berat badan tidak memenuhi syarat :(");
			  System.out.println("-----------------------------------------------------------------------------");
	  }
	*/  
	//Sistem Rwat inap rumah sakit
	  //TODO : jumlah penginap, kelas (1=100k/malam, 2=50/malam), doktor(a=1jt, b=2jt), total bayar
	  
	  int jumlahPenginap, kelas, hargaKelas, rawatinap, hargaDoktor, total ;
	  String doktor;
	  
	//Pengaturan format number
      formatRp.setCurrencySymbol("Rp. ");
      formatRp.setMonetaryDecimalSeparator(',');
      formatRp.setGroupingSeparator('.');
      kursIndonesia.setDecimalFormatSymbols(formatRp);

	  System.out.printf("Masukkan Jumlah Penginap       : ");
	  jumlahPenginap= input.nextInt();
	  System.out.printf("Masukkan Kelas Ruangan (1/2)   : ");
	  kelas= input.nextInt();
	  System.out.printf("Masukkan berpaa hari dirawat   : ");
	  rawatinap= input.nextInt();
	  System.out.printf("Masukkan Doktor Perawat (A/B)  : ");
	  doktor= input.next();
	  
	  if(kelas==1){
		  hargaKelas = 100000;
	  }else {
		  hargaKelas = 50000;
	  }
	  
	  if(doktor=="A") { 
		  hargaDoktor= 1000000;
	  }else {
		  hargaDoktor= 2000000;
	  }
	  total= (jumlahPenginap *hargaKelas)+hargaDoktor+(rawatinap*hargaKelas);
	  System.out.println("----------------------------------");
	  System.out.println("| Total bayar : "+kursIndonesia.format(total)+ " |" );
	  System.out.println("----------------------------------");
	}
  }

