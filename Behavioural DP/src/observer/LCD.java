package observer;

public class LCD implements Observer {
    @Override
    public void update(float temp) {
        System.out.println("LCD Device is notified and temp is "+temp);
    }
}
