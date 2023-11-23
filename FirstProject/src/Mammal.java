public class Mammal extends Animal{

    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println("Mammal is eating.");
    }

    @Override
    public String getVoice() {
        return "Mammal voice";
    }

    public void run() {
        System.out.println("Mammal is running.");
    }


}
// Dog.java
class Dog extends Mammal {
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }



    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public String getVoice() {
        return "Bark";
    }

    public void fetch() {
        System.out.println("Dog is fetching.");
    }
}


