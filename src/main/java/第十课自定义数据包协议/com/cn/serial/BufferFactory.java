package 第十课自定义数据包协议.com.cn.serial;


import java.nio.ByteOrder;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
/**
 * buff工厂
 * @author -琴兽-
 *
 */
public class BufferFactory {
	
	public static ByteOrder BYTE_ORDER = ByteOrder.BIG_ENDIAN;

	/**
	 * 获取一个buffer
	 * 
	 * @return
	 */
	public static ChannelBuffer getBuffer() {
		ChannelBuffer dynamicBuffer = ChannelBuffers.dynamicBuffer();
		return dynamicBuffer;
	}

	/**
	 * 将数据写入buffer
	 * @param bytes
	 * @return
	 */
	public static ChannelBuffer getBuffer(byte[] bytes) {
		ChannelBuffer copiedBuffer = ChannelBuffers.copiedBuffer(bytes);
		return copiedBuffer;
	}

}
