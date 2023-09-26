
//Write a program to initialize and print the array...............
import java.util.*;
public class Array1
{
	public static void main(String[] args) {
	    int size;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter size");
	    size=sc.nextInt();
	    
	    int a[]=new int[size];
	    for(int i=0;i<size;i++)
	    {
	        a[i]=i;
	    }
	    System.out.println("The array is");
	     for(int i=0;i<size;i++)
	     {
		System.out.print(a[i]);
	}
}}
