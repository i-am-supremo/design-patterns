public class SharedResource {

    private int data;

    private boolean hasData;

    public synchronized int consume()
    {
        while (!hasData)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("consumed " + data);
        notify();
        return data;
    }

    public synchronized void produce(int value){

        while(hasData)
        {
            try{
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("produced data: " + value);
        notify();
    }
}
