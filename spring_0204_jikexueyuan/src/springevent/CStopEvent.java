package springevent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CStopEvent implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("Spring Stop Event");
	}

}
