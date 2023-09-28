
public class Avenger implements Comparable<Avenger> {

	private String heroName;
	private String heroAlias;
	private String performer;
	private int nameFreq;
	private int aliasFreq;
	private int performerFreq;

	public Avenger() {
			heroName = "";
		heroAlias = "";
		performer = "";
		nameFreq = 0;
		aliasFreq = 0;
		performerFreq = 0;
	}
	
	public void setHeroName(String n) {heroName = n;}
	public void setHeroAlias (String a) {heroAlias = a;}
	public void setPerformer (String a) {performer = a;}
	public String getHeroName() {return heroName;}
	public String getHeroAlias() {return heroAlias;}
	public String getPerformer() {return performer;}
	
	public void setNameFreq(int i) {nameFreq = i;}
	public void setAliasFreq(int i) {aliasFreq = i;}
	public void setPerformerFreq(int i) {performerFreq = i;}
	public int getNameFreq() {return nameFreq;}
	public int getAliasFreq() {return aliasFreq;}
	public int getPerformerFreq() {return performerFreq;}
	
	@Override
	public String toString() {
		String format = heroAlias + "aka" + heroName + " performed by " + performer + " mentioned " + "(n: " + nameFreq + " +a: " + aliasFreq + " +p: " + performerFreq + ")" + "time(s)";
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
