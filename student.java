package Student_management;

public class student {
	private int id;
	private String name;
	private int age;
	private int clssnum;
	public student(int id, String name, int age, int clssnum) {
		//super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.clssnum = clssnum;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getClssnum() {
		return clssnum;
	}
	public void setClssnum(int clssnum) {
		this.clssnum = clssnum;
	}
	
	
}



