//package com.epam.openCloseRefactor;
//
//public class CommandService implements CommandHandler {
//    @Override
//    public void commandHandler(String line) {
//        // Depending of what comes after the '!' character,
//        // process the entire "scope" and/or the command in "line".
//        if (line.equals("!execute")) {
//            ExecuteScope(scope);
//        } else if (line.StartsWith("!custom_command"))
//            RunCustomCommand(line, scope);
//        else if (line.equals("!single_line_directive")) {
//            ProcessDirective(line);
//        }
//    }
//}
