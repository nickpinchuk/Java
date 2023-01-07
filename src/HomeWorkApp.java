public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumNumbers(10, 3) + "\n");
        numbersCheck(1);
        System.out.println(checkNumbers(-1) + "\n");
        linePrint("like this story", 4);
        System.out.println(leapYear(100));

    }

    private static void printThreeWords() {
        System.out.println(" Orange \n Banana \n Apple \n ");
    }

    private static void checkSumSign() {
        int a = -5;
        int b = 3;
        if ((a + b) >= 0) {
            System.out.println("The sum is positive \n ");
        } else {
            System.out.println("The sum is negative \n ");
        }
    }

    private static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Color Red \n ");
        } else if (value <= 100) {
            System.out.println("Color Yellow \n ");
        } else {
            System.out.println("Color Green \n ");
        }

    }

    private static void compareNumbers() {
        int a = 4;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b \n ");
        } else {
            System.out.println("a < b \n");
        }
    }

    private static boolean checkSumNumbers(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    private static void numbersCheck(int a) {
        if (a >= 0) {
            System.out.println("Number positive \n");
        } else {
            System.out.println("Number negative \n");
        }
    }

    private static boolean checkNumbers(int a) {

        return a < 0;
    }

    private static void linePrint(String line, int quantity) {
        for (int i = 1; i <= quantity; i++) {
            System.out.println(line);
        }
    }

    private static boolean leapYear(int y) {
        return ((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0);
    }

}