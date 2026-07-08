public class DrinkMenu {
    public static void main(String[] args) {
        int option = 2;

        switch (option) {
            case 1:
                System.out.println("Black Tea");
                break;
            case 2:
                System.out.println("Green Tea");
                break;
            case 3:
                System.out.println("Coffee");
                break;
            default:
                System.out.println("Unknown option");
        }
    }
}