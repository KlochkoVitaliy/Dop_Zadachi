package Task_8;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {

        // Task 1.2 / 8
        System.out.println();
        System.out.println(ANSI_YELLOW + "1.2 Переменные /  Задача 8" + ANSI_RESET);
        int a = 128;
        int b = 0, count = 0;
        b = Math.abs(a);
        for (int i = b; i != 0; i = i / 10)
            count++;
        if (count % 2 == 1) {
            for (int i = 1; i <= count / 2; i++) {
                b = b / 10;
            }
            int result = b % 10;
            System.out.println("result = " + result);
        }
    }
}
