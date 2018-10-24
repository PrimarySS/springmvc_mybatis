package cn.ssm.xhchen.service;

import java.util.List;

import cn.ssm.xhchen.po.ItemsCustomer;
import cn.ssm.xhchen.po.ItemsQueryVo;

/**
 * 
 * ClassName: ItemsService
 * 
 * @Description: Items�����ӿ�
 * @author XHChen
 * @date 2018��10��17�� ����8:49:43
 */
public interface ItemsService {

	/**
	 * 
	 * @Description: ��Ʒ�б���ѯ
	 * @param @param itemsQueryVo ��װ��Ʒ��Ϣ����
	 * @param @return
	 * @param @throws Exception
	 * @return List<ItemsCustomer> ���ݿⷵ�ص�ֵӳ�䵽ItemsCustomer
	 * @throws
	 * @author XHChen
	 * @date 2018��10��20�� ����8:23:28
	 */
	public List<ItemsCustomer> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;

	/**
	 * 
	 * @Description: �ҵ��޸���Ʒ��Ϣ
	 * @param @param id ��ѯ��Ʒ��id
	 * @param @return
	 * @param @throws Exception
	 * @return ItemsCustomer
	 * @throws
	 * @author XHChen
	 * @date 2018��10��20�� ����8:23:06
	 */
	public ItemsCustomer findItemsById(Integer id) throws Exception;

	/**
	 * 
	 * @Description: �޸���Ʒ��Ϣ
	 * @param @param id �޸���Ʒ��id
	 * @param @param itemsCustomer �޸���Ʒ����Ϣ
	 * @param @throws Exception
	 * @return void
	 * @throws
	 * @author XHChen
	 * @date 2018��10��20�� ����8:23:00
	 */
	public void updateItems(Integer id, ItemsCustomer itemsCustomer) throws Exception;

}