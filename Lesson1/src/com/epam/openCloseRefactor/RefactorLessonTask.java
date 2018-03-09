//package com.epam.openCloseRefactor;
//
//import java.io.StringReader;
//import java.util.Map;
//
//public class RefactorLessonTask {
//    private Map<String, LineHandler> mapExample;
//    private LineHandler lineHandler;
//    public void Parse() {
//        StringReader reader = new StringReader(scriptTextToProcess);
//        StringBuilder scope = new StringBuilder();
//
//        String line = reader.readLine();
//        while (line != null) {
//
//            mapExample.put(line,lineHandler);
//            parserService.handleScript(line);
//
//            line = reader.readLine();
//        }
//    }
//
//}
