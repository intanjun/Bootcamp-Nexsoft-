package com.nexsoft.logic;

import java.util.Iterator;

public class Palindrom {
	//TRIVIA
	//Polindrom adalah pembolak balikan huruf atau angka
	//Urutan penulisan tidak terlalu berpengaruh dalam pengimplementasian method
	public static void main(String[] args) {
		
		new Palindrom().palindrom("Kasur rusak");
		new Palindrom().palindromreverse("22022022");
	}
	
	public static void palindrom(String text) {
		String poli = "";
		
		for (int i=text.length(); i>0; i--) {
			String huruf = text.substring(i-1,i);
			poli += huruf;
		}
		if(text.equalsIgnoreCase(poli)) {
			System.out.println(text+ " ini polindrom");
		}else {
			System.out.println(text+ " ini bukan palindrom");
		}
		System.out.println("-------------------------------------");
	}
	
	public void palindromreverse(String text2) {
		StringBuffer baliktext = new StringBuffer(text2);
		//StringBuffer = create mutable (modifiable) String objects
		baliktext.reverse();
		
		if(text2.equals(baliktext.toString())) {
			System.out.println(text2+ " ini polindrom");
		}else {
			System.out.println(text2+ " ini bukan palindrom");
		}
	}
}
