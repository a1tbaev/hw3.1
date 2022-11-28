import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("height: ");
            int height = scanner.nextInt();
            System.out.println("width: ");
            int width = scanner.nextInt();
            System.out.println("length: ");
            int length = scanner.nextInt();
            if (height < 0.1 || width < 0.1 || length < 0.1){
                throw new InputMismatchException("the input must be a positive number");
            } else if (height > 20 || width > 20 || length > 20) {
                throw new InputMismatchException("the input must be a positive number");
            } else {
                System.out.println(2*((height * length) + (length * width) + (height * width)));
            }
        }catch (InputMismatchException e){
            System.out.println("the input must be a number");
        }

    }
}