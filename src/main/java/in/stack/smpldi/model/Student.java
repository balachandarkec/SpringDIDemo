package in.stack.smpldi.model;

public class Student {
	private int rollno;
	private String name;
	//private Department department;
	
	public Student() {
		super();
	}

	

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
		
	}



//	public Student(int rollno, String name, Department department) {
//		super();
//		this.rollno = rollno;
//		this.name = name;
//		this.department = department;
//	}
//
//	public Department getDepartment() {
//		return department;
//	}
//
//
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}



	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Strudent [rollno=" + rollno + ", name=" + name +"]";
	}
	
	
	

}
