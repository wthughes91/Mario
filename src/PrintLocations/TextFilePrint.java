package PrintLocations;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFilePrint {
    public void buildPyramid(int height) {
        try {
            File pyramidFile = new File("Mario.txt");
            PrintWriter out = new PrintWriter(pyramidFile);
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

}
