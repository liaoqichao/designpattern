package designpattrn.creation.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		simplePrototype();
		
		deepCopy();
		
		managementPrototype();
	}

	private static void managementPrototype() {
		// 设置
		WeeklyLog zhangSanLog = new WeeklyLog();
		zhangSanLog.setName("张三");
		zhangSanLog.setDate("第20周");
		zhangSanLog.setContent("今天依然加班");
		
		PrototypeManager.setPrototype(zhangSanLog.getName(), zhangSanLog);
		
		// 读取
		WeeklyLog zhangSanLog2 = (WeeklyLog)PrototypeManager.getProtoype("张三");
		WeeklyLog wangWuLog2 = (WeeklyLog)PrototypeManager.getProtoype("王五");
		PrototypeManager.getProtoype("张三");
		PrototypeManager.getProtoype("张三");
		
		// 重新写周报
		if(zhangSanLog2  != null) {
			zhangSanLog2.setDate("第21周");
		} else{
			zhangSanLog2 = new WeeklyLog();
			zhangSanLog2.setName("张三");
			zhangSanLog2.setDate("第20周");
			zhangSanLog2.setContent("今天依然加班");
		}
		PrototypeManager.setPrototype(zhangSanLog2.getName(), zhangSanLog2);
		if(wangWuLog2  != null) {
			wangWuLog2.setDate("第21周");
		} else {
			wangWuLog2 = new WeeklyLog();
			wangWuLog2.setName("王五");
			wangWuLog2.setDate("第21周");
			wangWuLog2.setContent("今天依然加班");
		}
		PrototypeManager.setPrototype(wangWuLog2.getName(), wangWuLog2);
		
		print((WeeklyLog)PrototypeManager.getProtoype("张三"));
		print((WeeklyLog)PrototypeManager.getProtoype("王五"));
	}

	private static void deepCopy() {
		AttachmentWeeklyLog awl1 = new AttachmentWeeklyLog();
		List<Attachment> list = new ArrayList<Attachment>();
		Attachment a1 = new Attachment();
		a1.setName("附件1");
		Attachment a2 = new Attachment();
		a2.setName("附件2");
		Attachment a3 = new Attachment();
		a3.setName("附件3");
		list.add(a1);
		list.add(a2);
		list.add(a3);
		awl1.setAttchementList(list);
		
		AttachmentWeeklyLog awl2 = awl1.deepClone();
		awl2.getAttchementList().get(0).setName("我是深拷贝元素");
		System.out.println(awl1.getAttchementList().toString());
		System.out.println(awl2.getAttchementList().toString());
	}
	
	private static void simplePrototype(){ 
		// 第12周
		WeeklyLog wl1 = new WeeklyLog();
		wl1.setName("kukii");
		wl1.setDate("第12周");
		wl1.setContent("这周工作很忙，每天加班");
		print(wl1);
		
		/*
		 *  第13周，因为周报内容相似，用new消耗大，所以用clone，然后小改
		 */
		WeeklyLog wl2 = wl1.clone();
		wl2.setDate("第12周");
		print(wl2);
	}
	
	private static void print(WeeklyLog wl1) {
        System.out.println("****周报****");
        System.out.println("周次：" +  wl1.getDate());
        System.out.println("姓名：" +  wl1.getName());
        System.out.println("内容：" +  wl1.getContent());
        System.out.println("--------------------------------");		
	}

}
