package dp.datnt.runsystem.com.facade;

import dp.datnt.runsystem.com.factory.Dell;
import dp.datnt.runsystem.com.factory.Laptop;
import dp.datnt.runsystem.com.factory.Lenovo;

public class LaptopFacade {
	
	Laptop dell;
	Laptop lenovo;
	
	public LaptopFacade() {	
		dell   = new Dell();
		lenovo = new Lenovo();
	}
	//Lấy thông tin của laptop Lenovo
	public void getLenovoInfo() {
		lenovo.getInfo();
	}
	//lấy thông tin của laptop Dell
	public void getDellInfo() {
		dell.getInfo();
	}
}



