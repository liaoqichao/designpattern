package designpattrn.structure.bridge;

public class Main {

	public static void main(String[] args) {

		// 狙击枪搭配八倍镜
		Gun sniperRifle = new SniperRifle("88狙");
		SniperMirror octaveSniperMirror = new OctaveSniperMirror("国产的八倍镜");
		sniperRifle.setSniperScope(octaveSniperMirror);
		sniperRifle.shoot(); 
		
		// 步枪搭配三倍镜
		Gun rifle = new Rifle("AK47");
		SniperMirror tripleSniperMirror = new TripleSniperMirror("进口的三倍镜");
		rifle.setSniperScope(tripleSniperMirror);
		rifle.shoot();
		
		// 聚合关系在抽象层建立，实现层不需要管理关联关系
		rifle.setSniperScope(octaveSniperMirror); 
		rifle.shoot();
		
		rifle.setSniperScope(null);
		rifle.shoot();
	}

}
