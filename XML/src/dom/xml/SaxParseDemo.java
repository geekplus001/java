package dom.xml;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import dom.vo.Teacher;

/*
 * sax（simple api for xml）解析xml
 */
public class SaxParseDemo {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException 
	{
		//创建SAX解析器工厂对象
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//根据工厂创建解析器对象
		SAXParser sax = factory.newSAXParser();
		
		InputStream is = Thread.currentThread().
				getContextClassLoader().getResourceAsStream("person.xml");
		PersonHandler ph = new PersonHandler();
		//开始解析
		sax.parse(is, ph);
		
		ArrayList<Teacher> list = ph.getTeachers();
		System.out.println(list);
	}

}
