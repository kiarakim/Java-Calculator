package chapter13;

import chapter12.infoDTO;

public abstract class InfoManagerAbstract {
	public abstract boolean addInfo(infoDTO info);
	public abstract boolean removeInfo(String name, String phone);
	public abstract boolean updateInfo(infoDTO info);
	public void printLog(String data) {
		System.out.println("Data = " + data);
	}
}
