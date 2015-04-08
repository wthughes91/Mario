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
            PyramidFactory.printPyramid().TextFilePyramid(height);

        } else if (answer.equals("no") || answer.equals("n")) {
            PyramidFactory.printPyramid().ConsolePyramid(height);

        } else {
            System.out.print("Unable to print");
            }
    }
}
