import java.util.Scanner;

	public class GradeScores{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 10 valid scores between 1 and 100");
		int scores = input.nextInt();

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		int validScores = 0;
		int invalidScores = 0;

	for(scores = 1; scores <= 10;){
		
		if(scores < 0 || scores > 100){
		System.out.println("Invalid scores. ");
		invalidScores++;
		continue;
		}
		else if(scores >= 0 && scores <= 100){
		validScores++;
		}

	switch(scores / 10){

		case 8, 9, 10: System.out.println("The student got an A");
		a++;
		break;
		
		case 7: System.out.println("The student got a B");
		b++;
		break;

		case 6: System.out.println("The student got a C");
		c++;
		break;

		case 5: System.out.println("The student got a D");
		d++;
		break;

		case 0, 1, 2, 3, 4: System.out.println("The student got an F");
		f++;
		break;

	}
	}
	
	System.out.println("Number of valid scores is: " + validScores);
	System.out.println("Number of invalid scores is: " + invalidScores);
	System.out.println("Number of grade A scores is: " + a);
	System.out.println("Number of grade B scores is: " + b);	
	System.out.println("Number of grade C scores is: " + c);	
	System.out.println("Number of grade D scores is: " + d);
	System.out.println("Number of grade F scores is: " + f);
}

}