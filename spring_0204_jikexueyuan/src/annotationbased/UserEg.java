package annotationbased;

import org.springframework.beans.factory.annotation.Required;

/**
 * 
 * @ClassName: UserEg 
 * @Description:Spring 基于注解的用法 ，就是把xml的属性set 进去 
 * @author penny
 * @date 2018年2月12日 上午1:25:24 
 *
 */
public class UserEg {

	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	@Required
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
}
