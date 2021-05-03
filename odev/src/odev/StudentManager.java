package odev;

public class StudentManager extends UserManager {
	public void registerCourse(User user) {
		System.out.println("Registered this course." + user.getCourse());
	}
	
	
}
