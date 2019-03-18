package designpattrn.behavior.template;

/**
 * 抽象模板，账户类
 */
public abstract class Account {

	/**
	 * 模板方法，计算利息
	 */
	public final double calInterest(){ 
		double interestRate = doCalInterestRate(); // 计算利息率
		String accountType = doCalAccountType(); // 获取账户类型
		double amount = calAmount(accountType); // 计算数量
		return amount * interestRate; 	// 利息 = 数量 * 息率
	}

	/**
	 * abstract method  
	 * 计算利息率
	 */
	abstract protected double doCalInterestRate();
	
	/**
	 * abstract method 
	 * 获取账户类型
	 */
	abstract protected String doCalAccountType();
	
	/**
	 * concrete method
	 * 计算数量
	 */
	private double calAmount(String accountType) {
		return 4396.00;
	}
	
}
