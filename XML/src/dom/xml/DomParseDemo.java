package dom.xml;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import dom.vo.Teacher;

/*
 * ʹ��Dom��document object model������XML(extensible markup language)
 */
public class DomParseDemo
{

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException 
	{
		//����Dom����������
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		//ͨ����������������������
		DocumentBuilder builder = dbf.newDocumentBuilder();
		//����һ��ָ��ָ���ļ���������
		InputStream is = Thread.currentThread().
				getContextClassLoader().getResourceAsStream("person.xml");
		//��ʼ����������Document����
		Document doc = builder.parse(is);
		
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		Teacher t = null;
		//�����ĵ��Ľ���ȡ����
		NodeList nodeList = doc.getElementsByTagName("teacher");
		for(int i=0;i<nodeList.getLength();i++)
		{
			t = new Teacher();
			Node teacherNode = nodeList.item(i);
			//��ȡ��ǰ��������
			String id = teacherNode.getAttributes().getNamedItem("id").getNodeValue();
			System.out.println(id);
			t.setId(Integer.parseInt(id));
			//��ȡ��ǰ����µ������ӽڵ��б�
			NodeList childNodeList = teacherNode.getChildNodes();
			for (int j = 0; j < childNodeList.getLength(); j++)
			{
				//��ȡteacher����µ�����һ���ӽڵ�
				Node childNode = childNodeList.item(j);
				String tagName = childNode.getNodeName();
				if("name".equals(tagName))
				{
					//��ȡteacher����µ�name����ֵ
					t.setName(childNode.getFirstChild().getNodeValue());
				}
				else if("desc".equals(tagName))
				{
					t.setDesc(childNode.getFirstChild().getNodeValue());
				}
			}
			teachers.add(t);
		}
		//���
		System.out.println(teachers);
	}

}
