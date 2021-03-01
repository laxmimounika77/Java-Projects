
public class Teacher {
	
	private int teacherID;
	private String teacherName;
	private int teacherSalary;
	
	/**
	 * 
	 * @param teacherID unique teacher id
	 * @param teacherName teacher's name
	 * @param teacherSalary teacher's Salary
	 */
	
	public Teacher(int teacherID, String teacherName, int teacherSalary) {
		this.teacherID=teacherID;
		this.teacherName=teacherName;
		this.teacherSalary=teacherSalary;
	}
	
	/**
	 * 
	 * @return teacher's name
	 */
	public String getTeacherName() {
		return this.teacherName;
		
	}
	
	/**
	 * 
	 * @return teacher's id
	 */
	public int getTeacherID() {
		return this.teacherID;
	}
	
	/**
	 * 
	 * @return teacher's salary
	 */
	public int getTeacherSalary() {
		return this.teacherSalary;
	}
	/**
	 * 
	 * @param teacherSalary updating teacher salary
	 */

	public void setSalary(int teacherSalary) {
		this.teacherSalary=teacherSalary;
	}
}
