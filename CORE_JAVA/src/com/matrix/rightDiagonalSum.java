package com.matrix;


public class rightDiagonalSum {

	public static void main(String[] args) {
		int [][]a= {{1,2,4},{1,2,3},{1,2,3}};
		int RightDiagonalSum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i+j==a.length-1) {
					RightDiagonalSum+=a[i][j];
				}
			}
		}
		System.out.println(+RightDiagonalSum);

	}

}
