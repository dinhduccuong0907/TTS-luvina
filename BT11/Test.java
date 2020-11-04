/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT11;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 *
 * @author dinhc
 */
public class Test {

    public static void main(String[] args) {
        treeMap();
    }

    public static void treeMap() {
        TreeMap<String, Tracder> treeTrader = new TreeMap<>();
        treeTrader.put("sell1", new Tracder("sell1", "0123482", "VN"));
        treeTrader.put("sell2", new Tracder("sell2", "0123483", "VN"));
        treeTrader.put("sell3", new Tracder("sell3", "0123484", "VN"));
        treeTrader.put("buy1", new Tracder("buy1", "0123485", "VN"));
        treeTrader.put("buy2", new Tracder("buy2", "0123486", "VN"));
        treeTrader.put("buy3", new Tracder("buy3", "0123487", "VN"));
        HashMap<String, Stock> hashStock = new HashMap<>();
        hashStock.put("stk1", new Stock("stk1", "cty1"));
        hashStock.put("stk2", new Stock("stk2", "cty2"));
        hashStock.put("stk3", new Stock("stk3", "cty3"));
        hashStock.put("stk4", new Stock("stk4", "cty4"));
        hashStock.put("stk5", new Stock("stk5", "cty5"));
        hashStock.put("stk6", new Stock("stk6", "cty6"));
        HashMap< TraderOrderDetail, TracderOrder> hashSell = new HashMap<>();
        hashSell.put(new TraderOrderDetail(1, 1, new Float(2)), new TracderOrder(1, "stk1", "sell1", "", "11/8/2020"));
        hashSell.put(new TraderOrderDetail(2, 1, new Float(7)), new TracderOrder(2, "stk1", "sell3", "", "11/8/2020"));
        hashSell.put(new TraderOrderDetail(3, 1, new Float(10)), new TracderOrder(3, "stk1", "sell5", "", "11/8/2020"));
        hashSell.put(new TraderOrderDetail(4, 1, new Float(4)), new TracderOrder(4, "stk1", "sell2", "", "11/8/2020"));
        hashSell.put(new TraderOrderDetail(5, 1, new Float(3)), new TracderOrder(5, "stk1", "sell7", "", "11/8/2020"));
        hashSell.put(new TraderOrderDetail(6, 1, new Float(5)), new TracderOrder(6, "stk1", "sell4", "", "11/8/2020"));
        PriorityQueue<TraderOrderDetail> priorTracder = new PriorityQueue<>();
        priorTracder.add(new TraderOrderDetail(1, 2, new Float(2)));
        priorTracder.add(new TraderOrderDetail(2, 1, new Float(7)));
// priorTracder.add(new TraderOrderDetail(3, 1, new Float(10)));
// priorTracder.add(new TraderOrderDetail(4, 1, new Float(4)));
// priorTracder.add(new TraderOrderDetail(5, 1, new Float(3)));
// priorTracder.add(new TraderOrderDetail(6, 1, new Float(5)));
        System.out.println(priorTracder.peek().getPrice());
        HashMap< TraderOrderDetail, TracderOrder> hashBuy = new HashMap<>();
        hashBuy.put(new TraderOrderDetail(7, 1, new Float(1)), new TracderOrder(7, "stk1", "buy1", "", "11/8/2020"));
        hashBuy.put(new TraderOrderDetail(8, 1, new Float(1)), new TracderOrder(8, "stk1", "buy3", "", "11/8/2020"));
        hashBuy.put(new TraderOrderDetail(9, 1, new Float(1)), new TracderOrder(9, "stk1", "buy5", "", "11/8/2020"));
        hashBuy.put(new TraderOrderDetail(10, 1, new Float(1)), new TracderOrder(10, "stk1", "buy2", "", "11/8/2020"));
        hashBuy.put(new TraderOrderDetail(11, 1, new Float(3)), new TracderOrder(11, "stk1", "buy7", "", "11/8/2020"));
        hashBuy.put(new TraderOrderDetail(12, 1, new Float(5)), new TracderOrder(12, "stk1", "buy4", "", "11/8/2020"));
        PriorityQueue<TraderOrderDetail> priorTracderBuy = new PriorityQueue<>(new Comparator<TraderOrderDetail>() {
            @Override
            public int compare(TraderOrderDetail o1, TraderOrderDetail o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return -(o1.getAmount().compareTo(o2.getAmount()));
                }
                return -((o1.getPrice()).compareTo((o2.getPrice())));
            }
        });
        priorTracderBuy.add(new TraderOrderDetail(7, 1, new Float(1)));
        priorTracderBuy.add(new TraderOrderDetail(8, 1, new Float(1)));
        priorTracderBuy.add(new TraderOrderDetail(9, 1, new Float(1)));
        priorTracderBuy.add(new TraderOrderDetail(10, 1, new Float(1)));
        priorTracderBuy.add(new TraderOrderDetail(11, 1, new Float(3)));
        priorTracderBuy.add(new TraderOrderDetail(12, 1, new Float(5)));
        System.out.println(priorTracderBuy.peek().getPrice());
        while ((priorTracder.peek() != null || priorTracderBuy.peek() != null) && (priorTracderBuy.peek().getPrice() >= priorTracder.peek().getPrice())) {
            if (priorTracder.peek().getAmount() == 1) {
                priorTracder.poll();
            }
            if (priorTracderBuy.peek().getAmount() == 1) {
                priorTracderBuy.poll();
            }
            if (priorTracder.peek().getAmount() > 1) {
                TraderOrderDetail a = priorTracder.poll();
                a.setAmount(a.getAmount() - 1);
                priorTracder.add(a);
            }
            if (priorTracderBuy.peek().getAmount() > 1) {
                TraderOrderDetail b = priorTracderBuy.poll();
                b.setAmount(b.getAmount() - 1);
                priorTracderBuy.add(b);
            }
        }
        System.out.println(priorTracder.peek().getPrice());
        System.out.println(priorTracderBuy.peek().getPrice());
    }
}
