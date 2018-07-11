package dp.datnt.runsystem.com.abstractfactory;

import dp.datnt.runsystem.com.abstractfactory.phones.SmartPhone;
import dp.datnt.runsystem.com.factory.Dell;
import dp.datnt.runsystem.com.factory.Laptop;
import dp.datnt.runsystem.com.factory.Lenovo;

public class LaptopFactory extends AbstractFactory {

	@Override
	public Laptop getLaptop(String laptop) {
		// TODO 
		if (laptop.equalsIgnoreCase("Dell")) {
			return (new Dell());
		}
		else {
			return (new Lenovo());
		}
	}

	@Override
	public SmartPhone getPhone(String phone) {
		// TODO Nothing
		return null;
	}
}
