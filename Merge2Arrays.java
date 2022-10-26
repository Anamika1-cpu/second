// merge two sorted arrays in java
import java.util.*;
public class Merge2Arrays {
	
	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	
	public static int[] merge(int[] arr1, int[] arr2) {
		
		int[] m = new int[arr1.length + arr2.length];
		
		int i=0, j=0, k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				m[k] = arr1[i];
				k++;
				i++;
			}
			else {
				m[k] = arr2[j];
				k++;
				j++;
			}
		}
		while(i<arr1.length) {
			m[k] = arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			m[k] = arr2[j];
			k++;
			j++;
		}
		return m;
	}
	
	public static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] input1 = input();
		int[] input2 = input();
		int[] ans = merge(input1, input2);
		print(ans);
	}

}
