package WeatherObservable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	Observable observable;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void display() {
        System.out.println("======Current Conditions======");
        System.out.println("Temperature = " + temperature);
        System.out.println("Humidity    = " + humidity);
        System.out.println("Pressure    = " + pressure);
	}

	public void update( Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherdata = (WeatherData) o;
            this.temperature = weatherdata.getTemperature();
            this.humidity = weatherdata.getHumidity();
            this.pressure = weatherdata.getPressure();
            display();
		}
	}
}
