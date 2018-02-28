package helloworld;

public class HelloWorld {
	private ConstructorDI constructorDI;
	private String message;
//	//通过构造方法的依赖注入
	public HelloWorld(ConstructorDI di) {
		this.constructorDI=di;
	}
	//通过设置函数 setter 
//	public void setConstructorDI(ConstructorDI constructorDI){
//		this.constructorDI = constructorDI;
//	}
	public void getMessage() {
		System.out.println("message="+this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
		System.out.println("bean initiating...");
	}
	public void destroy(){
		System.out.println("bean destroy");
	}
	public void getDiMsg( ){
//		this.constructorDI = constructorDI;
		constructorDI.showMsg();
	}
}
