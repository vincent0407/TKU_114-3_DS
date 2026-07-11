import java.util.Scanner;

public class OrderSystem_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAmount = 0;

        int totalItems = 0;
        
        int option = -1; 

        while (option != 0) {
            // 輸出範例中的選單畫面
            System.out.println("=== Order Menu ===");
            System.out.println("1. Black tea  $30");
            System.out.println("2. Green tea  $35");
            System.out.println("3. Coffee     $50");
            System.out.println("0. Checkout");
            System.out.print("請輸入選項：");
            
            option = sc.nextInt();

            if (option == 0) {
                break; 
            }

            int price = 0;
            String itemName = "";

            switch (option) {
                case 1:
                    itemName = "Black tea";
                    price = 30;
                    break;
                case 2:
                    itemName = "Green tea";
                    price = 35;
                    break;
                case 3:
                    itemName = "Coffee";
                    price = 50;
                    break;
                default:
                    System.out.println("無效的選項，請重新輸入。");
                    continue; 
            }

            System.out.print("請輸入數量：");
            int quantity = sc.nextInt();

            while (quantity <= 0) {
                System.out.print("數量不合法，請重新輸入：");
                quantity = sc.nextInt();
            }

            int subtotal = price * quantity;
            System.out.println("Subtotal: " + subtotal);
            System.out.println(); 

            totalAmount += subtotal;

            totalItems += quantity;
        }

        System.out.println();
        System.out.println("=== Receipt ===");
        System.out.println("Total items: " + totalItems);
        System.out.println("Total amount: " + totalAmount);

        sc.close();
    }
}