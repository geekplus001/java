package dom.xml;

import java.util.ArrayList;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import dom.vo.Teacher;
/*
 * SAX���������ݴ�����
 */
public class PersonHandler extends DefaultHandler 
{
	private ArrayList<Teacher> teachers = null;
	private Teacher teacher = null;
	private String tag;
	
	
	
	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	//XML�ĵ���ʼ����ʱ���õķ���
	@Override
	public void startDocument() throws SAXException {
		teachers = new ArrayList<Teacher>();
//		super.startDocument();
	}
	
	//������ʼԪ��ʱ���õķ���
	//������(��ǩ�������ռ䣨·������Ԫ�ر������ƣ�Ԫ�����֣�����teacher������ǰ׺������ǰ׺��Ԫ�����ƣ����磺<aa��teacher>�������Եļ���)
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException 
	{
		if("teacher".equals(qName))
		{
			teacher = new Teacher();
			//ȡ�����Բ���ӵ�teacher��
			teacher.setId(Integer.parseInt(attributes.getValue("id")));
		}
		tag = qName;
		
	}
	//��������Ԫ��ʱ���õķ���
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

	//�����ı�����ʱ���õķ���
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
	
	//XML�ĵ���������ʱ���õķ���
	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
		System.out.println("XML�������");
	}

}
