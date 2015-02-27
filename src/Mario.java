import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Mario {

    public static void main(String[] varArgs) {
        int height;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Height: ");
            height = scan.nextInt();
        } while(height < 0 || height > 23);

        Scanner check = new Scanner(System.in);
        System.out.print("Do you want the pyramid printed in a text file? ");
        String answer = check.nextLine();

        if (answer.equals("yes") || answer.equals("y")) {
            try {
                File pyramid = new File("Mario.txt");
                PrintWriter out = new PrintWriter(pyramid);
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= height - i; j++) {
                        out.print(" ");
                    }
                    for (int k = 1; k <= i + 1; k++) {
                        out.print("#");
                    }
                    out.print("\n");
                }
                out.close();
            } catch (IOException exception) {
                System.out.print("Unable to print");
            }
        }

        else if (answer.equals("no") || answer.equals("n")) {
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

        else {
            System.out.print("Unable to print");
        }
    }
}
