package com.yajava.kund;


    public abstract class Person {

        private String namn;
        private String telefon_nummer;

        public Person(String namn, String telefon_nummer) {
           this.namn = namn ;
           this.telefon_nummer = telefon_nummer ;
        }

        public String getNamn() {
            return namn;
        }

        public void setNamn(String namn) {
            this.namn = namn;
        }

        public String getTelefon_nummer() {
            return telefon_nummer;
        }

        public void setTelefon_nummer(String telefon_nummer) {
            this.telefon_nummer = telefon_nummer;
        }
    }


