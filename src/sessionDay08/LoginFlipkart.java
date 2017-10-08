package sessionDay08;

public class LoginFlipkart {

	
	String username;
	String password;
	
	
	public LoginFlipkart(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void login() {
		
		System.out.println("Username entered is:"+ username);
		System.out.println("Password entered is:"+ password);
		System.out.println("Login Successful");
	}

}
