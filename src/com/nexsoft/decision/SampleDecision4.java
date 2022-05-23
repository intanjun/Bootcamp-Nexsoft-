package com.nexsoft.decision;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class SampleDecision4 {

	public static void main(String[] args) {
		DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
	    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
		  
		double total = 1000000;
		System.out.println(total);
			
		//Pengaturan format number
	    formatRp.setCurrencySymbol("Rp. ");
	    formatRp.setMonetaryDecimalSeparator(',');
	    formatRp.setGroupingSeparator('.');
	    kursIndonesia.setDecimalFormatSymbols(formatRp);
		
	    System.out.println("Total Belanja : "+kursIndonesia.format(total));
		    if(total >= 100000) {
		    	System.out.println("Mendapat Kupon");
		    }else {
		    	System.out.println("Belum Mendapat Kupon");
		    }
	    /*
	    NumberFormat formatJepang = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
	    System.out.println(formatJepang.format(total));
		    
	    NumberFormat formatDolar = NumberFormat.getCurrencyInstance(Locale.US);
	    System.out.println(formatDolar.format(total));
	    */
		    
	    int x= 80;
	    String a= "nexsoft juara";
	    String b= "bootcamp";
	    //System.out.printf("%03d",x);
	    System.out.printf("%-15s%-15s%03d",a,b,x); //-15 menghitung karakter untuk format x=15 karakter
		    
		}
	}