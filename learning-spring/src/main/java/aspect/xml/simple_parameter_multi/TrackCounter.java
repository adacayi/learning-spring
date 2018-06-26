package aspect.xml.simple_parameter_multi;

import java.util.HashMap;
import java.util.Map;

public class TrackCounter {

	Map<String, Map<Integer, Integer>> trackCounts = new HashMap<>();

	public void countTrack(String album, int track) {
		if (!trackCounts.containsKey(album))
			trackCounts.put(album, new HashMap<Integer, Integer>());
		trackCounts.get(album).put(track, getTrackCount(album, track) + 1);
		int count = trackCounts.get(album).get(track);
		System.out.printf("Playing album %s - track %d for " + (count == 1 ? "the first time" : "%d. time") + "\n\t",
				album, track, count);
	}

	public int getTrackCount(String album, int trackNumber) {
		if (trackCounts.containsKey(album) && trackCounts.get(album).containsKey(trackNumber))
			return trackCounts.get(album).get(trackNumber);

		return 0;
	}
}
