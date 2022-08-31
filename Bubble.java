import java.util.*;
public class Bubble {
	
	public static int[] Bubbl(int ar[]){
		int n=ar.length;
		   int temp=0;
		    for(int i=0;i<n-1;i++){ //Loop will iterate at n-1 times
		    
		    	for(int j=0;j<n-i-1;j++) { 
		    		if(ar[j]>ar[j+1]) {    //comparing two elements at time
		    			
		    			temp=ar[j];
		    			ar[j]=ar[j+1];
		    		    ar[j+1]=temp;
		    		}
		    	}
		    }
		    return ar;
		    
	}
	
	public static void main(String args[]) {
		int ar[]= {10,36,1,9,8};
		int sortedAr[]=Bubbl(ar);//calling Bubble sort method by passing given Array
	    //printing array
	    for(int k:sortedAr) {
	    	System.out.println(k);
	    }
	   
	}
	
}
