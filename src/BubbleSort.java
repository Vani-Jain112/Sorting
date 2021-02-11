import java.util.*;
public class BubbleSort
{
	static void bubble_sort(int[] a)
	{  
        int n=a.length;  
        int temp=0;  
         for(int i=0;i<n;i++)
         {
        	 for(int j=1;j<(n-i);j++)
        	 {
        		 if(a[j-1]>a[j])
        		 {
        			 //swap elements
        			 temp=a[j-1];
        			 a[j-1]=a[j];
        			 a[j]=temp;
        		 }
        	 }  
         }
    } 
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub	
		int a[] ={3,60,35,2,45,320,5};  
        System.out.println("Array Before Bubble Sort:");  
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");  
        }  
        System.out.println(); 
        bubble_sort(a);	//to sort elements of the array using bubble sort   
        System.out.println("Array After Bubble Sort:");  
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");  
        }
	}
}