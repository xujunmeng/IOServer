package 第十课自定义数据包协议.com.com.cn.module.fuben.response;

import 第十课自定义数据包协议.com.com.cn.serial.Serializer;

public class FightResponse extends Serializer{

	/**
	 * 获取金币
	 */
	private int gold;
	
	

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	@Override
	protected void read() {
		this.gold = readInt();
	}

	@Override
	protected void write() {
		writeInt(gold);
	}
}
