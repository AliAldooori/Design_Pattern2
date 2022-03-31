package com.yajava.skapandeCommand;

import com.yajava.tårta.Tårta;

public class Semla_Stege1 implements SkapandeCommand {
    @Override
    public Tårta Tårta_skapande() {
        System.out.println("Värm mjölk, smula jäst i en bunke. Häll i mjölken och rör om. Tillsätt 4 dl vetemjöl. Blanda och låt vila ca 15 min");
        return null;
    }


    //  public class AddAlmonPasteCommand implements BakeCommand {

        /*@Override
        public Cake process(Cake cake) {

            if (cake instanceof Semla) {
                ((Semla) cake).setAlmondPaste("Almond paste");
                System.out.println("Split of bun top & dug out a bit; filled with " + ((Semla) cake).getAlmondPaste().toLowerCase());
            } else if (cake instanceof MudCake) {
                System.out.println("No almond paste needed for " + cake.getClass().getSimpleName());
            } else if (cake instanceof PrincessCake) {
                System.out.println("No almond paste needed for " + cake.getClass().getSimpleName());
            } else {
                System.out.println("Cake type is not recognized");
            }
            return cake;*/


}



