package com.pack1;

public class TransposeMaxtrix {

	public static void main(String[] args) {
		int arr[][] = {{10,11,12},{13,14,15},{16,17,18}};
		int arrtns[][] = new int[3][3];
		System.out.println("Original Matrix :");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Transpose Matrix :");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				 arrtns[i][j] = arr[j][i];
				System.out.print(arrtns[i][j] + " ");
			}
			System.out.println();
		}
	}

}
