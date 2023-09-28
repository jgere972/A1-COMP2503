
public class Avenger {

	private String name;
	private String alias;
	private String actor;
	private int nameCount;
	private int aliasCount;
	private int actorCount;

	public Avenger() {
		name = "";
		alias = "";
		actor = "";
		nameCount = 0;
		aliasCount = 0;
		actorCount = 0;
	}
	
	public void setName(String n) {name = n;}
	public void setAlias (String a) {alias = a;}
	public void setActor (String a) {actor = a;}
	public String getName() {return name;}
	public String getAlias() {return alias;}
	public String getActor() {return actor;}
	public int getNameCount() {return nameCount;}
	public int getAliasCount() {return aliasCount;}
	public int getActorCount() {return actorCount;}
	public void setNameCount(int i) {nameCount = i;}
	public void setAliasCount(int i) {aliasCount = i;}
	public void setActorCount(int i) {actorCount = i;}
	
	
}
