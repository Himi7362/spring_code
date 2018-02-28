package springevent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CostomerPublisher implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher publisher;
	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationeventpublisher) {
		this.publisher = applicationeventpublisher;
	}

	public void publish(){
		CostomerEvent ce = new CostomerEvent(this);
		publisher.publishEvent(ce);
	}
}
