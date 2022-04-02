package com.yajava.skapande;

import com.yajava.skapandeCommand.SkapandeCommand;
import com.yajava.tårta.Tårta;

// Denna klass används av attSkapa-klassen

import java.util.ArrayList;

public class SkapaPipeline {

    private ArrayList<SkapandeCommand> pipeline = new ArrayList<SkapandeCommand>();

    // Metod för att lägga in process-steg/kommandon
    public void addCommand(SkapandeCommand command) {
        pipeline.add(command);
    }

    // Metod som execute pipelinen
    public Tårta execute(Tårta tårta) throws InterruptedException {
        Thread.sleep(1000);
        for (var command : pipeline) {
            command.Tårta_skapande();
            Thread.sleep(500);
        }
        return tårta;
    }

}




