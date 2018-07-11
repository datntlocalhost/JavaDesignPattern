package dp.datnt.runsystem.com.instances;

public class Singleton {
	
   /*một biến instance có kiểu dữ liệu Singleton
	*và có modifier private, static
	*/
	private static Singleton instance;
	
	//constructor có access modifier là private
	private Singleton() {}
	
	//hàm getInstance cho phép global access 
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
