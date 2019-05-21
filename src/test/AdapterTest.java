package test;

public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("特长生招募中。。。");
        Students students1 = new Students() {
            @Override
            public void javaStudy() {
                System.out.println("我是一名大神");
            }
        };
        students1.javaStudy();
        Students students2 = new Students() {
            @Override
            public void playBasketball() {
                System.out.println("我篮球打得好");
            }

            @Override
            public void playFootBall() {
                System.out.println("足球也踢得好");
            }
        };
        students2.playBasketball();
        students2.playFootBall();
    }

}
