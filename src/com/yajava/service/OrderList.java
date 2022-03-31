package com.yajava.service;

import com.yajava.tårta.Tårta;

import java.util.ArrayList;
import java.util.List;


    public class OrderList {

        private List<Tårta> orders;
        String orderID;

        public OrderList(String orderID) {
            this.orders = new ArrayList<>();
            this.orderID = orderID;
        }

        public List<Tårta> getOrders() {
            return orders;
        }

        public void setOrders(List<Tårta> orders) {
            this.orders = orders;
        }

        public void addToOrders(Tårta tårta) {
            orders.add(tårta);
        }

        public void removeFromOrders(Tårta tårta) {
            orders.remove(tårta);
        }

        @Override
        public String toString() {
            return "Order-ID: " + orderID + "\n" + printTårtaList();
        }

        // Print out of orderlist in a cleaner manner; used in toString
        private String printTårtaList() {
            String tårtaT = "";
            int tårtaCount = 1;
            for (Tårta tårta : orders) {
                tårtaT += (tårtaCount++) + ": " + tårta + "\n";
            }
            return tårtaT;
        }
    }


