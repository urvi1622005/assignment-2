package org.animals;

class Lion {
    String color;
    double weight;
    int age;

    Lion(String c, double w, int a) {
        color = c;
        weight = w;
        age = a;
    }

    boolean isVegetarian() {
        return false;
    }

    boolean canClimb() {
        return false;
    }

    String getSound() {
        return "Roar";
    }

    public String toString() {
        return "Lion - Color: " + color + ", Weight: " + weight + " kg, Age: " + age + " years";
    }
}

class Monkey {
    String color;
    double weight;
    int age;

    Monkey(String c, double w, int a) {
        color = c;
        weight = w;
        age = a;
    }

    boolean isVegetarian() {
        return true;
    }

    boolean canClimb() {
        return true;
    }

    String getSound() {
        return "Chatter";
    }

    public String toString() {
        return "Monkey - Color: " + color + ", Weight: " + weight + " kg, Age: " + age + " years";
    }
}

class Elephant {
    String color;
    double weight;
    int age;

    Elephant(String c, double w, int a) {
        color = c;
        weight = w;
        age = a;
    }

    boolean isVegetarian() {
        return true;
    }

    boolean canClimb() {
        return false;
    }

    String getSound() {
        return "Trumpet";
    }

    public String toString() {
        return "Elephant - Color: " + color + ", Weight: " + weight + " kg, Age: " + age + " years";
    }
}

public class Animal {
    public static void main(String[] args) {
        Lion lion = new Lion("Golden", 180.5, 7);
        Monkey monkey = new Monkey("Brown", 10.2, 3);
        Elephant elephant = new Elephant("Gray", 4000.0, 12);

        System.out.println(monkey);
        System.out.println("Is Vegetarian: " + lion.isVegetarian());
        System.out.println("Can Climb: " + lion.canClimb());
        System.out.println("Sound: " + monkey.getSound());
        System.out.println();

        System.out.println(elephant);
        System.out.println("Is Vegetarian: " + elephant.isVegetarian());
        System.out.println("Can Climb: " + elephant.canClimb());
        System.out.println("Sound: " + elephant.getSound());
    }
}
