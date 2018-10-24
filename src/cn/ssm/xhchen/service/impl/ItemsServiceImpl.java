package cn.ssm.xhchen.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ssm.xhchen.mapper.ItemsMapper;
import cn.ssm.xhchen.mapper.ItemsMapperCustomer;
import cn.ssm.xhchen.po.Items;
import cn.ssm.xhchen.po.ItemsCustomer;
import cn.ssm.xhchen.po.ItemsQueryVo;
import cn.ssm.xhchen.service.ItemsService;

/**
 * 
 * ClassName: ItemsServiceImpl
 * 
 * @Description: Items管理实现
 * @author XHChen
 * @date 2018年10月17日 下午8:50:58
 */
public class ItemsServiceImpl implements ItemsService {

	// applicationContext-dao.xml已通过包扫描配置了ItemsMapperCustomer
	@Autowired
	private ItemsMapperCustomer itemsMapperCustomer;
	
	// 自动注入ItemsMapper接口
	@Autowired
	private ItemsMapper itemsMapper;

	@Override
	/**
	 * 通过itemsQueryVo查询商品信息
	 */
	public List<ItemsCustomer> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {

		// 通过ItemsMapperCustomer查询数据库
		return itemsMapperCustomer.findItemsList(itemsQueryVo);
	}

	@Override
	/**
	 * 根据id查询商品信息
	 */
	public ItemsCustomer findItemsById(Integer id) throws Exception {
		
		// 根据id查询商品信息
		Items items = itemsMapper.findItemsById(id);
		
		// 创建ItemsCustomer对象
		ItemsCustomer itemsCustomer = new ItemsCustomer();
		
		// 把商品信息items复制到itemsCustomer
		BeanUtils.copyProperties(items, itemsCustomer);
		
		// 返回拓展类ItemsCustomer
		return itemsCustomer;
	}

	@Override
	/**
	 * 修改商品信息
	 */
	public void updateItems(Integer id, ItemsCustomer itemsCustomer) throws Exception {
		
		// 一堆代码逻辑
		// ......

		// 设置修改商品id
		itemsCustomer.setId(id);
		
		// 修改商品信息
		itemsMapper.updateItems(itemsCustomer);
		
	}

}
