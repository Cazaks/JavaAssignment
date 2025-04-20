public class NaturalNumbers{

public static void main(String[] args){

	int number = 0;
	int sum = 0;
	

	while(number <= 10){
	sum = sum + number;
	number = number+1;
	}

	System.out.printf("The sum of the first 10 natural number is: %d", sum);


}
}