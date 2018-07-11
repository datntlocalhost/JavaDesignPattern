package dp.datnt.runsystem.com.interpreter;

import java.util.Stack;

public class ExpressionUtils {

	/* hàm chuyển infix sang postfix
	 * @param String infix - chuỗi đầu vào
	 * @return String postfix - chuỗi sau khi chuyển đổi
	 */
	public static String toPostfix(String infix) {
		
		String postFix = "";
		Stack<String> stack = new Stack<>();
		
		char[] inArray = infix.replace(" ", "").toCharArray();
		
		for (int i = 0; i < inArray.length; i++) {
			
			String s = String.valueOf(inArray[i]);
			
			//nếu là toán tử
			if (isOperator(s)) {
				while (stack.size() > 0 && getPriority(s) <= getPriority(stack.peek())) {
					postFix += stack.pop();
				}
				stack.push(s);
			}
			else if (s.equals("(")) {
				stack.push(s);
			}	
			else if (s.equals(")")) {
				String x = stack.pop();
				while (!x.equals("(")) {
					postFix += x;
					x = stack.pop();
				}
			}
			else {
				postFix += s;
			}
		}
		
		while (stack.size() > 0) {
			postFix += stack.pop();
		}
		
		return postFix;
	}
	
	/* kiểm tra ký tự có phải là toán tử
	 * @param String s - ký tự
	 * @return boolean - true nếu là +-/* và ngược lại
	 */
	public static boolean isOperator(String s) {
		String operator = "+-*/";	
		return operator.contains(s);
	}
	
	/* kiểm tra sự ưu tiên của các toán tử
	 * @param String s - toán tử
	 * @return int - 1 nếu là +-, 2 nếu là /*, còn lại 0
	 * */
	public static int getPriority(String s) {
		switch (s) {
			case "*":
			case "/": return 2;
			case "+":
			case "-": return 1;
			default: return 0;
		}
	}
	
	/* hàm trả về Expression nào sẽ thực hiện
	 * @param String s - toán tử
	 * @param IExpression left - vế trái phép toán
	 * @param IExpression right - vế phải phép toán
	 * @return IExpression - phép toán sẽ thực hiện
	 * */
	public static IExpression getOperator(String s, IExpression left, IExpression right) {
		switch (s) {
			case "+":
				return new Add(left, right);
			case "-":
				return new Sub(left, right);
			case "*":
				return new Multi(left, right);
			case "/":
				return new Division(left, right);
			default:
				return null;
		}
	}
}

