package property_source_java;

import org.springframework.core.env.Environment;

public class Yunus implements CompactDisc {

    private String artist;
    private String title;
    private int trackCount;
    private double size;
    private Class<?> discClass;

    public Yunus(String artist, String title, int trackCount, double size, Class<?> discClass) {
        this.artist = artist;
        this.title = title;
        this.trackCount = trackCount;
        this.size = size;
        this.discClass = discClass;
    }

    @Override
    public void play() {
        System.out.printf("Playing %s - %s\nTrack Count: %d\nDisc size: %.2f\nDisc Class: %s\n", artist, title,
                trackCount, size, discClass.getName());
    }
}
