package monopoly;

abstract class Property extends Tile
	{
protected int price;
protected int rent;
protected int getPrice()
	{
		return price;
	}
protected void setPrice(int price)
	{
		this.price = price;
	}
protected int getRent()
	{
		return rent;
	}
protected void setRent(int rent)
	{
		this.rent = rent;
	}
	}
 
