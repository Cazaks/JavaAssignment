// import your scanner

// class decleration

// method decleration

// prompt scanner

//prompt input frpm the users


import java.util.Scanner;

	public class SumProductAverage{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter dollar to RMB exchange rate: ");
		double dollarsChiness = input.nextDouble();

		System.out.print("Enter 0 to convert dollar: ");
		double dollarsConvert = input.nextDouble();

		System.out.print("Enter to 1 convert RMB to dollar: ");
		double convertDollars = input.nextDouble();

		System.out.print("Enter amount to convert from Chinese to US or from US to Chinese ");
		double exhangeAmount = input.nextDouble();

		
		double convert = dollarsConvert * exhangeAmount;

		if(convert == 0){
		System.out.printf("$100 is %f yuan", exhangeAmount, convert);
		}

		if(convert == 1){
		System.out.printf("$100 is %f yuan", exhangeAmount, convertDollars );
		}

		

		

}


}