package cn.ssm.xhchen.po;

/**
 * 
 * ClassName: ItemsQueryVo
 * 
 * @Description: ��Ʒ��Ϣ��װ��
 * @author XHChen
 * @date 2018��10��17�� ����8:03:46
 */
public class ItemsQueryVo {

	// ��Ʒ��Ϣ
	private Items items;

	// ϵͳ��չ�ԣ���ԭʼpo������չ
	private ItemsCustomer itemsCustomer;

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public ItemsCustomer getItemsCustomer() {
		return itemsCustomer;
	}

	public void setItemsCustomer(ItemsCustomer itemsCustomer) {
		this.itemsCustomer = itemsCustomer;
	}

	@Override
	public String toString() {
		return "ItemsQueryVo [items=" + items + ", itemsCustomer="
				+ itemsCustomer + "]";
	}

}
