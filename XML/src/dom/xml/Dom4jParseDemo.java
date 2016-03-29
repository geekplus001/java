package dom.xml;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import dom.vo.Teacher;

public class Dom4jParseDemo {

	public static void main(String[] args) throws DocumentException 
	{
		//����������
		SAXReader reader = new SAXReader();
		InputStream in = Thread.currentThread().
				getContextClassLoader().getResourceAsStream("person.xml");
		//��ʼ����������Document����
		Document doc = reader.read(in);
		Element root = doc.getRootElement();
		//��ȡ��Ԫ�ص�������Ԫ��
		Iterator<Element> iters = root.elementIterator();
		List<Teacher> list = new ArrayList<Teacher>();
		while(iters.hasNext())
		{
			Teacher t =new Teacher();
			Element e = iters.next();
			t.setId(Integer.parseInt(e.attributeValue("id")));
			t.setName(e.elementText("name"));
			t.setDesc(e.elementText("desc"));
			list.add(t);
		}
		System.out.println(list);
	}

}
