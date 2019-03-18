package designpattrn.behavior.chainofresponsibility.array;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {

	private List<AHandler> list = new ArrayList<AHandler>();
	
	public HandlerChain addHandler(AHandler handler){
		list.add(handler);
		return this;
	}
	
	public String handleRequest(String user, double fee) {
		StringBuilder sb = new StringBuilder();
		for (AHandler handler : list) {
			/*
			 *  1. 根据返回值来判断是否传递给下一个handler
			 *  2. Handler之间解耦，所以无法在当前Handler获取下一个Handler的信息（例如名字）
			 */
			boolean isEnd = handler.handleRequest(user, fee, sb); 
			if(isEnd){
				break;
			}
		}
		return sb.toString();
	}
}
