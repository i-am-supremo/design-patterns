package observer;

public class MobileDevice implements Observer {

    @Override
    public void update(float temp) {
        System.out.println("Mobile Device is notified and temp is "+temp);
    }
}
