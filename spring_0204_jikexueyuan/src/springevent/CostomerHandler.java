package springevent;

import org.springframework.context.ApplicationListener;

public class CostomerHandler implements ApplicationListener<CostomerEvent>{

	@Override
	public void onApplicationEvent(CostomerEvent event) {
		System.out.println(event);
	}

}
