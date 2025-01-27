package random;
 class Calculator  {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    String add(String a, String b) {
        return a + b;
    }

    int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Adding two integers: " + calc.add(5, 3));
        System.out.println("Adding two doubles: " + calc.add(3.5, 2.7));
        System.out.println("Adding three integers: " + calc.add(1, 2, 3));
        System.out.println("Concatenating strings: " + calc.add("Hello", "World"));
        System.out.println("Summing array: " + calc.add(new int[]{1,2,3,4,5}));
    }
}
    

