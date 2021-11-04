package Assignments;

public class AmusementPark {
	double height;
	double weight;

	public AmusementPark(double new_height, double new_weight) {
		this.height = new_height;
		this.weight = new_weight;
	}

	public void AmusementParkRide() {
		if (height >= 90 && height <= 200 && weight >= 15 && weight <= 95) {
			System.out.println("Permitted to the ride ");
		} else
			System.out.println("Not permitted to the ride ");
		{
		}
	}
}
