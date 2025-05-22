package concreate_commands;

import interface_command.Command;
import receiver.MediaPlayer;

public class PreviousTrackCommand implements Command {
    private MediaPlayer player;

    public PreviousTrackCommand(MediaPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.previousTrack();
    }
}