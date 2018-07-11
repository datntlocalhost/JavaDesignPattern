package dp.datnt.runsystem.com.interpreter;

public class Division implements IExpression {

	private IExpression left;
	private IExpression right;
	
	public Division (IExpression left, IExpression right) {
		this.left  = left;
		this.right = right;
	}
	
	@Override
	public float interpreter() {
		return left.interpreter() / right.interpreter();
	}
}

