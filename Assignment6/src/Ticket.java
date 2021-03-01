public abstract class Ticket {
    private int price;
    private int ticketNumber;
    private static int nextTicketNumber = 1;

    public Ticket() {
        ticketNumber = nextTicketNumber;
        nextTicketNumber++;
    }

    public abstract int getPrice();

    @Override
    public String toString() {
        return "Ticket number " + ticketNumber + " with a price of $" + getPrice();
    }
}
