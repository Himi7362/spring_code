package annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {

	@Autowired
	@Qualifier("account2")
	private Account acct;
	public Profile() {
		
	}
	public void getAcctInfo(){
//		System.out.println(acct.getAcctid()+" "+acct.getAcctname());
		acct.getAcctInfo();
	}
}
