import java.util.Scanner;

public class StudyMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Review Java");
        System.out.println("2. Practice loops");
        System.out.println("3. Push to GitHub");
        System.out.println("0. Exit");
        System.out.print("請輸入選項：");
        
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Review Java");
                break;
            case 2:
                System.out.println("Practice loops");
                break;
            case 3:
                System.out.println("Push to GitHub");
                break;
            case 0:
                System.out.println("Bye"); // 依照範例習慣，離開時輸出 Bye
                break;
            default:
                System.out.println("Unknown option"); // 處理無效輸入
                break;
        }

        sc.close();
    }
}