package http;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("docs.oracle.com", 80)) {
            String request =
                    "GET /javase/tutorial/getStarted/index.html HTTP/1.0\r\n" +
                            "Host: docs.oracle.com\r\n" +
                            "\r\n";

            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
            printWriter.print(request);
            printWriter.flush();

            // 请求发送结束
            // 读取响应

            // 这里有 BUG，假设我可以一次性把所有内容都读完
            byte[] responseBuffer = new byte[8192];
            int len = socket.getInputStream().read(responseBuffer);

            String response = new String(responseBuffer, 0, len, "UTF-8");
            System.out.println(response);
        }
    }
}