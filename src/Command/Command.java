package Command;

import java.text.ParseException;

@FunctionalInterface

public interface Command {
    void execute() throws ParseException;
}
