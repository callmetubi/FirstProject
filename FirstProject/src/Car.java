public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    // Constructor
    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    // Getter methods for fields
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter methods for fields
    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to simulate car delivery
    public void deliver(int quantityDelivered) {
        quantity += quantityDelivered;
    }

    // Method to simulate car sales
    public void sell(int quantitySold) {
        if (quantity >= quantitySold) {
            quantity -= quantitySold;
        } else {
            System.out.println("Not enough cars in stock to sell.");
        }
    }

    // toString method to represent the object as a string
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}


