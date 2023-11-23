public abstract class Animal {
    private String name;
    private int age;
    private double weight;


    public Animal(){
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void eat();

    public abstract String getVoice();


    // AnimalName.java
    public interface AnimalName {
        String getName();
    }

    // AnimalMove.java
    public interface AnimalMove {
        void move();
    }

    // AnimalBehavior.java
    public interface AnimalBehavior {
        void behave();
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight;
    }
}
