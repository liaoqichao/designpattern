package designpattrn.behavior.chainofresponsibility.array;

public class ProjectManagerAHandler implements AHandler {

	private final String  name = "项目经理";
	
	@Override
	public boolean handleRequest(String user, double fee, StringBuilder result) {
		if(fee < 500){ 
			if("张三".equals(user)){
				result.append("成功："+this.name+"同意【" + user + "】的聚餐费用，金额为"+ fee + "元\r\n");
			} else { 
				result.append("失败："+this.name+"不同意【" + user + "】的聚餐费用，金额为" + fee + "元\r\n");
			}
			return true; // 不传递到下一个Handler，无论下一个Handler是否存在
		} else {
			result.append(this.name+"提交到下一级审核\r\n");
			return false; // 传递到下一个Handler，如果没有下一个Handler，HandlerChain也会跳出循环。
		}
		
	}

}
