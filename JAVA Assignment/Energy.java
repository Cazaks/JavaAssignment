import java.util.Scanner;

public class Energy{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the amount of water ");
double amountOfWater = input.nextDouble();

System.out.print("Enter initial temperature ");
double initialTemperature = input.nextDouble();

System.out.print("Enter final temperature ");
double finalTemperature = input.nextDouble();

double Q = amountOfWater * (finalTemperature - initialTemperature ) * 4184;

System.out.printf("The energy needed is %f%n", Q);

}
}