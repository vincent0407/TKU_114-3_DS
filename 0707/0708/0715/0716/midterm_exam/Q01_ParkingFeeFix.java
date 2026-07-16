public class Q01_ParkingFeeFix {
    public static void main(String[] args) {
        int[] testMinutes = {-20, 30, 31, 60, 61, 120, 121, 420};

        for (int minutes : testMinutes) {
            int fee = calculateFee(minutes);
            System.out.println("停車 " + minutes + " 分鐘，費用：" + fee + " 元");
        }
    }

    public static int calculateFee(int minutes) {

        if (minutes < 0) {
            return -1;
        }
        
        if (minutes <= 30) {
            return 0;
        }
        
        int fee = 0;
        
        if (minutes <= 120) {
            int extraMinutes = minutes - 30;
            fee = ((extraMinutes + 29) / 30) * 20;
        } 

        else {
            int extraMinutes = minutes - 120;
            fee = 60 + ((extraMinutes + 59) / 60) * 30;
        }
        
        if (fee > 180) {
            fee = 180;
        }
        
        return fee;
    }
}

    