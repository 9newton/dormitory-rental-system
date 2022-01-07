import java.util.*;
import java.util.Scanner;
class confirm extends Room
{
	public static int price;
	public static String cf;
	public static Scanner CF = new Scanner(System.in);
	public static void fan() 
	{
		if(Room.id_room>100 && Room.id_room<113)
			price=7000;
		else
			price=8000;
		System.out.println("\n\n\n\n\n\t\t\t\t            ____________ >> DETAILS << ______________");
		System.out.println("\t\t\t\t           |                                         |");
		System.out.println("\t\t\t\t           |           Room : "+Room.id_room+"                    |");
		System.out.println("\t\t\t\t           |           Type : Fan                    |");
        System.out.println("\t\t\t\t           |          Price : "+price+" Bath/Month        |");
		System.out.println("\t\t\t\t           |_________________________________________|");
		System.out.println("\n\t\t\t\t    Confirm your room reservation");
		System.out.print("\t\t\t\t    Yes/No : ");cf=CF.nextLine();
		switch(cf)
			{
			case "yes" : Bill.payment();break;
			case "Yes" : Bill.payment();break;
			case "No" : Rent_room.rent();break;
			case "no" : Rent_room.rent();break;
			default : error.er_confirm();break;
			}
	}
	public static void air() 
	{
		if(Room.id_room>200 && Room.id_room<213)
			price=9000;
		else if(Room.id_room>300 && Room.id_room<313)
			price=10000;
		else
			price=11000;
		System.out.println("\n\n\n\n\n\t\t\t\t            ____________ >> DETAILS << ______________");
		System.out.println("\t\t\t\t           |                                         |");
		System.out.println("\t\t\t\t           |           Room : "+Room.id_room+"                    |");
		System.out.println("\t\t\t\t           |           Type : Air                    |");
        System.out.println("\t\t\t\t           |          Price : "+price+" Bath/Month       |");
		System.out.println("\t\t\t\t           |_________________________________________|");
		System.out.println("\n\t\t\t\t    Confirm your room reservation");
		System.out.print("\t\t\t\t    Yes/No : ");cf=CF.nextLine();
		switch(cf)
			{
			case "yes" : Bill.payment();break;
			case "Yes" : Bill.payment();break;
			case "No" : Rent_room.rent();break;
			case "no" : Rent_room.rent();break;
			default : error.er_confirm();break;
			}
	}
	public static void suite() 
	{
		price=15000;
		System.out.println("\n\n\n\n\n\t\t\t\t            ____________ >> DETAILS << ______________");
		System.out.println("\t\t\t\t           |                                         |");
		System.out.println("\t\t\t\t           |           Room : "+Room.id_room+"                    |");
		System.out.println("\t\t\t\t           |           Type : Suite                  |");
        System.out.println("\t\t\t\t           |          Price : "+price+" Bath/Month       |");
		System.out.println("\t\t\t\t           |_________________________________________|");
		System.out.println("\n\t\t\t\t    Confirm your room reservation");
		System.out.print("\t\t\t\t    Yes/No : ");cf=CF.nextLine();
		switch(cf)
			{
			case "yes" : Bill.payment();break;
			case "Yes" : Bill.payment();break;
			case "No" : Rent_room.rent();break;
			case "no" : Rent_room.rent();break;
			default : error.er_confirm();break;
			}
	}
}
