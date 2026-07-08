import java.util.Scanner;

public class ScoreMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入姓名：");
        String name = scanner.next();

        System.out.print("請輸入 Java 成績：");
        double javaScore = scanner.nextDouble();

        System.out.print("請輸入 English 成績：");
        double englishScore = scanner.nextDouble();

        System.out.print("請輸入 Math 成績：");
        double mathScore = scanner.nextDouble();

        double average = (javaScore + englishScore + mathScore) / 3.0;

        String status = (average >= 60) ? "及格" : "不及格";

        String grade = "";
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        int option = -1;

        while (option != 0) {
            System.out.println("\n=== 成績查詢選單 ===");
            System.out.println("1：顯示平均分數");
            System.out.println("2：顯示及格狀態");
            System.out.println("3：顯示等第");
            System.out.println("0：離開");
            System.out.print("請選擇操作功能：");
            option = scanner.nextInt();

            // 6. 使用 switch 建立選單功能
            switch (option) {
                case 1:
                    System.out.printf("%s 的三科平均分數為：%.2f\n", name, average);
                    break;
                case 2:
                    System.out.printf("%s 的及格狀態為：%s\n", name, status);
                    break;
                case 3:
                    System.out.printf("%s 的成績等第為：%s\n", name, grade);
                    break;
                case 0:
                    System.out.println("系統已關閉，謝謝使用！");
                    break;
                default:
                    System.out.println("無效的選項，請重新輸入！");
                    break;
            }
        }

        scanner.close();
    
            
            switch (option) {
                case 1:
                    System.out.printf("%s 的三科平均分數為：%.2f\n", name, average);
                    break;
                case 2:
                    System.out.printf("%s 的及格狀態為：%s\n", name, status);
                    break;
                case 3:
                    System.out.printf("%s 的成績等第為：%s\n", name, grade);
                    break;
                case 0:
                    System.out.println("系統已關閉，謝謝使用！");
                    break;
                default:
                    System.out.println("無效的選項，請重新輸入！");
                    break;
            }
        }

        scanner.close();
    }
}
