package com.yajava.skapandeCommand;

import com.yajava.tårta.Tårta;

public class Semla_Stege2 implements SkapandeCommand{


    @Override
    public Tårta Tårta_skapande() {
        System.out.println("Tillsätt 3dl mjöl, ägg, salt, kardemumma och strösocker. Arbeta in smöret i degen och låt jäsa i 30 minuter.");
        return null;
    }
}
