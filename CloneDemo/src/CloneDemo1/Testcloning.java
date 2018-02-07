package CloneDemo1;
class Student implements Cloneable
{
	int id;
	String name;
	Department department;
	public Student(int id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
}
class Department
{
	int id;
	String dname;
	public Department(int id, String dname) {
		super();
		this.id = id;
		this.dname = dname;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
}
public class Testcloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Department d=new Department(1,"abcd");
		Student s1=new Student(1,"abc",d);
		Student cloned=(Student) s1.clone();
		/*System.out.println(cloned.getId());
		System.out.println(s1!=cloned);
		System.out.println(s1.getClass()==cloned.getClass());
		System.out.println(s1.equals(cloned));
		*/
		cloned.getDepartment().setDname("b");
		System.out.println(s1.getDepartment().getDname());

	}

}
