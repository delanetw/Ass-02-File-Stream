import javax.swing.*;
import java.awt.*;

public class RandProductSearchRunner
{
    public static void main(String[] args)
    {
        double dHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        double dWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();

        int height = ((int) (dHeight * .90));
        int width = ((int) (dWidth * .85));

        RandProductSearchFrame viewer = new RandProductSearchFrame();
        viewer.setSize(width, height);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - viewer.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - viewer.getHeight()) / 2);
        viewer.setLocation(x, y);
        viewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewer.setVisible(true);
    }
}