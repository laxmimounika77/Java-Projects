import java.util.List;

public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private int totalMoneyEarned;
	private int totalMoneySpent;

	
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers= teachers;
		this.students= students;
		this.totalMoneyEarned=0;
		this.totalMoneySpent=0;
		
		
		
	}
	
	public List<Teacher> getTeachers(){
		return teachers;
	}
	
	public void addTeachers(Teacher teacher){
		teachers.add(teacher);
	}
	
	public List<Student> getStudents(){
		return students;
	}
	
	public void addStudents(Student student){
		students.add(student);
	}
	
	public int getTotalMoneyEarned() {
		return this.totalMoneyEarned;
	}
	
	public int getTotalMoneySpent() {
		return this.totalMoneySpent;
	}
	
	public void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned+=moneyEarned;
		
	}
	
	public void updateTotalMoneySpent(int moneySpent) {
		this.totalMoneyEarned-=moneySpent;
		
	}
	
}
