package designpattrn.behavior.template;

/**
 * 货币市场账户，具体模板类
 */
public class MoneyMarketAccount extends Account {

	@Override
	protected double doCalInterestRate() {
		return 0.45;
	}

	@Override
	protected String doCalAccountType() {
		return "Money Market";
	}

}
