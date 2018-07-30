public class Printer {
    public int paperTray;
    public int tonerAmount;


    // Set up printer with 100 sheets of paper and 1000 toner units
    public Printer(int paperTray, int tonerAmount) {
        this.paperTray = 100;
        this.tonerAmount = 1000;
    }

    //Dedine a print method that checks if pages x copies =< paper in the paperTray
    public int print(int pages, int copies) {

        if (this.paperTray <= (pages * copies)) {

            return (this.paperTray = -(pages * copies));

        }

    }
}
