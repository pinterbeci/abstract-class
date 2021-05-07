package practice;

public class Animal {

    private String name;
    private int weight;

    public Animal() {
    }

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("WÁÁÁÁÁÁÁÁ!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
