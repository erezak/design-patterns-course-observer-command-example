// The interface for command objects
public interface Command {
    void execute();
    void undo();
}