public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void fillToner(int fillAmount) {
        if (this.tonerLevel + fillAmount <= 100) {
            this.tonerLevel += fillAmount;
        } else {
            System.out.println("Toner can only be filled up to 100%");
        }
    }

    public void printPage() {
        this.pagesPrinted -= this.pagesPrinted;
    }
}
