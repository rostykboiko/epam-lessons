package com.epam.refactorRev2;

import java.util.Map;

public class OpenCloseExample {
    private Map<Character, IHandler> _handlers;
    private IHandler _defaultHandler;

    public void Add(Character controlCharacter, IHandler handler) {
        _handlers.put(controlCharacter, handler);
    }

    public void Parse(TextReader reader) {
        StringBuilder scope = new StringBuilder();
        Context context = null;

        String line = reader.readLine();
        while (line != null)
        {
            IHandler handler = null;

            Character character = line.toCharArray()[0];

            if (_handlers.get(character) != null)
                handler = _defaultHandler;

            assert handler != null;
            handler.Process(context, line);


            line = reader.readLine();
        }
    }
}
