




public class Sum {
	
	public static void main(String[] args) {
		
		int i, j, sum;	
	
		int[][] SumOfRows_arr = {{15, 25, 35}, {45, 55, 65}, {75, 85, 95}};
	
		
		for(i = 0; i < SumOfRows_arr.length; i++)
		{
			sum = 0;
			for(j = 0; j < SumOfRows_arr[0].length; j++)
			{
				sum = sum + SumOfRows_arr[i][j];
			}
			System.out.println("\nThe Sum of Matrix Items in  " + i + " row = " + sum);
		}
	}
}