package springevent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CStartEvent implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("Spring Start Event");
	}
	
}
