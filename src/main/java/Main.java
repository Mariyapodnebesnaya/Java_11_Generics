import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(1, 1299, "SVO", "KZN", 1.35);
        Ticket ticket3 = new Ticket(3, 3456, "DME", "KZN", 1.35);
        Ticket ticket4 = new Ticket(4, 7548, "DMZ", "KZN", 1.35);

        Ticket ticket2 = new Ticket(2, 2199, "VKO", "KZN", 1.35);

        TicketPriceComparator priceComparator = new TicketPriceComparator();

        Ticket[] tickets = {ticket1,ticket3, ticket4, ticket2};
        Arrays.sort(tickets, priceComparator);
        System.out.println(1);
    }
}
