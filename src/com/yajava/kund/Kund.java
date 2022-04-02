package com.yajava.kund;

import com.yajava.service.OrderList;
import com.yajava.tårta.Tårta;

public class Kund extends Person {

        private OrderList orderlist;

        public Kund (String namn, String telefon_nummer, OrderList orderlist) {
            super(namn, telefon_nummer);
            this.orderlist = orderlist;
        }

        public OrderList getOrderlist() {
            return orderlist;
        }


        public void setOrderlist(OrderList orderlist) { this.orderlist = orderlist; }

        public void buyItem(Tårta tårta) {
            orderlist.addToOrders(tårta);

        }

    }

