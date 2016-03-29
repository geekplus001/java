package dom.xml;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import dom.vo.Teacher;

/*
 * ʹ�õ��������Jdom����XML
 */
public class JdomParseDemo {

	public static void main(String[] args) throws JDOMException, IOException
	{
		//����
		SAXBuilder builder = new SAXBuilder();
		InputStream in = Thread.currentThread().
				getContextClassLoader().getResourceAsStream("person.xml");
		//��ʼ����
		org.jdom2.Document doc = builder.build(in);
		//��ȡ��Ԫ��
		Element root = doc.getRootElement();
		//��ȡ��Ԫ���µ�������Ԫ���б�
		List<Element> list = root.getChildren();
		
		List<Teacher> teachers = new ArrayList<Teacher>();
		
		//����
		for(int i=0;i<list.size();i++)
		{
			Teacher t = new Teacher();
			Element e = list.get(i);
			String id = e.getAttributeValue("id");
			t.setId(Integer.parseInt(id));
			//��ȡ��ǰԪ�ص���Ԫ�ص��ı�����
			t.setName(e.getChildText("name"));
			t.setDesc(e.getChildText("desc"));
			teachers.add(t);
		}
		System.out.println(teachers);
	}

}
