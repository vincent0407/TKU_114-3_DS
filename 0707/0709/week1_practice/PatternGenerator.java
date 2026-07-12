import java.util.Scanner;

public class PatternGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            printMenu();
            int option = sc.nextInt();

            if (option == 0) {
                break;
            }

            switch (option) {
                case 1:
                    printMultiplicationTable();
                    break;
                case 2:
                    int triHeight = readPositiveInt(sc, "請輸入正三角形高度：");
                    printTriangle(triHeight);
                    break;
                case 3:
                    int revHeight = readPositiveInt(sc, "請輸入倒三角形高度：");
                    printReverseTriangle(revHeight);
                    break;
                case 4:
                    int rows = readPositiveInt(sc, "請輸入列數：");
                    int cols = readPositiveInt(sc, "請輸入欄數：");
                    printNumberGrid(rows, cols);
                    break;
                default:
                    System.out.println("無效選項，請重新輸入。");
                    break;
            }
            System.out.println(); 
        }

        sc.close();
    }

    public static void printMenu() {
        System.out.println("=== Pattern Menu ===");
        System.out.println("1. 九九乘法表");
        System.out.println("2. 正三角形星號");
        System.out.println("3. 倒三角形星號");
        System.out.println("4. 數字方格");
        System.out.println("0. 離開");
        System.out.print("請輸入選項：");
    }

    public static int readPositiveInt(Scanner sc, String message) {
        System.out.print(message);
        int value = sc.nextInt();
        while (value <= 0) {
            System.out.print("輸入必須大於 0，請重新輸入：");
            value = sc.nextInt();
        }
        return value;
    }

    public static void printMultiplicationTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printReverseTriangle(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printNumberGrid(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
