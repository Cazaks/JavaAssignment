import java.util.Scanner;

public class InterestRate{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter investment amount ");
double investAmount = input.nextDouble();

System.out.print("Enter annual interest rate ");
double annualInterestRate = input.nextDouble();

System.out.print("Enter number of years ");
double numberOfYears = input.nextDouble();

double monthlyInterestRate = (annualInterestRate / 100) / 12; 

double futureInvestment =  investAmount * Math.pow ((1 + monthlyInterestRate), (numberOfYears * 12));

System.out.printf("Accumolated value is %.2f%n", futureInvestment); 
}
}