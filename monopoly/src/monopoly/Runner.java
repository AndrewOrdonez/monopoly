package monopoly;
import java.util.*;
public class Runner
	{
static void print(String s) throws InterruptedException{
	char[] cars=s.toCharArray();
	for(char c:cars){
		System.out.print(c);
		Thread.sleep(40);
	}
}
		public static void main(String[] args) throws InterruptedException
			{
				// TODO Auto-generated method stub
				Scanner scan=new Scanner(System.in);
				System.out.println("Hello and welcome to Monopoly!\nWhich piece would you like to play as? \n[1] DOG\n[2] DOG\n[3] DOG\n[4] CAR (currently out of order, we're sorry for the inconvienience)\n[5] DOG\n[6] DOG ");
String hfgt =scan.next();
if (hfgt.equals("4")){
	print("That option wasn't working, so instead you will be playing as 'DOG'");
}else{
	print("You chose to play as 'DOG', congratulations! ");
}

			}

	}
