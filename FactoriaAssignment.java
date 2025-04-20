import java.util.Scanner;

	public class FactoriaAssignment{

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = input.nextInt();

		int counter = 0;
		int factoria = 1;
		counter = number;

		while(counter != 0){
		factoria = factoria * counter;
		counter--;
		}

		System.out.println("The factoria of the number is " + factoria);
	}
}