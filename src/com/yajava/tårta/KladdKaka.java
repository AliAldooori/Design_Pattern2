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
        private String ugnstemperatur  ;
        private String  tid_i_ugn   ;
        private boolean bestalld ;
        private String status;
        private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

        public KladdKaka(int i) {
            this.smör = smör;
            this.strösocker = strösocker;
            this.ägg = ägg;
            this.vetemjöl = vetemjöl;
            this.kakao = kakao;
            this.vaniljsocker = vaniljsocker;
            this.salt = salt;
            this.ugnstemperatur = ugnstemperatur;
            this.tid_i_ugn = tid_i_ugn;

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

        public String getUgnstemperatur() {
            return ugnstemperatur;
        }

        public void setUgnstemperatur(String ugnstemperatur) {
            this.ugnstemperatur = ugnstemperatur;
        }

        public String getTid_i_ugn() {
            return tid_i_ugn;
        }

        public void setTid_i_ugn(String tid_i_ugn) {
            this.tid_i_ugn = tid_i_ugn;
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

        // Metod för att lägga till listner
        public void addPropertyChangeListner(PropertyChangeListener listener) {
            this.propertyChangeSupport.addPropertyChangeListener(listener);
        }

        @Override
        public String toString() {
            return "Kladdkaka{" +
                    "smör='" + smör + '\'' +
                    ", strösocker='" + strösocker + '\'' +
                    ", ägg='" + ägg + '\'' +
                    ", vetemjöl='" + vetemjöl + '\'' +
                    ", kakao='" + kakao + '\'' +
                    ", vaniljsocker='" + vaniljsocker + '\'' +
                    ", salt='" + salt + '\'' +
                    ", ugnstemperatur='" + ugnstemperatur + '\'' +
                    ", tid_i_ugn='" + tid_i_ugn + '\'' +
                    ", bestalld=" + bestalld +
                    ", status='" + status + '\'' +
                    ", propertyChangeSupport=" + propertyChangeSupport +
                    '}';
        }

}
