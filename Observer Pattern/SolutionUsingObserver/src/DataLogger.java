import java.util.ArrayList;
import java.util.List;

public class DataLogger implements Observer{
    private List<Float> temperatureLog;
    private List<Float> humidityLog;
    public DataLogger() {
        temperatureLog = new ArrayList<>();
        humidityLog = new ArrayList<>();
    }
    @Override
    public void update(float temperature, float humidity) {
        logTemperature(temperature);
        logHumidity(humidity);
        printLog();
    }
    private void logHumidity(float humidity) {
        humidityLog.add(humidity);
    }
    private void logTemperature(float temperature) {
        temperatureLog.add(temperature);
    }
    public void printLog() {
        System.out.println("Log: ");
        for (Float temperature : temperatureLog) {
            System.out.println("Temperature: " + temperature);
        }
        for (Float humidity : humidityLog) {
            System.out.println("Humidity: " + humidity);
        }
        System.out.println("End of Log");
        System.out.println();
    }
}
