package Assignments;

public class Employee {

	String employeeName;
	double NoOfHours;
	double hourlyPay;
	double grossPay;
	double overtime;

	public Employee(String name, double hours, double pay) {

		this.employeeName = name;
		this.NoOfHours = hours;
		this.hourlyPay = pay;
	}

	public double grossPay() {
		if (NoOfHours < 40) {
			grossPay = NoOfHours * hourlyPay;
		} else if (NoOfHours <= 60) {
			overtime = (NoOfHours - 40) * 1.5 * hourlyPay;
			grossPay = (40 * hourlyPay) + overtime;
		} else {
			System.out.println("   over time is exceed "+employeeName   );
		}

		return grossPay;
	}

}
