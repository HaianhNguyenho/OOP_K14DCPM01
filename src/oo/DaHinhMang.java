package oo;

import java.util.ArrayList;
import java.util.List;

public class DaHinhMang {
    public static void main(String[] args) {
        
        Animal dsAnimal[] = new Animal[4];

        Dog dog = new Dog();
        Dog dog2 = new Dog();

        Cat cat = new Cat();
        Cat cat2 = new Cat();

        dsAnimal[0] = dog;
        dsAnimal[1] = dog2;
        dsAnimal[2] = cat;
        dsAnimal[3] = cat2;

        for (Animal animal : dsAnimal) {
            animal.makeNoise();
            
        }

        List<Pet> listPet = new ArrayList<>();
        Dog dogPet = new Dog();
        RobotDog robotDog = new RobotDog();
        Cat catPet = new Cat();

        listPet.add(dogPet);
        listPet.add(robotDog);
        listPet.add(catPet);

        for (Pet pet : listPet) {
            pet.beFriendly();
        }

    
    }
    
}
