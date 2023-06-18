import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private float temperature;
    private float humidity;
    private List<DisplayDevice> displayDevices;
    private List<DataLogger> dataLoggers;

    public WeatherStation() {
        displayDevices = new ArrayList<>();
        dataLoggers = new ArrayList<>();
    }

    public void attachDisplayDevice(DisplayDevice displayDevice) {
        displayDevices.add(displayDevice);
    }

    public void detachDisplayDevice(DisplayDevice displayDevice) {
        displayDevices.remove(displayDevice);
    }

    public void attachDataLogger(DataLogger dataLogger) {
        dataLoggers.add(dataLogger);
    }

    public void detachDataLogger(DataLogger dataLogger) {
        dataLoggers.remove(dataLogger);
    }

    public void setWeatherData(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyDisplayDevices();
        notifyDataLoggers();
    }

    private void notifyDisplayDevices() {
        for (DisplayDevice displayDevice : displayDevices) {
            displayDevice.update(temperature, humidity);
        }
    }

    private void notifyDataLoggers() {
        for (DataLogger dataLogger : dataLoggers) {
            dataLogger.logData(temperature, humidity);
        }
    }
}
