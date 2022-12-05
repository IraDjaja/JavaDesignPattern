package Challenge2;

interface MediaPlayer {
    void play(String audioType, String filename);
}

class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String filename) {
        if (audioType == "mp3") {
            System.out.println("Mp3 player playing " + filename);
        } else {
            System.out.println("Invalid media ." + audioType + " format not supported");
        }
    }
}

class AdvancedMediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
        advancedMediaPlayer.loadFilename(filename);
        advancedMediaPlayer.listen();
    }
}
