package Weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherdata;
	
	public CurrentConditionsDisplay(Subject weatherdata) {
		this.weatherdata = weatherdata;
		weatherdata.registerObserver(this);
	}
	
	public void display() {
        System.out.println("======Current Conditions======");
        System.out.println("Temperature = " + temperature);
        System.out.println("Humidity    = " + humidity);
        System.out.println("Pressure    = " + pressure);
	}

	public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
	}

}
