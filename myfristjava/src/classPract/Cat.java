package classPract;

public class Cat implements Vertebrates {
	private String name;
	
	public Cat() {
		this.name = "cat";
	}
	
	public Cat(String name) {
		this.changeName(name);
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	public void changeName(String name) {
		this.name = name;
	}

	@Override
	public String sound() {
		return "meow";
	}

	@Override
	public String habitat() {
		return "savannah, open forest, scrubland, swamp, and farmland.";	
	}

	@Override
	public boolean canFly() {
		return false;
	}

	@Override
	public int numOfLegs() {
		return 4;
	}

	@Override
	public double speedKmH() {
		return 48.0;
	}

	@Override
	public String toString() {
		return name + ": Cat [sound()=" + sound() + ", habitat()=" + habitat() + ", canFly()=" + canFly() + ", numOfLegs()="
				+ numOfLegs() + ", speedKmH()=" + speedKmH() + "]";
	}

}
