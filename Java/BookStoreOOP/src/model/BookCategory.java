package model;

public class BookCategory {
    private String id;
    private String name;

    public BookCategory(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //getter and setter
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name= name;
    }
}
