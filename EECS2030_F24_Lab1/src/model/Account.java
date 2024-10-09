package model;

public class Account {
	private String userName;
	private AppStore store = new AppStore(null,1);
	private int downloadCounter = 0;
	private App[] downloads = new App[50];
	private int rating; 

	private String downloadAttempt = "";
//	private boolean uninstallationError = false;
//	private boolean ratingError = false;
//	private boolean switched = false;
//	private boolean downloadStatusSuccessful = false;
//	private boolean attemptingToDownloadAgain = false;
//	private boolean ratedSuccessfully = false;
	private int status = 8;

	public Account(String userName, AppStore store) {
		this.userName = userName;
		this.store = store;
	}


	public String toString() {
		switch(status) {
			//		if (this.ratingError) {		
		case 1:
			return String.format("Error: %s is not a downloaded app for %s.", this.downloadAttempt ,this.userName);
		case 2:
			//		} else if (this.uninstallationError) {			
			return String.format("Error: %s has not been downloaded for %s.", this.downloadAttempt ,this.userName);
		case 3:

			//		}else if (this.attemptingToDownloadAgain){
			return String.format("Error: %s has already been downloaded for %s.", downloadAttempt, this.userName);
		case 4:

			//		} else if (this.downloadStatusSuccessful) {
			return String.format("%s is successfully downloaded for %s.", this.downloadAttempt, this.userName);
		case 5:
			//		}else if(!this.switched) {
			return String.format("Account for %s is now linked to the %s store.", this.userName, this.store.getBranch());
			
		case 6:
			//ratedSuccessfully
			return String.format("Rating score %d of %s is successfully submitted for %s.", rating, this.userName, this.downloadAttempt);
		case 7:
			return String.format("%s is successfully uninstalled for %s.",this.downloadAttempt, this.userName);
		default:
			//		} else {
			return String.format("An account linked to the %s store is created for %s.", this.store.getBranch(), this.userName);

		}
	}

	public String[] getNamesOfDownloadedApps() {		
		String[] downloadedAppNames = new String[downloadCounter];
		for (int i = 0; i < downloadCounter; i++) {
			if (this.downloads[i]!= null) {
				downloadedAppNames[i] = this.downloads[i].getName();}

		}
		return downloadedAppNames;
	}


	public App[] getObjectsOfDownloadedApps() {	
		App[] downloadedApp = new App[downloadCounter];
		for (int i = 0; i < downloadCounter; i++) {
			if (this.downloads[i]!= null) {
				downloadedApp[i] = this.downloads[i];}
		}
		return downloadedApp;
	}


	public void uninstall(String string) {
		int i = 0;
		boolean flag = false;
		App[] cpyDownloads = this.getObjectsOfDownloadedApps();
		for (App a:cpyDownloads) {
			if (a.getName().equals(string)) {
				if (cpyDownloads.length==1) {
					this.downloads[i] = null;
				} else {
					for (int j = i; j < cpyDownloads.length-1; j++) {
						this.downloads[j] = cpyDownloads[j+1];
						this.downloads[j+1] = null;

					}
				}
				flag = true;
				this.downloadCounter--;
				this.status = 7;

			}
			i++;
		}			
		this.downloadAttempt = string;
		if (!flag) {
			this.status = 2;
		}
	}


	public void submitRating(String string, int i) {
		this.downloadAttempt = string;
		if (!isThereADownloadedAppWithTheSameName(string)) {
			this.status = 1;
		} else {
			this.status = 6;
			this.store.getApp(string).submitRating(i);
			this.rating = i;

		}
	}

	public void download(String name) {
		if (!isThereADownloadedAppWithTheSameName(name)) {
			this.downloads[downloadCounter] = store.getApp(name);
			this.status  = 4;
			this.downloadAttempt = name;
			this.downloadCounter++;
		} else {
			status  = 3;
			this.downloadAttempt = name;
		}
	}


	public void switchStore(AppStore appStore) {
		this.store = appStore;
		this.downloadAttempt = "";
		this.status  = 5;
	}

	private boolean isThereADownloadedAppWithTheSameName(String appName) {
		boolean flag = false;
		App[] cpyDownloads = this.getObjectsOfDownloadedApps();
		for (App a:cpyDownloads) {
			if (a.getName().equals(appName)) {
				flag = true;
			}
		}
		return flag;

	}

}
