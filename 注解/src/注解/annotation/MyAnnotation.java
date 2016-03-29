package 注解.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;

/*
 * 自定义一个注解（三个内置注解，四个元注解加上自定义注解）
 */
@Inherited//允许被子类继承下来
@Documented//导出文档
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.PARAMETER})
@Retention(value=RetentionPolicy.RUNTIME)
//元注解（描述注解的注解）
//元数据
public @interface MyAnnotation 
{
	public String name();
	public String info() default "WSDR";//定义属性并指定默认值
	
	public String[] like();//定义一个数组变量
	
	public EnumSex sex();//定义一个枚举变量
}
