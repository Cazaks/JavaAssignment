import java.util.Scanner;

	public class FactorsOfNumber{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = input.nextInt();

		int counter;

		System.out.print("The factors of " + number + " are: ");
		for(counter = 1; counter <= number; counter++){
		if(number % counter == 0){

		System.out.print(counter + " ");
		}
		}

		
	}
}