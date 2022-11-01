import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {
    Ticket ticket1 = new Ticket(1, 1299, "SVO", "KZN", 1.35);
    Ticket ticket2 = new Ticket(2, 3456, "DMD", "KZN", 1.35);
    Ticket ticket3 = new Ticket(3, 7548, "SVO", "KZN", 1.30);
    Ticket ticket4 = new Ticket(4, 2199, "SVO", "KZN", 1.40);
    Ticket ticket5 = new Ticket(5, 2199, "MSK", "SPB", 1.35);

    public Manager addToManager() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        return manager;
    }

    @Test
    public void oneSearchResultByToFrom() {
        Ticket[] actual = addToManager().searchByWithPriceComparator("MSK", "SPB");
        Ticket[] expected = {ticket5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchResultWithSortMethod1() {
        Ticket[] tickets = addToManager().searchByWithPriceComparator("SVO", "KZN");
        for (int i = 1; i < tickets.length; i++) {
            Assertions.assertTrue(tickets[i].getPrice() > tickets[i - 1].getPrice());
        }
    }

    @Test
    public void searchResultWithSortMethod2() {
        Ticket[] actual = addToManager().searchByWithPriceComparator("SVO", "KZN");
        Ticket[] expected = {ticket1, ticket4, ticket3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchResultSortTime() {
        Ticket[] actual = addToManager().searchByWithTimeComparator("SVO", "KZN");
        Ticket[] expected = {ticket3, ticket1, ticket4};
        Assertions.assertArrayEquals(expected, actual);
    }
}
