package Assignments;

import java.util.Scanner;

public class EmployyeMain {
	public static void main(String[] args) {
		String empname;
		double hours;
		double pay;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first employee name");
		empname = scan.next();
		System.out.println("enter the hours");
		hours = scan.nextDouble();
		System.out.println("enter the hourly pay");
		pay = scan.nextDouble();
		Employee employee1 = new Employee(empname, hours, pay);

		System.out.println("Please enter second employee name");
		empname = scan.next();
		System.out.println("enter the hours");
		hours = scan.nextDouble();
		System.out.println("enter the hourly pay");
		pay = scan.nextDouble();
		Employee employee2 = new Employee(empname, hours, pay);

		System.out.println("Please enter thrid employee name");
		empname = scan.next();
		System.out.println("enter the hours");
		hours = scan.nextDouble();
		System.out.println("enter the hourly pay");
		pay = scan.nextDouble();

		Employee employee3 = new Employee(empname, hours, pay);

		System.out.println("Gross Pay of " + employee1.employeeName + " = " + employee1.grossPay());
		System.out.println("Gross Pay of " + employee2.employeeName + " = " + employee2.grossPay());
		System.out.println("Gross Pay of " + employee3.employeeName + " = " + employee3.grossPay());
		scan.close();
	}

}
