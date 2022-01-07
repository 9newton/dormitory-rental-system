import java.util.*;
import java.util.Scanner;
class Guest extends dormitory
{
	public static void menu() 
	{
		Scanner inp = new Scanner(System.in);
		Kuti_Dormitory();
		System.out.println("\t\t\t\t\t  ===================MENU====================");
		System.out.println("\t\t\t\t\t  | 1.Rent a room                            |");
		System.out.println("\t\t\t\t\t  | 2.contact for information                |");
		System.out.println("\t\t\t\t\t  ============================================");
		System.out.println("\t\t\t\t\t  What do you want to do? [1,2]");
		System.out.print("\t\t\t\t\t  Ans : ");int menu_guest = inp.nextInt();
		if(menu_guest==1)
			Rent_room.rent();
		else
			information();
	}
	public static void information() 
	{
		Scanner inp = new Scanner(System.in);
		Scanner ma = new Scanner(System.in);
		System.out.println("\n\n\n\t\t\t\t\t  =================CONTACT====================");
		System.out.println("\t\t\t\t\t  |                                          |");
		System.out.println("\t\t\t\t\t  | 1.Email                                  |");
		System.out.println("\t\t\t\t\t  | 2.Telephone Number                       |");
		System.out.println("\t\t\t\t\t  |                                          |");
		System.out.println("\t\t\t\t\t  ============================================");
		System.out.println("\t\t\t\t\t  Choose a contact [1,2]");
		System.out.print("\t\t\t\t\t  Ans : ");int ct = inp.nextInt();
		if(ct==1)
		{
			System.out.print("\n\n\n\t\t\t\t\t  Your Mail : ");String email = ma.nextLine();
			System.out.println("\t\t\t\t\t  What do you want to inquire?");
			System.out.print("\t\t\t\t\t  Ans :");String Tmail = ma.nextLine();
		    System.out.println("\n\n\t\t\t\t                     Mail : "+email+"                    ");
		    System.out.println("\t\t\t\t                      Ask : "+Tmail+"                  ");
			System.out.println("\n\t\t\t\t\t  We will reply to your email");
		    System.out.println("\t\t\t\t\t_________________________________________________");
		}
		else
		{
			System.out.println("\n\n\n\t\t\t\t\t  ====================TEL=====================");
			System.out.println("\t\t\t\t\t  |                                          |");
		    System.out.println("\t\t\t\t\t  |         02-756-5741 (Mr.Saranyu)         |");
	 	    System.out.println("\t\t\t\t\t  |         088-638-4158 (Mr.Pakorn)         |");
			System.out.println("\t\t\t\t\t  |                                          |");
	    	System.out.println("\t\t\t\t\t  ============================================");
		}
	}
}