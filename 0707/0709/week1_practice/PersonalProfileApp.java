import java.util.Scanner;

public class PersonalProfileApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入姓名：");
        String name = sc.nextLine();

        int age = readPositiveInt(sc, "請輸入年齡：");

        double height = readPositiveDouble(sc, "請輸入身高 (公尺)：");

        double weight = readPositiveDouble(sc, "請輸入體重 (公斤)：");

        double bmi = calculateBmi(height, weight);
        String bmiLevel = getBmiLevel(bmi);
        boolean adult = isAdult(age);

        printReport(name, age, adult, height, weight, bmi, bmiLevel);

        sc.close();
    }

    public static int readPositiveInt(Scanner sc, String message) {
        System.out.print(message);
        int value = sc.nextInt();
        while (value <= 0) {
            System.out.print("輸入錯誤！金額/數值必須大於 0，請重新輸入：");
            value = sc.nextInt();
        }
        return value;
    }

    public static double readPositiveDouble(Scanner sc, String message) {
        System.out.print(message);
        double value = sc.nextDouble();
        while (value <= 0) {
            System.out.print("輸入錯誤！數值必須大於 0，請重新輸入：");
            value = sc.nextDouble();
        }
        return value;
    }

    public static double calculateBmi(double height, double weight) {
        return weight / (height * height);
    }

    public static String getBmiLevel(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.0) {
            return "Normal";
        } else if (bmi < 27.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static boolean isAdult(int age) {
        return age >= 18;
    }

    public static void printReport(String name, int age, boolean adult, double height, double weight, double bmi, String bmiLevel) {
        System.out.println();
        System.out.println("=== Personal Health Report ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Adult: " + adult);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("BMI: " + bmi);
        System.out.println("Level: " + bmiLevel);
    }
}

