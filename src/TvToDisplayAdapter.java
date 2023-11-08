public class TvToDisplayAdapter implements Display, IObserver {
    private Tv tv;

    public TvToDisplayAdapter(Tv tv, WeatherStation weatherStation) {
        this.tv = tv;
        weatherStation.registerObserver(this);
    }

    @Override
    public void display(int temperature, int pressure, int humidity) {
        tv.displayOnChannel1("\nDisplay on TV");
        tv.displayOnChannel1("Temperature: " + String.valueOf(temperature));
        tv.displayOnChannel2("Pressure: " + String.valueOf(pressure));
        tv.displayOnChannel2("Humidity: " + String.valueOf(humidity) + '\n');
    }

    @Override
    public void update(int temperature, int pressure, int humidity) {
        this.display(temperature, pressure, humidity);
    }
}
