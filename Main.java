/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
class MultiplicationTable2 extends Thread {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
  public void run() {
    for(int i=1; i<=10; i++) {
      System.out.println(a + " x " + i + " = " + a*i);
    }
  }

}

public class Main {

  public static void main(String[] args) {
    MultiplicationTable2 t1 = new MultiplicationTable2();
    MultiplicationTable2 t2 = new MultiplicationTable2();

    t1.start();
    t2.start();
  }

}