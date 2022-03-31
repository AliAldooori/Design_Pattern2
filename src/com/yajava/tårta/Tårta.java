package com.yajava.tårta;


    public abstract class Tårta {
        private String tårtaNanm;
        private int tårta_id ;

        public Tårta() {
            this.tårtaNanm = tårtaNanm ;
            this.tårta_id = tårta_id  ;
        }

        public String getTårtaNanm() {
            return tårtaNanm;
        }

        public void setTårtaNanm(String tårtaNanm) {
            this.tårtaNanm = tårtaNanm;
        }

        public int getTårta_id() {
            return tårta_id;
        }

        public void setTårta_id(int tårta_id) {
            this.tårta_id = tårta_id;
        }

        @Override
        public String toString() {
            return "Tårta namn: " + tårtaNanm + ", Id : " + tårta_id;
        }
    }


