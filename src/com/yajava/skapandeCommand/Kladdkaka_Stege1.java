package com.yajava.skapandeCommand;

import com.yajava.tårta.Tårta;

public class Kladdkaka_Stege1 implements SkapandeCommand{
    @Override
    public Tårta Tårta_skapande() {
        System.out.println("Smält smöret i kastrull");
        return null;
    }
}
