package join;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestThread implements Runnable {

    int x = 150;
    int y = 150;
    int weight = 50;
    int height = 50;
    private JFrame frame;

    public void setFrame(JFrame frame) {

        this.frame = frame;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Graphics graphics = frame.getGraphics();
            graphics.drawOval(x,y,weight,height);
            graphics.setColor(Color.pink);
            x-=15/2;
            y-=15/2;
            weight += 15;
            height += 15;
            if (weight >= 300){
                break;
            }
        }
    }
};
