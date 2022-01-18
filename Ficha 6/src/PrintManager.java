import java.util.*;

public class PrintManager {

    HashMap<String, Printer> map = new HashMap<>();

    PriorityQueue<Printer> printers = new PriorityQueue<>(new Comparator<Printer>() {
        @Override
        public int compare(Printer p1, Printer p2) {
            int work = p1.getWorkSize() - p2.getWorkSize();
            if (work == 0) {
                int pages = p1.peekNextWork().getPages() - p2.peekNextWork().getPages();
                if (pages == 0) {
                    int rand = new Random().nextInt(2);
                    if (rand == 0) {
                        return -1;
                    }
                    return 1;
                }
                return pages;
            }
            return work;
        }
    });

    public Printer getPrinter(String name){
        return map.get(name);
    }

    public Set<String> getNames(){
        return map.keySet();
    }

    public void addPrinter(Printer printer){
        map.put(printer.getName(), printer);
    }

    public void removePrinter(String name){
        map.remove(name);
    }

    public boolean existsPrinter(String name){
        return map.containsKey(name);
    }

    public void print(Work work){
        printers.poll().sendWork(work);
    }
}
