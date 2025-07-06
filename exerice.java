import java.util.Scanner;

public class exerice {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int average = (a + b + c) / 3;
            System.out.println("The average is: " + average);
        }
    }
}
