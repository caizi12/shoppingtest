package ngves.lfinfo.core.award;

import com.ai.appframe2.service.ServiceFactory;
import ngves.lfinfo.core.CoreSrvContstant;
import ngves.lfinfo.core.award.ivalues.IQBOWareQueryInfoValue;
import ngves.lfinfo.core.award.service.interfaces.IAwardLevelInfoSrv;
import org.junit.Test;
public class AwardLevelInfoSrvTest {
	
	private IAwardLevelInfoSrv  infoSrv = (IAwardLevelInfoSrv)ServiceFactory.getService(CoreSrvContstant.SERVICE_CORE_AWARD_LEVEL_INFO);

	@Test
	public void findAllWareInfosByWareNameTest(){
		IQBOWareQueryInfoValue[] value;
		try {
			value = infoSrv.findAllWareInfosByWareName("","", 1, 5);
			System.out.println(value.length);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * 测试批量新增档次对象
	 * @throws Exception
	 */
	@Test
	public void addAwardLevelInfoTest() throws Exception{
		try{
			infoSrv.addAwardLevelInfos(null,-1,"0",-1);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
