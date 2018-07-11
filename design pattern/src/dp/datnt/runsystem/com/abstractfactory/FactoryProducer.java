package dp.datnt.runsystem.com.abstractfactory;

import dp.datnt.runsystem.com.nullObject.NullObjectFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		
		if (choice.equalsIgnoreCase("Laptop")) {
			return (new LaptopFactory());
		}
		else if (choice.equalsIgnoreCase("Phone")) {
			return (new PhoneFactory());
		}
		
		//Return null object
		return (new NullObjectFactory()); 
	}
}



