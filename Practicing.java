import java.util.Scanner;

public class Practicing{
public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	int num1 = (int)(Math.random() * 100);
	int num2 = (int)(Math.random() * 100);

	if (num1 < num2){
	int temp = num1;

	num1 = num2;
	num2 = num1;
	}
	
	System.out.println("What is " + num1 + " - " + num2 + "? ");
	int ans = scan.nextInt();

	if(num1 - num2 == ans){
	System.out.println("You answer is correct");
	}
	else
	{
	System.out.println("You answer is wrong");

	System.out.println(num1 + " - " + num2 + " should be " + (num1 - num2));
	}
}
}