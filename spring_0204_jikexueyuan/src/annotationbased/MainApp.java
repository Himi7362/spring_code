package annotationbased;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext xml = new ClassPathXmlApplicationContext("Beans2.xml");
//		Account acct = (Account) xml.getBean("account");
//		acct.getUserInfo();
//		acct.getAcctInfo();
		//@qualifier
		Profile profile = (Profile) xml.getBean("profile");
		profile.getAcctInfo();
	}
}
