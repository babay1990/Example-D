public class Billing {

    private int order_id;
    private int shop_id;
    private int cost;

    public Billing(int order_id, int shop_id, int cost) {
        this.order_id = order_id;
        this.shop_id = shop_id;
        this.cost = cost;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
