package com.yajava.skapande;

import com.yajava.skapandeCommand.SkapandeCommand;
import com.yajava.tårta.Tårta;

import java.util.ArrayList;

public class SkapaPipeline {

// Class enabling adding and executing multiple commands



        // Takes the interface as data type, to capture all classes that implements it
        private ArrayList<SkapandeCommand> pipeline = new ArrayList<SkapandeCommand>();

        // Method for adding a command to the pipeline-list
        public void addCommand(SkapandeCommand command){
            pipeline.add(command);
        }

        // Method for executing each added command, with a for each loop
        public Tårta execute(Tårta tårta) throws InterruptedException {
            Thread.sleep(1000); // Sleep is just a design choice
            for(var command : pipeline){
               tårta = command.Tårta_skapande(); // Execute current command
                Thread.sleep(500);
            }
            return tårta;
        }

    }


      /*  package com.yajava.bakery;

        import com.yajava.bakecommand.BakeCommand;
        import com.yajava.cakes.Cake;
        import java.util.ArrayList;

// Class enabling adding and executing multiple commands

public class ProcessPipeline {

    // Takes the interface as data type, to capture all classes that implements it
    private ArrayList<BakeCommand> pipeline = new ArrayList<>();

    // Method for adding a command to the pipeline-list
    public void addCommand(BakeCommand command){
        pipeline.add(command);
    }

    // Method for executing each added command, with a for each loop
    public Tårta execute(Tårta cake) throws InterruptedException {
        Thread.sleep(1000); // Sleep is just a design choice
        for( command : pipeline){
            cake = command.process(cake); // Execute current command
            Thread.sleep(500);
        }
        return cake;
    }*/



