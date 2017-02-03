package monopoly;
import java.util.*;
public class Runner
	{
static ArrayList<Tile> board=new ArrayList<Tile>();
static Go a=new Go("Go", 0);
static ColoredSpace b=new ColoredSpace("Mediterranean Avenue", 1, 't', 60);
static Card c=new Card("Comunity Chest", 2, "CC");
static ColoredSpace d=new ColoredSpace("Baltic Avenue", 3, 't', 60);
static Tax e=new Tax("Income Tax", 4, "income");
static RailRoad f=new RailRoad("Reading Railroad", 5, 200);
static ColoredSpace g=new ColoredSpace("Oriental Avenue", 6, 'c', 100);
static Card h=new Card("Chance", 7, "chance");
static ColoredSpace i=new ColoredSpace("Vermont Avenue", 8, 'c', 100);
static ColoredSpace j=new ColoredSpace("Connecticut Avenue", 9, 'c', 120);
static Jail k=new Jail("Jail", 10);
static ColoredSpace l=new ColoredSpace("St. Charles Place", 11, 'p', 140);
static Utility m=new Utility("Electric Company", 12, 150);
static ColoredSpace n=new ColoredSpace("States Avenue", 13, 'p', 140);
static ColoredSpace o=new ColoredSpace("Virginia Avenue", 14, 'p', 160);
static RailRoad p=new RailRoad("Pennsylvania Railroad", 15, 200);
static ColoredSpace q=new ColoredSpace("St. James Place", 16, 'o', 180);
static Card r=new Card("Community Chest", 17, "CC");
static ColoredSpace s=new ColoredSpace("Tennesse Avenue", 18, 'o', 180);
static ColoredSpace t=new ColoredSpace("New York Avenue", 19, 'o', 200);
static FreeParking u=new FreeParking("Free Parking", 20);
static ColoredSpace v=new ColoredSpace("Kentucky Avenue", 21, 'r', 220);
static Card w=new Card("Chance", 22, "chance");
static ColoredSpace x=new ColoredSpace("Indiana Avenue", 23, 'r', 220);
static ColoredSpace y=new ColoredSpace("Illinois Avenue", 24, 'r', 240);
static RailRoad z=new RailRoad("BnO Railroad", 25, 200);
static ColoredSpace aa=new ColoredSpace("Atlantic Avenue", 26, 'y', 260);
static ColoredSpace ab=new ColoredSpace("Ventinor Avenue", 27, 'y', 260);
static Utility ac=new Utility("Water Works", 28, 150);
static ColoredSpace ad=new ColoredSpace("Marvin Gardens", 29, 'y', 280);
static GoToJail ae=new GoToJail("Boardwalk                            \nj.k. GO TO JAIL                                        \np.s. Have fun not collecting $200                                           \np.p.s don't drop the soap!", 30);
static ColoredSpace af=new ColoredSpace("Pacific Avenue", 31, 'g', 300);
static ColoredSpace ag=new ColoredSpace("North Carolina Avenue", 32, 'g', 300);
static Card ai=new Card("Community Chest", 33, "CC");
static ColoredSpace aj=new ColoredSpace("Pennsylvania Avenue", 34, 'g', 320);
static RailRoad ak=new RailRoad("Short Line", 35, 200);
static Card al=new Card("Chance", 36, "chance");
static ColoredSpace am=new ColoredSpace("Park Place", 37, 'b', 350);
static Tax an=new Tax("Luxury Tax", 38,"luxury");
static ColoredSpace ao=new ColoredSpace("boardwalk", 39, 'b', 400);


static Player player=new Player(null, 0, 0, 1500);

static Scanner scan=new Scanner(System.in);


static void print(String s) throws InterruptedException{
	char[] cars=s.toCharArray();
	System.out.println();
	for(char c:cars){
		System.out.print(c);
		if (c==' '){
			Thread.sleep(35);
		}
		Thread.sleep(30);
	}
}

static void play() throws InterruptedException{
	int die=(int)(Math.random()*6)+1;
	int dye=(int)(Math.random()*6)+1;
	int mo=die+dye;
	print("you are on "+board.get(player.getLocation()).getName());
	print("you rolled a "+die+" and a "+dye+" for a total of "+mo);
	player.setLocation(player.getLocation()+mo);
	if (player.getLocation()>=40){
		print("you passed go and collected $200");
		player.setMoney(player.getMoney()+200);
		player.setLocation(player.getLocation()%40);
	}
	print("you have $"+player.getMoney());
print("you currently own:");
for (int qr=0;qr<owned.size();qr++){
	print(owned.get(qr).getName());
}
	print("you then landed on "+board.get(player.getLocation()).getName());
	switch (board.get(player.getLocation()).getFind()){
	case 0:print("you wait                          \n.                   \n.                           \n.                       \nyou then decide to keep playing");break;
	case 1:print("would you like to buy the property for $"+((ColoredSpace) board.get(player.getLocation())).getPrice());
			print("[1] yes\n[2]no");
				if (scan.nextInt()==1){
					owned.add((Property) board.get(player.getLocation()));
					print("you bought it");
					player.setMoney(player.getMoney()-((ColoredSpace) board.get(player.getLocation())).getPrice());

				}	
				else {
					print("you didn't buy it");
				}
				break;
	case 2:print("all the chance and community chest cards were burned in a fire.\n Nothing was left.\nNow that I think about it it's kind of odd,\n with this being a digital game and all");break;
	case 3:if (((Tax) board.get(player.getLocation())).getType().equals("income")){
				print("you are taxed $200");
				player.setMoney(player.getMoney()-200);break;
			}
			print("you were taxxed $100");
			player.setMoney(player.getMoney()-100);break;
	case 4:		print("would you like to buy the Railroad for $"+((RailRoad) board.get(player.getLocation())).getPrice());
	print("[1] yes\n[2]no");
	if (scan.nextInt()==1){
		owned.add((Property) board.get(player.getLocation()));
		print("you bought it");
		player.setMoney(player.getMoney()-((RailRoad) board.get(player.getLocation())).getPrice());
	}	
	else {
		print("you didn't buy it");
	}
	break;
	case 5:print("you're at the jail, your not in it but just visiting.\nDon't ask me why your doing this,\nProbably philanthropy or something, who knows,\nI'm just a computer, not some rich monopolist or something");break;
	case 6:	print("would you like to buy the Utility for $"+((Utility) board.get(player.getLocation())).getPrice());
	print("[1] yes\n[2]no");
	if (scan.nextInt()==1){
		owned.add((Property) board.get(player.getLocation()));
		print("you bought it");
		player.setMoney(player.getMoney()-((Utility) board.get(player.getLocation())).getPrice());
	}	
	else {
		print("you didn't buy it");
	}
	case 7:print("if it's free, why not use it, so you do.\nYou park.                                                     \n.                                                               \n.                                                          \n.                                                   \nYou got bored, a capitalist like you doesnt have time for this.\nYou think about how you should have moved to the USSR when it was still around and been a communist.\nBut not one of the poor ones, the rich ones at th top that say they're communist, but really just in spirit");break;
	case 8:print("you roll once, it's not doubles.\nyou roll again, it's not doubles\nyou sneakily take out your weighted dice\nyou roll doubles\n you are let out of jail for free.\n You can now enjoy your gambling addiction in peace");	
			player.setLocation(20);break;
	default:print("something happened and you didn't land on the board, I'm actually pretty impressed that you were able to get here and the compiler did'nt just through an error.\nHave Fun!");break;
				
			}
	if (player.getMoney()<0){
		print("You ran out of money.\n :( \nSo Sad...\nGAME OVER");
	}
	else{play();}
	}
	
	
	
	
	
	
	
static ArrayList<Property> owned=new ArrayList<Property>();



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
				board.add(ai);
				board.add(aj);
				board.add(ak);
				board.add(al);
				board.add(am);
				board.add(an);
				board.add(ao);
				Collections.sort(board);
				Utility gi=new Utility(" ", 100, 0);
				owned.add(gi);
				print("Hello and welcome to Monopoly!\nWhich piece would you like to play as? \n[1] DOG\n[2] DOG\n[3] DOG\n[4] CAR (currently out of order, we're sorry for the inconvienience)\n[5] DOG\n[6] DOG ");
				String hfgt =scan.next();
				if (hfgt.equals("4")){
					print("That option wasn't working, so instead you will be playing as 'DOG'");
				}else{
	print("You chose to play as 'DOG', congratulations! ");
}
player.setPiece("DOG");

			
			
		










			play();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}

	}
