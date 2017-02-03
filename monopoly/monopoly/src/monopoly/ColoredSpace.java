package monopoly;
import java.util.*;
public class ColoredSpace extends Property
{
private char color;
private int houses=0;
private boolean hotel=false;
public ColoredSpace(String name, int location,char color, int price)
	{
		super();
		this.color = color;
		this.price = price;
		this.name=name;
		this.location=location;
		find=1;
	}
public char getColor()
	{
		return color;
	}
public void setColor(char color)
	{
		this.color = color;
	}
public int getPrice()
	{
		return price;
	}
public void setPrice(int price)
	{
		this.price = price;
	}
public int getHouses()
	{
		return houses;
	}
public void setHouses(int houses)
	{
		this.houses = houses;
	}
public boolean isHotel()
	{
		return hotel;
	}
public void setHotel(boolean hotel)
	{
		this.hotel = hotel;
	}
}