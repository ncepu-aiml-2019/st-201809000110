package ccc;

import java.util.ArrayList;
import java.util.Scanner;

public class E {
  static void get(ArrayList<Integer> arr) {
	  int result,cnt;
	  result=arr.get(0);cnt=1;
	  for(int i=1;i<arr.size();i++) {
		  if(arr.get(i)==result) {
			  cnt++;
		  }
		  else if(cnt==1) {
			  result=arr.get(i);
			  cnt=1;
		  }
		  else {
			  cnt--;
		  }
	  }
	  cnt=0;
	  for(int i=0;i<arr.size();i++) {
		  if(arr.get(i)==result)cnt++;
	  }
	  if(cnt>arr.size()/2)System.out.print(result);
	  else System.out.print(-1);
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
      
	get(arr);


	}

}
