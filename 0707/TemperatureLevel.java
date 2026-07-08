public class TemperatureLevel {
    public static void main(String[] args) {
        int temperature = 22;

        if (temperature < 15) {
            System.out.println("cold");
        } else if (temperature < 28) {
            System.out.println("comfortable");
        } else {
            System.out.println("hot");
    }
}
}