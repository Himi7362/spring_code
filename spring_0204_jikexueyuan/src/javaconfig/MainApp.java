package javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(BoradConfig.class);
		Borad borad = (Borad)appCtx.getBean(Borad.class);
		borad.setBid(11111);
		System.out.println(borad.getBid());
		borad.run();
	}
}
