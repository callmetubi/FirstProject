public class MainAnimal {
    public static void main(String[] args) {
        // Create an array of Animal references
        Animal[] animals = new Animal[4];

        // Create objects using different constructors
        animals[0] = new Dog("Buddy", 3, 15.5);
        animals[1] = new Pigeon("Pidgey", 2, 0.5, "Gray", "Rock Pigeon");
        animals[2] = new Blowfish("Bubbles", 1, 0.2);
        animals[3] = new Mammal("Generic Mammal", 5, 10.0);  // Demonstrating abstract class instantiation

        // Call selected methods on individual indexes
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
            System.out.println("Voice: " + animal.getVoice());

            if (animal instanceof Mammal) {
                ((Mammal) animal).run();
            } else if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly();
            } else if (animal instanceof Pigeon) {
                ((Pigeon) animal).coo();
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim();
            } else if (animal instanceof Blowfish) {
                ((Blowfish) animal).inflate();
            }

            System.out.println("-------------");



        }
    }
}
