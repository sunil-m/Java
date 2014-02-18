package Weather;

public class WeatherStation {
    public static void main(String args[]) {
    	WeatherData weatherdata = new WeatherData();
    	CurrentConditionsDisplay cdisplay = new CurrentConditionsDisplay(weatherdata);
    	HeatIndexDisplay hdisplay = new HeatIndexDisplay(weatherdata);
    	
    	weatherdata.setMeasurements(80, 65,  30.4f);
    	weatherdata.setMeasurements(88, 68,  31.4f);
    }
}
