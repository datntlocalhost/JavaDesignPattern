package dp.datnt.runsystem.com.factory;

public class Lenovo extends Laptop {

	@Override
	public void getInfo() {
		System.out.println("Lenovo Thinkpad T540P\n");
	}

	@Override
	public void getPrice() {
		System.out.println("16.000.000 vnd\n");
	}

	@Override
	public void getWeight() {
		System.out.println("2.4kg\n");
	}
}


