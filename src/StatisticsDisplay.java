import java.util.ArrayList;

public class StatisticsDisplay implements IObserver, Display {
    private WeatherStation weatherStation;
    private ArrayList<Integer> temperatures;
    private ArrayList<Integer> pressures;
    private ArrayList<Integer> humidities;


    public StatisticsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
        temperatures = new ArrayList<>();
        pressures = new ArrayList<>();
        humidities = new ArrayList<>();
    }

    @Override
    public void update(int temperature, int pressure, int humidity) {
        temperatures.add(temperature);
        pressures.add(pressure);
        humidities.add(humidity);
        display(temperature, pressure, humidity);

    }

    public double getAverage(ArrayList<Integer> values) {
        int size = values.size();
        int sum = 0;
        for (int value : values)
            sum += value;

        return (double) sum / size;

    }

    @Override
    public void display(int temperature, int pressure, int humidity) {
        System.out.println("Statistics Display ...");
        System.out.println("Average Temperature: "+getAverage(temperatures));
        System.out.println("Average Pressure: "+getAverage(pressures));
        System.out.println("Average Humidity: "+getAverage(humidities));

    }
}
