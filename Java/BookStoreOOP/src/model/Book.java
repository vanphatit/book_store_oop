package model;

public class Book {
    private String id;
    private String name;
    private String status;
    private String author;
    private int unitPrice;
    private BookCategory category;

    public Book(String id, String name, String status, String author, int unitPrice, BookCategory category) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.author = author;
        this.unitPrice = unitPrice;
        this.category = category;
    }

    //getter and setter
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getStatus() {
        return status;
    }
    public String getauthor() {
        return author;
    }
    public int getUnitPrice() {
        return unitPrice;
    }
    public BookCategory getCategory() {
        return category;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name= name;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setauthor(String author) {
        this.author = author;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }
}
