package Challenge2;

interface AdvancedMediaPlayer {
    void loadFilename(String filename);
    void listen();
}

class VlcPlayer implements AdvancedMediaPlayer {
    private String filename;

    @Override
    public void loadFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println("Vlc player playing " + this.filename);
    }
}

class Mp4Player implements AdvancedMediaPlayer {
    private String filename;

    @Override
    public void loadFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println("Mp4 player playing " + this.filename);
    }
}
