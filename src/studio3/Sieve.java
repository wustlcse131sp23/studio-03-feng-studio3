package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What would you like n to be?");
		int n = scan.nextInt();
		boolean []isPrime = new boolean[n];
		
		for (int i=2; i<n; i++) {
			isPrime[i]=true;
		}
		
		for (int i=0; i<n; i++) {
			if (isPrime[i]==true){
				int j = i;
				while (j<(n-i)) {
					isPrime[j+i]=false;
					j=j+i;
				}
			}
		}

		System.out.println(" ");
		
		for (int i=0; i<n; i++) {
			if (isPrime[i]==true) {
				System.out.print(i + " ");
			}
		}
	}

}
