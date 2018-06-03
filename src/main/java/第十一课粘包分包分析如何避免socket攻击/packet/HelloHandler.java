package 第十一课粘包分包分析如何避免socket攻击.packet;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

public class HelloHandler extends SimpleChannelHandler {
	
	private int count = 1;

	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
		
		System.out.println(e.getMessage() + "  " +count);
		count++;
	}
}
