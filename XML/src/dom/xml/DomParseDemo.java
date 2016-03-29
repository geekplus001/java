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
 * 使用Dom（document object model）解析XML(extensible markup language)
 */
public class DomParseDemo
{

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException 
	{
		//创建Dom解析器工厂
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		//通过解析器工厂创建解析器
		DocumentBuilder builder = dbf.newDocumentBuilder();
		//构造一个指向指定文件的输入流
		InputStream is = Thread.currentThread().
				getContextClassLoader().getResourceAsStream("person.xml");
		//开始解析并返回Document对象
		Document doc = builder.parse(is);
		
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		Teacher t = null;
		//根据文档的结点获取数据
		NodeList nodeList = doc.getElementsByTagName("teacher");
		for(int i=0;i<nodeList.getLength();i++)
		{
			t = new Teacher();
			Node teacherNode = nodeList.item(i);
			//获取当前结点的属性
			String id = teacherNode.getAttributes().getNamedItem("id").getNodeValue();
			System.out.println(id);
			t.setId(Integer.parseInt(id));
			//获取当前结点下的所有子节点列表
			NodeList childNodeList = teacherNode.getChildNodes();
			for (int j = 0; j < childNodeList.getLength(); j++)
			{
				//获取teacher结点下的其中一个子节点
				Node childNode = childNodeList.item(j);
				String tagName = childNode.getNodeName();
				if("name".equals(tagName))
				{
					//获取teacher结点下的name结点的值
					t.setName(childNode.getFirstChild().getNodeValue());
				}
				else if("desc".equals(tagName))
				{
					t.setDesc(childNode.getFirstChild().getNodeValue());
				}
			}
			teachers.add(t);
		}
		//输出
		System.out.println(teachers);
	}

}
