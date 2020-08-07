package tom.yiqiing.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// 获取最新的疫情的数据--》国家卫健委
		//获取疫情数据的网址：https://zaixianke.com/yq/all
		//URL,统一资源定位符 Uniform Resource Locator
		//1、创建URL类的对象url
		URL url = new URL("https://zaixianke.com/yq/all");
		//2、通过URL类的对象url打开网络连接，同时得到连接对象conn
		URLConnection conn = url.openConnection();
		//3、通过链接对象读取网页上内容，先得到用于读取网页内容的输入流对象
		InputStream in=conn.getInputStream();
		//4、将上述得到的字节流对象装饰为缓冲字符流
		BufferedReader reader = new BufferedReader(new InputStreamReader(in,"UTF-8"));
		//5、通过reader对象读取一行内容
		String data = reader.readLine();
		//6、显示读取到的内容
		System.out.println(data);
		
	}

}
