package com.yajava.skapandeCommand;

import com.yajava.tårta.Tårta;

public class Kladdkaka_Stege5 implements SkapandeCommand{

    @Override
    public Tårta Tårta_skapande() {
        System.out.println("Grädda ca 20 min. Ugnstemperatur 175 grader");
        return null;
    }
}
