import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class frameImage extends JFrame  {

    static ImageIcon Img=new ImageIcon(("123.png"));
    frameImage(String title){
        super(title);
        //Shape myShape= new Ellipse2D.Double(0,0,200,200);
        this.setBounds(200,200,250,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        Image image=new Image(this);
        JLabel label=new JLabel(Img);
        label.setOpaque(false);
        image.add(label);
        // this.setBackground(new Color(2,3,0,0));
        this.setContentPane(image);
        this.pack();

        //this.setShape(myShape);
    }

}