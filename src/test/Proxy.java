package test;

public class Proxy implements Subject {
    @Override
    public void buyMac() {
        RealSubject realSubject = new RealSubject();
        realSubject.buyMac();
        this.WrapMac();
    }
    public void WrapMac(){
        System.out.println("用盒子包装好Mac a");
    }
}
