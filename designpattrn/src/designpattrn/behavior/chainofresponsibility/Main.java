package designpattrn.behavior.chainofresponsibility;

import designpattrn.behavior.chainofresponsibility.array.DeptManagerAHandler;
import designpattrn.behavior.chainofresponsibility.array.GeneralManagerAHandler;
import designpattrn.behavior.chainofresponsibility.array.HandlerChain;
import designpattrn.behavior.chainofresponsibility.array.ProjectManagerAHandler;
import designpattrn.behavior.chainofresponsibility.linkedlist.DeptManagerHandler;
import designpattrn.behavior.chainofresponsibility.linkedlist.GeneralManagerHandler;
import designpattrn.behavior.chainofresponsibility.linkedlist.Handler;
import designpattrn.behavior.chainofresponsibility.linkedlist.ProjectManagerHandler;

public class Main {

	public static void main(String[] args) {

		/*
		 *  这两个例子都是不纯的职责链模式，
		 * 	因为它们每个Handler都加工了返回结果，而不是完全不处理，交给下一个Handler
		 */
		
//		chainOfResponsibility1();
		
//		chainOfResponsibility2();
	}
	
	// 类似于链表的职责链模式
	public static void chainOfResponsibility1() {
		Handler pm = new ProjectManagerHandler();
		Handler dm = new DeptManagerHandler();
		Handler gm = new GeneralManagerHandler();
		pm.setSuccessor(dm);
		dm.setSuccessor(gm);
		
		String ret1 = pm.handleRequest("张三", 2000);
		System.out.println(ret1);
		
		String ret2 = pm.handleRequest("李四", 700);
		System.out.println(ret2);
	}
	// 基于数组的职责链模式
	public static void chainOfResponsibility2() {
		
		// Hanlder之间通过HandlerChain解耦，无法在当前Handler获取下一个Handler的信息
		HandlerChain chain = new HandlerChain()
				.addHandler(new ProjectManagerAHandler())
				.addHandler(new DeptManagerAHandler())
				.addHandler(new GeneralManagerAHandler());
		String ret1 = chain.handleRequest("张三", 2000);
		System.out.println(ret1);
		
		String ret2 = chain.handleRequest("李四", 700);
		System.out.println(ret2);
	}

}
