package cn.ssm.xhchen.mapper;

import java.util.List;

import cn.ssm.xhchen.po.ItemsCustomer;
import cn.ssm.xhchen.po.ItemsQueryVo;

/**
 * 
 * ClassName: ItemsMapper
 * 
 * @Description: ItemsMapper����չmapper�ӿ�
 * @author XHChen
 * @date 2018��10��17�� ����5:11:51
 */
public interface ItemsMapperCustomer {

	// ��Ʒ�б��ѯ 
	public List<ItemsCustomer> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;

}
