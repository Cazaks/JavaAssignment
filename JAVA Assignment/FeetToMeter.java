import java.util.Scanner;

pupblic class FeetToMeter{

public static void main(String[] args){

Scanner input new Scanner(System.in);

System.out.print("Number in feets ");
double feets = input.nextDouble();

double meters = feets * 0.305;

System.out.printf("%.2f feets is %.2f meeters %n", feets, meters);

}
}