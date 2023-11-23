public class Fish extends Animal{
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating.");
    }

    @Override
    public String getVoice() {
        return "Fish voice";
    }

    public void swim() {
        System.out.println("Fish is swimming.");
    }



}
// Blowfish.java
class Blowfish extends Fish {
    public Blowfish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println("Blowfish is eating.");
    }

    @Override
    public String getVoice() {
        return "Blub";
    }

    public void inflate() {
        System.out.println("Blowfish is inflating.");
    }
}

