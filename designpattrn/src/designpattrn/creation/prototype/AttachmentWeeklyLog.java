package designpattrn.creation.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class AttachmentWeeklyLog extends WeeklyLog implements Serializable, DeepClone<AttachmentWeeklyLog> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Attachment> attchementList;

	public List<Attachment> getAttchementList() {
		return attchementList;
	}

	public void setAttchementList(List<Attachment> attchementList) {
		this.attchementList = attchementList;
	}

	@Override
	public AttachmentWeeklyLog deepClone() {
		try {
			// 读
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			// 写
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			return (AttachmentWeeklyLog)ois.readObject();
			
		} catch(IOException e){
			System.out.println("深拷贝错误");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("深拷贝错误");
			e.printStackTrace();
		}
		return null;
	}
	
	
}
