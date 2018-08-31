package property_placeholders_java_explicit;

public class Yunus implements CompactDisc {

    private String artist;
    private String title;
    private int trackCount;
    private double size;

    public Yunus(String artist, String title, String trackCount, double size) {
        this.artist = artist;
        this.title = title;
        this.trackCount = Integer.parseInt(trackCount);
        this.size = size;
    }

    @Override
    public void play() {
        System.out.printf("Playing %s - %s\nTrack Count: %d\nDisc Size: %.2f MB\n", artist, title, trackCount, size);
    }
}
