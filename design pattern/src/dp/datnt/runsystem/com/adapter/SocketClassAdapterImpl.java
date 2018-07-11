package dp.datnt.runsystem.com.adapter;

public class SocketClassAdapterImpl extends Socket 
									implements ISocketAdapter {

	@Override
	public Volt get220Volt() {
		return getVolt();
	}

	@Override
	public Volt get110Volt() {
		Volt volt = getVolt();
		return convertVolt(volt, 2);
	}

	@Override
	public Volt get55Volt() {
		Volt volt = getVolt();
		return convertVolt(volt, 4);
	}
	
	/* chuyển đổi volt thông qua hệ số i 
	 * @param Volt volt
	 * @param int  i 
	 * 
	 * @return Volt
	 * */
	private Volt convertVolt(Volt volt, int i) {
		return new Volt(volt.getVolts()/i);
	}
}




