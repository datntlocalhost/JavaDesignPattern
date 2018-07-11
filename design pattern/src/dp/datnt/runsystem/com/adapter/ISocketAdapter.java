package dp.datnt.runsystem.com.adapter;

public interface ISocketAdapter {
	
	/* Xây dựng một Adapter có thể tạo ra:
	 *   + nguồn 3 volt
	 *   + nguồn 12 volt
	 *   + nguồn 220 volt
	 */
	public Volt get220Volt();
	public Volt get110Volt();
	public Volt get55Volt();
	
}


