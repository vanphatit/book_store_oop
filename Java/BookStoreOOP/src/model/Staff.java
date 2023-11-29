package model;

import java.util.Date;

public class Staff {
    private String id;
    private String name;
    private String workShift;
    private String address;
    private Boolean gender;
    private Date birthday;
    private String phone;

    public Staff(String id, String name, String workShift, String address, Boolean gender, Date birthday, String phone) {
        this.id = id;
        this.name = name;
        this.workShift = workShift;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.phone = phone;
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

    public String getworkShift() {
        return workShift;
    }

    public void setworkShift(String workShift) {
        this.workShift = workShift;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
