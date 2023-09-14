//TO display the 


import java.util.Scanner;

public class AG
{
	public static void main(String[] args) {
	    
	    
	  String s1="Adarsh Goyal";
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice (1 or 0)");
		int choice=sc.nextInt();
		
		switch(choice){
		    case 0:System.out.println(s1.toLowerCase());
		    break;
		     case 1:System.out.println(s1.toUpperCase());
		     break;
		     default:
		      System.out.println("Please enter a valid choice");
		}
	}
}
