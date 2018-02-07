package CloneDemo1;

public class Employee implements Cloneable{
int id;
String name;

	@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}


	public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
	


	public Employee(Employee e1) {
		// TODO Auto-generated constructor stub
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




	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		Employee e=new Employee(1,"abc");
		Employee e1=new Employee(2,"xyz");
		Employee e3=new Employee(e1);//copy constructor
		System.out.println(e3.equals(e1));//object reference
		System.out.println(e1);
		System.out.println(e==e1);//compare reference
		System.out.println(e.getClass()==e1.getClass());//in between same class
		System.out.println(e.equals(e1));
		//cloning true and false example
		
		
		

	}

}
