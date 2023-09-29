
public class Avenger implements Comparable<Avenger> {

	private String name;
	private String alias;
	private String actor;
	private int nameCount;
	private int aliasCount;
	private int actorCount;

	// Constructor
	public Avenger() {
		name = "";
		alias = "";
		actor = "";
		nameCount = 0;
		aliasCount = 0;
		actorCount = 0;
	}

	// Getters and setters
	public void setName(String n) {
		name = n;
	}

	public void setAlias(String a) {
		alias = a;
	}

	public void setActor(String a) {
		actor = a;
	}

	public String getName() {
		return name;
	}

	public String getAlias() {
		return alias;
	}

	public String getActor() {
		return actor;
	}

	public int getNameCount() {
		return nameCount;
	}

	public int getAliasCount() {
		return aliasCount;
	}

	public int getActorCount() {
		return actorCount;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		Avenger av = (Avenger) obj;
		if (this.actor.compareTo(av.getActor()) == 0 || this.alias.compareTo(av.getAlias()) == 0
				|| this.name.compareTo(av.getName()) == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Avenger a) {
		return 0;
	}

}
