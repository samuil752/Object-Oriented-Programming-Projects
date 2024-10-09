package model;

public class Log {
	private String fixes = "[]";
	private int numberOfFixes = 0;
	private String version;
	public Log(String version) {
		this.version = version;
	}
	public String getFixes() {
		return fixes;
	}
	public String getVersion() {
		return version;
	}
	public int getNumberOfFixes() {
		return numberOfFixes;
	}
	public void addFix(String fix) throws IndexOutOfBoundsException {
		if (getNumberOfFixes()==0) {
			this.fixes = "[" + fix + "]";
			numberOfFixes++;
		} else if (getNumberOfFixes()<10) {
			this.fixes = this.fixes.substring(0, this.fixes.length()-1) + ", " + fix + "]";
			numberOfFixes++;
		} else {
			throw new IndexOutOfBoundsException("limit of number of fixes reached");
		}			
	}
	public String toString() {
		return String.format("Version %s contains %d fixes %s", this.version, this.getNumberOfFixes(), this.getFixes());
	}

}
