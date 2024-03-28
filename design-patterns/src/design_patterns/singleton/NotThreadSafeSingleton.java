package design_patterns.singleton;

public class NotThreadSafeSingleton {
	
	public static NotThreadSafeSingleton instance = null;
	
	private NotThreadSafeSingleton() { }
	
	public static NotThreadSafeSingleton getInstance() {
		if(instance == null) {
			instance = new NotThreadSafeSingleton();
		}
		
		return instance;
	}

}
