package PrintLocations;

public class ConsolePrint {

    public void buildPyramid(int height) {
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
