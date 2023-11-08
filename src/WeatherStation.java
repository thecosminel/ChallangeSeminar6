import java.util.ArrayList;

public class WeatherStation implements ISubject {
    private ArrayList<IObserver> IObservers;
    private int temperature;
    private int pressure;
    private int humidity;

    public WeatherStation() {
        IObservers = new ArrayList<>();

    }

    public int getTemperature() {
        return this.temperature;
    }

    public ArrayList<IObserver> getObservers() {
        return IObservers;
    }

    public int getPressure() {
        return this.pressure;
    }

    public int getHumidity() {
        return this.humidity;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public void setMeasurements(int temperature,int humidity,int pressure){
        this.setPressure(pressure);
        this.setHumidity(humidity);
        this.setTemperature(temperature);
        this.notifyObservers();
    }

    @Override
    public void registerObserver(IObserver IObserver) {
        IObservers.add(IObserver);
    }

    @Override
    public boolean removeObserver(IObserver IObserver) {
        return IObservers.remove(IObserver);
    }

    @Override
    public void notifyObservers() {
        for (IObserver IObserver : IObservers) {
            IObserver.update(this.temperature,this.pressure,this.humidity);
        }
    }
}
