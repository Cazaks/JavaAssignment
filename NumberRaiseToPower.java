import java.util.Scanner;

	public class NumberRaiseToPower{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int firstNumber = input.nextInt();

		System.out.println("Enter second number: ");
		int secondNumber = input.nextInt();

		int result = 0;
		int power = 1;

		while(result != secondNumber){
		power = power * firstNumber;
		result++;
		}

		System.out.printf("The value of one number rase to the power of another is: %d", power);
		
	}
}