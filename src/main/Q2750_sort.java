package main;

import java.util.Scanner;

public class Q2750_sort {

	public static void main(String[] args) {

		//수 정렬하기
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int change = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int k = i; k < n; k++) {
				if(arr[i] > arr[k]) {
					change = arr[i];
					arr[i] = arr[k];
					arr[k] = change;
				}
			}
		}
	
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
