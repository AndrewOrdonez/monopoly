package monopoly;
import java.util.*;
public class Player implements Redundant
	{
private String piece;
private int location;
private int tempLocation;
private int money;
public Player(String piece, int location, int tempLocation, int money)
	{
		this.piece = piece;
		this.location = location;
		this.tempLocation = tempLocation;
		this.money = money;
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

@Override
public boolean isDog(Player p)
	{
		if (p.getPiece().equals("DOG")){
			return true;
		}
		return false;
	}

	}
