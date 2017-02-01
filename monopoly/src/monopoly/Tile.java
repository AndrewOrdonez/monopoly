package monopoly;

abstract class Tile
	{
protected String name;
protected int location;
protected String getName()
	{
		return name;
	}
protected void setName(String name)
	{
		this.name = name;
	}
protected int getLocation()
	{
		return location;
	}
protected void setLocation(int location)
	{
		this.location = location;
	}

	}
