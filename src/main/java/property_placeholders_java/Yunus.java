package property_placeholders_java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Yunus implements CompactDisc {

    private String artist;
    private String title;
    private int trackCount;
    private double size;

    public Yunus(@Value("${disc.artist}") String artist, @Value("${disc.title}") String title,
                 @Value("${disc.trackCount}") String trackCount, @Value("${disc.size}") double size) {
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
