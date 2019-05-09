package how;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        System.out.println("服务器启动");
        InputStream in;
        String info = "Java Socket Study```";
        while(true) {
            Socket socket = ss.accept();
            System.out.println(socket.getInetAddress() + "上线了");
            //根据客户端对象获取输出流对象
            in = socket.getInputStream();
            in.read(info.getBytes());
            in.close();
            socket.close();
        }
    }
}
