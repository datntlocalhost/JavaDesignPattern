package dp.datnt.runsystem.com.abstractfactory;

import dp.datnt.runsystem.com.abstractfactory.phones.IPhone;
import dp.datnt.runsystem.com.abstractfactory.phones.Samsung;
import dp.datnt.runsystem.com.abstractfactory.phones.SmartPhone;
import dp.datnt.runsystem.com.factory.Laptop;

public class PhoneFactory extends AbstractFactory {

	@Override
	public Laptop getLaptop(String laptop) {
		// TODO Nothing
		return null;
	}

	@Override
	public SmartPhone getPhone(String phone) {
		// TODO Auto-generated method stub
		if (phone.equalsIgnoreCase("Samsung")) {
			return (new Samsung());
		}
		else {
			return (new IPhone());
		}
	}
}

