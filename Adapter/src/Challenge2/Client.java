package Challenge2;

public class Client {
    public static void main(String[] args) {
        MediaPlayer mp3Player = new AudioPlayer();
        mp3Player.play("mp3", "beyond the horizon.mp3");

        AdvancedMediaPlayerAdapter mp4PlayerAdapter = new AdvancedMediaPlayerAdapter(new Mp4Player());
        mp4PlayerAdapter.play("mp4", "alone.mp4");

        AdvancedMediaPlayerAdapter vlcPlayerAdapter = new AdvancedMediaPlayerAdapter(new VlcPlayer());
        vlcPlayerAdapter.play("vlc", "far far away.vlc");

        mp3Player.play("avi", "alone.avi");
    }
}
