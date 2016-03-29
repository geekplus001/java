package url;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlDemo2 
{

	public static void main(String[] args) throws UnsupportedEncodingException 
	{
		String url = "http://www.baidu.com/username=小白&password=123";
		//把URL地址进行编码
		url = URLEncoder.encode(url,"UTF-8");
		System.out.println(url);
		//把URL地址进行解码
		url = URLDecoder.decode(url,"UTF-8");
		System.out.println(url);
	}

}
