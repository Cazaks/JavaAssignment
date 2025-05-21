import java.util.Scanner;

public class RunwayLength{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter Speed ");
double v = input.nextDouble();

System.out.print("Enter accelerator ");
double a = input.nextDouble();

double length = v * v / (2 * a);

System.out.printf("The minimum runway length is %f%n", length);

}

}