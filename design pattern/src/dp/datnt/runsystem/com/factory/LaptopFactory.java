package dp.datnt.runsystem.com.factory;

public class LaptopFactory {
	
	/* create object dựa vào input
	 * @param String branch - tên hãng 
	 * 
	 * @return Laptop
	 */
	public static Laptop getLaptop(String branch) {
		
		if (branch.equalsIgnoreCase("Dell")) {
			return (new Dell());
		}
		else {
			return (new Lenovo());
		}
	}
}


