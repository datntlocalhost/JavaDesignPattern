package dp.datnt.runsystem.com.nullObject;

import dp.datnt.runsystem.com.factory.Laptop;

public class NullLaptop extends Laptop {

	@Override
	public void getInfo() {
		System.out.println("Không có sản phẩm này");
	}

	@Override
	public void getPrice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getWeight() {
		// TODO Auto-generated method stub
		
	}
}

