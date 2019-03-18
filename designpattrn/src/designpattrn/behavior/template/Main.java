package designpattrn.behavior.template;

/**
 * 模板方法模式
 */
public class Main {

	public static void main(String[] args) {
		Account cdAccount = new CDAccount();
		Account moneyMarketAccount = new MoneyMarketAccount();
		System.out.println("存款账号利息："+cdAccount.calInterest());
		System.out.println("货币市场账号利息："+moneyMarketAccount.calInterest());
//		存款账号利息：373.66
//		货币市场账号利息：1978.2
	}

}
