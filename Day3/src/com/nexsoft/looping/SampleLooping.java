package com.nexsoft.looping;

import java.util.Iterator;
import java.util.Scanner;

import javax.naming.directory.SearchResult;

public class SampleLooping {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println(i+" . nexsoft");
		}
		System.out.println("----------------------");
		
		for (int i=1; i<=10; i=i+2) {
			System.out.println(i+" ");
		}
		System.out.println("----------------------");
		
		for(int i=10; i>=1; i--) {
			System.out.println(i+" ");
		}
		System.out.println("----------------------");
		
		String nama="Nexsoft";
		for (int i=1; i<=nama.length(); i++ ) { //length= menghitung berapa karakter yang ada 
			System.out.println(i+" ");
		}
		System.out.println("----------------------");
		
		int errorlogin=3;
		for(int i=1; i<=errorlogin; ++i) { 
			System.out.println(i+" ");
			System.out.println(++i); //++i = menambahkan nilai i sebelumnya 
		}
		System.out.println("----------------------");
		/*jika tidak diberik decrement/increment akan looping terusint error=3;
		for(int i=1; i<=error;) {
			System.out.println(i+" ");
		}
		*/
		
		String motor[] = {"Suzuki", "Honda", "Yamaha"};
		System.out.println(motor[0]);
		for(String i : motor) {
			System.out.println(i);
		}
		System.out.println("");
		
        int angka[] = { 2, 3, 4, 10, 40 };
 
        //Angka yang dicari
        int x = 10;
 
        // Function Call
        int hasil;
        //= SearchResult(angka, x);
        if (hasil == -1)
            System.out.print("Angka tidak ditemukan");
        else
            System.out.print("Angka ditemukan pada index ke- "+ hasil);
    }
}

