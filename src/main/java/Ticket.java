public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String from;
    private String to;
    private double time;

    public Ticket(int id, int price, String from, String to, double time) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
        this.time= time;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public int compareTo(Ticket o) {
        if (price < o.getPrice()) {
            return -1;
        } else if (price > getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }
    public boolean matches(String search) {
        return getFrom().contains(search) || getTo().contains(search);
    }
}

