package designpattrn.behavior.interpreter;

public class Context {

	private static String[] citys = {"深圳","香港"}; 
	
	private static String[] persons = {"老人","孕妇","儿童"};
	
	private Context(){ 
		
	}
	
	public static void allowance(String expression){ 
		Expression city = new TerminalExpression(citys);
		Expression person = new TerminalExpression(persons);
		Expression cityPerson = new NonterminalExpression(city, person);
		boolean hasAllowance = cityPerson.interpret(expression);
		if(hasAllowance){ 
			System.out.println("您是" + expression + "，您有补贴！");
		} else { 
			System.out.println("您是" + expression + "，不在补贴范围！");
		}
	}
}
