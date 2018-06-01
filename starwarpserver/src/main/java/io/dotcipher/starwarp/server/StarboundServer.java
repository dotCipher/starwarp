package io.dotcipher.starwarp.server;

import com.palantir.giraffe.command.ExecutionSystem;

public class StarboundServer {
    protected ExecutionSystem executionSystem;
    protected StarboundCommand starboundCommand;
    // Temporary hardcode for debugging purposes
    protected String command;
    protected String address;

    public StarboundServer(){
        executionSystem = new ExecutionSystem();
        starboundCommand = new StarboundCommand();
        // Temporary hardcode for debugging purposes
        command = "ssh";
        address = "starbound@137.197.230.102";
    }

    public boolean start(){
        starboundCommand = executionSystem.getCommand( command, address);

    }

}
