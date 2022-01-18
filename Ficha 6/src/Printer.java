import java.util.Comparator;
import java.util.PriorityQueue;

public class Printer {
    public String name;
    public int port;
    public String brand;
    public String model;
    public String driver;
    public String version;

    public Printer(String name, int port, String brand, String model, String driver, String version){
        this.name = name;
        this.port = port;
        this.brand = brand;
        this.model = model;
        this.driver = driver;
        this.version = version;
    }

    PriorityQueue<Work> queue = new PriorityQueue<Work>(Comparator.comparingInt(Work::getPages));

    public String getName(){
        return name;
    }

    public boolean hasNextWork(){
        return !queue.isEmpty();
    }

    public Work nextWork(){
        return queue.poll();
    }

    public Work peekNextWork(){
        return queue.peek();
    }

    public void sendWork(Work work){
        queue.add(work);
    }

    public int getWorkSize(){
        return queue.size();
    }

    @Override
    public String toString() {
        return "Printer '" + name + "'\n" +
                "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Driver: " + driver + "\n" +
                "Version: " + version + "\n" +
                "Port: " + port;
    }
}
