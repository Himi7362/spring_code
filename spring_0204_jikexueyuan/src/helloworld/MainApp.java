package helloworld;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");//1 ApplicationContext
//		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));//2	XmlBeanFactory
//		FileSystemXmlApplicationContext appContext =new FileSystemXmlApplicationContext
//				("D:/PZHCRec/tobeBetter/HTML/jwebwork/spring_0204_jikexueyuan/src/Beans.xml");//3	FileSystemXmlApplicationContext 
//		HelloWorld pojo = (HelloWorld) context.getBean("HelloWorld");
//		pojo.getMessage();
//		pojo.getDi();
		HelloWorld pojo1 = (HelloWorld) context.getBean("helloWorld");
		pojo1.getMessage();
		pojo1.getDiMsg();//bean 自动装配 byName :id name, byType 根据classpath去找
//		
//		CollectionDI pojo = (CollectionDI) context.getBean("CollectionDI");
//		System.out.println(pojo.getAddList());
//		System.out.println(pojo.getAddMap());
//		System.out.println(pojo.getAddSet());
//		System.out.println(pojo.getProp());
		context.registerShutdownHook();
	}
	
}
