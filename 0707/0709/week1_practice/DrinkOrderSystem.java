import java.util.Scanner;

public class DrinkOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int blackTeaCount = 0;
        int greenTeaCount = 0;
        int milkTeaCount = 0;
        int coffeeCount = 0;

        int totalAmount = 0; 

        while (true) {
            printMenu();
            int option = sc.nextInt();

            if (option == 0) {
                break;
            }

            int price = getPrice(option);
            if (price == -1) {
                System.out.println("無效的選項，請重新輸入。");
                System.out.println();
                continue;
            }

            String itemName = getItemName(option);
            int quantity = readValidQuantity(sc);

            int subtotal = calculateSubtotal(price, quantity);
            System.out.println(itemName + " x " + quantity);
            System.out.println("Subtotal: " + subtotal);
            System.out.println();

            totalAmount += subtotal;

            switch (option) {
                case 1: blackTeaCount += quantity; break;
                case 2: greenTeaCount += quantity; break;
                case 3: milkTeaCount += quantity; break;
                case 4: coffeeCount += quantity; break;
            }
        }

        printReceipt(blackTeaCount, greenTeaCount, milkTeaCount, coffeeCount, totalAmount);

        sc.close();
    }

    public static void printMenu() {
        System.out.println("=== Drink Menu ===");
        System.out.println("1. Black tea  $30");
        System.out.println("2. Green tea  $35");
        System.out.println("3. Milk tea   $45");
        System.out.println("4. Coffee     $50");
        System.out.println("0. Checkout");
        System.out.print("請輸入選項：");
    }

    public static int getPrice(int option) {
        switch (option) {
            case 1: return 30;
            case 2: return 35;
            case 3: return 45;
            case 4: return 50;
            default: return -1;
        }
    }

    public static String getItemName(int option) {
        switch (option) {
            case 1: return "Black tea";
            case 2: return "Green tea";
            case 3: return "Milk tea";
            case 4: return "Coffee";
            default: return "";
        }
    }

    public static int readValidQuantity(Scanner sc) {
        System.out.print("請輸入數量：");
        int quantity = sc.nextInt();
        while (quantity <= 0) {
            System.out.print("數量必須大於 0，請重新輸入：");
            quantity = sc.nextInt();
        }
        return quantity;
    }

    public static int calculateSubtotal(int price, int quantity) {
        return price * quantity;
    }

    public static int calculateDiscountedTotal(int totalAmount) {
        if (totalAmount >= 300) {
            return (int) (totalAmount * 0.9);
        }
        return totalAmount;
    }

    public static void printReceipt(int blackTeaCount, int greenTeaCount, int milkTeaCount, int coffeeCount, int totalAmount) {
        int totalItems = blackTeaCount + greenTeaCount + milkTeaCount + coffeeCount;
        int finalAmount = calculateDiscountedTotal(totalAmount);
        String hasDiscount = (totalAmount >= 300) ? "Yes (10% off)" : "No";

        System.out.println();
        System.out.println("=== Receipt ===");
        System.out.println("Black tea: " + blackTeaCount);
        System.out.println("Green tea: " + greenTeaCount);
        System.out.println("Milk tea: " + milkTeaCount);
        System.out.println("Coffee: " + coffeeCount);
        System.out.println("Total items: " + totalItems);
        System.out.println("Original amount: " + totalAmount);
        System.out.println("Discount: " + hasDiscount);
        System.out.println("Final amount: " + finalAmount);
    }
}
