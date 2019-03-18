package designpattrn.behavior.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人
 */
public class Caretaker {

	private List<IMemento> list = new ArrayList<IMemento>();
	
	/**
	 * 接管备忘录
	 */
	public void save(IMemento memento){ 
		list.add(memento);
	}
	
	/**
	 * 多重检查点
	 * 多个备份，返回指定备忘录
	 */
	public IMemento retrieve(int i){ 
		IMemento m = null;
		if(list.size() > i && i >= 0){ 
			m = list.get(i);
			if(i != 0 && list.size()-1 != i){ // 保留初始化备份点，防止没得备份；最后一个还原不需要删除后面的元素，不然会数组越界
				list = list.subList(0, i+1); // 当前返回的备忘录保留，后面的备忘录去掉
			}
			return m;
		} else { 
			throw new RuntimeException("找不到指定备份点");
		}
	}
	
	/**
	 * 返回上一个备份点
	 */
	public IMemento retrieve(){
		return retrieve(list.size() - 1);
	}
	
	public int size(){ 
		return list.size();
	}
	
}
