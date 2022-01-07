import java.util.*;
import java.util.Scanner;
class window extends User_login
{
	public static Scanner in = new Scanner(System.in);
	public static User_login ul = new User_login();
	public static Data_Room dt = new Data_Room();
	public static String type;
	public static String out_bal[]= new String[36];
    public static int floor,OB,j;
	public static void member()
	{
		switch(ul.password)
		{
			case "1111" :
				floor=1;
			    type="Fan";
				showMember();
			break;
			case "2222" :
				floor=2;
			    type="Air";
				showMember();
			break;
			case "3333" :
				floor=3;
			    type="Air";
				showMember();
			break;
			case "4444" :
				floor=4;
			    type="Fan";
				showMember();
			break;
			case "5555" :
				floor=5;
			    type="Air";
				showMember();
			break;
			case "6666" :
				floor=6;
			    type="Suite";
				showMember();
			break;
			default :break;
		}
	}
	public static void showMember() 
	{
		switch(OB)
			{
			//FLOOR 1
			case 101 : j=0;break;
			case 102 : j=1;break;
			case 103 : j=2;break;
			case 104 : j=3;break;
			case 105 : j=4;break;
			case 106 : j=5;break;
			//FLOOR 2
			case 201 : j=6;break;
			case 202 : j=7;break;
			case 203 : j=8;break;
			case 204 : j=9;break;
			case 205 : j=10;break;
			case 206 : j=11;break;
			//FLOOR 3
			case 301 : j=12;break;
			case 302 : j=13;break;
			case 303 : j=14;break;
			case 304 : j=15;break;
			case 305 : j=16;break;
			case 306 : j=17;break;
			//FLOOR 4
			case 401 : j=18;break;
			case 402 : j=19;break;
			case 403 : j=20;break;
			case 404 : j=21;break;
			case 405 : j=22;break;
			case 406 : j=23;break;
			//FLOOR 5
			case 501 : j=24;break;
			case 502 : j=25;break;
			case 503 : j=26;break;
			case 504 : j=27;break;
			case 505 : j=28;break;
			case 506 : j=29;break;
			//FLOOR 6
			case 601 : j=30;break;
			case 602 : j=31;break;
			case 603 : j=32;break;
			case 604 : j=33;break;
			case 605 : j=34;break;
			case 606 : j=35;break;
			//
			default : break;
			}
		System.out.println("\n\n\n\t\t\t\t      ___________________________________");
        System.out.println("\n\t\t\t\t\t            MEMBER   ");
		System.out.println("\t\t\t\t      ___________________________________");
		System.out.println("\n\t\t\t\t\tName   : "+Room.nameUser);
		System.out.println("\n\t\t\t\t\tRoom   : "+Room.id_room);
		System.out.println("\n\t\t\t\t\tFloor  : "+floor);
		System.out.println("\n\t\t\t\t\tType   : "+type);
		System.out.println("\n\t\t\t\t\tStatus : Member");
		System.out.println("\n\t\t\t\t\tOutstanding balance : "+out_bal[j]);
		System.out.println("\t\t\t\t      ___________________________________");
		System.out.print("\n\t\t\t\t      Back to menu or exit : ");String back = in.nextLine();
		switch(back)
		{
			case "menu": dormitory.goWindow();break;
			case "exit": System.out.println("\n\n\n\n\n\n\n\n\n\n\t\t\t\t>>>>>>>>>>EXIT<<<<<<<<<<");break;
			default :break;
		}
	}
	public static void goAdmin() 
	{
		System.out.println("\n\n\n\t\t\t\t\tHey Admin !!");
		System.out.print("\t\t\t\t\tGo to data 'ok' : ");String okAdmin = inp.nextLine();
		switch(okAdmin)
			{
			case "ok" : admin();break;
			case "Ok" : admin();break;
			default : ul.LoginSession();break;
			}
	}
	public static void admin() 
	{
		Data_Room.Fan();
		Data_Room.Air();
		Data_Room.Suite();
		System.out.println("\n\n\n\t\t\t\tHey Admin !!");
		System.out.println("\t\t\t\tWhat do you want to do?");
		System.out.println("\t\t\t\t1.Change room status");
		System.out.println("\t\t\t\t2.Report outstanding balance");
		System.out.println("\t\t\t\t3.Menu");
	    System.out.print("\t\t\t\tAns[1,2,3] : ");int change = inp.nextInt();
		if(change==1)
			change();
	    else if(change==2)
			reports();
		else if(change==3)
			dormitory.goWindow();
		else
			ul.LoginSession();
	}
	public static void change() 
	{
		System.out.print("\n\t\t\t\t\tWhich Room? : ");int room = inp.nextInt();
		System.out.println("\t\t\t\tChange to null or full");
		System.out.println("\t\t\t\t1.Change to null");
		System.out.println("\t\t\t\t2.Change to full");
		System.out.print("\t\t\t\tAns : ");int c = inp.nextInt();
		if(c==1)
		{
			switch(room)
			{
			//FLOOR 1
			case 101 : dt.status[0]="null";break;
			case 102 : dt.status[1]="null";break;
			case 103 : dt.status[2]="null";break;
			case 104 : dt.status[3]="null";break;
			case 105 : dt.status[4]="null";break;
			case 106 : dt.status[5]="null";break;
			//FLOOR 2
			case 201 : dt.status[18]="null";break;
			case 202 : dt.status[19]="null";break;
			case 203 : dt.status[20]="null";break;
			case 204 : dt.status[21]="null";break;
			case 205 : dt.status[22]="null";break;
			case 206 : dt.status[23]="null";break;
			//FLOOR 3
			case 301 : dt.status[12]="null";break;
			case 302 : dt.status[13]="null";break;
			case 303 : dt.status[14]="null";break;
			case 304 : dt.status[15]="null";break;
			case 305 : dt.status[16]="null";break;
			case 306 : dt.status[17]="null";break;
			//FLOOR 4
			case 401 : dt.status[6]="null";break;
			case 402 : dt.status[7]="null";break;
			case 403 : dt.status[8]="null";break;
			case 404 : dt.status[9]="null";break;
			case 405 : dt.status[10]="null";break;
			case 406 : dt.status[11]="null";break;
			//FLOOR 5
			case 501 : dt.status[24]="null";break;
			case 502 : dt.status[25]="null";break;
			case 503 : dt.status[26]="null";break;
			case 504 : dt.status[27]="null";break;
			case 505 : dt.status[28]="null";break;
			case 506 : dt.status[29]="null";break;
			//FLOOR 6
			case 601 : dt.status[30]="null";break;
			case 602 : dt.status[31]="null";break;
			case 603 : dt.status[32]="null";break;
			case 604 : dt.status[33]="null";break;
			case 605 : dt.status[34]="null";break;
			case 606 : dt.status[35]="null";break;
			//
			default : 
				System.out.println("\t\t\t\tRoom "+room+" is not available in the system.");
			    error.er_window();
			break;
			}
		}
		else
		{
		switch(room)
			{
			//FLOOR 1
			case 101 : dt.status[0]="full";break;
			case 102 : dt.status[1]="full";break;
			case 103 : dt.status[2]="full";break;
			case 104 : dt.status[3]="full";break;
			case 105 : dt.status[4]="full";break;
			case 106 : dt.status[5]="full";break;
			//FLOOR 2
			case 201 : dt.status[18]="full";break;
			case 202 : dt.status[19]="full";break;
			case 203 : dt.status[20]="full";break;
			case 204 : dt.status[21]="full";break;
			case 205 : dt.status[22]="full";break;
			case 206 : dt.status[23]="full";break;
			//FLOOR 3
			case 301 : dt.status[12]="full";break;
			case 302 : dt.status[13]="full";break;
			case 303 : dt.status[14]="full";break;
			case 304 : dt.status[15]="full";break;
			case 305 : dt.status[16]="full";break;
			case 306 : dt.status[17]="full";break;
			//FLOOR 4
			case 401 : dt.status[6]="full";break;
			case 402 : dt.status[7]="full";break;
			case 403 : dt.status[8]="full";break;
			case 404 : dt.status[9]="full";break;
			case 405 : dt.status[10]="full";break;
			case 406 : dt.status[11]="full";break;
			//FLOOR 5
			case 501 : dt.status[24]="full";break;
			case 502 : dt.status[25]="full";break;
			case 503 : dt.status[26]="full";break;
			case 504 : dt.status[27]="full";break;
			case 505 : dt.status[28]="full";break;
			case 506 : dt.status[29]="full";break;
			//FLOOR 6
			case 601 : dt.status[30]="full";break;
			case 602 : dt.status[31]="full";break;
			case 603 : dt.status[32]="full";break;
			case 604 : dt.status[33]="full";break;
			case 605 : dt.status[34]="full";break;
			case 606 : dt.status[35]="full";break;
			//
			default : 
				System.out.println("\t\t\t\tRoom "+room+" is not available in the system.");
			    error.er_window();
			break;
			}
		}
		System.out.println("\n\n\n\t\t\t\t      ___________________________________");
        System.out.println("\n\t\t\t\t      >>>>>>>>>>>>> SUCCESS <<<<<<<<<<<<<");
		System.out.println("\t\t\t\t      ___________________________________");
		System.out.print("\t\t\t\t\tGo to Data or Menu [1/2] :");int success = inp.nextInt();
		if(success==1)
			admin();
		else
			dormitory.goWindow();
	}
	public static void reports() 
	{
		System.out.println("\n\t\t\t\tReport outstanding balance");
		System.out.print("\t\t\t\t\tWhich Room? : ");OB = in.nextInt();
		System.out.print("\t\t\t\tReport : ");String r = in.next();
			switch(OB)
			{
			//FLOOR 1
			case 101 : out_bal[0]=r;break;
			case 102 : out_bal[1]=r;break;
			case 103 : out_bal[2]=r;break;
			case 104 : out_bal[3]=r;break;
			case 105 : out_bal[4]=r;break;
			case 106 : out_bal[5]=r;break;
			//FLOOR 2
			case 201 : out_bal[6]=r;break;
			case 202 : out_bal[7]=r;break;
			case 203 : out_bal[8]=r;break;
			case 204 : out_bal[9]=r;break;
			case 205 : out_bal[10]=r;break;
			case 206 : out_bal[11]=r;break;
			//FLOOR 3
			case 301 : out_bal[12]=r;break;
			case 302 : out_bal[13]=r;break;
			case 303 : out_bal[14]=r;break;
			case 304 : out_bal[15]=r;break;
			case 305 : out_bal[16]=r;break;
			case 306 : out_bal[17]=r;break;
			//FLOOR 4
			case 401 : out_bal[18]=r;break;
			case 402 : out_bal[19]=r;break;
			case 403 : out_bal[20]=r;break;
			case 404 : out_bal[21]=r;break;
			case 405 : out_bal[22]=r;break;
			case 406 : out_bal[23]=r;break;
			//FLOOR 5
			case 501 : out_bal[24]=r;break;
			case 502 : out_bal[25]=r;break;
			case 503 : out_bal[26]=r;break;
			case 504 : out_bal[27]=r;break;
			case 505 : out_bal[28]=r;break;
			case 506 : out_bal[29]=r;break;
			//FLOOR 6
			case 601 : out_bal[30]=r;break;
			case 602 : out_bal[31]=r;break;
			case 603 : out_bal[32]=r;break;
			case 604 : out_bal[33]=r;break;
			case 605 : out_bal[34]=r;break;
			case 606 : out_bal[35]=r;break;
			//
			default : 
				System.out.println("\t\t\t\tRoom "+OB+" is not available in the system.");
			    error.er_window();
			break;
			}
		System.out.println("\n\n\n\t\t\t\t      ___________________________________");
        System.out.println("\n\t\t\t\t      >>>>>>>>>>>>> SUCCESS <<<<<<<<<<<<<");
		System.out.println("\t\t\t\t      ___________________________________");
		System.out.print("\t\t\t\t\tGo to Data or Menu [1/2] :");int success = inp.nextInt();
		if(success==1)
			admin();
		else
			dormitory.goWindow();
	}
	}

