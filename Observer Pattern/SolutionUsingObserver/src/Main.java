public class Main {
    public static void main(String[] args) {
        WeatherStation weatherData = new WeatherStation();

        Observer displayDevice = new DisplayDevice();
        Observer dataLogger = new DataLogger();

        weatherData.attachObserver(displayDevice);
        weatherData.attachObserver(dataLogger);

        weatherData.setWeatherData(25.0f, 60.0f);

        weatherData.setWeatherData(27.5f, 55.0f);
    }
}