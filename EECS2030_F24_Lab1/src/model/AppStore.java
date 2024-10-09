package model;

public class AppStore {
	private int appCounter = 0;
	private int maxApps;
	private String branchName;
	private App[] apps;

	public AppStore(String branchName, int maxApps) {
		this.branchName = branchName;
		this.maxApps = maxApps;
		apps = new App[this.maxApps];
	}

	public App getApp(String appName) {
		for (App a:this.apps) {
			if (a != null) {
				if (a.getName().equals(appName)) {
					return a;
				}
			}
		}
		return null;
		
	}

	public String getBranch() {
		return branchName;
	}
	
	public String[] getStableApps(int stability) {
		int i =0;
		for (App app : apps) {
			if (app != null) {
				if (app.getUpdateHistory().length >= stability) {
					i++;
				}
			}
		}
		String[] stableApps = new String[i];
		int j =0;
		for (App app : apps) {
			if (app != null) {
				if (app.getUpdateHistory().length >= stability) {
					stableApps[j] = String.format("%s (%d versions; Current Version: %s)", app.getName(), app.getUpdateHistory().length, app.getWhatIsNew());
					j++;
				}
			}
		}
		return stableApps;
	}
	
	public void addApp(App app) {
		this.apps[appCounter] =  app;
		appCounter++;
	}
	

}
