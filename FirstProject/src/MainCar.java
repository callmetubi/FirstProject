public class MainCar {
    public static void main(String[] args) {
        // Create a car object using the constructor
        Car myCar = new Car("Model X", "Tesla", 2023, 80000.0, "Black", 10);

        // Print the initial state of the car object using toString
        System.out.println("Initial Car State:");
        System.out.println(myCar);

        // Simulate selling 3 cars
        myCar.sell(3);

        // Print the car's state after selling
        System.out.println("\nCar State After Selling 3 Cars:");
        System.out.println(myCar);

        // Use setter methods to change some fields
        myCar.setModel("Model S");
        myCar.setPrice(75000.0);

        // Print the car's state after making changes
        System.out.println("\nCar State After Changing Model and Price:");
        System.out.println(myCar);
    }
}
