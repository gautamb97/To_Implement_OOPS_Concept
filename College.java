//Encapsulation
class Student {
	private int enrollmentno;
	private String name;
	//Getter and Setter
	public int getEnrollmentno() {
		return enrollmentno;
	}
	public void setEnrollmentno(int enrollmentno) {
		this.enrollmentno = enrollmentno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class College {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setEnrollmentno(120130);
		s1.setName("Pearl");
		
		System.out.println(s1.getEnrollmentno());
		System.out.println(s1.getName());

	}

}
