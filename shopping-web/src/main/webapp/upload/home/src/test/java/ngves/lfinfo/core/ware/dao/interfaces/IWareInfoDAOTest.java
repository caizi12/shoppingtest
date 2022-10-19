package ngves.lfinfo.core.ware.dao.interfaces;

import com.ai.appframe2.service.ServiceFactory;
import ngves.lfinfo.core.ware.ivalues.IWareInfoPortalValue;
import org.junit.Test;

import static org.junit.Assert.fail;

public class IWareInfoDAOTest {
	
	IWareInfoDAO dao = (IWareInfoDAO) ServiceFactory.getService("ngves.lfinfo.core.wareInfoDAO");

	@Test
	public void testGetWareProvDeliverFee() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllWareInfoPortal() {
		try {
			IWareInfoPortalValue[] values = dao.getAllWareInfoPortal();
			for (IWareInfoPortalValue value : values) {
				System.out.println(value.getBakCol3());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
