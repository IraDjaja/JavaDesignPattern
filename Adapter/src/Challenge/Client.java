package Challenge;

public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        VlcPlayer vlcPlayer = new VlcPlayer();
        Mp4Player mp4Player = new Mp4Player();

        AdvancedMediaPlayerAdapter vlcPlayerAdapter = new AdvancedMediaPlayerAdapter(vlcPlayer);
        AdvancedMediaPlayerAdapter mp4PlayerAdapter = new AdvancedMediaPlayerAdapter(mp4Player);

        audioPlayer.play("mp3", "song1.mp3");
        vlcPlayerAdapter.play("vlc", "song2.vlc");
        mp4PlayerAdapter.play("mp4", "song3.mp4");

        audioPlayer.play("mp4", "song4.mp4");
    }
}
