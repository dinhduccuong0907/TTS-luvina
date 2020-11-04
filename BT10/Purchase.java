/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT10;

import java.util.Date;

/**
 *
 * @author dinhc
 */
public class Purchase implements Comparable<Purchase> {

    private int idPurchase;
    private Date purDate;
    private String supplierID;

    public Purchase(int idPurchase, Date purDate, String supplierID) {
        this.idPurchase = idPurchase;
        this.purDate = purDate;
        this.supplierID = supplierID;
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }

    public Date getPurDate() {
        return purDate;
    }

    public void setPurDate(Date purDate) {
        this.purDate = purDate;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    @Override
    public int compareTo(Purchase purchase) {
        if (this.idPurchase > purchase.idPurchase) {
            return 1;
        } else if (this.idPurchase < purchase.idPurchase) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return idPurchase + " " + purDate + " " + supplierID;
    }
}
