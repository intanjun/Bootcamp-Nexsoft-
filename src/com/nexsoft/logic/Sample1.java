package com.nexsoft.logic;

public class Sample1 {

	public static void main(String[] args) {
		/*
		Operator ada 6 : 
		1. Aritmatika (+, -, /, *, =, %)
		2. Penugasan (+=)
		3. Pembanding(<, >)
		4. Logika(&&, ||, !)
		5. Bitwise → Binary (&, |)
		6. Ternary(? :)
		 */
		
		int a = 10; //0000 1010
		int b = 5;  //0000 0101
					//     0000 &(AND)-> 1 + 1 = 1. selain itu 0
					//     1111 |(OR) -> 0 + 0 = 0. selain itu 1
		int c = 20;
		int d = 0;
		/*
		System.out.println(a>b||a<c);
		System.out.println(a>b| a<c);
		
		System.out.println(a>b|| a++<c); 
		//penggunaan operator logika tidak menambah nilai a, tidak berubah nilainya
		System.out.println(a);
		
		System.out.println(a>b| a++<c);
		//penggunaan operator betwice menambah nilai a, berubah nilai
		System.out.println(a);
		*/
		d = a & b;
		System.out.println("a & b = "+d);
		d = a|b;
		System.out.println("a | b = "+d);
		
	}
}
