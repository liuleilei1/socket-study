package test;

public class LoggerFileSystem implements Logger {

    @Override
    public void log(String message) {
        System.out.println("日志输出到本地文本系统" + message);
    }
}
