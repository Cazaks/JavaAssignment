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
}