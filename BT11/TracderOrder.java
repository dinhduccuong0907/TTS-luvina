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
public class TracderOrder {

    private Integer OrderID;
    private String StockCode;
    private String SellerID, BuyerID;
    private String date;

    public TracderOrder(Integer OrderID, String StockCode, String SellerID, String BuyerID, String date) {
        this.OrderID = OrderID;
        this.StockCode = StockCode;
        this.SellerID = SellerID;
        this.BuyerID = BuyerID;
        this.date = date;
    }
}
