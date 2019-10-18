package ccc;

import java.util.Scanner;

public class Triple {
     int row,col,v;
     public Triple() {}
     public Triple(int row,int col,int v) {
    	 this.row=row;
    	 this.col=col;
    	 this.v=v;
     }
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
	   Triple[] a=new Triple[n];
	   Triple[] b=new Triple[m];
	   Triple[] c=new Triple[n+m];
	   for(int i=0;i<n;i++) {
		   a[i]=new Triple();
	   }
	   for(int i=0;i<m;i++) {
		   b[i]=new Triple();
	   }
	   for(int i=0;i<n;i++) {
		   a[i].row=scn.nextInt();
		   a[i].col=scn.nextInt();
		   a[i].v=scn.nextInt();
	   }
	   for(int i=0;i<m;i++) {
		   b[i].row=scn.nextInt();
		   b[i].col=scn.nextInt();
		   b[i].v=scn.nextInt();
	   }
	   for(int i=0;i<n+m;i++) {
		   c[i]=new Triple();
	   }
	   for(int i=0;i<n+m;i++) {
		   c[i].v=0;
	   }

   	
   	    int k=0;
   	   
   		for(int j=0;j<m;j++) {
   			for(int i=0;i<n;i++) {
   			if(a[i].row<b[j].row) {
   				c[k].row=a[i].row;
   				c[k].col=a[i].col;
   				c[k].v=a[i].v;
   				k++;
   				
   			}
   			else if(a[i].row>b[j].row) {
   				c[k].row=b[j].row;
   				c[k].col=b[j].col;
   				c[k].v=b[j].v;
   				k++;
   			}
   			else if(a[i].row==b[j].row&&a[i].col<b[j].col) {
   				c[k].row=a[i].row;
   				c[k].col=a[i].col;
   				c[k].v=a[i].v;
   				k++;
   				
   			}
   			else if(a[i].row==b[j].row&&a[i].col>b[j].col) {
   				c[k].row=b[j].row;
   				c[k].col=b[j].col;
   				c[k].v=b[j].v;
   				k++;
   				
   			}
   			else {
   				c[k].row=a[i].row;
   				c[k].col=a[i].col;
   				c[k].v=a[i].v+b[j].v;
   				k++;
   				
   			}
   			
   				}
   			}
   	    for(int i=0;i<n+m;i++) {
   	    	for(int j=i+1;j<n+m;j++) {
   	    		if(c[i].row==c[j].row&&c[i].col==c[j].col) {
   	    			c[i].v=c[j].v=0;
   	    		}
   	    	}
   	    }
   	
   	
   int j=0;
   for(int i=0;i<n+m;i++) {
   	
   	if(c[i].v!=0) {
   		System.out.println(c[i].row+" "+c[i].col+" "+c[i].v);
   		j++;
   	}
   }
   if(j==0)System.out.print("-1 -1 -1");

	}

}
