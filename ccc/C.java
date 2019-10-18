package ccc;

import java.util.ArrayList;
import java.util.Scanner;

public class C {
     public static void search(ArrayList<Integer> arr) {
    	 int num=0;
    	 for(int i=0;i<arr.size();i++) {
    		 
    		int k=arr.get(i);
    		for(int j:arr) {
    			if(k==j)num++;
    		}
    		if(num>arr.size()/2)System.out.print(k);
    	 }
     }
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList();
        Scanner in=new Scanner(System.in);
        String line=in.nextLine();
        Scanner in2=new Scanner(line);
        int n=0;
        while(in2.hasNextInt()) {
        	arr.add(in2.nextInt());
        	n++;
        }


	}

}
