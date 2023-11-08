public class Main {
    public static void main(String[] args) {
        WeatherStation weatherData = new WeatherStation();

        // Create a display
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // Create a tv and adapt it to display
        FullHdTV fullHdTV = new FullHdTV();
        TvToDisplayAdapter tvToDisplayAdapter = new TvToDisplayAdapter(fullHdTV, weatherData);

        // Update
        weatherData.setMeasurements(75, 60, 30);
    }
}