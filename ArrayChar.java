public class ArrayChar{

public static void main(String[] args){



	char[][] numbers = new char [3][3];
	numbers[0] [0] = 'X';
	numbers[0] [1] = '0';
	numbers[0] [2] = 'X';
	
	numbers[1] [0] = '0';
	numbers[1] [1] = '0';
	numbers[1] [2] = '0';

	numbers[2] [0] = 'X';
	numbers[2] [1] = 'X';
	numbers[2] [2] = '0'; 

	for(int count = 0; count < numbers.length; count++){

	System.out.println(numbers [count]);
	}






}
}