package labsession;

public class Employee {

	private int id;
	private String name;
	private int salary;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setId(21);
		e.setName("jd");
		e.setSalary(100);

		System.out.println("id=" + e.getId());
		System.out.println("name=" + e.getName());
		System.out.println("salary=" + e.getSalary());

	}

}
