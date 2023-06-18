public class DisplayDevice implements Observer{
    float temperature;
    float humidity;
    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        displayTemperature();
        displayHumidity();
    }

    private void displayTemperature() {
        System.out.println("Current temperature: " + temperature);
    }

    private void displayHumidity() {
        System.out.println("Current humidity: " + humidity);
    }

}
