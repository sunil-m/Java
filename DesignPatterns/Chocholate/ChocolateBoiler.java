package Chocholate;

public class ChocolateBoiler {
    private static volatile ChocolateBoiler uniqueInstance;
    
    private ChocolateBoiler() {}
    
    public static ChocolateBoiler getInstance() {
    	if (uniqueInstance == null) {
    		synchronized (ChocolateBoiler.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new ChocolateBoiler();
				}
			}
    	}
    	return uniqueInstance;
    }
}
