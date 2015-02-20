import java.util.Scanner;

public class Mario {

    public static void main(String[] varArgs) {
        int height;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Height: ");
            height = scan.nextInt();
        } while(height < 0 || height > 23);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
