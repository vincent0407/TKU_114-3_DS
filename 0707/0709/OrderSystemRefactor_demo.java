import java.util.Scanner;

public class OrderSystemRefactor_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalAmount = 0;
        int totalItems = 0;
        int option = -1;

        while (option != 0) {

            printMenu();
            option = sc.nextInt();

            if (option == 0) {
                break;
            }

            int price = getPrice(option);

            if (price == -1) {
                System.out.println("無效的選項，請重新輸入。");
                System.out.println();
                continue;
            }

            int quantity = readValidQuantity(sc);

            int subtotal = calculateSubtotal(price, quantity);
            System.out.println("Subtotal: " + subtotal);
            System.out.println();

            totalAmount += subtotal;
            totalItems += quantity;
        }

        printReceipt(totalItems, totalAmount);

        sc.close();
    }

    public static void printMenu() {
        System.out.println("=== Order Menu ===");
        System.out.println("1. Black tea  $30");
        System.out.println("2. Green tea  $35");
        System.out.println("3. Coffee     $50");
        System.out.println("0. Checkout");
        System.out.print("請輸入選項：");
    }

    public static int getPrice(int option) {
        switch (option) {
            case 1: return 30;
            case 2: return 35;
            case 3: return 50;
            default: return -1;
        }
    }

    public static int readValidQuantity(Scanner sc) {
        System.out.print("請輸入數量：");
        int quantity = sc.nextInt();

        while (quantity <= 0) {
            System.out.print("數量不合法，請重新輸入：");
            quantity = sc.nextInt();
        }
        return quantity;
    }

    public static int calculateSubtotal(int price, int quantity) {
        return price * quantity;
    }

    public static void printReceipt(int totalItems, int totalAmount) {
        System.out.println();
        System.out.println("=== Receipt ===");
        System.out.println("Total items: " + totalItems);
        System.out.println("Total amount: " + totalAmount);
    }
}
