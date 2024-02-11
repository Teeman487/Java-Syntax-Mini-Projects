package com.adebusoye.java2DAnimation72;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{

    public static void main(String[] args) {

        new MyFrame();

    }
}
//------------------------------------------------

class MyFrame extends JFrame {

    MyPanel panel;

    MyFrame(){

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack(); // Preferred over this.setSize(500,500) // packs the panel

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
//------------------------------------------------


class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image image;
    //Image backgroundImage;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;


    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        image = new ImageIcon("C:\\Users\\MR AKINADE AA\\IdeaProjects\\Java_Syntax_MiniProject\\src\\main\\java\\com\\adebusoye\\java2DAnimation72\\img.png").getImage();
        //backgroundImage = new ImageIcon("space.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g)  // invoke implicitly-Graphics is outdated
    {

        super.paint(g); // paint background

        Graphics2D g2D = (Graphics2D) g; // child class of Graphics class

//        g2D.setPaint(Color.blue);
//        g2D.setStroke(new BasicStroke(5));
//        g2D.drawRect(0,0,100,200);
//        //g2D.drawImage(backgroundImage, 0, 0, null);
       g2D.drawImage(image, x, y, null);


//        g2D.drawLine(0,0,500,500);
//        g2D.fillRect(0,0,100,200);

       // g2D.setPaint(Color.orange);
       // g2D.drawOval(0,0,100,100);
      //  g2D.fillOval(0,0,100,100);

//        g2D.drawArc(0,0,100,100,180,180);
//        g2D.fillArc(0,0,100,100,0,180);

        /*int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2D.setPaint(Color.yellow);

        g2D.drawPolygon(xPoints,yPoints,3);
        g2D.fillPolygon(xPoints,yPoints,3);*/

        /*g2D.setFont(new Font("Ink Free",Font.BOLD, 50));
        g2D.drawString("U R A WINNER!", 50, 50);*/

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(x>=PANEL_WIDTH-image.getWidth(null) || x<0) {// 500-100
            xVelocity = xVelocity * -1; // -1
        }
        x = x + xVelocity; // 0+-1

        if(y>=PANEL_HEIGHT-image.getHeight(null) || y<0) {
            yVelocity = yVelocity * -1; // -1
        }
        y = y + yVelocity;   // -1
        repaint();
    }
}