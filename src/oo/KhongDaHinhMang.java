package oo;

public class KhongDaHinhMang {
    public static void main(String[] args) {
        
        //ds ca con cho
        Dog dsDog[] = new Dog[2];

        Dog dog = new Dog();
        Dog dog2 = new Dog();

        dsDog[0] = dog;
        dsDog[1] = dog2;

        for (Dog d : dsDog) {
            d.makeNoise();
        }

        //Quản lý mấy con chuột
        Cat dsCat[] = new Cat[2];
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        dsCat[0] = cat;
        dsCat[1] = cat2;

        for (Cat c : dsCat) {
            c.makeNoise();
        }

    }
    
}
