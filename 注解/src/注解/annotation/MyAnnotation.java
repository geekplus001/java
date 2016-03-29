package ע��.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;

/*
 * �Զ���һ��ע�⣨��������ע�⣬�ĸ�Ԫע������Զ���ע�⣩
 */
@Inherited//��������̳�����
@Documented//�����ĵ�
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.PARAMETER})
@Retention(value=RetentionPolicy.RUNTIME)
//Ԫע�⣨����ע���ע�⣩
//Ԫ����
public @interface MyAnnotation 
{
	public String name();
	public String info() default "WSDR";//�������Բ�ָ��Ĭ��ֵ
	
	public String[] like();//����һ���������
	
	public EnumSex sex();//����һ��ö�ٱ���
}
