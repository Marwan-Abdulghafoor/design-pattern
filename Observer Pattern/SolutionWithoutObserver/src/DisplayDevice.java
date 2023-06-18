public class DisplayDevice {
    public void update(float temperature, float humidity) {
        displayTemperature(temperature);
        displayHumidity(humidity);
    }
    private void displayTemperature(float temperature) {
        System.out.println("Current temperature: " + temperature);
    }
    private void displayHumidity(float humidity) {
        System.out.println("Current humidity: " + humidity);
    }
}
