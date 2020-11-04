/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT11;

/**
 *
 * @author dinhc
 */
public class TraderOrderDetail implements Comparable<TraderOrderDetail> {

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer Amount) {
        this.Amount = Amount;
    }
    private Integer OrderID;
    private Integer Amount;
    private Float Price;

    public TraderOrderDetail(Integer OrderID, Integer Amount, Float Price) {
        this.OrderID = OrderID;
        this.Amount = Amount;
        this.Price = Price;
    }

    @Override
    public int hashCode() {
        return this.OrderID;
    }

    public Float getPrice() {
        return Price;
    }

    @Override
    public boolean equals(Object obj) {
        return this.OrderID.equals(((TraderOrderDetail) obj).getOrderID());
    }

    public Integer getOrderID() {
        return OrderID;
    }

    @Override
    public int compareTo(TraderOrderDetail o) {
        if (this.Price == o.getPrice()) {
            return this.Amount.compareTo(o.getAmount());
        }
        return this.Price.compareTo(o.Price);
    }
}
