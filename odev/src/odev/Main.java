package odev;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setUserName("dilara");
		student.setEmail("dilara.aslan.98@hotmail.com");
		student.setCourse("Java");
		
		Instructor instructor = new Instructor();
		instructor.setCourse("C# Kamp Programming");
		
		UserManager userManager = new UserManager();
		userManager.updateProfile(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerCourse(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
	}

}
