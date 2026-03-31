package com.matrix;


public class DiagonalMatrix {

	public static void main(String[] args) {
		int [][]a= {{1,0,0},{0,1,0},{0,0,1}};
		boolean status=true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
					if(a[i][j]!=0) {
						status=false;
						break;
					}
				}
			}
		}
		if(status) {
			System.out.println("Diagonal Matrix");
		}
		else {
			System.out.println("Not a Diagonal Matrix");
		}

	}

}
