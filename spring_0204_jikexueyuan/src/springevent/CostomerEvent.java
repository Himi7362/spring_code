package springevent;

import org.springframework.context.ApplicationEvent;

public class CostomerEvent extends ApplicationEvent{

	public CostomerEvent(Object source) {
		super(source);
	}
	@Override
	public String toString() {
		return this.getClass().toString()+":自定义事件";
	}
}
