import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter the name of the day: ");
        String day = scanner.nextLine();

        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Its a weekday🤦‍♂️");
            case "Saturday", "Sunday" -> System.out.println("Its a Weekday😁😀");
            default -> System.out.println(day + "is not valid day");

        }

        scanner.close();
    }
}
