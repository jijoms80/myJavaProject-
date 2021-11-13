package Restaurant;

public class CouponClass  {

	public CouponClass() {
	
}
	public double couponApply(int coupon, double food_cost, double delivery_cost) {

		if (coupon == 1) {
			food_cost = food_cost - (food_cost * .05);

		} else if (coupon == 2) {
			food_cost = food_cost - (food_cost * .1);

		} else if (coupon == 3) {
			food_cost = food_cost - 10;

		} else if (coupon == 4) {
			food_cost = food_cost - delivery_cost;

		} else if (coupon == 5) {
			food_cost = food_cost;

		}
		return food_cost;

	}

}
