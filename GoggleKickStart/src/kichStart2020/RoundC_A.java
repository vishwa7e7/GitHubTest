package kichStart2020;

import java.util.Scanner;

public class RoundC_A {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.hasNext() ? scanner.nextInt() : 0;
		for(int t = 1 ;t<=testCases ; t++) {
			int n = scanner.hasNext() ? scanner.nextInt() : 0;
			int k = scanner.hasNext() ? scanner.nextInt() : 0;
			boolean isCounting = false;
			int counts = 0;
			int[] array = new int[n];
			for(int i=0; i<n;i++) {
				array[i] = scanner.hasNext() ? scanner.nextInt() : 0;
				if(array[i] == k) {
					isCounting = true;
					continue;
				}
				if(array[i] == 1 && isCounting) {
					if((array[i-1] == array[i] + 1)) {
						++counts;
					} 
					isCounting = false;
					continue;
				}
				if(array[i] > k) {
					isCounting = false;
					continue;
				}
				if(array[i] < k && isCounting) {
					if(!(array[i-1] == array[i] + 1)) {
						isCounting = false;
					}
				}
				
			}
			
			System.out.println("Case #"+ t+ ": " + counts);
		}
	}

}
