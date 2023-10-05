




public class Array{
    public static void main(String[] args) {
       
        int[] numbers = {9, 3, 7, 8, 10};
       
       
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
       
        
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of all elements: " + sum);
    }
}