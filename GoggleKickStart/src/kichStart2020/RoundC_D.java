package kichStart2020;

import java.util.Scanner;

/**
 * problem  statement : 
 * @author vishwa
 *
 */

public class RoundC_D {
	
	public static int doSum(int[] a, int startIndex, int endIndex) {
		int sum = 0;
		int length = (endIndex - startIndex) != 0 ? (endIndex - startIndex) + 1 : 1;
		int index = startIndex;
		for(int i=1; i<=length ; i++) {
			int multiply = a[index] * i;
			if(i%2 == 0) {
				sum = sum - multiply;
			}else {
				sum = sum + multiply;
			}
			index++;
		}
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.hasNext() ? scanner.nextInt() : 0;
		for(int t = 1 ;t<=testCases ; t++) {
			int n = scanner.hasNext() ? scanner.nextInt() : 0;
			int q = scanner.hasNext() ? scanner.nextInt() : 0;
			int[] array = new int[n];
			
			int finalSum = 0;
			for(int i=0; i<n;i++) {
				array[i] = scanner.hasNext() ? scanner.nextInt() : 0;
			}
			for(int j=0; j<q;j++) {
				int[] query = new int[2];
				String type = scanner.next();
				char c = type.charAt(0);
				query[0] = scanner.hasNext() ? scanner.nextInt() : 0;
				query[1] = scanner.hasNext() ? scanner.nextInt() : 0;
				if(c == 'Q') {
					finalSum = doSum(array,query[0]-1, query[1]-1) + finalSum;
				}else {
					array[query[0]-1] = query[1];
				}
				
			}
			System.out.println("Case #"+ t+ ": " + finalSum);
 		}
	}

}
