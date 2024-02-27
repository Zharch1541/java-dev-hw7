package dataobj;

public class ProjectPrices {
    private int id;
    private int price;

    public ProjectPrices(int id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProjectPrices{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
