package com.epam.refactorRev2;

public class CommandService implements IHandler {
    public void Add(String commandName, ICommandHandler handler) {
    }

    public void Handle(Context context, Character[] line) {
        // TODO
        // first word on the line is the command, all other words are arguments.
        // split the string properly

        // then find the corrext command handler and invoke it.
        // take the result and add it to the <code>IProcessContext</code>
    }

    @Override
    public void Process(Context context, String line) {

    }
}