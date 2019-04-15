package join;

import javax.swing.*;
import java.awt.*;

public class CircleFrame extends JFrame {
    public static void main(String[] args){
        JFrame frame=new CircleFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);//该方法会调用子类的paint重写方法，画出相应paint中的图形

    }

    @Override
    public void paint(Graphics g){
        //g.drawString("circle 99", 20, 20);

        int x0=getSize().width/2;//圆的最左上角x坐标
        int y0=getSize().height/2;//圆的最左上角y坐标
        for(int r=0;r<getSize().height/2;r+=10){
            g.setColor(getRandomColor());//给画笔设置随机数颜色

            /*画圆，前两个参数是圆的xy坐标，xy坐标值想等为同心圆，否则不是
            后面两个参数是宽和高，若宽高相等则为圆，否则为椭圆*/
            g.drawOval(x0-r, y0-r, r*2, r*2);
        }
    }

    public Color getRandomColor(){
        Color color=new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
        return color;
    }

}
