
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirtName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.seteMail("engin@kodlamaio.com");
		instructor1.setPassword("12345");
		instructor1.setCourse("Java");
		instructor1.setScore(4.8);
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirtName("Eyüp");
		student1.setLastName("Karakaya");
		student1.seteMail("eyup@kodlamaio.com");
		student1.setPassword("1453");
		student1.setRegisteredCourse("Java Kampı");
		
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.add(student1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.editProfile(student1, "ek@kodlamaio.com");
		studentManager.editProfile(student1, "Eyüp", "Karakaya");
		
		System.out.println(student1.geteMail());
		System.out.println(student1.getFirtName() + " " + student1.getLastName());
		
		

	}

}
