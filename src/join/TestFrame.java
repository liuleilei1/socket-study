package join;

import javax.swing.*;
import java.awt.*;

public class TestFrame extends JFrame {

    public TestFrame() {
        init();
        setTitle("同心圆");
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init(){
        TestThread testThread = new TestThread();
        testThread.setFrame(this);
        new Thread((Runnable) testThread).start();
//        add(new FlowLayout(FlowLayout.CENTER,30,100));
       // setLayout(new FlowLayout(FlowLayout.CENTER,30,100));

    }

    public static void main(String[] args) {
        new TestFrame();
    }
}