import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        // for loops
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the Number of count Down: ");
        int Start = scanner.nextInt();


        for (int i = Start; i > 0; i --){
            System.out.println(i);
            Thread.sleep(1000);

        };
        System.out.println("Happy New Year!🎉");


    scanner.close();


    }
}
