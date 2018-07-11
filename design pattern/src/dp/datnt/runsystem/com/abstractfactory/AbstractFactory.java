package dp.datnt.runsystem.com.abstractfactory;

import dp.datnt.runsystem.com.abstractfactory.phones.SmartPhone;
import dp.datnt.runsystem.com.factory.Laptop;

public abstract class AbstractFactory {
	
	public abstract Laptop getLaptop(String laptop);
	public abstract SmartPhone getPhone(String phone);
}

