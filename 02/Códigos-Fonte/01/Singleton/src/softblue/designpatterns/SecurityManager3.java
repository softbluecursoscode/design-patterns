package softblue.designpatterns;

public class SecurityManager3 {
	
	private static SecurityManager3 instance;
	
	private SecurityManager3() {
	}
	
	public static SecurityManager3 getInstance() {
		if (instance == null) {
			synchronized (SecurityManager3.class) {
				if (instance == null) {
					instance = new SecurityManager3();
				}
			}
		}
		return instance;
	}

	public void login() {
		
	}
}