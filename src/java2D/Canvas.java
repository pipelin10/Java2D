package java2D;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    private String text;
    private Font font;
    private int step = 1;

    public Canvas(){
        this.setBackground(new Color(128, 128, 128));
        text = "Drawing with Graphics";
        font = new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 27);
    }

    public void drawParts(){
        step++;
        System.out.println("Step:" + String.valueOf(step));
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(font);

        switch (step) {
            case 1: //Texto
                g.setColor(new Color(200,0,125));
                g.drawString(text, 150, 24);
                break;
            case 2: //Lines
                g.drawString("Lines", 150, 24);
                g.setColor(new Color(100, 200, 0));
                g.drawLine(25, 60, 25, 100);
                g.setColor(new Color(20, 111, 139));
                g.drawLine(50, 60, 300, 400);
                g.setColor(new Color(236, 201, 5, 255));
                g.drawLine(200, 300, 0, 0);
                g.setColor(new Color(100, 200, 0));
                g.drawLine(600, 600, 0, 0);
                g.setColor(new Color(26, 15, 128));
                g.drawLine(200, 100, 400, 500);
                break;
            case 3: //Rectangles
                g.drawString("Rectangles", 150, 24);
                g.setColor(new Color(100,0,255));
                g.drawRect(20, 50, 100, 100);
                g.fillRect(150, 50, 100, 100);
                g.setColor(new Color(232, 2, 2));
                g.drawRoundRect(20, 200, 100, 100, 250, 50);
                g.fillRoundRect(150, 200, 100, 100, 250, 50);
                g.setColor(new Color(0, 255, 0));
                g.draw3DRect(20, 350, 100, 100, true);
                g.fill3DRect(150, 350, 100, 100, true);
                break;
            case 4: //Oval
                g.drawString("Oval", 150, 24);
                g.setColor(Color.YELLOW);
                g.drawOval(20, 40, 100, 100);
                g.fillOval(150, 40, 100, 100);
                break;
            case 5: //Image
                g.drawString("Images", 150, 24);
                ImageIcon image = new ImageIcon(getClass().getResource("resources/1506.jpg"));
                g.drawImage(image.getImage(), 20, 40, 200, 200, null);
                break;
            default:
                g.setColor(Color.BLUE);
                g.drawString("Nothing to do", 200, 24);
                break;
        }




    }
}
