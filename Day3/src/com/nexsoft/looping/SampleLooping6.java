package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		String passw = "nexsoft", inputPassword;
		int maxInput = 3, hitung = 0;
		boolean masuk = true;
		
		do {
			System.out.print("Masukkan password : ");
			inputPassword = input.nextLine();
			
			if(inputPassword.equals(passw)) {
				System.out.println("Password Matched, Login berhasil!");
				break;
			}else if(!inputPassword.equals(passw)) {
				hitung += 1;
				System.out.println("Password salah, masukkan password yang benar");
				if(hitung == maxInput) {
					System.out.println("Akun anda ditangguhkan karena sudah "+ hitung + " percobaan");
					masuk = false;
				}
			}
		} while(masuk);
		
		//Bilangan Fibonachi
		 int jumlahDeret=10, a=0, b=1 ;    
		 System.out.print("Deret Fibonaci : ");
		    
		 for(int i=1; i<jumlahDeret; ++i){ //cetak deret 0 hingga 10  
			 System.out.print(a+ " ");
			 int c = a + b;    
			 //System.out.print(" "+c);
			 a = b;
			 b = c;
		 }   
		
		
		
		
		
		 int jumlahDeret=10, a=0, b=1, c ;    
		 System.out.print("Deret Fibonaci : " +a+" "+b);//Cetak 0 dan 1    
		    
		 for(int i=2; i<jumlahDeret; ++i){ //cetak deret 0 hingga 10  
			 c = a + b;    
			 System.out.print(" "+c);
			 a = b;
			 b = c;
		 } 
		 */   
		 
		 //5 x 1=5
		 int jumlahDeret=10, c ;    
		 System.out.print("Masukkan Pengali :");
		 int inputAngka = input.nextInt();
		    
		 for(int i=1; i<=jumlahDeret; ++i){ //cetak deret 0 hingga 10  
			 c = inputAngka *i;    
			 System.out.println(inputAngka+ " * " +i +" = "+c);
		 }   
		
	}
}

