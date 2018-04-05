public class VariablesAndNames {
	public static void main(String[] args){
		int cars, drivers, passengers, cars_not_driven, cars_driven, space_in_car;
		double carpool_capacity, average_passengers_per_car;
		
		cars = 100;
		space_in_car = 4;
		drivers = 30;
		passengers = 90;
		cars_not_driven = cars-drivers;
		cars_driven=drivers;
		carpool_capacity=cars_driven*space_in_car;
		average_passengers_per_car = passengers/cars_driven;
		
	System.out.println("there are " + cars + " cars available");
	System.out.println("there are only "+ drivers +" drivers available");
	System.out.println("there will be "+ cars_not_driven+" Empty cars today");
	System.out.println("we can transport "+ carpool_capacity+" people today");
	System.out.println("we have "+passengers+" to carpool today");
	System.out.println("we need to put about "+average_passengers_per_car+" in each car");
	}
}