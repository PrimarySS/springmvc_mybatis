package cn.ssm.xhchen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.ssm.xhchen.po.ItemsCustomer;
import cn.ssm.xhchen.po.ItemsQueryVo;
import cn.ssm.xhchen.service.ItemsService;

/**
 * 
 * ClassName: ItemsController
 * 
 * @Description: ��Ʒ�������
 * @author XHChen
 * @date 2018��10��17�� ����9:31:52
 */
@Controller
// խ������ӳ��,��url���з������
@RequestMapping("/items")
public class ItemsController {

	@Autowired
	private ItemsService itemsService;

	/**
	 * 
	 * @Description: ģ����ѯ��Ʒ��Ϣ
	 * @param @return
	 * @param @throws Exception
	 * @return ModelAndView
	 * @throws
	 * @author XHChen
	 * @date 2018��10��20�� ����8:34:57
	 */
	// 1.@RequestMapping("/queryItems.action")
	// 2.����http���󷽷�,�޶���POST����
	// @RequestMapping(value="/queryItems.action",method={RequestMethod.POST})
	// 3.����http���󷽷�,�޶���POST/GET����
	@RequestMapping(value = "/queryItems.action", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView queryItems() throws Exception {
		
		// ����Ŀ�������ݰ�

		 // ����ItemsCustomer����
		 ItemsCustomer itemsCustomer = new ItemsCustomer();
		 // ���ò�ѯ����
		 itemsCustomer.setItems_name("ƻ��");
		
		 // ����ItemsQueryVo����
		 ItemsQueryVo itemsQueryVo = new ItemsQueryVo();
		 // ��itemsCustomer��װ��ItemsQueryVo��
		 itemsQueryVo.setItemsCustomer(itemsCustomer);

		// ����service������ѯ���ݿ�
		List<ItemsCustomer> itemsList = itemsService.findItemsList(itemsQueryVo);

		// ����ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);

		// ָ����ͼ
		// ·��ǰ׺�ͺ�׺����springmvc.xml����
		modelAndView.setViewName("items/itemsList");

		return modelAndView;

	}

	/**
	 * 
	 * @Description: ��Ʒ��Ϣ�޸�ҳ��
	 * @param @return ����ModelAndView
	 * @param @throws Exception
	 * @return ModelAndView
	 * @throws
	 * @author XHChen
	 * @date 2018��10��20�� ����8:46:10
	 */
	@RequestMapping("/editItems.action")
	public ModelAndView editItems() throws Exception {

		// ͨ��itemsService����޸����ݣ�����Ŀ���������ݰ�
		ItemsCustomer itemsCustomer = itemsService.findItemsById(1);

		System.out.println(itemsCustomer);

		// ����ModelAndView
		ModelAndView modelAndView = new ModelAndView();

		// ��������ӵ�modelAndView
		modelAndView.addObject("itemsCustomer", itemsCustomer);

		// ָ����ͼ
		modelAndView.setViewName("items/editItems");

		return modelAndView;

	}

	/**
	 * 
	 * @Description: �޸���Ʒ��Ϣ
	 * @param @return
	 * @param @throws Exception
	 * @return ModelAndView
	 * @throws
	 * @author XHChen
	 * @date 2018��10��20�� ����8:51:59
	 */
	@RequestMapping("/editItemsSubmit.action")
	public ModelAndView editItemsSubmit() throws Exception {

		// ����itemsService�����޸���Ʒ��Ϣ����Ҫ��ҳ�������ύ���˷���
		// ......
		// ����û����������
		// itemsService.updateItems(id, itemsCustomer);

		// ����ModelAndView
		ModelAndView modelAndView = new ModelAndView();

		// ָ����ͼ
		modelAndView.setViewName("items/itemsList");
		
		// ����ָ����ͼ
		return modelAndView;

	}
}
