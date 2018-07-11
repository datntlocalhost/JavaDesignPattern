package dp.datnt.runsystem.com.adapter;

public class SocketObjectAdapterImpl implements ISocketAdapter {
	
	private Socket socket = new Socket();

	@Override
	public Volt get220Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get110Volt() {
		Volt volt = socket.getVolt();
		return convertVolt(volt, 2);
	}

	@Override
	public Volt get55Volt() {
		Volt volt = socket.getVolt();
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

