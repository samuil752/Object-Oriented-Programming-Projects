package console_apps;
import model.*;

public class console {

	public static void main(String[] args) {
		App app1 = new App("maps",1);
		App app2 = new App("instagram", 1);
		App app3 = new App("whatsapp", 1);
		App app4 = new App("facebook", 1);
		AppStore canadianStore = new AppStore("Canada", 4);
		Account samuil = new Account("samuil", canadianStore);
		
		samuil.download(app1.getName());
		samuil.download(app2.getName());		
		samuil.download(app3.getName());
		samuil.download(app4.getName());
		
		samuil.uninstall(app1.getName());

		
	}

}
