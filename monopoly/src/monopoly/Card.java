package monopoly;

public class Card extends Tile
	{
private String type;
public Card(String name, int location, String type){
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
