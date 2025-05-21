import java.util.Scanner;

public class Geometry{

public static void main(String[] args){

Scanner input = new system(System.in);

System.out.print("Enter y1 and 1 ");
double side1 = input.nextDouble();

System.out.print("Enter x2 and y2 ");
double side2 = input.nextDouble();

System.out.print("Enter x3 and y3 ");
double side3 = input.nextDouble();

double s = (side1 + side2 + side3) / 2;

double area = Math.squr (s(s - side1)(s - side2)(s - side3));

System.out.printf("Area of the triangle is %f%n", area);


}
}