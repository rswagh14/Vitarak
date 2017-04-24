package com.example.rahul.vitarak.Adapters;

/**
 * Created by Rahul on 4/23/2017.
 */

public class CollectionList {

    private Long id;
    private String name;
    private String address;
    private String amount;
    private int profilepic;

    public CollectionList(Long id, String name, String address, String amount, int profilepic) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.amount = amount;
        this.profilepic = profilepic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(int profilepic) {
        this.profilepic = profilepic;
    }
}
