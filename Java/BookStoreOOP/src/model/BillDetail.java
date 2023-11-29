package model;

public class BillDetail {
    private int quantity;
    private Bill bill;
    private Object object;

    public BillDetail(String id, int quantity, Bill bill, Object object) {
        this.quantity = quantity;
        this.bill = bill;
        this.object = object;
    }

    public int getQuantity() {
        return quantity;
    }

    public Bill getBill() {
        return bill;
    }

    public Object getObject() {
        return object;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
