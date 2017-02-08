package monopoly;
import java.util.*;
public class Runner
	{
static ArrayList<Tile> board=new ArrayList<Tile>();

//base game
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
static GoToJail ae=new GoToJail("Boardwalk                            \nj.k. GO TO JAIL ", 30);
static ColoredSpace af=new ColoredSpace("Pacific Avenue", 31, 'g', 300);
static ColoredSpace ag=new ColoredSpace("North Carolina Avenue", 32, 'g', 300);
static Card ai=new Card("Community Chest", 33, "CC");
static ColoredSpace aj=new ColoredSpace("Pennsylvania Avenue", 34, 'g', 320);
static RailRoad ak=new RailRoad("Short Line", 35, 200);
static Card al=new Card("Chance", 36, "chance");
static ColoredSpace am=new ColoredSpace("Park Place", 37, 'b', 350);
static Tax an=new Tax("Luxury Tax", 38,"luxury");
static ColoredSpace ao=new ColoredSpace("boardwalk", 39, 'b', 400);


//14ers edition
static Go a2=new Go("Trailhead", 0);
static ColoredSpace b2=new ColoredSpace("Mt. Sherman", 1, 't', 60);
static Card c2=new Card("Trail Fortune", 2, "CC");
static ColoredSpace d2=new ColoredSpace("Quandrary Peak", 3, 't', 60);
static Tax e2=new Tax("CO Fourteeners Initiative", 4, "income");
static RailRoad f2=new RailRoad("Mt. Bierstadt", 5, 200);
//keep working
static ColoredSpace g2=new ColoredSpace("Oriental Avenue", 6, 'c', 100);
static Card h2=new Card("Chance", 7, "chance");
static ColoredSpace i2=new ColoredSpace("Vermont Avenue", 8, 'c', 100);
static ColoredSpace j2=new ColoredSpace("Connecticut Avenue", 9, 'c', 120);
static Jail k2=new Jail("Jail", 10);
static ColoredSpace l2=new ColoredSpace("St. Charles Place", 11, 'p', 140);
static Utility m2=new Utility("Electric Company", 12, 150);
static ColoredSpace n2=new ColoredSpace("States Avenue", 13, 'p', 140);
static ColoredSpace o2=new ColoredSpace("Virginia Avenue", 14, 'p', 160);
static RailRoad p2=new RailRoad("Pennsylvania Railroad", 15, 200);
static ColoredSpace q2=new ColoredSpace("St. James Place", 16, 'o', 180);
static Card r2=new Card("Community Chest", 17, "CC");
static ColoredSpace s2=new ColoredSpace("Tennesse Avenue", 18, 'o', 180);
static ColoredSpace t2=new ColoredSpace("New York Avenue", 19, 'o', 200);
static FreeParking u2=new FreeParking("Free Parking", 20);
static ColoredSpace v2=new ColoredSpace("Kentucky Avenue", 21, 'r', 220);
static Card w2=new Card("Chance", 22, "chance");
static ColoredSpace x2=new ColoredSpace("Indiana Avenue", 23, 'r', 220);
static ColoredSpace y2=new ColoredSpace("Illinois Avenue", 24, 'r', 240);
static RailRoad z2=new RailRoad("BnO Railroad", 25, 200);
static ColoredSpace aa2=new ColoredSpace("Atlantic Avenue", 26, 'y', 260);
static ColoredSpace ab2=new ColoredSpace("Ventinor Avenue", 27, 'y', 260);
static Utility ac2=new Utility("Water Works", 28, 150);
static ColoredSpace ad2=new ColoredSpace("Marvin Gardens", 29, 'y', 280);
static GoToJail ae2=new GoToJail("Boardwalk                            \nj.k. GO TO JAIL ", 30);
static ColoredSpace af2=new ColoredSpace("Pacific Avenue", 31, 'g', 300);
static ColoredSpace ag2=new ColoredSpace("North Carolina Avenue", 32, 'g', 300);
static Card ai2=new Card("Community Chest", 33, "CC");
static ColoredSpace aj2=new ColoredSpace("Pennsylvania Avenue", 34, 'g', 320);
static RailRoad ak2=new RailRoad("Short Line", 35, 200);
static Card al2=new Card("Chance", 36, "chance");
static ColoredSpace am2=new ColoredSpace("Park Place", 37, 'b', 350);
static Tax an2=new Tax("Luxury Tax", 38,"luxury");
static ColoredSpace ao2=new ColoredSpace("boardwalk", 39, 'b', 400);





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
		Thread.sleep(25);
	}
}

static void playBaseGame() throws InterruptedException{
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
	else{playBaseGame();}
	}
	
	//copy and edit new play() to be usable with any other board
	
	
	
	
	
static ArrayList<Property> owned=new ArrayList<Property>();



public static void main(String[] args) throws InterruptedException
			{
				// TODO Auto-generated method stub
				print("Hello and welcome to MONOPOLY\nWhich version would you like to play\n[1] Normal\n[2] Colorado 14ers");
				String ghj=scan.next();
				if (!ghj.equals("2")){
					if (!ghj.equals("1")){
						print("your answer was not valid so you will beplaying the base game");
					}
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
				print("Which piece would you like to play as? \n[1] DOG\n[2] DOG\n[3] DOG\n[4] CAR (currently out of order, we're sorry for the inconvienience)\n[5] DOG\n[6] DOG ");
				String hfgt =scan.next();
				if (hfgt.equals("4")){
					print("That option wasn't working, so instead you will be playing as 'DOG'");
				}else{
	print("You chose to play as 'DOG', congratulations! ");
}
player.setPiece("DOG");

			
			
		










			playBaseGame();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				}
				else if (ghj.equals("2")){
					board.add(a2);
					board.add(b2);
					board.add(c2);
					board.add(d2);
					board.add(e2);
					board.add(f2);
					board.add(g2);
					board.add(h2);
					board.add(i2);
					board.add(j2);
					board.add(k2);
					board.add(l2);
					board.add(m2);
					board.add(n2); 
					board.add(o2);
					board.add(p2);
					board.add(q2);
					board.add(r2);
					board.add(s2);
					board.add(t2);
					board.add(u2);
					board.add(v2);
					board.add(w2);
					board.add(x2);
					board.add(y2);
					board.add(z2);
					board.add(aa2);
					board.add(ab2);
					board.add(ac2);
					board.add(ad2);
					board.add(ae2);
					board.add(af2);
					board.add(ag2);
					board.add(ai2);
					board.add(aj2);
					board.add(ak2);
					board.add(al2);
					board.add(am2);
					board.add(an2);
					board.add(ao2);
					Collections.sort(board);
					Utility gi=new Utility(" ", 100, 0);
					print("you chose to play the 14ers version of the game, you will be playing as hiker");
					player.setPiece("HIKER");
					
					
					
					//play();
				}
			}

	}
