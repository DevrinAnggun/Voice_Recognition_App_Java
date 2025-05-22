package concreate_commands;

import interface_command.Command;
import receiver.MediaPlayer;

public class NextTrackCommand implements Command {
    private MediaPlayer player;

    public NextTrackCommand(MediaPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.nextTrack();
    }
}