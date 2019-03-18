package designpattrn.behavior.interpreter;

import java.util.HashSet;
import java.util.Set;

public class TerminalExpression implements Expression {

	private Set<String> dictionary;
	
	public TerminalExpression(String[] dictionary) {
		super();
		this.dictionary = new HashSet<String>();
		for(String word : dictionary){ 
			this.dictionary.add(word);
		}
	}

	@Override
	public boolean interpret(String expression) { // 解释表达式，直接返回
		return dictionary.contains(expression);
	}


}
