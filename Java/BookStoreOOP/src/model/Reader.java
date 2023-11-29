package model;

public class Reader {
    private String id;
    private String name;
    private Boolean gender;
    private ReaderCategory category;

    public Reader(String id, String name, Boolean gender, ReaderCategory category) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public ReaderCategory getCategory() {
        return category;
    }

    public void setCategory(ReaderCategory category) {
        this.category = category;
    }
}
