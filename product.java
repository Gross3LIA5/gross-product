public class Product
{
	private String name;
	private boolean onStock = true;
	private float price = 10f;
	public Product()
	{
		setName("Coca Cola");
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
