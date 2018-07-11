package dp.datnt.runsystem.com.abstractfactory.phones;

public class Samsung extends SmartPhone {

	@Override
	public void getInfo() {
		System.out.println("Samsung galaxy.");
	}

	@Override
	public void getPrice() {
		System.out.println("8.000.000 vnd");
	}

	@Override
	public void getWeight() {
		System.out.println("0.1kg");
	}
}

