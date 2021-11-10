public class Main {
    public static void main(String[] args){
        DezReais d = new DezReais();
        ItDezReais id = new ItDezReais(d);

        for(int j=0; j<10; j++){
            d.add(Double.valueOf(j));
        }

        while(id.hasNext()){
            System.out.println("Last: " + id.next());
        }

        DezReaisMutavel drm = new DezReaisMutavel();
        ItDezReaisMutavel idrm = new ItDezReaisMutavel(drm);

        for(int j=0; j<10; j++){
            drm.add(Double.valueOf(j));
        }

        Double db1;

        while(idrm.hasNext() && (db1 = idrm.next()) < 6){
            System.out.println("ultimo: " + db1);
        }

        idrm.remove();

        ItDezReaisMutavel idrm2 = new ItDezReaisMutavel(drm);

        while(idrm2.hasNext()){
            System.out.println("sem 6: " + idrm2.next());
        }
    }
}
