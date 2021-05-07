package practice;

import javax.crypto.spec.PSource;

public class Cat extends Animal {

    public Cat() {
    }


    public Cat(String name) {
        this.setName(name);
    }

    public Cat(String name, int weight) {

        this.setName(name);
        this.setWeight(weight);
    }

    public void purr(){
        System.out.println("dohombohááááás!");
    }

    @Override
    public void makeSound() {

        System.out.println("MEOW!");
    }

    @Override
    public String toString() {
        return "macska vaook gecc, így híjnak la: " + this.getName();
    }
}


