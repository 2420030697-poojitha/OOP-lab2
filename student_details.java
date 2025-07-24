import java.util.Scanner;
public class student_details {
	public static void main(String[] args) {
		String name;
		int age;
		String rollno;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		name=sc.nextLine();
		System.out.print("Enter your age: ");
		age=sc.nextInt();
		sc.nextLine(); 
		System.out.print("Enter your Roll number: ");
		rollno=sc.nextLine();
		
		System.out.println("\nUser Information:");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Roll Number: " + rollno);
		
	}

}