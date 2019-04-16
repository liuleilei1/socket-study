package join;

/**
 *
 */


public class JoinDemo extends Thread {
    @Override
    public  void run(){
        for (int i =10;i>0;i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("开始倒数");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JoinDemo joinDemo = new JoinDemo();
        joinDemo.start();
        try {
            joinDemo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("节目开始");
    }
}