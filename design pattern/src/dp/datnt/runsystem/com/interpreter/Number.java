package dp.datnt.runsystem.com.interpreter;

public class Number implements IExpression {
	
	private final float n;
	
	public Number(float n) {
		this.n = n;
	}
	
	@Override
	public float interpreter() {
		return this.n;
	}
}


