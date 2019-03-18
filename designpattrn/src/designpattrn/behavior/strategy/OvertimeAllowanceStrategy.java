package designpattrn.behavior.strategy;

/**
 * 抽象策略，发放加班补助策略
 */
public interface OvertimeAllowanceStrategy {

	String provideOvertimeAllowance();
}
