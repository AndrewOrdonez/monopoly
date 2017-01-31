package monopoly;

abstract class Tile
	{
protected String name;
protected int location;
public String getName()
	{
		return name;
	}
public void setName(String name)
	{
		this.name = name;
	}
public int getLocation()
	{
		return location;
	}
public void setLocation(int location)
	{
		this.location = location;
	}

	}
