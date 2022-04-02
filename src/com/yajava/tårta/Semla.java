package com.yajava.tårta;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// Affärsklassernas kommentarer finns i denna klass

public class Semla extends Tårta {
    private String mjolk;
    private String jast;
    private String vetemjol;
    private String agg;
    private String salt;
    private String kardemumma;
    private String strosocker;
    private String smor;
    private String mandelmassa;
    private String gradde;
    private String florsocker;
    private int graderIUgnen;
    private int tidIUgnen;

    // Del av observer
    private boolean bestalld;
    private String status;
    private PropertyChangeSupport propertyChangeSupport;

    public Semla(int graderIUgnen, int tidIUgnen) {
        super();
        this.mjolk = "mjolk";
        this.jast = "jast";
        this.vetemjol = "vetemjol";
        this.agg = "agg";
        this.salt = "salt";
        this.kardemumma = "kardemumma";
        this.strosocker = "strosocker";
        this.smor = "smor";
        this.mandelmassa = "mandelmassa";
        this.gradde = "gradde";
        this.florsocker = "florsocker";
        this.status = "inte levererat";
        this.graderIUgnen = graderIUgnen;
        this.tidIUgnen = tidIUgnen;

        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public String getMjolk() {
        return mjolk;
    }

    public void setMjolk(String mjolk) {
        this.mjolk = mjolk;
    }

    public String getJast() {
        return jast;
    }

    public void setJast(String jast) {
        this.jast = jast;
    }

    public String getVetemjol() {
        return vetemjol;
    }

    public void setVetemjol(String vetemjol) {
        this.vetemjol = vetemjol;
    }

    public String getAgg() {
        return agg;
    }

    public void setAgg(String agg) {
        this.agg = agg;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getKardemumma() {
        return kardemumma;
    }

    public void setKardemumma(String kardemumma) {
        this.kardemumma = kardemumma;
    }

    public String getStrosocker() {
        return strosocker;
    }

    public void setStrosocker(String strosocker) {
        this.strosocker = strosocker;
    }

    public String getSmor() {
        return smor;
    }

    public void setSmor(String smor) {
        this.smor = smor;
    }

    public String getMandelmassa() {
        return mandelmassa;
    }

    public void setMandelmassa(String mandelmassa) {
        this.mandelmassa = mandelmassa;
    }

    public String getGradde() {
        return gradde;
    }

    public void setGradde(String gradde) {
        this.gradde = gradde;
    }

    public String getFlorsocker() {
        return florsocker;
    }

    public void setFlorsocker(String florsocker) {
        this.florsocker = florsocker;
    }

    public int getTidIUgnen() {
        return tidIUgnen;
    }

    public void setTidIUgnen(int tidIUgnen) {
        this.tidIUgnen = tidIUgnen;
    }

    public int getGraderIUgnen() {
        return graderIUgnen;
    }

    public void setGraderIUgnen(int graderIUgnen) {
        this.graderIUgnen = graderIUgnen;
    }

    // Del av observer
    public boolean isBestalld() {
        return bestalld;
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
        this.propertyChangeSupport.firePropertyChange("Semla levererat ", oldStatus, this.status);
    }

    // Metod för att lägga till listner
    public void addPropertyChangeListner(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    @Override
    public String toString() {
        return "Semla. Ingridienser och info:\n" +
                mjolk + ", " +
                jast + ", " +
                vetemjol + ", " +
                agg + ", " +
                salt + ", " +
                kardemumma + ", " +
                strosocker + ", " +
                smor + ", " +
                mandelmassa + ", " +
                gradde + ", " +
                florsocker +
                ", bestalld=" + bestalld +
                ", status='" + status ;
    }
}
