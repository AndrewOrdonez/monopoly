package monopoly;
import java.util.*;
public class Player implements Redundant
	{
private String piece;
private int location;
private int tempLocation;
private int money;
private ArrayList<Property> owned;
public Player(String piece, int location, int tempLocation, int money, ArrayList<Property> owned)
	{
		super();
		this.piece = piece;
		this.location = location;
		this.tempLocation = tempLocation;
		this.money = money;
		this.owned = owned;
	}
public String getPiece()
	{
		return piece;
	}
public void setPiece(String piece)
	{
		this.piece = piece;
	}
public int getLocation()
	{
		return location;
	}
public void setLocation(int location)
	{
		this.location = location;
	}
public int getTempLocation()
	{
		return tempLocation;
	}
public void setTempLocation(int tempLocation)
	{
		this.tempLocation = tempLocation;
	}
public int getMoney()
	{
		return money;
	}
public void setMoney(int money)
	{
		this.money = money;
	}
public ArrayList<Property> getOwned()
	{
		return owned;
	}
public void setOwned(ArrayList<Property> owned)
	{
		this.owned = owned;
	}
@Override
public boolean isDog(Player p)
	{
		if (p.getPiece().equals("DOG")){
			return true;
		}
		return false;
	}

	}
