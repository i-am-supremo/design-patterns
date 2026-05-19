package observer;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer obs =  new MobileDevice();
        weatherStation.attach(obs);
        Observer obs2 = new LCD();
        weatherStation.attach(obs2);

        weatherStation.setTemperature(33.5F);
    }
}
