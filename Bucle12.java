package edu.alonso.tema1;

import java.util.Scanner;

public class Bucle12 {
public static void main(String[] args) {
	Scanner sc = new  Scanner(System.in);
	int num = sc.nextInt();
	
	for (int i = 1; i <= num; i++) {
		for (int j = i; j < num; j++) {
			System.out.print("  ");
		}
		for (int k = 1 ; k <= i ; k++) {
			System.out.print(k);
			}
		for (int s = i - 1; s >= 1 ;s--) {
			System.out.print(s);
		}
	System.out.println();
	}
	sc.close();
}
}
