package cn.ssm.xhchen.po;

/**
 * 
 * ClassName: ItemsQueryVo
 * 
 * @Description: 商品信息包装类
 * @author XHChen
 * @date 2018年10月17日 下午8:03:46
 */
public class ItemsQueryVo {

	// 商品信息
	private Items items;

	// 系统拓展性，对原始po进行拓展
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
