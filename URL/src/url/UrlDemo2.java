package url;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlDemo2 
{

	public static void main(String[] args) throws UnsupportedEncodingException 
	{
		String url = "http://www.baidu.com/username=С��&password=123";
		//��URL��ַ���б���
		url = URLEncoder.encode(url,"UTF-8");
		System.out.println(url);
		//��URL��ַ���н���
		url = URLDecoder.decode(url,"UTF-8");
		System.out.println(url);
	}

}
