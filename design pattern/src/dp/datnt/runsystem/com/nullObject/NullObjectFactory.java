package dp.datnt.runsystem.com.nullObject;

import dp.datnt.runsystem.com.abstractfactory.AbstractFactory;
import dp.datnt.runsystem.com.abstractfactory.phones.SmartPhone;
import dp.datnt.runsystem.com.factory.Laptop;

public class NullObjectFactory extends AbstractFactory {

	//TODO: nothing in this class
	@Override
	public Laptop getLaptop(String laptop) {
		return (new NullLaptop());
	}

	@Override
	public SmartPhone getPhone(String phone) {
		return (new NullPhone());
	}
}





