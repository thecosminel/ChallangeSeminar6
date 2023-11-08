public class ForecastDisplay implements IObserver,Display{
    private WeatherStation weatherStation;

    public ForecastDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    @Override
    public void update(int temperature,int pressure,int humidity) {
        display(temperature,pressure,humidity);

    }

    @Override
    public void display(int temperature,int pressure,int humidity) {
        System.out.println("Forecast Display ...");
        System.out.println("Current Condition Display...");
        System.out.println("Temperature: "+(temperature+1));
        System.out.println("Pressure: "+(pressure+1));
        System.out.println("Humidity: "+(humidity+1));
    }
}
