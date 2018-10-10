package scope_prototype_xml_proxymode;

public class Yunus implements CompactDisc {

	private String title = "Daglar ile";
	private String artist = "Yunus";
	private int id;
	private static int lastId = 1;

	private static final Object lockObject = new Object();

	public Yunus() {
		synchronized (lockObject) {
			id = lastId++;
		}
		System.out.printf("%d Yunus generated\n", id);
	}

	@Override
	public void play() {
		System.out.printf("Playing %d- %s - %s\n", id, artist, title);

	}

}
