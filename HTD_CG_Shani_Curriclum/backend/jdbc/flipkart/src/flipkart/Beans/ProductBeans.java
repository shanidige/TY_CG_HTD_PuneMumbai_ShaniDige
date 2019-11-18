package flipkart.Beans;

public class ProductBeans {
	private int item_id;
	private String name;
	private double cost;

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ProductBeans [item_id=" + item_id + ", name=" + name + ", cost=" + cost + "]";
	}
}
