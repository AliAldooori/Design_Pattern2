package com.yajava.skapandeCommand;

import com.yajava.tårta.Tårta;

public class Prinsestårta_Stege1 implements SkapandeCommand{
    @Override
    public Tårta Tårta_skapande() {
        System.out.println("Vispa grädden hård");
        return null;
    }
}
