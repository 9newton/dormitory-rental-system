import java.util.*;
import java.util.Scanner;
class error
{
	public static String again;
	public static Scanner er = new Scanner(System.in);
	public static void text_error()
	{	
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t******************ERROR*******************");
                System.out.println("\t\t\t\t\t>> The room you selected does not exist <<");
                System.out.println("\t\t\t\t\t_________________________________________");
				System.out.println("\t\t\t\t\t  Do you want to do the list again?");
	}
	public static void er_rent()
	{
		text_error();
		System.out.print("\t\t\t\t\t  Yes/No : ");again = er.nextLine();
				switch(again)
				{
					case "yes" : Rent_room.rent();break;
					case "Yes" : Rent_room.rent();break;
					case "No" : break;
					case "no" : break;
					default : er_rent();break;
				}
	}
	public static void er_fRoom()
	{
		text_error();
		System.out.print("\t\t\t\t\t  Yes/No : ");again = er.nextLine();
				switch(again)
				{
					case "yes" : Room.fRoom();break;
					case "Yes" : Room.fRoom();break;
					case "No" : break;
					case "no" : break;
					default : er_fRoom();break;
				}
	}
	public static void er_aRoom()
	{
		text_error();
		System.out.print("\t\t\t\t\t  Yes/No : ");again = er.nextLine();
				switch(again)
				{
					case "yes" : Room.aRoom();break;
					case "Yes" : Room.aRoom();break;
					case "No" : break;
					case "no" : break;
					default : er_aRoom();break;
				}
	}
	public static void er_sRoom()
	{
		text_error();
		System.out.print("\t\t\t\t\t  Yes/No : ");again = er.nextLine();
				switch(again)
				{
					case "yes" : Room.sRoom();break;
					case "Yes" : Room.sRoom();break;
					case "No" : break;
					case "no" : break;
					default : er_sRoom();break;
				}
	}
	public static void er_confirm()
	{
		text_error();
		System.out.print("\t\t\t\t\t  Yes/No : ");again = er.nextLine();
				switch(again)
				{
					case "yes" : Room.fRoom();break;
					case "Yes" : Room.fRoom();break;
					case "No" : break;
					case "no" : break;
					default : er_confirm();break;
				}
	}
	public static void er_bill()
	{
		text_error();
		System.out.print("\t\t\t\t\t  Yes/No : ");again = er.nextLine();
				switch(again)
				{
					case "yes" :Bill.payment();break;
					case "Yes" : Bill.payment();break;
					case "No" : break;
					case "no" : break;
					default : er_bill();break;
				}
	}
	public static void er_window()
	{
		System.out.println("\t\t\t\t\t  Do you want to do the list again?");
		System.out.print("\t\t\t\t\t  Yes/No : ");again = er.nextLine();
				switch(again)
				{
					case "yes" : window.goAdmin();break;
					case "Yes" : window.goAdmin();break;
					case "No" : break;
					case "no" : break;
					default : er_window();break;
				}
	}
}
