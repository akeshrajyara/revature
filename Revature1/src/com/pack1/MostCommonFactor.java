package com.pack1;

public class MostCommonFactor {

	public static void main(String[] args) {
		int arr[] = {4,6,8};
		int max = arr[0];
		for(int i = 0; i<arr.length; i++ ) {
			if(arr[i]>max)
				max=arr[i];
		}
		for(int i = 0; i<arr.length; i++) {
			for(int j = 1; j<=max; j++) {
				if(arr[i] %j == 0)
					System.out.println(j);
			}
		}
	}
}
