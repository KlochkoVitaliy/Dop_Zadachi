package Task_6;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {

        // Task 1.2 / 6
        System.out.println();
        System.out.println(ANSI_YELLOW + "1.2 Переменные / Задача 6" + ANSI_RESET);
        System.out.println();

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        int x = Math.abs(result);

        System.out.println(ANSI_GREEN+ "result =   " +ANSI_RESET+ x);
    }
}
