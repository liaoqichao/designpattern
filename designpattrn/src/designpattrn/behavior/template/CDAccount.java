package designpattrn.behavior.template;

/**
 * 存款账户，具体模板类
 */
public class CDAccount extends Account {

	@Override
	protected double doCalInterestRate() {
		return 0.085;
	}

	@Override
	protected String doCalAccountType() {
		return "Certificate of Deposit";
	}

}
