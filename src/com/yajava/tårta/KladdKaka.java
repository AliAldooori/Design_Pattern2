package com.yajava.tårta;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

        public class KladdKaka extends Tårta{
        private String smör ;
        private String strösocker ;
        private String ägg ;
        private String vetemjöl ;
        private String kakao  ;
        private String  vaniljsocker ;
        private String salt  ;
        private int graderIUgnen ;
        private int tidIUgnen  ;
        private boolean bestalld ;
        private String status;
        private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

        public KladdKaka(int graderIUgnen, int tidIUgnen) {
            this.smör = "smör";
            this.strösocker = "strösocker";
            this.ägg = "ägg";
            this.vetemjöl = "vetemjöl";
            this.kakao = "kakao";
            this.vaniljsocker = "vaniljsocker";
            this.salt = "salt";
            this.graderIUgnen = graderIUgnen;
            this.tidIUgnen = tidIUgnen;

            this.propertyChangeSupport = propertyChangeSupport;
        }

        public String getSmör() {
            return smör;
        }

        public void setSmör(String smör) {
            this.smör = smör;
        }

        public String getStrösocker() {
            return strösocker;
        }

        public void setStrösocker(String strösocker) {
            this.strösocker = strösocker;
        }

        public String getÄgg() {
            return ägg;
        }

        public void setÄgg(String ägg) {
            this.ägg = ägg;
        }

        public String getVetemjöl() {
            return vetemjöl;
        }

        public void setVetemjöl(String vetemjöl) {
            this.vetemjöl = vetemjöl;
        }

        public String getKakao() {
            return kakao;
        }

        public void setKakao(String kakao) {
            this.kakao = kakao;
        }

        public String getVaniljsocker() {
            return vaniljsocker;
        }

        public void setVaniljsocker(String vaniljsocker) {
            this.vaniljsocker = vaniljsocker;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public int getGraderIUgnen() {
            return graderIUgnen;
        }

        public void setGraderIUgnen(int graderIUgnen) {
            this.graderIUgnen = graderIUgnen;
        }

        public int getTidIUgnen() {
            return tidIUgnen;
        }

        public void setTidIUgnen(int tid_i_ugn) {
            this.tidIUgnen = tid_i_ugn;
        }

        public boolean isBestalld() {
            return bestalld;
        }

        public PropertyChangeSupport getPropertyChangeSupport() {
            return propertyChangeSupport;
        }

        public void setPropertyChangeSupport(PropertyChangeSupport propertyChangeSupport) {
            this.propertyChangeSupport = propertyChangeSupport;
        }

        public void setBestalld(boolean bestalld) {
            boolean oldBestalld = this.bestalld;
            this.bestalld = bestalld;
            this.propertyChangeSupport.firePropertyChange("Beställd ", oldBestalld, this.bestalld);
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            String oldStatus = this.status;
            this.status = status;
            this.propertyChangeSupport.firePropertyChange("KladdKaka levererat ", oldStatus, this.status);
        }

        public void addPropertyChangeListner(PropertyChangeListener listener) {
            this.propertyChangeSupport.addPropertyChangeListener(listener);
        }

        @Override
        public String toString() {
            return "Kladdkaka. Ingridienser och info:\n" +
                    smör + ", " +
                    strösocker + ", " +
                    ägg +", " +
                    vetemjöl +", " +
                    kakao + ", " +
                    vaniljsocker + ", " +
                    salt +
                    ", bestalld=" + bestalld +
                    ", status='" + status;
        }

}
