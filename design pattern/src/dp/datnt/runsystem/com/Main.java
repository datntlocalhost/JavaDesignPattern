package dp.datnt.runsystem.com;

import java.util.Stack;

import dp.datnt.runsystem.com.interpreter.ExpressionUtils;
import dp.datnt.runsystem.com.interpreter.IExpression;
import dp.datnt.runsystem.com.interpreter.Number;

public class Main {

	public static void main(String args[]) {
		
		// ================== demo interpreter pattern =======================
		String infix = "4 + 3 - (2*5)/7";
		
		char[] postfix = ExpressionUtils.toPostfix(infix).toCharArray();
		
		Stack<IExpression> stack = new Stack<>();
		
		for (char c : postfix) {
			
			String s = String.valueOf(c);
			
			//Nếu là toán tử
			if (ExpressionUtils.isOperator(s)) {
				//lấy elements ra stack theo thứ tự
				IExpression right = stack.pop();
				IExpression left  = stack.pop();
				
				//Gọi toán tử sẽ thực hiện
				IExpression operator = ExpressionUtils.getOperator(s, left, right);
				float result = operator.interpreter();
				stack.push(new Number(result)); //cho kết quả lại vào stack
			}
			//Nếu không phải là toán tử
			else {
				IExpression number = new Number(Float.parseFloat(s));
				stack.push(number); //cho vào stack
			}
		}
		
		System.out.println(stack.pop().interpreter());
	}
}


/* =================== demo strategy pattern =========================
 * Entity entity = new Entity(new HumanMove());		
		entity.move();//Output: Di chuyển bằng hai chân
		
		entity = new Entity(new DogMove());
		entity.move();//Output: Di chuyển bằng bốn chân
		
		entity = new Entity(new BirdMove());
		entity.move();//Output: Di chuyển bằng hai cánh (Bay)
 */

/* =================== demo iterator pattern =========================
 * MyList<String> list = new MyList<String>();
		
		list.add("line 1");
		list.add("line 2");
		list.add("line 3");
		list.add("line 4");

		for (IMyIterator iterator = list.getIterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
*/


/* =================== demo facade pattern =========================
 * LaptopFacade laptopFacade = new LaptopFacade();
		
		laptopFacade.getDellInfo();  //Output: Dell vostro
		laptopFacade.getLenovoInfo();//Output: Lenovo Thinkpad T540P
 */

/* =================== demo abstract factory pattern =========================
 * AbstractFactory laptop = FactoryProducer.getFactory("laptop");
		AbstractFactory phone  = FactoryProducer.getFactory("phone");
		
		Laptop     lt = laptop.getLaptop("Dell");
		SmartPhone sp = phone.getPhone("Samsung");
		
		lt.getInfo(); //Output: Dell Vostro
		sp.getInfo(); //Output: Samsung galaxy
 */

/* =================== demo adapter pattern =========================
 * SocketAdapter socketAdapter1 = new SocketClassAdapterImpl();	
		Volt v220 = socketAdapter1.get220Volt();
		
		SocketAdapter socketAdapter2 = new SocketObjectAdapterImpl();
		Volt v110 = socketAdapter2.get110Volt();
		
		System.out.println("220 volt sử dụng Class Adapter: " + v220.getVolts());
		System.out.println("110 volt sử dụng Object Adapter: " + v110.getVolts());
*/

