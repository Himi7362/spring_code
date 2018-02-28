package springjdbc;

public class UserMarks {

	private int id;
	private String name;
	private String age;
	private int uid;
	private int marks;
	private int year;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString(){
		return  "id="+this.id+" name="+this.name+" age="+this.age+"   uid="+this.uid+" year="+this.year+" marks="+this.marks;
	}
}
