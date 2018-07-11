package dp.datnt.runsystem.com.interpreter;

public class Multi implements IExpression {

	private IExpression left;
	private IExpression right;
	
	public Multi(IExpression left, IExpression right) {
		this.left  = left;
		this.right = right;
	}
	
	@Override
	public float interpreter() {
		return left.interpreter() * right.interpreter();
	}
}

