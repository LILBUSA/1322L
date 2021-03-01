public class DiscountBooking extends Ticket {
    private int price;
    private int numDaysUntilGame;

    public DiscountBooking(int numDaysUntilGame) {
        super();
        setNumDaysUntilGame(numDaysUntilGame);
        setPrice(getPrice());
    }

    public int getPrice() {
        if (getNumDaysUntilGame() == 0) {
          return 75;
        } else {
          return 10;
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
