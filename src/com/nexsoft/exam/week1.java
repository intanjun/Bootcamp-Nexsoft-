package com.nexsoft.exam;
import java.util.Scanner;
public class week1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		//no.1
		double a=0, b=0;
		
		System.out.print("Angka 1 : ");
	    a = scan.nextDouble();
	    System.out.print("Angka 2 : ");
	    a = scan.nextDouble();
	    
	    a = (int)b;
	    System.out.printf("Harga 1: %.0f\n", a);
	    b = (int)b;
	    System.out.printf("Harga 2: %.0f", b);
	    
	    //no.2
	    int a = 0, x, y;
	    //inputan
	    a = scan.nextInt();
	    x = a + 3;
	    y = x * 3;
	    
	    System.out.println(x);
	    System.out.println(y);
	    
	    //no.3
	    String text;
		int a, b;
		
		//inputan
		text = scan.next();
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.println(text.substring(a, b));
		
		//no.4
		int a = scan.nextInt();
	    
	     for (int j=1; j<=a; j++){
	        for (int k=5; k>=j+j ;k--){
	            System.out.print("");
	        }for (int k=1; k<j; k++){ 
	            System.out.print("*");
	        } for (int k=1; k<=j; k++){ 
	             System.out.print("*");
	        }  
	    System.out.println(" ");
	    }
		
		//no.5
		int a = scan.nextInt();
	    
	     for (int j=1; j<=a; j++){
	        for (int k=5; k>=j+j ;k--){
	            System.out.print("");
	        }for (int k=1; k<j; k++){ 
	            System.out.print("*");
	        } for (int k=1; k<=j; k++){ 
	             System.out.print("*");
	        }  
	    System.out.println(" ");
	    }
	    
	    //no.6
		int a = scan.nextInt();
		int b = scan.nextInt();
	    
		for(int i=1; i<=b; i++){
			System.out.print(a+ " x "+ i " = "+ a*i );
		}
		
		//no.7
		double a, b;
    
		a = scan.nextDouble();
		b = scan.nextDouble();
		
		for (int i=1; i<=b; i++) {
		    System.out.print(Math.pow(a, i)+" ");
		}
		
		//no.8
		int a = scan.nextInt();
    
		for(int i=1; i<a; i++) {
		    for(int j=1; j<=a; j++) {
		       if (j==1) {
		           System.out.println(i);
		       } else {
		           System.out.println("Text print");
		       }
		   }
  		}
		 
		//no.9
		int batasAtas, batasBawah, selisih;
		
		batasAtas = scan.nextInt();
		batasBawah = scan.nextInt();
		selisih = scan.nextInt();
		System.out.println("Deret aritmatika");
		for(int i = batasAtas; i <= batasBawah; i += selisih){
            System.out.print( i + " ");
        }
		*/
		
		//no.10
		String a1 = scan.next();
		int b1 = scan.nextInt();
		String a2 = scan.next();
		int b2 = scan.nextInt();
		String a3 = scan.next();
		int b3 = scan.nextInt();
				
		System.out.print("============================");
		System.out.printf("\n%s\t\t%03d", a1, b1);
		System.out.printf("\n%s\t\t%03d", a2, b2);
		System.out.printf("\n%s\t\t%03d\n", a3, b3);
		System.out.print("============================");
		
		
	}
}
