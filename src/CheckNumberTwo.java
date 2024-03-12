import java.util.Scanner;

public class CheckNumberTwo {
    public static void main(String[] args) {

    }

    public static void isEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("enter number");
        int number = scanner.nextInt();
        isEven(number);


    }

    public static void isEven(int number) {
        if (number % 2 == 0) {
            System.out.printf(number + "is even");
        } else {
            System.out.printf(number + "is ood");
        }
    }
}
