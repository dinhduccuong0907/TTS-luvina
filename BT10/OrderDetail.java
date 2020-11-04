/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT10;

/**
 *
 * @author dinhc
 */
public class OrderDetail implements Comparable<OrderDetail> {

    private int idOrder;
    private int idDetail;
    private int itemID;
    private int amount;
    private float price;

    public OrderDetail(int idOrder, int idDetail, int itemID, int amount, float price) {
        this.idOrder = idOrder;
        this.idDetail = idDetail;
        this.itemID = itemID;
        this.amount = amount;
        this.price = price;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "|" + idOrder + " " + idDetail + " " + itemID + " " + amount + " " + price + "|\t";
    }

    @Override
    public int compareTo(OrderDetail orderDetail) {
        if (this.idOrder - orderDetail.idOrder > 0) {
            return 1;
        } else if (this.idOrder - orderDetail.idOrder < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
