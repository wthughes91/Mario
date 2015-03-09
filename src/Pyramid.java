
public class Pyramid {

    public static StringBuilder GetPyramid(int height) {

        StringBuilder p = new StringBuilder("");

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                p.append(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                p.append("#");
            }
            p.append("\n");
        }
        return p;
    }
}
