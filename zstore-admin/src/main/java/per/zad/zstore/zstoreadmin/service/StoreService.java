package per.zad.zstore.zstoreadmin.service;

public class StoreService{
    private String item;

    public String saleItem() {
        return "hello " + item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}