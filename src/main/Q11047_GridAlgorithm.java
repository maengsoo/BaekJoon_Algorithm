package main;

import java.util.Scanner;

public class Q11047_GridAlgorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//동전 0
		int coinValue = sc.nextInt();
		int won = sc.nextInt();
		int coinSu = 0;
		
		int[] coinValueArr = new int[coinValue];
		
		for(int i = 0; i < coinValue; i++) {
			coinValueArr[i] = sc.nextInt();
		}
		
		for(int i = coinValue-1; i >= 0; i--) {
			if(won % coinValueArr[i] != won) {
				
				coinSu += won / coinValueArr[i];
				won 	= won % coinValueArr[i];
				
			}
			if(won == 0) break;
		}
		System.out.println(coinSu);
		sc.close();
	}
}
