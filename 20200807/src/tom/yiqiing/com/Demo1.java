package tom.yiqiing.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// ��ȡ���µ����������--����������ί
		//��ȡ�������ݵ���ַ��https://zaixianke.com/yq/all
		//URL,ͳһ��Դ��λ�� Uniform Resource Locator
		//1������URL��Ķ���url
		URL url = new URL("https://zaixianke.com/yq/all");
		//2��ͨ��URL��Ķ���url���������ӣ�ͬʱ�õ����Ӷ���conn
		URLConnection conn = url.openConnection();
		//3��ͨ�����Ӷ����ȡ��ҳ�����ݣ��ȵõ����ڶ�ȡ��ҳ���ݵ�����������
		InputStream in=conn.getInputStream();
		//4���������õ����ֽ�������װ��Ϊ�����ַ���
		BufferedReader reader = new BufferedReader(new InputStreamReader(in,"UTF-8"));
		//5��ͨ��reader�����ȡһ������
		String data = reader.readLine();
		//6����ʾ��ȡ��������
		System.out.println(data);
		
	}

}
