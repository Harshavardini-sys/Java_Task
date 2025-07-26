package taskOpps;

interface Logger{
	default void logInfo() {
		System.out.println("logInfo() called");
	}
	static void logError() {
		System.out.println("logError() called");
	}
	
}

class AppLogger implements Logger{
	
}

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppLogger obj = new AppLogger();
		obj.logInfo();
		Logger.logError();
	}

}
