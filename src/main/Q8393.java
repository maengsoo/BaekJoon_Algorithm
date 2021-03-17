package main;

import java.util.Scanner;

public class Q8393 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int hab = 0;
		
		for(int i = 1; i <= n; i++) {
			
			hab = hab + i;

		}
		
		System.out.println(hab);
		sc.close();
	}

}
