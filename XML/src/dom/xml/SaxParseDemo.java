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
 * sax��simple api for xml������xml
 */
public class SaxParseDemo {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException 
	{
		//����SAX��������������
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//���ݹ�����������������
		SAXParser sax = factory.newSAXParser();
		
		InputStream is = Thread.currentThread().
				getContextClassLoader().getResourceAsStream("person.xml");
		PersonHandler ph = new PersonHandler();
		//��ʼ����
		sax.parse(is, ph);
		
		ArrayList<Teacher> list = ph.getTeachers();
		System.out.println(list);
	}

}
