package 第十课自定义数据包协议.com.com.cn.module.fuben.request;


import 第十课自定义数据包协议.com.com.cn.serial.Serializer;

public class FightRequest extends Serializer {
	
	/**
	 * 副本id
	 */
	private int fubenId;
	
	/**
	 * 次数
	 */
	private int count;

	public int getFubenId() {
		return fubenId;
	}

	public void setFubenId(int fubenId) {
		this.fubenId = fubenId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	protected void read() {
		this.fubenId = readInt();
		this.count = readInt();
	}

	@Override
	protected void write() {
		writeInt(fubenId);
		writeInt(count);
	}
	
	

}
