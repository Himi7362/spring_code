package springevent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");
//		context.start();
//		Demo demo = (Demo)context.getBean("demo");
//		demo.showMsg();
//		context.stop();
		CostomerPublisher publisher = (CostomerPublisher)context.getBean("costomerPublisher");
		publisher.publish();
		publisher.publish();
	}
}
