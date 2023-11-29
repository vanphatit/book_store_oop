package model;

public class ReceptNoteDetail {
    private int unitPrice;
    private int quantity;
    private ReceptNote receptNote;
    private Book book;

    public ReceptNoteDetail(int unitPrice, int quantity, ReceptNote receptNote, Book book) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.receptNote = receptNote;
        this.book = book;
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

    public Book getbook() {
        return book;
    }

    public void setbook(Book book) {
        this.book = book;
    }
}
