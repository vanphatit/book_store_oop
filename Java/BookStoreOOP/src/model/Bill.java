package model;

import java.util.Date;

public class Bill {
    private String id;
    private Date date;
    private String status;
    private Reader reader;
    private Staff staff;

    public Bill(String id, Date date, String status, Reader reader, Staff staff) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.reader = reader;
        this.staff = staff;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}
