import java.util.Scanner;

	public class PrimeNumber{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = input.nextInt();

		int prime = 2;
		int counter = 1;

		while(prime < number){
		if(number % prime == 0){
		counter--;
		prime--;
		}
		

		if(counter > 0){
		System.out.print(number + " is not prime");
		} else
		{
		System.out.print(number + " is prime");
		}
		}
		
		
	}
}