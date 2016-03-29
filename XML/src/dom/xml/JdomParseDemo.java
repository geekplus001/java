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
 * 使用第三方组件Jdom解析XML
 */
public class JdomParseDemo {

	public static void main(String[] args) throws JDOMException, IOException
	{
		//创建
		SAXBuilder builder = new SAXBuilder();
		InputStream in = Thread.currentThread().
				getContextClassLoader().getResourceAsStream("person.xml");
		//开始解析
		org.jdom2.Document doc = builder.build(in);
		//获取根元素
		Element root = doc.getRootElement();
		//获取根元素下的所有子元素列表
		List<Element> list = root.getChildren();
		
		List<Teacher> teachers = new ArrayList<Teacher>();
		
		//遍历
		for(int i=0;i<list.size();i++)
		{
			Teacher t = new Teacher();
			Element e = list.get(i);
			String id = e.getAttributeValue("id");
			t.setId(Integer.parseInt(id));
			//获取当前元素的子元素的文本内容
			t.setName(e.getChildText("name"));
			t.setDesc(e.getChildText("desc"));
			teachers.add(t);
		}
		System.out.println(teachers);
	}

}
