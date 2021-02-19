package main;

import java.util.Scanner;

public class Q2292 {

	public static void main(String[] args) {
		//벌집
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 1;
		int range = 2;
		
		if (N ==1) {
			System.out.print(1);
		}
		
		else {
			while (range <= N) {
				range = range + (6 * count);
				count++;
			}
			System.out.print(count);
			//R
		}
	}
}
