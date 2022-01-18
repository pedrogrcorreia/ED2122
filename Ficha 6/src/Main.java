public class Main {
    public static void main(String[] args){
        PrintManager printManager = new PrintManager();

        printManager.addPrinter(new Printer("Desk", 20, "HP", "33", "l88", "3.0.0"));
        printManager.addPrinter(new Printer("Office", 20, "HP", "32", "l87", "3.0.0"));
        printManager.addPrinter(new Printer("Bedroom", 20, "HP", "34", "l84", "3.0.0"));

        Printer p = printManager.getPrinter("Desk");
        System.out.println(p);

        System.out.println(printManager.getNames());

        printManager.removePrinter("Office");

        System.out.println(printManager.getNames());
    }
}
