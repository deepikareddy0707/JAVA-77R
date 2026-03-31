package com.matrix;

import java.util.Arrays;

public class Addition {

	public static void main(String[] args) {
		int [][] a= {{1,2,3},{1,2,3},{1,2,3}};
		int [][] b= {{1,2,3},{1,2,3},{1,2,3}};
		
		int rowsA=a.length;
		int rowsB=b.length;
		
		int colsA=a[0].length;
		int colsB=b[0].length;
		
		int [][]c=new int[rowsA][colsA];

				if((rowsA==rowsB)&&(colsA==colsB)) {
					for(int i=0;i<rowsA;i++) {
						for(int j=0;j<colsA;j++) {
							c[i][j]=a[i][j]+b[i][j];
					
				}
			}
		}
				else {
					System.out.println("Addition not Possible");
				}
				
				for(int i=0;i<c.length;i++) {
					System.out.println(Arrays.toString(c[i]));
				}

	}

}
