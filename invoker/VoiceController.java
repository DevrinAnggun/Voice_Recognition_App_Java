package invoker;

import interface_command.Command;

public class VoiceController {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command has been set!");
        }
    }
}