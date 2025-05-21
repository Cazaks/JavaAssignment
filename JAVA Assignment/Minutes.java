import java.util.Scanner;

public class Minutes{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Number of minuntes ");
int minutes = input.nextInt();

int minutesInYear = minutes / (365 * 24 * 60);

int lostMinutes = minutes % (365 * 24 * 60);
int days = lostMinutes / (24 * 60);

System.out.printf("%d minutes is approximately %d years and %d days%n", minutes, minutesInYear, days );
}
}