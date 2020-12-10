// employee class
public class Employee {
	
	// essentially the details of employee need to be stored in a file which gets loaded into JTable
	
	int EmployeeId = 0;
	String name;
	String surname;
	String job;
	int age;
	int HolidaysRemaining = 28;
	int HolidaysRequested;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHolidaysRemaining() {
		return HolidaysRemaining;
	}
	public void setHolidaysRemaining(int holidaysRemaining) {
		HolidaysRemaining = holidaysRemaining;
	}
	public int getHolidaysRequested() {
		return HolidaysRequested;
	}
	public void setHolidaysRequested(int holidaysRequested) {
		HolidaysRequested = holidaysRequested;
	}
	
	
}
