import java.util.Scanner;
	public class WhileLoop{

	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	/*int count = 0;
	while(count <= 100){
	System.out.println("Welcome to java");
	count++;
	}

	for(int count = 0; count <= 100; count++){
	System.out.println("Welcome to java");
	}

	int counter = 1;
	int sum = 0;
	while(counter <= 10){
	sum = sum + counter;
	counter++;
	}
	System.out.println("The sum is " + sum);

	int sumation = 0;
	for(int add = 1; add <= 10; add++){
	sumation = sumation + add;
	}
	System.out.println("The sum is " + sumation);

	int num1 = (int)(Math.random() * 10);
	int num2 = (int)(Math.random() * 10);

	System.out.println("What is " + num1 + " + " + num2 + "? ");
	int ans = scan.nextInt();
	
	while(num1 + num2 != ans){
	System.out.println("You answer is wrong.  Try again. What is "         	+ num1 + " + " + num2 + "? ");
 	ans = scan.nextInt();
	}
	
	System.out.println("You got it! Congratulation");*/	

	int number = (int)(Math.random() * 101);
	System.out.println("Guess a number between 1 and 100");

	int guess = 0;
	while(guess != number){
	System.out.println("\nEnter a guess number");
	guess = scan.nextInt();

		if (guess == number){
		System.out.print("Your guess is correct. Congratulation! " + number + " is the correct guess");
		}
		else if(guess > number){
		System.out.print("Number too high, try again");
		}
		else
		System.out.print("Number too low, try again");
	}

}

}
	