package model;

public class App {
	private int updateCount =0;
	private int updateRatingCount =0;
	private String name;
	private int maxRating;
	private String averageRating = "n/a";
	private Log latestAppLog = new Log("n/a");
	private Log[] updateHistory = new Log[20];
	private String ratingReport = "n/a";
	private int[] ratings = {0,0,0,0,0};
	public String getName() {
		return name;
	}
	public App(String name, int maxRating) {
		this.name = name;
		this.maxRating = maxRating;
	}
	public int getMaxRating() {
		return maxRating;
	}
	public String getWhatIsNew() {
		if (updateCount==0) {
			return "n/a";
		} else {
			return String.format("Version %s contains %d fixes %s", this.latestAppLog.getVersion(), this.latestAppLog.getNumberOfFixes(), this.latestAppLog.getFixes());
		}
	}
	public Log[] getUpdateHistory() {
		int count = 0;
		for (Log l: updateHistory) {
			if (l != null) {
				count++;
			}
		}
		Log[] cpyupdateHistory = new Log[count];
		for (int i=0; i<count; i++) {
			cpyupdateHistory[i] = this.updateHistory[i];
		}
		return cpyupdateHistory;
	}
	public Log getVersionInfo(String s) {
		int numberOfUpdates = this.getUpdateHistory().length;
		for (int i =0; i<numberOfUpdates; i++) {
			if (this.updateHistory[i].getVersion().equals(s)) {
				return this.updateHistory[i];			
			}
		}
		return null;
	}
	public String getRatingReport() {
		return (this.ratingReport.equals("n/a"))? "No ratings submitted so far!":String.format("Average of %d ratings: %s " + this.ratingReport,updateRatingCount, averageRating);
	}
	public String toString() {
		if (!this.latestAppLog.getVersion().equals("n/a")) {
			return String.format("%s (Current Version: Version %s" + " contains %d fixes %s; " + "Average Rating: %s)", name, this.latestAppLog.getVersion(), this.latestAppLog.getNumberOfFixes(), this.latestAppLog.getFixes(), this.averageRating); 
		} else {
			return String.format("%s (Current Version: %s; Average Rating: %s)", name, this.latestAppLog.getVersion(), this.averageRating);
		}
	}
	public void releaseUpdate(String newVersion) {
		this.updateHistory[updateCount] = new Log(newVersion);
		latestAppLog = this.updateHistory[updateCount];
		updateCount++;
	}
	public void submitRating(int rate) {
		if (updateRatingCount<maxRating) {
			if (rate<1) {
				this.ratings[0]++;
				updateRatingCount++;

			} else if (rate>5) {
				this.ratings[4]++;
				updateRatingCount++;
			} else {
				this.ratings[rate-1]++;
				updateRatingCount++;
			}

		}
		this.ratingReport = String.format("(Score 5: %d, Score 4: %d, Score 3: %d, Score 2: %d, Score 1: %d)", this.ratings[4], this.ratings[3], this.ratings[2], this.ratings[1], this.ratings[0]);
		float sum = 0;
		for (int i=0; i<5; i++) {
			sum += (i+1)*this.ratings[i];
		}
		this.averageRating = String.format("%.1f",sum/(float)this.updateRatingCount);
		
	}
}
