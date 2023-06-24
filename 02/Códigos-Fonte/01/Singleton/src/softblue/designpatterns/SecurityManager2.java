package softblue.designpatterns;

public class SecurityManager2 {
	
	private static SecurityManager2 instance;
	
	static {
		try {
			instance = new SecurityManager2();
		} catch (Exception e) {
			//tratar exceção
		}
	}
	
	private SecurityManager2() {
	}
	
	public static SecurityManager2 getInstance() {
		return instance;
	}

	public void login() {
		
	}
}
