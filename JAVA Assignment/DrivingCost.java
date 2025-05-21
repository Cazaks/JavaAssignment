import java.util.Scanner;

public class DrivingCost{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter driving distance ");
double distance = input.nextDouble();

System.out.print("Enter miles per gallon ");
double miles = input.nextDouble();

System.out.print("Enter prince per gallon ");
double price = input.nextDouble();

double cost = distance / miles * price;

System.out.printf("The cost of the trip is %f%n", cost);

}
}