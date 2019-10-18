package ccc;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
   static class Node{
	   int val;
	   Node next;
	   Node(int v){
		   val=v;
	   }
   }
   public static void remove(Node list) {
	   Node q=list;
	   Node p=list.next;
	   Node r=list;
	   Node s=list;
	   
	   while(p!=null) {
		   if(p.val>=q.val) {
			   s=r;
			   q=p;
		   }
		   r=p;
		   p=p.next;
	   }
	   if(q!=r) {
		   if(q==list) {
			   list=list.next;
			   
			   
		   }
		   else {s.next=q.next;}
		   r.next=q;
		   q.next=null;
	   }
	   Node o=list;
	   while(o!=null) {
		   System.out.print(o.val+" ");
		   o=o.next;
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
		
		Node list=new Node(arr.get(0));
		Node p=list;
		for(int i=1;i<n;i++) {
			p=p.next=new Node(arr.get(i));
		}
		remove(list);
		
		}
	}	
