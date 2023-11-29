package model;

import java.util.Date;

public class ReceptNote {
    private String id;
    private Date date;
    private String moreInfo;
    private Suplier suplier;
    private Staff staff;

    public ReceptNote(String id, Date date, String moreInfo, Suplier suplier, Staff staff) {
        this.id = id;
        this.date = date;
        this.moreInfo = moreInfo;
        this.suplier = suplier;
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

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public Suplier getSuplier() {
        return suplier;
    }

    public void setSuplier(Suplier suplier) {
        this.suplier = suplier;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}
