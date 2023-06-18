import java.util.ArrayList;
import java.util.List;

public class DataLogger {
    private List<Float> temperatureLog;
    private List<Float> humidityLog;

    public DataLogger() {
        temperatureLog = new ArrayList<>();
        humidityLog = new ArrayList<>();
    }

    public void logData(float temperature, float humidity) {
        temperatureLog.add(temperature);
        humidityLog.add(humidity);
        printLog();
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
