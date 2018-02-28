package springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans5.xml");
		UserDao userJDBCTemplate = (UserDao)context.getBean("userJDBCTemplate");
//		userJDBCTemplate.create("剑圣", "15");
//		userJDBCTemplate.create("拉萨的咖啡机", "75");
//		userJDBCTemplate.create("DK", "26");//添加一个
		
//		User user = userJDBCTemplate.getUser(24);//获取一个
//		System.out.println(user.toString());
//		userJDBCTemplate.delete(26);//删除
//		userJDBCTemplate.update(13, "ff草泥马勒戈壁");
		userJDBCTemplate.addMarksUser("美宝莲 纽约 Helloween", "test 1/0", 2018, 005);
		List<UserMarks> Users = userJDBCTemplate.listUser();
		for (UserMarks user : Users) {
			System.out.println(user.toString());
		}
	}
}
