import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");

        int num1 = scanner.nextInt();

        System.out.println("Enter another number: ");

        int num2 = scanner.nextInt();
        int num3 = num1 + num2;

        System.out.println("The answer is: " + num3);


    }



}
