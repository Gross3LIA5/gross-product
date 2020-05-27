public class Product
{
	private String name;
	private boolean onStock = true;
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
