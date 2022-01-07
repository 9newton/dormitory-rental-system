import java.util.*;
import java.util.Scanner;
class Rent_room extends Guest  
{
	public static void rent()
	{
		Scanner inp = new Scanner(System.in);
		Kuti_Dormitory();
		System.out.println("\n\n\t\t\t\t      +++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\t\t\t\t      |                                                   |");
        System.out.println("\t\t\t\t      |          >>>>>>>> Price Rate <<<<<<<<<<           |");
		System.out.println("\t\t\t\t      |                                                   |");
        System.out.println("\t\t\t\t      |       Fan Room    :   7,000-8,000 Bath/Month      |");
		System.out.println("\t\t\t\t      |                                                   |");
        System.out.println("\t\t\t\t      |       Air Room    :  9,000-11,000 Bath/Month      |");
		System.out.println("\t\t\t\t      |                                                   |");
        System.out.println("\t\t\t\t      |       Suite Room  :        15,000 Bath/Month      |");
		System.out.println("\t\t\t\t      |                                                   |");
		System.out.println("\t\t\t\t      +++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\n\n\t\t\t\t\t                 ====RENT====");
		System.out.println("\t\t\t\t\t    What kind of room are you interested in?");
		System.out.println("\t\t\t\t\t               [ fan,air,suite ]");
		System.out.print("\t\t\t\t\t  Ans : ");String room = inp.nextLine();
		switch(room)
			{
			case "fan" : Room.fRoom();break;
			case "Fan" : Room.fRoom();break;
			case "air" : Room.aRoom();break;
			case "Air" : Room.aRoom();break;
			case "suite" : Room.sRoom();break;
			case "Suite" : Room.sRoom();break;
			default : error.er_rent();break;
			}
	}
}
