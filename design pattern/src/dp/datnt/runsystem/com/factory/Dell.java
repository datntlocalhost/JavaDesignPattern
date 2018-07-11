package dp.datnt.runsystem.com.factory;

public class Dell extends Laptop {

	@Override
	public void getInfo() {
		System.out.println("Dell vostro\n");
	}

	@Override
	public void getPrice() {
		System.out.println("9.800.000 vnd\n");
	}

	@Override
	public void getWeight() {
		System.out.println("2.0kg\n");
	}
}


