import java.util.*;
import java.util.Scanner;
class Bill extends confirm
{
	public static void payment() 
	{
		Scanner inp = new Scanner(System.in);
		Scanner np = new Scanner(System.in);
		int deposit=confirm.price/2;
		System.out.println("\n\n\n\n\n\n\t\t\t\t\t               >>  Pay Deposit <<");
		System.out.println("\n\t\t\t\t\t  ================Payment Channel===============");
		System.out.println("\t\t\t\t\t  |                                            |");
		System.out.println("\t\t\t\t\t  |    SCB 407-432212-9 -> Saranyu Siriphat    |");
		System.out.println("\t\t\t\t\t  |                                            |");
		System.out.println("\t\t\t\t\t  ==============================================");
		System.out.println("\t\t\t\t\t  |                                            |");
		System.out.println("\t\t\t\t\t  | PROMPTPAY 088-638-4158 -> Pakorn Khunleang |");
		System.out.println("\t\t\t\t\t  |                                            |");
		System.out.println("\t\t\t\t\t  ==============================================");
		System.out.println("\n\t\t\t\t\t**Pay half first and pay the rest when you enter**");
		System.out.println("\t\t\t\t\t  Your bill : "+deposit);
		System.out.print("\t\t\t\t\t  Pay and reply 'ok' :");String ok=np.nextLine();
		switch(ok)
				{
					case "ok":end();break;
					case "Ok":end();break;
					default : error.er_bill();break;
				}
	}
	public static void end() 
	{
		int passEnd;
		char typeUser;
		if(confirm.price>=7000 && confirm.price<=8000)
			{
			typeUser='F';
			if(confirm.price==7000)
				passEnd=1111;
			else
				passEnd=4444;
			}
		else if(confirm.price>=9000 && confirm.price<=11000)
			{
			typeUser='A';
			if(confirm.price==9000)
				passEnd=2222;
			else if(confirm.price==10000)
				passEnd=3333;
			else
				passEnd=5555;
			}
		else
			{
			typeUser='S';
			passEnd=6666;
			}
		System.out.println("\n\n\t\t\t\t                >> This is your membership code << ");
		System.out.println("\n\t\t\t\t\t  ==============Membership Code================");
		System.out.println("\t\t\t\t\t  |                                           |");
		System.out.println("\t\t\t\t\t  |             Username : "+typeUser+Room.id_room+"               |");
		System.out.println("\t\t\t\t\t  |             Password : "+passEnd+"               |");
		System.out.println("\t\t\t\t\t  |                                           |");
		System.out.println("\t\t\t\t\t  =============================================\n\n\n\n\n\n");
		System.out.print("\t\t\t\t\t  Go to login 'go' :");String goLog=inp.next();
				switch(goLog)
				{
					case "go": User_login.LoginSession();break;
					case "Go": User_login.LoginSession();break;
					default : error.er_bill();break;
				}
	}
}
