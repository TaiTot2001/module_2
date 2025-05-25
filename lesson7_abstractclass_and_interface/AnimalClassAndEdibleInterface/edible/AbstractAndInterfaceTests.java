package AnimalClassAndEdibleInterface.edible;

import AnimalClassAndEdibleInterface.edible.animal.Animal;
import AnimalClassAndEdibleInterface.edible.animal.Chicken;
import AnimalClassAndEdibleInterface.edible.animal.Tiger;
import AnimalClassAndEdibleInterface.edible.edible.Edible;
import AnimalClassAndEdibleInterface.edible.fruit.Apple;
import AnimalClassAndEdibleInterface.edible.fruit.Fruit;
import AnimalClassAndEdibleInterface.edible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] =new Orange();
        fruits[1] =new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
