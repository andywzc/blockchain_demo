package indi.wu.entity;

import java.io.Serializable;

/**
 * Created by wuzichao on 2018/3/14.
 */
public class Transaction implements Serializable {

    private String sender;
    private String recevier;
    private Double quantity;


    public Transaction() {}

    public Transaction(String sender, String recevier, Double quantity) {
        this.sender = sender;
        this.recevier = recevier;
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "sender='" + sender + '\'' +
                ", recevier='" + recevier + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecevier() {
        return recevier;
    }

    public void setRecevier(String recevier) {
        this.recevier = recevier;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}
