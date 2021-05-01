
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirtName()+ " " + user.getLastName() + " " + "Kullanýcý eklenmiþtir." );	
	}
	public void editProfile(User user ,String eMail) {
		user.seteMail(eMail);
	}
	
	public void editProfile(User user,String firtName, String lastName) {
		user.setFirtName(firtName);
		user.setLastName(lastName);
	}

}
