
//To check the given character is vowel or consonant


import java.util.Scanner;
 class Java5
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter character");
	    char c=sc.next().charAt(0);
	    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
	   		System.out.println("character  is vowel");
		else
		System.out.println("character is consonant");
	}
}
