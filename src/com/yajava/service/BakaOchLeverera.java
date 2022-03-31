package com.yajava.service;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

// Receive reports of changes from Tårta  object's property-change/observing methods
public class BakaOchLeverera  implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("\nBaking status changed; " + evt.getPropertyName() + " : " + evt.getNewValue());
    } // getOldValue() is also available option



}
