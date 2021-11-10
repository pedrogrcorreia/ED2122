import java.util.Iterator;

public class DezReaisMutavel extends DezReais {
    private int mod = 0;

    public void remove(int pos){
        mod++;
        for(int j = pos; j<last-1; j++){
            list[j] = list[j+1];
        }
        if(last > -1){
            last--;
        }
    }

    public void acrescenta(Double val){
        mod++;
        add(val);
    }

    public int getMod(){
        return mod;
    }

    public Iterator<Double> iterator(){
        return new ItDezReaisMutavel(this);
    }
}
