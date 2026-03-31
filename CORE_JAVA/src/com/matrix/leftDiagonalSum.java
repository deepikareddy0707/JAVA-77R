package com.matrix;

public class leftDiagonalSum {
	public static void main(String[] args) {
		int [][] a= {{1,2,3},{1,2,3},{1,2,3}};
		int leftDiagonalSum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j) {
					leftDiagonalSum+=a[i][j];
				}
			}
		}
		System.out.println(+leftDiagonalSum);

}
}
