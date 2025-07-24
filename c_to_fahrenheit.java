import java.util.Scanner;

public class c_to_fahrenheit {
	public static void main(String[] args) {
		int fahrenheit;
		System.out.println("Enter the temp: ");
		Scanner sc=new Scanner(System.in);
		fahrenheit= sc.nextInt();
		int c = (fahrenheit - 32)*5/9;
		System.out.println("The temp in c= " +c);
	}
}
