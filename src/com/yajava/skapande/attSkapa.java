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



        // Accessible by all methods in this class
    //    private static final BakingAndDeliveryControl bakingAndDeliveryControl = new BakingAndDeliveryControl();

        public static Tårta fixaSemla(Kund kund) throws InterruptedException {
            System.out.println("\nStarta att fixa  semla");


            // customer-orderlist-size is to add next number as cake id (+1 is becuase it is empty at first initialization)
            Semla semla = new Semla(kund.getOrderlist().getOrders().size()+1, 225, 8);
         //   Semla semla = new Semla("Whipping Semla", customer.getOrderlist().getOrders().size()+1, 225, 8);

            // Part of Observer pattern for listening on incoming orders
            // (See BakeryMenu class for listener of undone/done status)
            semla.addPropertyChangeListner(bakaOchLeverera); // Add property-change/observing methods
            semla.setBestalld(true); // Trigger property-change/observing methods when order starts
            System.out.println();

            // Create process line for SEMLA
            SkapaPipeline semlaPipeline = new SkapaPipeline();

            // Add appropriate process-steps/commands
            semlaPipeline.addCommand(new Semla_Stege1());
            semlaPipeline.addCommand(new Semla_Stege2());
            semlaPipeline.addCommand(new Semla_Stege3());
            semlaPipeline.addCommand(new Semla_Stege4());
            semlaPipeline.addCommand(new Semla_Stege5());
            semlaPipeline.addCommand(new Semla_Stege6());



            // Execute the list of process-steps (i.e. pipline)
            return semlaPipeline.execute(semla) ;
        }

 // Method for baking a mud cake - with or without whip cream
        public static Tårta FixaKalddkaka(Kund kund) throws InterruptedException {

            System.out.println("Starta att fixa KladdKaka tårta ");


     //       MudCake mudCake = new MudCake("Choclomania", customer.getOrderlist().getOrders().size()+1, 175, 20);

              BakaOchLeverera bakaOchLeverera = new BakaOchLeverera();
            KladdKaka kladdKaka = new KladdKaka(kund.getOrderlist().getOrders().size()+1);
            kladdKaka.addPropertyChangeListner(bakaOchLeverera);
            kladdKaka.setBestalld(true);
            //mudCake.addPropertyChangeListener(bakingAndDeliveryControl);
           // mudCake.setOrdered(true);

            System.out.println();

            // Create process line for MUD CAKE
            SkapaPipeline klddkakaPipeline = new SkapaPipeline();

            // Add appropriate process-steps/commands
           klddkakaPipeline.addCommand(new Kladdkaka_Stege1());
           klddkakaPipeline.addCommand(new Kladdkaka_Stege2());
           klddkakaPipeline.addCommand(new Kladdkaka_stege3());
           klddkakaPipeline.addCommand(new Kladdkaka_Stege4());
           klddkakaPipeline.addCommand(new Kladdkaka_Stege5());


            return klddkakaPipeline.execute(kladdKaka) ;
        }

        public static Tårta FixaPrinsesTårta (Kund kund ) throws InterruptedException {
            System.out.println("\nStarta att fixa prinsesTårta ");

           PrinsesTårta prinsesTårta = new PrinsesTårta("Amazing Princess", kund.getOrderlist().getOrders().size()+1);

            prinsesTårta.addPropertyChangeListner(bakaOchLeverera);
           prinsesTårta.setBestalld(true);
            System.out.println();

            // Create process line for PRINCESS CAKE
            SkapaPipeline princessTårtaPipeline = new SkapaPipeline();

            // Add appropriate process-steps/commands
            princessTårtaPipeline.addCommand(new Prinsestårta_Stege1());
            princessTårtaPipeline.addCommand(new prinsestårta_stege2());
            princessTårtaPipeline.addCommand(new Prinsestårta_Stege3());
            princessTårtaPipeline.addCommand(new Prinsestårta_Stege4());
            princessTårtaPipeline.addCommand(new Prinsestårta_Stege5());
            princessTårtaPipeline.addCommand(new Prinsestårta_Stege6());
            princessTårtaPipeline.addCommand(new Prinsestårta_Stege7());
            princessTårtaPipeline.addCommand(new Prinsestårta_Stege8());

            // Execute the list of process-steps (i.e. pipline)
            return (PrinsesTårta) princessTårtaPipeline.execute(prinsesTårta);

        }

    }
/*package com.yajava.bakery;

        import com.yajava.bakecommand.*;
        import com.yajava.cakes.Cake;
        import com.yajava.cakes.MudCake;
        import com.yajava.cakes.PrincessCake;
        import com.yajava.cakes.Semla;
        import com.yajava.customer.Customer;
        import com.yajava.service.BakingAndDeliveryControl;

// Class with static methods utilizing respective process pipeline and its appropriate commands

public class BakeryProcess {

    // Accessible by all methods in this class
    private static final BakingAndDeliveryControl bakingAndDeliveryControl = new BakingAndDeliveryControl();

    public static Cake bakeSemla(Customer customer) throws InterruptedException {
        System.out.println("\nStarting process of baking a semla");

        // customer-orderlist-size is to add next number as cake id (+1 is becuase it is empty at first initialization)
        Semla semla = new Semla("Whipping Semla", customer.getOrderlist().getOrders().size()+1, 225, 8);

        // Part of Observer pattern for listening on incoming orders
        // (See BakeryMenu class for listener of undone/done status)
        semla.addPropertyChangeListener(bakingAndDeliveryControl); // Add property-change/observing methods
        semla.setOrdered(true); // Trigger property-change/observing methods when order starts
        System.out.println();

        // Create process line for SEMLA
        ProcessPipeline semlaPipeline = new ProcessPipeline();

        // Add appropriate process-steps/commands
        semlaPipeline.addCommand(new BunDoughPrepCommand());
        semlaPipeline.addCommand(new BunDoughFinalizeCommand());
        semlaPipeline.addCommand(new BunOvenPrepCommand());
        semlaPipeline.addCommand(new OvenTimeCommand());
        semlaPipeline.addCommand(new AddAlmonPasteCommand());
        semlaPipeline.addCommand(new WhippingCreamCommand());
        semlaPipeline.addCommand(new AddToppingCommand());

        // Execute the list of process-steps (i.e. pipline)
        return semlaPipeline.execute(semla);
    }

    // Method for baking a mud cake - with or without whip cream
    public static Cake bakeMudCake(Customer customer, boolean whipOrNot) throws InterruptedException {
        String startingText = whipOrNot ? "\nStarting process of baking a mud cake with whip cream\n" :
                "\nStarting process of baking a mud cake without whip cream";
        System.out.println(startingText);

        MudCake mudCake = new MudCake("Choclomania", customer.getOrderlist().getOrders().size()+1, 175, 20);

        mudCake.addPropertyChangeListener(bakingAndDeliveryControl);
        mudCake.setOrdered(true);
        System.out.println();

        // Create process line for MUD CAKE
        ProcessPipeline mudCakePipeline = new ProcessPipeline();

        // Add appropriate process-steps/commands
        mudCakePipeline.addCommand(new MeltButterCommand());
        mudCakePipeline.addCommand(new SoftDoughCommand());
        mudCakePipeline.addCommand(new AddButterCommand());
        mudCakePipeline.addCommand(new SoftDoughOvenPrepCommand());
        mudCakePipeline.addCommand(new OvenTimeCommand());
        if (whipOrNot)
            mudCakePipeline.addCommand(new AddWhipCommand());

        // Execute the list of process-steps (i.e. pipline)
        return (MudCake) mudCakePipeline.execute(mudCake);
    }

    public static Cake bakePrincessCake(Customer customer) throws InterruptedException {
        System.out.println("\nStarting process of baking a princess cake");

        PrincessCake princessCake = new PrincessCake("Amazing Princess", customer.getOrderlist().getOrders().size()+1);

        princessCake.addPropertyChangeListener(bakingAndDeliveryControl);
        princessCake.setOrdered(true);
        System.out.println();

        // Create process line for PRINCESS CAKE
        ProcessPipeline princessCakePipeline = new ProcessPipeline();

        // Add appropriate process-steps/commands
        princessCakePipeline.addCommand(new WhippingCreamCommand());
        princessCakePipeline.addCommand(new JamOnCakeBaseCommand());
        princessCakePipeline.addCommand(new VanillaOnCakeBaseCommand());
        princessCakePipeline.addCommand(new AddWhipCommand());
        princessCakePipeline.addCommand(new AddToppingCommand());

        // Execute the list of process-steps (i.e. pipline)
        return (PrincessCake) princessCakePipeline.execute(princessCake);

    }

}*/


