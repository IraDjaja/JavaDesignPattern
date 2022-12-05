package Challenge;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    public void play(String audioType, String filename) {
        this.advancedMediaPlayer.loadFilename(filename);
        this.advancedMediaPlayer.listen();
    }
}
