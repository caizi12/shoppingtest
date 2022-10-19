package ngves.lfinfo.core.sms.service.interfaces;

import com.ai.appframe2.service.ServiceFactory;
import ngves.lfinfo.core.sms.SmsConstant;
import ngves.lfinfo.core.sms.bo.SmsTemplateBean;
import ngves.lfinfo.core.sms.dao.interfaces.IBusiSmsTemplateDAO;
import ngves.lfinfo.core.sms.ivalues.IBusiSmsTemplateValue;
import ngves.lfinfo.core.sms.ivalues.ISmsTemplateValue;
import org.junit.Before;
import org.junit.Test;

public class IBusiSmsTemplateSrvTest {
	private IBusiSmsTemplateSrv busiSmsTempService;
	private IBusiSmsTemplateDAO busiSmsTemplateDAO;
	@Before
	public void init(){
		System.out.println("start");
		busiSmsTempService = (IBusiSmsTemplateSrv)ServiceFactory.getService(SmsConstant.BUSI_SMS_TEMPLATE_SRV);
		busiSmsTemplateDAO= (IBusiSmsTemplateDAO)ServiceFactory.getService("ngves.lfinfo.core.BusiSmsTemplateDAO");
	}
	@Test
	public void testGetBusiSmsTemplate() throws NumberFormatException, Exception {
		String str="100000000022142";
		IBusiSmsTemplateValue[] i= busiSmsTemplateDAO.getBusiSmsTemplateBySmsId(Long.parseLong(str));
		for (int j = 0; j < i.length; j++) {
			IBusiSmsTemplateValue busiSmsTemplateValue = i[j];
			System.out.println("smsId= "+busiSmsTemplateValue.getSmsId());
			System.out.println("title= "+busiSmsTemplateValue.getTitle());
		}
	}
	@Test
	public void testSavBusiSmsTemplate() throws Exception{
		ISmsTemplateValue v = new SmsTemplateBean();
		String str="100000000022142";
		v.setSmsId(Long.parseLong(str));
		busiSmsTempService.savBusiSmsTemplate(v);
	}
}
