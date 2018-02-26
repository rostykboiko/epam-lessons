package com.epam.openCloseRefactor;

public class ParserService implements LineHandler {
    private CommandService commandSerivce;
    @Override
    public void handleScript(String line) {
        if (line.substring(0, 1).equals("$")) {
            // handleScript the entire "line" as a variable,
            // i.e. add it to a collection of KeyValuePair.
            AddToVariables(line);
        } else if (line.substring(0, 1).equals("!")) {
            commandSerivce.commandHandler(line);
        } else {
            scope.append();
        }
    }
}
