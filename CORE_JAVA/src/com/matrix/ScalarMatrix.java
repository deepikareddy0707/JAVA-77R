package com.matrix;

public class ScalarMatrix {

	public static void main(String[] args) {
		int [][]a= {{2,0,0},{0,2,0},{0,0,2}};
		int d=a[0][0];
		boolean status=true;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
					if(a[i][j]!=0) {
						status=false;
						break;
					}
				}
				else {
					if(a[i][j]!=d) {
						status=false;
						break;
						
					}
				}
			}
		}
		if(status) {
			System.out.println("Scalar");
		}
		else {
			System.out.println("!Scalar");
		}


	}

}
