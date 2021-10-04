public class Result {

    private int order_id;
    private String shop_name;
    private int shop_id;
    private int cost;

    public Result(int order_id, String shop_name, int shop_id, int cost) {
        this.order_id = order_id;
        this.shop_name = shop_name;
        this.shop_id = shop_id;
        this.cost = cost;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
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
