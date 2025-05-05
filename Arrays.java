public class Arrays{

public static void main(String[] args){

	int[] numbers = new int[5];

	numbers [0] = 22;
	numbers [1] = 51;
	numbers [2] = 38;
	numbers [3] = 23;
	numbers [4] = 48;

	System.out.print(numbers [0] + " ");
	System.out.print(numbers [1] + " ");
	System.out.print(numbers [2] + " ");
	System.out.print(numbers [3] + " ");
	System.out.print(numbers [4] + " "); 

	System.out.println(numbers [0] + " ");
	System.out.println(numbers [1] + " ");
	System.out.println(numbers [2] + " ");
	System.out.println(numbers [3] + " ");
	System.out.println(numbers [4] + " ");

	int total = 0;
	for(int counter = 0; counter < numbers.length; counter++){
	
	total = total + numbers[counter];
}
	System.out.print(total);

}
}