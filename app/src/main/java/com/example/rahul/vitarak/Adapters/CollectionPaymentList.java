package com.example.rahul.vitarak.Adapters;

/**
 * Created by Rahul on 4/23/2017.
 */

public class CollectionPaymentList {

    private Long id;
    private String productName;
    private String ltrQty;
    private String amount;
    private int productpic;

    public CollectionPaymentList(Long id, String productName, String ltrQty, String amount, int productpic) {
        this.id = id;
        this.productName = productName;
        this.ltrQty = ltrQty;
        this.amount = amount;
        this.productpic = productpic;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLtrQty() {
        return ltrQty;
    }

    public void setLtrQty(String ltrQty) {
        this.ltrQty = ltrQty;
    }

    public int getProductpic() {
        return productpic;
    }

    public void setProductpic(int productpic) {
        this.productpic = productpic;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
