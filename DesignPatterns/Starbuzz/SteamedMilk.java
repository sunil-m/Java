package Starbuzz;

public class SteamedMilk extends CondimentDecorator {

	Beverage beverage;
	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
	}

	public double cost() {
		return 0.1 + beverage.cost();
	}

}
