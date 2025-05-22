import concreate_commands.*;
import receiver.MediaPlayer;
import invoker.VoiceController;

public class ClientUser {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        VoiceController controller = new VoiceController();

        controller.setCommand(new PlaySongCommand(player));
        controller.executeCommand();

        controller.setCommand(new PauseVideoCommand(player));
        controller.executeCommand();

        controller.setCommand(new NextTrackCommand(player));
        controller.executeCommand();

        controller.setCommand(new PreviousTrackCommand(player));
        controller.executeCommand();
    }
}
