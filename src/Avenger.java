
public class Avenger implements Comparable<Avenger> {

	private String heroName;
	private String heroAlias;
	private String performer;
	private int nameFreq;
	private int aliasFreq;
	private int performerFreq;

	public Avenger(String heroName, String heroAlias, String performer) {
		this.heroName = heroName;
		this.heroAlias = heroAlias;
		this.performer = performer;
		this.nameFreq = 0;
		this.aliasFreq = 0;
		this.performerFreq = 0;
	}
	
	public void setHeroName(String n) {this.heroName = n;}
	public void setHeroAlias (String a) {this.heroAlias = a;}
	public void setPerformer (String a) {this.performer = a;}
	
	public String getHeroName() {return this.heroName;}
	public String getHeroAlias() {return this.heroAlias;}
	public String getPerformer() {return this.performer;}
	
	public void setNameFreq(int i) {this.nameFreq = i;}
	public void setAliasFreq(int i) {this.aliasFreq = i;}
	public void setPerformerFreq(int i) {this.performerFreq = i;}
	
	public int getNameFreq() {return this.nameFreq;}
	public int getAliasFreq() {return this.aliasFreq;}
	public int getPerformerFreq() {return this.performerFreq;}
	public int getTotalMentionFrequency() {return this.nameFreq + this.aliasFreq + this.performerFreq;}
	
	public void increaseNameCount() {nameFreq ++;}
	public void increaseAliasCount() {aliasFreq ++;}
	public void increasePerformerCount() {performerFreq ++;}
	
	@Override
	public String toString() {
		String format = heroName + " aka " + heroAlias + " performed by " + performer + " mentioned " + "(n: " + nameFreq + " + a: " + aliasFreq + " + p: " + performerFreq + ")" + " time(s)";
		return format;
	}

	@Override
	public int compareTo(Avenger o) {
		int result = this.getHeroAlias().compareTo(o.getHeroAlias());
		return result;
	}
	
	public boolean equals(Avenger a) {
		if (this.equals(a)) {return true;}
		else {return false;}
	}
	
}
