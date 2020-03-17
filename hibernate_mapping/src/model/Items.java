package model;

public class Items {
	private long id;
	private String itemId;
	private double itemTotal;
	private int quantity;
	private Cart cart;
	public Items(String string, double i, int j, Cart cart2) {
		// TODO Auto-generated constructor stub
		super();
		this.itemId=string;
		this.quantity=j;
		this.itemTotal=i;
		this.cart=cart2;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public double getItemTotal() {
		return itemTotal;
	}
	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
}
