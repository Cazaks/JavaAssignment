public class KataEvenOdd{

public static boolean isEvenNumber(int number){

	if(number % 2 == 0){
		return true;
		}
	if(number % 2 != 0){
		
		}
		return false;
	}

public static boolean isPrime(int number) {
	
	
	for(int i = 2; i <= number / 2; i++){

	if(number % i == 0){
	return false;
	}
	}
	return true;
	
	}


public static int subtract(int number1, int number2) {

	if(number1 < number2){
	return number2 - number1;
	} 
	return number1 - number2; 

	}

public static float divide(int firstNumber, int secondNumber) {

	int quotient = 0;
	if (secondNumber == 0){
	return secondNumber = quotient;
	}
	return (float) firstNumber / secondNumber;

	}

public static int factorsOf(int number){
	int factor_counter = 0;
	for(int counter = 1; counter <=number; counter++){
	if(number % counter == 0){
	factor_counter = factor_counter + 1;
	}
	}

	return factor_counter;

	}

public static long factorialOf(int number) {

	long factorial = 1;
	for(int count = 1; count <= number; count++){
	factorial = factorial * count;
	}
	return factorial;

	}

public static boolean isPalindrom(int numbers) {

	int firstDivid = (numbers / 10000);
	int secondDivid = (numbers / 1000) % 10;
	int thirdDivid = (numbers / 100) % 10;
	int fourthDivid = (numbers / 10) % 10;
	int fiftDivid = numbers % 10;

	if (firstDivid == fiftDivid || secondDivid == fourthDivid){
	return true;
	}
	else{return false;
	}
	}

public static long sqaureOf(int number){

	long square = 1;
	for(int count = 1; count <= number; count++){
		
		
		}
	





	}

	
}







