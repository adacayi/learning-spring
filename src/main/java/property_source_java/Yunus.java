package property_source_java;

import org.springframework.core.env.Environment;

public class Yunus implements CompactDisc {

    private String artist;
    private String title;
    private int trackCount;
    private Class<?> discClass;
    private Environment env;

    public Yunus(String artist, String title, int trackCount, Class<?> discClass, Environment env) {
        this.artist = artist;
        this.title = title;
        this.trackCount = trackCount;
        this.discClass = discClass;
        this.env = env;
    }

    @Override
    public void play() {
        System.out.printf("Playing %s - %s\nTrack Count: %d\nDisc Class: %s\n", artist, title, trackCount,
                discClass.getName());
    }

    public Environment getEnvironment() {
        return env;
    }
}
