package com.epam.refactorRev2;

public interface ICommandHandler {
    void Handle(Context context, String commandName, String[] arguments);
}
