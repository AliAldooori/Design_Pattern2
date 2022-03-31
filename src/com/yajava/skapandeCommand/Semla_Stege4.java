package com.yajava.skapandeCommand;

import com.yajava.tårta.Tårta;

public class Semla_Stege4 implements SkapandeCommand{
    @Override
    public Tårta Tårta_skapande() {
        System.out.println("Grädda bullarna i 8 minuter. Ugnstemperatur 225 grader");
        return null;
    }
}
