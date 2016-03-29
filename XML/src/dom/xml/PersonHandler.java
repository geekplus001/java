package dom.xml;

import java.util.ArrayList;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import dom.vo.Teacher;
/*
 * SAX解析的内容处理器
 */
public class PersonHandler extends DefaultHandler 
{
	private ArrayList<Teacher> teachers = null;
	private Teacher teacher = null;
	private String tag;
	
	
	
	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	//XML文档开始解析时调用的方法
	@Override
	public void startDocument() throws SAXException {
		teachers = new ArrayList<Teacher>();
//		super.startDocument();
	}
	
	//解析开始元素时调用的方法
	//参数：(标签的命名空间（路径），元素本地名称（元素名字：比如teacher，不带前缀），带前缀的元素名称（例如：<aa：teacher>），属性的集合)
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException 
	{
		if("teacher".equals(qName))
		{
			teacher = new Teacher();
			//取出属性并添加到teacher中
			teacher.setId(Integer.parseInt(attributes.getValue("id")));
		}
		tag = qName;
		
	}
	//解析结束元素时调用的方法
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
//		super.endElement(uri, localName, qName);
		if("teacher".equals(qName))
		{
			teachers.add(teacher);
		}
		tag = null;
	}

	//解析文本内容时调用的方法
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
//		super.characters(ch, start, length);
		if(tag!=null)
		{
			if("name".equals(tag))
			{
				teacher.setName(new String(ch,start,length));
			}
			else if("desc".equals(tag))
			{
				teacher.setDesc(new String(ch,start,length));
			}
		}
		
	}
	
	//XML文档解析结束时调用的方法
	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
		System.out.println("XML解析完毕");
	}

}
