package ngves.lfinfo.core.ware.service.interfaces;

import com.ai.appframe2.service.ServiceFactory;
import com.lfinfo.test.AppFrameJUnit4ClassRunner;
import ngves.lfinfo.core.ware.ivalues.IQBOAllWareInfoChildValue;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.fail;

@RunWith(AppFrameJUnit4ClassRunner.class)
public class IWarePCInfoSrvTest {
	
	private IWarePCInfoSrv service = (IWarePCInfoSrv)ServiceFactory.getService("ngves.lfinfo.core.WarePCInfoService");

	@Test
	public void testQueryAllWareInfoChild() {
		try {
			IQBOAllWareInfoChildValue[] values = service.queryAllWareInfoChild(null, null, null, null, null, null, null, null, null,null, null, 0, 99);
			System.out.println("----------"+values.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testQueryAllWareInfoChildCount() {
		fail("Not yet implemented");
	}

}
