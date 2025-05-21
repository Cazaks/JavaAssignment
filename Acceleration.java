import java.util.Scanner;

public class Acceleration{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter starting velocity ");
double velocity0 = input.nextDouble();

System.out.print("Enter ending velocity ");
double velocity1 = input.nextDouble();

System.out.print("Enter starting velocity ");
double time = input.nextDouble();

double acceleration = (velocity1 - velocity0) / time;

System.out.printf("The average acceleration is %f%n", acceleration);



}
}