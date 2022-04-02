package com.yajava.service;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BakaOchLeverera implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("\nBaking status - " + evt.getPropertyName() + " : " + evt.getNewValue());
    }



}
