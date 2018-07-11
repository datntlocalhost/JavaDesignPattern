package dp.datnt.runsystem.com.iterator;

public class MyList<T> implements IMyCollection {

	@SuppressWarnings("unchecked")
	private T array[] = (T[])new Object[0];
	
	/* new một ListIterator
	 * @return IMyIterator
	 * */
	@Override
	public IMyIterator getIterator() {
		return (new ListIterator());
	}
	
	private class ListIterator implements IMyIterator {
		
		private int index = 0;

		@Override
		public boolean hasNext() {
			return this.index < array.length;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return array[index++];
			}
			return null;
		}		
	}
	
	/* Thêm một phần tử t vào mảng
	 * @param T t
	 */
	@SuppressWarnings("unchecked")
	public void add(T t) {
		int oldSize = size(); //kích thước mảng cũ
		
		//tạo một mảng mới để lưu lại các phần tử mảng cũ
		T oldArray[] = (T[])new Object[oldSize];
		//copy mảng cũ sang mảng mới
		this.copyArray(this.array, oldArray); 
		//resize lại mảng cũ với size + 1
		this.array = (T[])new Object[oldSize + 1];
		//copy lại mảng mới sang mảng cũ
		this.copyArray(oldArray, array);
		//thêm phần tử mới vào cuối mảng cũ
		this.array[oldSize] = t;
	}
	
	/* Lấy một phần tử i trong mảng
	 * @param int i
	 * @return T 
	 */
	public T get(int i) {
		return this.array[i];
	}
	
	/* Trả về kích thước của mảng
	 * @return int
	 */
	public int size() {
		return this.array.length;
	}
	
	/* Hàm copy mảng củ sang mảng mới
	 * @param T[] oldArray 
	 * @param T[] newArray
	 */
	private void copyArray(T[] oldArray, T[] newArray) {
		
		int size = oldArray.length;
		for (int i = 0; i < size; i++) {
			newArray[i] = oldArray[i];
		}
	}

}
