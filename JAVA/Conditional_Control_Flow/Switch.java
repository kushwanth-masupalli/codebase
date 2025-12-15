package Conditional_Control_Flow;

public class Switch {
    public static void main(String[] args) {
        int day = 3;

        // 1. Traditional switch
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 2. Enhanced switch (Java 14+)
        int month = 4;
        String monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            default -> "Unknown";
        };

        System.out.println("Month: " + monthName);
    }
}
