package com.mkyong.asymmetric;

import java.util.Scanner;

public class DP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while (cases != 0) {
			int tickets = sc.nextInt();
			int a[] = new int[tickets];
			for (int x = 0; x < a.length; x++) {
				a[x] = sc.nextInt();
			}
			max(a);
			cases--;
		}
		sc.close();
	}

	static void max(int a[]) {
		int dp[] = new int[a.length];
		String dps[] = new String[a.length];
		dp[0] = a[0]>0?a[0]:0;
		dps[0] =a[0]>0?a[0]+"":"";
		dp[1] = a[1]>0?a[1]:0;
		dps[1] =a[1]>0?a[1]+"":"";

		for(int x=2;x<a.length;x++){
			
			if((a[x]+dp[x-2])> dp[x-1]){
				dp[x]= a[x]+dp[x-2];
				dps[x] =a[x]+""+dps[x-2];	
			} else{
				dp[x]= dp[x-1];
				dps[x] =dps[x-1];
			}
		}
		System.out.println(dps[a.length - 1]);

	}
	
	
	

	
}
