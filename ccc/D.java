package ccc;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
        int[][] a=new int[n][n];
        int rows=0;
        int cols=-1;
        int div=0;
        int index=0;
        while(index<n*n) {
        	for(int i=0;i<n-div;i++) {
        		a[rows][++cols]=++index;
        	}
        	for(int i=0;i<n-div-1;i++) {
        		a[++rows][cols]=++index;
        	}
        	for(int i=0;i<n-div-1;i++) {
        		a[rows][--cols]=++index;
        	}
        	for(int i=0;i<n-div-2;i++) {
        		a[--rows][cols]=++index;
        		div+=2;
        	}
        	for(int i=0;i<n;i++) {
        		for(int j=0;j<n;j++) {
        			System.out.print(a[i][j]+" ");
        		System.out.println();
        		}
        	}
        }
	}

}
