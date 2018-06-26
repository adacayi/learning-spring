package aspect.simple_parameter;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackCounter {

	Map<Integer, Integer> trackCounts = new HashMap<>();

	@Pointcut("execution(* aspect.simple_parameter.CompactDisc.playTrack(int)) && args(track)")
	public void trackPlayed(int track) { // The argument name must be the same name with the args designator above

	}

	@Before("trackPlayed(track)") // The parameter name must be the same with the Pointcut parameter defined
									// above.
	public void countTrack(int track) {// Parameter name must be the same with the Pointcut parameter defined above
		trackCounts.put(track, getTrackCount(track) + 1);
		int count = trackCounts.get(track);
		System.out.printf("Playing track %d for " + (count == 1 ? "the first time" : "%d. time") + "\n\t", track,
				count);
	}

	public int getTrackCount(int trackNumber) {
		if (trackCounts.containsKey(trackNumber))
			return trackCounts.get(trackNumber);

		return 0;
	}
}
