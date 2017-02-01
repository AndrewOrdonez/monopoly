package monopoly;

public class Tax extends Tile
	{
		private String type;
public Tax(String name, int location,String type){
	this.name=name;
	this.location=location;
	this.type=type;
}
public String getType()
	{
		return type;
	}
public void setType(String type)
	{
		this.type = type;
	}
	}
