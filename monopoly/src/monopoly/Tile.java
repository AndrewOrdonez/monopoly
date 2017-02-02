package monopoly;

abstract class Tile implements Comparable<Tile>
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
public int compareTo(Tile t)
	{
		// TODO Auto-generated method stub
		if(t.getLocation()>location){
			return -1;
		}
		else if (t.getLocation()<location){
			return 1;
		}
		else{
			return 0;
		}
	}

	}
