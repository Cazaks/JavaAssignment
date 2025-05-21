import java.util.Scanner;

public class PoundsKilograms{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter number in pounds ");
double poundsNumber = input.nextDouble();

double poundsToKilograms = poundsNumber * 0.454;

System.out.printf("poundsToKilograms is %f0%n kilograms", poundsToKilograms);

}
}