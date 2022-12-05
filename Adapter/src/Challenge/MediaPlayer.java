package Challenge;

interface MediaPlayer {
    void play(String audioType, String filename);
}

interface AdvancedMediaPlayer {
    void loadFilename(String filename);
    void listen();
}

class AudioPlayer implements MediaPlayer {
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + filename);
        } else {
            System.out.println("Invalid media. " + audioType + " format is not supported");
        }

    }
}

class VlcPlayer implements AdvancedMediaPlayer {
    String filename;
    public void loadFilename(String filename) {
        this.filename = filename;
    }

    public void listen() {
        System.out.println("Playing vlc file. Name: " + this.filename);
    }
}
class Mp4Player implements AdvancedMediaPlayer {
    String filename;
    public void loadFilename(String filename) {
        this.filename = filename;
    }

    public void listen() {
        System.out.println("Playing mp4 file. Name: " + this.filename);
    }
}
