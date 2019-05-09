package how;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("39.96.182.225",8080);
        //获取客户端的输入流
        OutputStream out = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String info = scanner.nextLine();
        out.write(info.getBytes());
        out.close();
        socket.close();

    }
}


