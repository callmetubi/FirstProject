public class Bird extends Animal {
    private String featherColor;

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating.");
    }

    @Override
    public String getVoice() {
        return "Bird voice";
    }

    public void fly() {
        System.out.println("Bird is flying.");
    }

}
// Pigeon.java
class Pigeon extends Bird {
    private String species;

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("Pigeon is eating.");
    }

    @Override
    public String getVoice() {
        return "Coo";
    }

    public void coo() {
        System.out.println("Pigeon is cooing.");
    }
}



