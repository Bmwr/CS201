import java.awt.Color;

public class Scale {
    public static void main(String[] args) {
        String filename = args[0];
        int w = Integer.parseInt(args[1]);
        int h = Integer.parseInt(args[2]);
        Picture source = new Picture(filename);
        Picture target = new Picture(w, h);

        for (int tx = 0; tx < w; tx++) {
            for (int ty = 0; ty < h; ty++) {
                int sx = tx * source.width()  / w;
                int sy = ty * source.height() / h;
                Color color = source.get(sx, sy);
                target.set(tx, ty, color);
            }
        }

        source.show();
        target.show();
    }
}
