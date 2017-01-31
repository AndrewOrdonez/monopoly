package monopoly;
import java.util.*;
public class ColoredSpace extends Tile
{
private char color;
private int price;
private int houses;
private boolean hotel;
public ColoredSpace(String name, int location,char color, int price, int houses, boolean hotel)
	{
		super();
		this.color = color;
		this.price = price;
		this.houses = houses;
		this.hotel = hotel;
		this.name=name;
		this.location=location;
	}
}