public class CurrentConditionsDisplay implements IObserver, Display {
    private WeatherStation weatherStation;

    public CurrentConditionsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);

    }

    @Override
    public void update(int temperature,int pressure,int humidity) {
        display(temperature,pressure,humidity);
    }

    @Override
    public void display(int temperature,int pressure,int humidity) {
        System.out.println("Current Condition Display...");
        System.out.println("Temperature: "+temperature);
        System.out.println("Pressure: "+pressure);
        System.out.println("Humidity: "+humidity);
    }
}
