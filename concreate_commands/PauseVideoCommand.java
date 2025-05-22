package concreate_commands;

import interface_command.Command;
import receiver.MediaPlayer;

public class PauseVideoCommand implements Command {
    private MediaPlayer player;

    public PauseVideoCommand(MediaPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.pause();
    }
}