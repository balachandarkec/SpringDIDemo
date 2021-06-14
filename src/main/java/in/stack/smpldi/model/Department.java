package in.stack.smpldi.model;

import java.util.List;

public class Department {
	private int id;
	private String name;
	
	private List<Student> students;
	
	public Department() {
		super();
	}
//	public Department(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
	
	

	public Department(int id, String name, List<Student> students) {
	super();
	this.id = id;
	this.name = name;
	this.students = students;
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
//	@Override
//	public String toString() {
//		return "Department [id=" + id + ", name=" + name + "]";
//	}
//	
//	



	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", students=" + students + "]";
	}



	public List<Student> getStudents() {
		return students;
	}



	public void setStudents(List<Student> students) {
		this.students = students;
	}
	

}
