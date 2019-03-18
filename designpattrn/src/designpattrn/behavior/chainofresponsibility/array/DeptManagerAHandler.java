package designpattrn.behavior.chainofresponsibility.array;

public class DeptManagerAHandler implements AHandler {

	private final String  name = "部门经理";
	
	@Override
	public boolean handleRequest(String user, double fee, StringBuilder result) {
		if(fee < 1000){ 
			if("张三".equals(user)){
				result.append("成功："+this.name+"同意【" + user + "】的聚餐费用，金额为"+ fee + "元\r\n");
			} else { 
				result.append("失败："+this.name+"不同意【" + user + "】的聚餐费用，金额为" + fee + "元\r\n");
			}
			return true;
		} else {
			result.append(this.name+"提交到下一级审核\r\n");
			return false;
		}
		
	}

}
