import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PyramidFactory {

    public static void ConsolePyramid(int height) {
        StringBuilder sb = Pyramid.GetPyramid(height);
        System.out.print(sb);
    }

    public static void TextFilePyramid(int height) {
        StringBuilder sb = Pyramid.GetPyramid(height);
        try {
            File pyramidFile = new File("Mario.txt");
            PrintWriter out = new PrintWriter(pyramidFile);
            out.print(sb);
            out.close();
        } catch (IOException exception) {
            System.out.print("Unable to print");
        }
    }
}
