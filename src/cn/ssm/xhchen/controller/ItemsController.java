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
 * @Description: 商品管理控制
 * @author XHChen
 * @date 2018年10月17日 下午9:31:52
 */
@Controller
// 窄化请求映射,对url进行分类管理
@RequestMapping("/items")
public class ItemsController {

	@Autowired
	private ItemsService itemsService;

	/**
	 * 
	 * @Description: 模糊查询商品信息
	 * @param @return
	 * @param @throws Exception
	 * @return ModelAndView
	 * @throws
	 * @author XHChen
	 * @date 2018年10月20日 下午8:34:57
	 */
	// 1.@RequestMapping("/queryItems.action")
	// 2.限制http请求方法,限定表单POST请求
	// @RequestMapping(value="/queryItems.action",method={RequestMethod.POST})
	// 3.限制http请求方法,限定表单POST/GET请求
	@RequestMapping(value = "/queryItems.action", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView queryItems() throws Exception {
		
		// 此项目不做数据绑定

		 // 创建ItemsCustomer对象
		 ItemsCustomer itemsCustomer = new ItemsCustomer();
		 // 设置查询条件
		 itemsCustomer.setItems_name("苹果");
		
		 // 创建ItemsQueryVo对象
		 ItemsQueryVo itemsQueryVo = new ItemsQueryVo();
		 // 把itemsCustomer封装到ItemsQueryVo中
		 itemsQueryVo.setItemsCustomer(itemsCustomer);

		// 调用service方法查询数据库
		List<ItemsCustomer> itemsList = itemsService.findItemsList(itemsQueryVo);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);

		// 指定视图
		// 路径前缀和后缀已由springmvc.xml配置
		modelAndView.setViewName("items/itemsList");

		return modelAndView;

	}

	/**
	 * 
	 * @Description: 商品信息修改页面
	 * @param @return 返回ModelAndView
	 * @param @throws Exception
	 * @return ModelAndView
	 * @throws
	 * @author XHChen
	 * @date 2018年10月20日 下午8:46:10
	 */
	@RequestMapping("/editItems.action")
	public ModelAndView editItems() throws Exception {

		// 通过itemsService获得修改数据，此项目不介绍数据绑定
		ItemsCustomer itemsCustomer = itemsService.findItemsById(1);

		System.out.println(itemsCustomer);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();

		// 把数据添加到modelAndView
		modelAndView.addObject("itemsCustomer", itemsCustomer);

		// 指定视图
		modelAndView.setViewName("items/editItems");

		return modelAndView;

	}

	/**
	 * 
	 * @Description: 修改商品信息
	 * @param @return
	 * @param @throws Exception
	 * @return ModelAndView
	 * @throws
	 * @author XHChen
	 * @date 2018年10月20日 下午8:51:59
	 */
	@RequestMapping("/editItemsSubmit.action")
	public ModelAndView editItemsSubmit() throws Exception {

		// 调用itemsService方法修改商品信息，需要将页面数据提交到此方法
		// ......
		// 方法没有做参数绑定
		// itemsService.updateItems(id, itemsCustomer);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();

		// 指定视图
		modelAndView.setViewName("items/itemsList");
		
		// 返回指定视图
		return modelAndView;

	}
}
