import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PyramidFactory {

    private PyramidFactory() {}

    private static PyramidFactory pyramidPrinter;

    public static PyramidFactory printPyramid() {
        if(pyramidPrinter == null) {
            pyramidPrinter = new PyramidFactory();
        }
        return pyramidPrinter;
    }

    public void ConsolePyramid(int height) {
        StringBuilder sb = Pyramid.GetPyramid(height);
        System.out.print(sb);
    }

    public void TextFilePyramid(int height) {
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
