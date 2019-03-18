package designpattrn.creation.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

	private static Map<String, Object> map = new HashMap<String, Object>();
	
	private PrototypeManager(){
		
	}
	
	public static Object setPrototype(String key, Object value){
		return map.put(key, value);
	}
	
	public static Object getProtoype(String key){ 
		return map.get(key);
	}
	
	public static Object removePrototype(String key){ 
		return map.remove(key);
	}
	
	
}
