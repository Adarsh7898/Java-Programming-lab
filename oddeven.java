




//create an integer arrayof positive numbers and print the number of even and oodd elements int the array.....




import java.util.Arrays;
public class oddeven
{
	public static void main(String[] args) {
	    
	    int a[]={4546,767,55,4545,66,77,22,67};
	   int  even=0;
	   int  odd=0;
	    
	  for(int i=0;i<a.length-1;i++){
	      if(a[i]%2==0){
	          even=even+1;
	      }
	      else{
	          odd=odd+1;
	      }
	  }
	    System.out.println("Number od even elements is"+even);
	    System.out.println("Number od odd elemennts  is"+odd);
	    
	
	}
}