import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        frameImage app = new frameImage("Image");
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("123.png"));
        } catch (IOException e) {
        }

        if (img == null) {
            System.out.println("ERROR");
        }

        app.setShape(contour(img));
        app.setVisible(true);
    }

    private static Shape contour(BufferedImage img) {
        final int w = img.getWidth();
        final int h = img.getHeight();
        final Area s = new Area(new Rectangle(w, h));
        for (int y = 0; y < h; ++y) {
            for (int x = 0; x < w; ++x) {
                Color color = new Color(img.getRGB(x, y));
                if (color.getRed() == 255 & color.getGreen() == 255 & color.getBlue() == 255) {
                    Rectangle r = new Rectangle(x, y, 1, 1);
                    s.subtract(new Area(r));
                }
            }
        }
        return s;
    }
}
