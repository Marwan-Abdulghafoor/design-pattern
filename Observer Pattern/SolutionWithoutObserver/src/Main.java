public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        DisplayDevice displayDevice = new DisplayDevice();

        DataLogger dataLogger = new DataLogger();

        weatherStation.attachDisplayDevice(displayDevice);
        weatherStation.attachDataLogger(dataLogger);

        weatherStation.setWeatherData(25.0f, 60.0f);

        weatherStation.setWeatherData(27.5f, 55.0f);

    }
}