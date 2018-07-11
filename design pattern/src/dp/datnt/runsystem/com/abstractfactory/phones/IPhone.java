package dp.datnt.runsystem.com.abstractfactory.phones;

public class IPhone extends SmartPhone {

	@Override
	public void getInfo() {
		System.out.println("IPhone X.");
	}

	@Override
	public void getPrice() {
		System.out.println("20.000.000 vnd");
	}

	@Override
	public void getWeight() {
		System.out.println("0.1kg");
	}
}
