



import java.util.Scanner;


public class Jav3

{ public static void main(String[]args){
    int c;
    System.out.println("Enter two numerical values to swap");
    Scanner s= new Scanner(System.in);
    int a= s.nextInt();
    int b=s.nextInt();
    c=a;
    a=b;
    b=c;
    

    System.out.println("The value of a is "+a);
     System.out.println("The value of b is "+b);
}
    
    
}

