package main;

import java.util.Scanner;

public class Q10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int su  = 0;
		int su2 = 0;
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			su  = sc.nextInt();
			su2 = sc.nextInt();
			
			arr[i] = su + su2;
			
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
