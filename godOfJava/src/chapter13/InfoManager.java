package chapter13;

import chapter12.infoDTO;

public interface InfoManager {
	public boolean addInfo(infoDTO info);
	public boolean removeInfo(String name, String phone);
	public boolean updateInfo(infoDTO info);
}
