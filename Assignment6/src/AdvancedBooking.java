public class AdvancedBooking extends Ticket {
    private int price;
    private int numDaysUntilGame;

    public AdvancedBooking(int numDaysUntilGame) {
        super();
        setNumDaysUntilGame(numDaysUntilGame);
        setPrice(getPrice());
    }

    public int getPrice() {
        if (getNumDaysUntilGame() >= 15) {
            return 25;
        } else {
            return 50;
        }
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumDaysUntilGame() {
        return numDaysUntilGame;
    }

    public void setNumDaysUntilGame(int days) {
        numDaysUntilGame = days;
    }

    @Override
    public String toString() {
        return super.toString() + " for a game in " + getNumDaysUntilGame() + " days.";
    }
}
