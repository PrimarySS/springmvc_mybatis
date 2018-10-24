package cn.ssm.xhchen.mapper;

import java.util.List;

import cn.ssm.xhchen.po.ItemsCustomer;
import cn.ssm.xhchen.po.ItemsQueryVo;

/**
 * 
 * ClassName: ItemsMapper
 * 
 * @Description: ItemsMapper的拓展mapper接口
 * @author XHChen
 * @date 2018年10月17日 下午5:11:51
 */
public interface ItemsMapperCustomer {

	// 商品列表查询 
	public List<ItemsCustomer> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;

}
