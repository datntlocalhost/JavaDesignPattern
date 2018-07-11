package dp.datnt.runsystem.com.nullObject;

import dp.datnt.runsystem.com.abstractfactory.phones.SmartPhone;

public class NullPhone extends SmartPhone {

	@Override
	public void getInfo() {
		System.out.println("Không có sản phẩm này");
	}

	@Override
	public void getPrice() {
		
	}

	@Override
	public void getWeight() {
		
	}

}

