public class CurrentBooking extends Ticket {
    private int price;

    public CurrentBooking() {
        super();
        setPrice(getPrice());
    }

    public int getPrice() {
       return 75;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + " for today's game.";
    }
}
