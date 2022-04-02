package com.yajava.skapande;

import com.yajava.kund.Kund;
import com.yajava.service.BakaOchLeverera;
import com.yajava.skapandeCommand.*;
import com.yajava.tårta.KladdKaka;
import com.yajava.tårta.PrinsesTårta;
import com.yajava.tårta.Semla;
import com.yajava.tårta.Tårta;

public class attSkapa {
    private static final BakaOchLeverera bakaOchLeverera = new BakaOchLeverera();

    public static Tårta fixaSemla(Kund kund) throws InterruptedException {
        // Skapa kakan
        Semla semla = new Semla(225, 8);

        // Del av observermönster (för beställning)
        semla.addPropertyChangeListner(bakaOchLeverera);
        semla.setBestalld(true);
        System.out.println();

        System.out.println("Börja fixa semla\n");

        // Skapa pipeline för semla
        SkapaPipeline semlaPipeline = new SkapaPipeline();

        // Välj process-stegen för kakan
        semlaPipeline.addCommand(new Semla_Stege1());
        semlaPipeline.addCommand(new Semla_Stege2());
        semlaPipeline.addCommand(new Semla_Stege3());
        semlaPipeline.addCommand(new Semla_Stege4());
        semlaPipeline.addCommand(new Semla_Stege5());
        semlaPipeline.addCommand(new Semla_Stege6());

        // Execute dem valda process-stegen/pipelinen
        return semlaPipeline.execute(semla);
    }

    public static Tårta FixaKalddkaka(Kund kund) throws InterruptedException {
        KladdKaka kladdKaka = new KladdKaka(175, 20);

        kladdKaka.addPropertyChangeListner(bakaOchLeverera);
        kladdKaka.setBestalld(true);
        System.out.println();

        System.out.println("Börja fixa KladdKaka\n");

        SkapaPipeline klddkakaPipeline = new SkapaPipeline();

        klddkakaPipeline.addCommand(new Kladdkaka_Stege1());
        klddkakaPipeline.addCommand(new Kladdkaka_Stege2());
        klddkakaPipeline.addCommand(new Kladdkaka_stege3());
        klddkakaPipeline.addCommand(new Kladdkaka_Stege4());
        klddkakaPipeline.addCommand(new Kladdkaka_Stege5());

        return klddkakaPipeline.execute(kladdKaka);
    }

    public static Tårta FixaPrinsesTårta(Kund kund) throws InterruptedException {
        PrinsesTårta prinsesTårta = new PrinsesTårta();

        prinsesTårta.addPropertyChangeListner(bakaOchLeverera);
        prinsesTårta.setBestalld(true);
        System.out.println();

        System.out.println("Börja fixa prinsesTårta\n");

        SkapaPipeline princessTårtaPipeline = new SkapaPipeline();

        princessTårtaPipeline.addCommand(new Prinsestårta_Stege1());
        princessTårtaPipeline.addCommand(new prinsestårta_stege2());
        princessTårtaPipeline.addCommand(new Prinsestårta_Stege3());
        princessTårtaPipeline.addCommand(new Prinsestårta_Stege4());
        princessTårtaPipeline.addCommand(new Prinsestårta_Stege5());
        princessTårtaPipeline.addCommand(new Prinsestårta_Stege6());
        princessTårtaPipeline.addCommand(new Prinsestårta_Stege7());
        princessTårtaPipeline.addCommand(new Prinsestårta_Stege8());

        return (PrinsesTårta) princessTårtaPipeline.execute(prinsesTårta);

    }

}