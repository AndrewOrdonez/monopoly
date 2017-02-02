package monopoly;
import java.util.*;
public class Runner
	{
static ArrayList<Tile> board=new ArrayList<Tile>();
static Tile a=new ColoredSpace("ParkPlace", 37, 'b', 350);
static Tile b=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile c=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile d=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile e=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile f=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile g=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile h=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile i=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile j=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile k=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile l=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile m=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile n=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile o=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile p=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile q=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile r=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile s=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile t=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile u=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile v=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile w=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile x=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile y=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile z=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile aa=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile ab=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile ac=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile ad=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile ae=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile af=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile ag=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile ah=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile ai=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile aj=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile ak=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile al=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile am=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile an=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile ao=new ColoredSpace("boardwalk", 38, 'b', 400);
static Tile ap=new ColoredSpace("boardwalk", 38, 'b', 400);
static void print(String s) throws InterruptedException{
	char[] cars=s.toCharArray();
	for(char c:cars){
		System.out.print(c);
		if (c==' '){
			Thread.sleep(35);
		}
		Thread.sleep(35);
	}
}
public static void main(String[] args) throws InterruptedException
			{
				// TODO Auto-generated method stub
				board.add(a);
				board.add(b);
				board.add(c);
				board.add(d);
				board.add(e);
				board.add(f);
				board.add(g);
				board.add(h);
				board.add(i);
				board.add(j);
				board.add(k);
				board.add(l);
				board.add(m);
				board.add(n); 
				board.add(o);
				board.add(p);
				board.add(q);
				board.add(r);
				board.add(s);
				board.add(t);
				board.add(u);
				board.add(v);
				board.add(w);
				board.add(x);
				board.add(y);
				board.add(z);
				board.add(aa);
				board.add(ab);
				board.add(ac);
				board.add(ad);
				board.add(ae);
				board.add(af);
				board.add(ag);
				board.add(ah);
				board.add(ai);
				board.add(aj);
				board.add(ak);
				board.add(al);
				board.add(am);
				board.add(an);
				board.add(ao);
				board.add(ap);


				System.out.println(board.get(0).getName());
				System.out.println(board.get(1).getName());
				Scanner scan=new Scanner(System.in);
				System.out.println("Hello and welcome to Monopoly!\nWhich piece would you like to play as? \n[1] DOG\n[2] DOG\n[3] DOG\n[4] CAR (currently out of order, we're sorry for the inconvienience)\n[5] DOG\n[6] DOG ");
				String hfgt =scan.next();
				if (hfgt.equals("4")){
					print("That option wasn't working, so instead you will be playing as 'DOG'");
				}else{
	print("You chose to play as 'DOG', congratulations! ");
}
// add piece in player for when you inevitably need to make multiplayer
			}

	}
