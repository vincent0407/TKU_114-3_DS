public class Q06_CommandValidator {
    public static void main(String[] args) {
        String[] commands = {
            "START",
            new String("stop"),
            " Pause ",
            "RUN",
            " ",
            null
        };

        for (String command : commands) {
            System.out.println(command + " -> " + isValidCommand(command));
        }
    }

    public static boolean isValidCommand(String command) {

        if (command == null) {
            return false;
        }

        String cleanedCommand = command.trim();

        return cleanedCommand.equalsIgnoreCase("START") 
            || cleanedCommand.equalsIgnoreCase("STOP") 
            || cleanedCommand.equalsIgnoreCase("PAUSE");
    }
}
