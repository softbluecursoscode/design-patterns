package softblue.designpatterns;

public class App {

	public static void main(String[] args) {
		
		SecurityManager sm1 = SecurityManager.getInstance();
		sm1.login();
		
		SecurityManager sm2 = SecurityManager.getInstance();
		sm2.login();
		
	}
}
