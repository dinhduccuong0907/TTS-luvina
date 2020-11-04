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
public class PurchaseDetail implements Comparable<PurchaseDetail> {

    private int idPurchase;
    private int idDetail;
    private int itemID;
    private int amount;
    private float price;

    public PurchaseDetail(int idPurchase, int idDetail, int itemID, int amount, float price) {
        this.idPurchase = idPurchase;
        this.idDetail = idDetail;
        this.itemID = itemID;
        this.amount = amount;
        this.price = price;
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
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
    public int compareTo(PurchaseDetail purchaseDetail) {
        if (this.idPurchase > purchaseDetail.idPurchase) {
            return 1;
        } else if (this.idPurchase < purchaseDetail.idPurchase) {
            return -1;
        } else {
            return 0;
        }
    }
}
