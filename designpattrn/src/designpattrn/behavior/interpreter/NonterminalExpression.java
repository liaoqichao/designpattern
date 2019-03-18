package designpattrn.behavior.interpreter;

public class NonterminalExpression implements Expression {

	private Expression city; // 非终结表达式里面包含抽象表达式
	
	private Expression person;
	
	public NonterminalExpression(Expression city, Expression person) {
		super();
		this.city = city;
		this.person = person;
	}

	@Override
	public boolean interpret(String expression) { // 解释表达式
		String[] words = expression.split("的");
		return city.interpret(words[0]) && person.interpret(words[1]);
	}

}
