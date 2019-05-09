package how;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端向服务器端发送文本数据--控制带版本
 */
public class Client3 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",8083);
        System.out.println("成功连上服务器");
        Scanner scanner = new Scanner(System.in);
        BufferedWriter buf;
        System.out.println("请输入一行信息：");
        String str = scanner.nextLine();
        buf = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        buf.write(str);
        buf.flush();
        buf.close();
    }
}
