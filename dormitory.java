//Pakorn Khunleang 116210906078-7 Saranyu Sirirphat16210906103-3
import java.util.*;
import java.util.Scanner;
class dormitory
{
	public static void Kuti_Dormitory()
	{
		System.out.println("\n\n\n\n\n\t\t\t\t================================================================");
		System.out.println("\t\t\t\t|                                                              |");
		System.out.println("\t\t\t\t*                       Kuti  Dormitory                        *");
		System.out.println("\t\t\t\t|                                                              |");
		System.out.println("\t\t\t\t================================================================\n");
	}
	public static void main(String[] args)  
	{
		User_login member = new User_login();
		Scanner inp = new Scanner(System.in);
		Kuti_Dormitory();
		System.out.println("\t\t\t\t\t  ===================STATUS===================");
		System.out.println("\t\t\t\t\t  | 1.Member                                 |");
		System.out.println("\t\t\t\t\t  | 2.Guest                                  |");
		System.out.println("\t\t\t\t\t  ============================================");
		System.out.println("\t\t\t\t\t  Are you a member or guest? [1,2]");
		System.out.print("\t\t\t\t\t  Ans : ");int login = inp.nextInt();
		if(login==1)
			member.LoginSession();
		else if(login==2)
			Guest.menu();
	}
	public static void goWindow()  
	{
		User_login member = new User_login();
		Scanner inp = new Scanner(System.in);
		Kuti_Dormitory();
		System.out.println("\t\t\t\t\t  ===================STATUS===================");
		System.out.println("\t\t\t\t\t  | 1.Member                                 |");
		System.out.println("\t\t\t\t\t  | 2.Guest                                  |");
		System.out.println("\t\t\t\t\t  ============================================");
		System.out.println("\t\t\t\t\t  Are you a member or guest? [1,2]");
		System.out.print("\t\t\t\t\t  Ans : ");int login = inp.nextInt();
		if(login==1)
			member.LoginSession();
		else if(login==2)
			Guest.menu();
	}
}
