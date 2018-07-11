package dp.datnt.runsystem.com.interpreter;

public class Sub implements IExpression {

	private IExpression left;
	private IExpression right;
	
	public Sub(IExpression left, IExpression right) {
		this.left  = left;
		this.right = right;
	}
	
	@Override
	public float interpreter() {
		return this.left.interpreter() - this.right.interpreter();
	}
}

