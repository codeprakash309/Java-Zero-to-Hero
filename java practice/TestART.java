import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class TestART {
    public static void main(String[] args) throws IOException {

        // This will convert image to ascii art
        // 😂😂

        for (int x = 0 ; x < 1; x++) {
           // String pathName = "img/frame_" + x + ".jpg";
          //  String outName = "pout/"+ x + ".txt";

            File file = new File("pic1.jpg");
            BufferedImage image = ImageIO.read(file);

//        char[] density = {'Ñ', '@', '#', 'W', '$', '9', ',', '8', '7', '6', '5', '4', '3', '2', '1', '0', '?', '!', 'f', 'u', 'c', 'k', ':', '+', '=', '-', ',', '.', ' ', ' '};

//           char[] density = {'Ñ', '@', '#', 'W', '$', '9', ',', '8', '7', '6', '5', '4', '3', '2', '1', '0', '?', '!', 'f', 'u', 'c', 'k', ':', '+', '=', '-', ',', '.',
//                    ' ', ' ', ' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '
//                    ,' ',' ',' ',' ',' ',' '};

            char [] density = {' ', ',','(','s','#','g','@'};

            try {
                PrintStream fileOut = new PrintStream("./krishna.txt");
                System.setOut(fileOut);
            int j;
            for (int i = 0; i < image.getHeight(); i++) {
                for (j = 0; j < image.getWidth(); j++) {
                    int pixel = image.getRGB(j, i);
                    Color color = new Color(pixel, true);
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();
                    int avgBrt = (red + green + blue) / 3;
//                    System.out.print(avgBrt+" ");
                    int dns = (int) Math.floor(avgBrt / 42.5);
                    System.out.print(density[dns]);
                }
                if (j == image.getWidth()) {
                    System.out.println();
                }
            }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
