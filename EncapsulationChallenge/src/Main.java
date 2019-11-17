
public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);

        printer.fillToner(40);
        printer.printPage();

        System.out.println("Printer toner is at " + printer.getTonerLevel());
        System.out.println("Number of pages printed: " + printer.getPagesPrinted());
    }
}
