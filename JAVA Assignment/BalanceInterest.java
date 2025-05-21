import java.util.Scanner;

public class BalanceInterest{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter balance ");
double balanceInterest = input.nextDouble();

System.out.print("Enter interest rate ");
double annualInterestRate = input.nextDouble();

double interest = balanceInterest * (annualInterestRate / 1200);

System.out.printf("The interest rate is %f%n", interest);
}
}