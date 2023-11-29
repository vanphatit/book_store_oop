package model;

public class ReceptNoteDetail {
    private int unitPrice;
    private int quantity;
    private ReceptNote receptNote;
    private Object object;

    public ReceptNoteDetail(int unitPrice, int quantity, ReceptNote receptNote, Object object) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.receptNote = receptNote;
        this.object = object;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ReceptNote getReceptNote() {
        return receptNote;
    }

    public void setReceptNote(ReceptNote receptNote) {
        this.receptNote = receptNote;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
