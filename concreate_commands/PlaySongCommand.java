package concreate_commands;

import interface_command.Command;
import receiver.MediaPlayer;

public class PlaySongCommand implements Command {
    private MediaPlayer player;

    public PlaySongCommand(MediaPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.playSong();
    }
}