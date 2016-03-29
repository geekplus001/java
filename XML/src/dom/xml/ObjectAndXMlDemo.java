package dom.xml;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import dom.vo.Teacher;

public class ObjectAndXMlDemo 
{
	
	//把对象转换成XML文件
	public static void object2XMl(File file,Teacher obj) throws IOException
	{
		OutputStream out = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(out);
		//构造一个把对象输出到XML文件中的工具
		XMLEncoder encoder = new XMLEncoder(bos);
		encoder.writeObject(obj);
		encoder.flush();
		encoder.close();
		
		bos.close();
		out.close();
	}
	//把XML文件转换成对象
	public static Teacher XML2Object(File file) throws IOException
	{
		InputStream in = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(in);
		
		//构造一个把XML文件转换成对象的工具
		XMLDecoder decoder = new XMLDecoder(bis);
		Teacher t = (Teacher)decoder.readObject();
		
		decoder.close();
		bis.close();
		in.close();
		
		return t;
	}
	
	public static void main(String[] args) throws IOException
	{
		Teacher t =new Teacher(1,"白老师","一个猥琐但不下流的淫");
		object2XMl(new File("G://teacher.xml"), t);
		System.out.println("success!");
		
		t = XML2Object(new File("G://teacher.xml"));
		System.out.println(t);
	}

}
