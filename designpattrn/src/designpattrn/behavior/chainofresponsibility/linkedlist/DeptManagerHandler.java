package designpattrn.behavior.chainofresponsibility.linkedlist;

public class DeptManagerHandler extends Handler {

	
	public DeptManagerHandler() {
		super();
		this.name = "部门经理";
	}

	@Override
	public String handleRequest(String user, double fee) {
		String str = "";
		if(fee < 1000){ 
			if("张三".equals(user)){
				str += "成功："+this.name+"同意【" + user + "】的聚餐费用，金额为"+ fee + "元\r\n";
			} else { 
				 str = "失败："+this.name+"不同意【" + user + "】的聚餐费用，金额为" + fee + "元\r\n";
			}
		} else {
			str += fire(user, fee);
		}
		return str;
	}

}
