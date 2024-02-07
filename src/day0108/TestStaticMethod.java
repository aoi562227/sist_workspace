package day0108;

@FunctionalInterface
interface Operation {
    void apply(int num1, int num2);
}

public class TestStaticMethod {

//    public static void plus(int num, int num2) {
//        int result = 0;
//        result = num + num2;
//        System.out.println(result);
//    }

    public static void nineToNine(int num, Operation operation) {
        if (1 < num && num < 10) {
            for (int i = 2; i < num + 1; i++) {
                for (int j = 1; j < 10; j++) {
                    operation.apply(i, j);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // Example of using lambda expression
        nineToNine(6, (i, j) -> System.out.println(i + " * " + j + " = " + i * j));
    }
}
