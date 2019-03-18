package designpattrn.behavior.chainofresponsibility.linkedlist;

public abstract class Handler {

	protected Handler successor;
	
	protected String name;

	// 处理请求
	public abstract String handleRequest(String user, double fee);
	
	public String fire(String user, double fee) {
		String str = "";
		if(this.successor != null){ 
			str += this.name+"提交到下一级【"+this.successor.name+"】审批。\r\n";
			str += this.successor.handleRequest(user, fee);
		} 
		return str;
	}
	
	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

}
