import java.util.Scanner;

public class AtmMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 1000;
        int option = -1;

        while (option != 0) {
            System.out.println("=== ATM Menu ===");
            System.out.println("1: 查詢餘額");
            System.out.println("2: 存款");
            System.out.println("3: 提款");
            System.out.println("0: 離開");
            System.out.print("請輸入選項：");
            
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("目前帳戶餘額為：" + balance + " 元");
                    break;

                case 2:
                    System.out.print("請輸入存款金額：");
                    int deposit = sc.nextInt();

                    while (deposit <= 0) {
                        System.out.print("存款金額必須大於 0，請重新輸入：");
                        deposit = sc.nextInt();
                    }

                    balance += deposit;
                    System.out.println("存款成功！已存入 " + deposit + " 元，目前餘額：" + balance + " 元");
                    break;

                case 3:
                    System.out.print("請輸入提款金額：");
                    int withdraw = sc.nextInt();

                    // 輸入驗證 2（規則 3 & 4）：提款金額必須大於 0，且不能大於目前餘額
                    while (withdraw <= 0 || withdraw > balance) {

                    if (withdraw <= 0) {
                            System.out.print("提款金額必須大於 0，請重新輸入：");
                        } else {
                            System.out.print("餘額不足（目前餘額 " + balance + " 元），請重新輸入提款金額：");
                        }
                        withdraw = sc.nextInt();
                    }

                    // 更新餘額並顯示結果
                    balance -= withdraw;
                    System.out.println("提款成功！已吐出 " + withdraw + " 元，目前餘額：" + balance + " 元");
                    break;

                case 0:
                    System.out.println("感謝使用本 ATM 系統，謝謝光臨！");
                    break;

                default:
                    System.out.println("無效選項，請輸入 0 ~ 3 之間的數字。");
                    break;
            }
            System.out.println();
        }
        sc.close();
    }
}
