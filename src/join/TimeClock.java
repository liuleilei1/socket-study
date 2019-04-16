package join;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

class TimerClock extends JFrame {
    private java.util.Timer timer;
    private JLabel bgLabel;
    private JPanel bgPanel;
    private TimerTask timerTask;
    private JButton button;

    private JTextField jTextField;
    private JPasswordField jPasswordField;
    private JLabel jLabel1,jLabel2;
    private JPanel jp1,jp2,jp3;
    private JButton jb1,jb2;


    public TimerClock(){
        init();
        setTitle("定时时钟");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void init(){
        JTextField jTextField = new JTextField(11);
        JPasswordField jPasswordField = new JPasswordField(11);
        JLabel jLabel1 = new JLabel("用户名");
        JLabel jLabel2 = new JLabel("密码");
        JButton jb1 = new JButton("确认");
        JButton jb2 = new JButton("取消");
        jb1.setBounds(10,10,5,5);
        jb2.setBounds(15,15,5,5);
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();




        this.setLayout(new GridLayout(3,2));
        jp1.add(jLabel1);
        jp1.add(jTextField);
        jp2.add(jLabel2);
        jp2.add(jPasswordField);
        jp3.add(jb1);
        jp3.add(jb2);
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.setSize(30, 20);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("登陆");







        bgPanel = new JPanel(){
            protected void paintComponent(Graphics g){
                try {
                    Image bg = ImageIO.read(new File("D:\\333.jpg"));
                    g.drawImage(bg,200,100,getWidth(),getHeight(),null);
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        };





        bgPanel.setLayout(new FlowLayout(FlowLayout.CENTER,4,4));
        add(bgPanel);
        Font font = new Font("微软雅黑",Font.BOLD,22);
        bgLabel = new JLabel();
        bgLabel.setFont(font);
        bgPanel.add(bgLabel);

        timerTask = new TimerTask() {
            @Override
            public void run() {
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String timeString =sdf.format(date);
                bgLabel.setText(timeString);
                if (timeString.equals("2019-04-16 09:48:30")){
                    JOptionPane.showConfirmDialog(bgPanel,"嗝屁了");
                    this.cancel();
                }
            }
        };
        timer = new Timer();
        timer.schedule(timerTask, 0, 1000);

    }
    public static void main(String[] args) {



        JFrame.setDefaultLookAndFeelDecorated(true);
        new TimerClock();
    }
}








