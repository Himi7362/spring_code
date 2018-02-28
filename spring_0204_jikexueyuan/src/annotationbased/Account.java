package annotationbased;

import org.springframework.beans.factory.annotation.Autowired;

public class Account {

	private int acctid;
	private String acctname;
//	@Autowired	//属性 注解
	private UserEg user;
//	@Autowired  // setter 注解
	public void setUser(UserEg user) {
		this.user = user;
	}
	@Autowired //构造方法注解
	public Account(UserEg user) {
		this.user = user;
	}
	
	public int getAcctid() {
		return acctid;
	}
	@Autowired(required=false) //required =false 时 就会被配置成 该类型的默认值 int =0 string=null  object=null;
	public void setAcctid(int acctid) {
		this.acctid = acctid;
	}
	public String getAcctname() {
		return acctname;
	}
	@Autowired		 // @Autowired 默认就是required =true  意味着 该属性 必须配置参数
	public void setAcctname(String acctname) {
		this.acctname = acctname;
	}
	public void getUserInfo(){
		System.out.println("name="+user.getName());
		System.out.println("age="+user.getAge());
	}
	public void getAcctInfo(){
		System.out.println("acctid="+this.getAcctid());
		System.out.println("acctname="+this.getAcctname());
	}
}
