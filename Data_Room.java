import java.util.*;
import java.util.Scanner;
class Data_Room
{
	public static Scanner inp = new Scanner(System.in);
	//FAN & FLOOR
	public static int fan[]={101,102,103,104,105,106,401,402,403,404,405,406};
	public static String f_price[]={"7,000","8,000"};
	//AIR & FLOOR
	public static int air[]={201,202,203,204,205,206,301,302,303,304,305,306,501,502,503,504,505,506};
	public static String a_price[]={"9,000","10,000","11,000"};
	//AIR & FLOO
	public static int suite[]={601,602,603,604,605,606};
	public static String s_price[]={"15,000"};
	//status
	public  static String status[] = new String[36];
	public static int floor[]={1,2,3,4,5,6};
	public static void Fan() 
	{
		System.out.println("\t\t\t\t    _________________________________________________________");
		System.out.println("\t\t\t\t    |                   |                                    |");
        System.out.println("\t\t\t\t    |  Room type : FAN  |       >> Kuti  Dormitory <<        |");
		System.out.println("\t\t\t\t    |___________________|____________________________________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    | ID_ROOM |  FLOOR  |      PRICE/MONTH     |    STATUS   |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+fan[0]+"   |    "+floor[0]+"    |        "+f_price[0]+"         |     "+status[0]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+fan[1]+"   |    "+floor[0]+"    |        "+f_price[0]+"         |     "+status[1]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+fan[2]+"   |    "+floor[0]+"    |        "+f_price[0]+"         |     "+status[2]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+fan[3]+"   |    "+floor[0]+"    |        "+f_price[0]+"         |     "+status[3]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+fan[4]+"   |    "+floor[0]+"    |        "+f_price[0]+"         |     "+status[4]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+fan[5]+"   |    "+floor[0]+"    |        "+f_price[0]+"         |     "+status[5]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+fan[6]+"   |    "+floor[3]+"    |        "+f_price[1]+"         |     "+status[6]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+fan[7]+"   |    "+floor[3]+"    |        "+f_price[1]+"         |     "+status[7]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+fan[8]+"   |    "+floor[3]+"    |        "+f_price[1]+"         |     "+status[8]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+fan[9]+"   |    "+floor[3]+"    |        "+f_price[1]+"         |     "+status[9]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+fan[10]+"   |    "+floor[3]+"    |        "+f_price[1]+"         |     "+status[10]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+fan[11]+"   |    "+floor[3]+"    |        "+f_price[1]+"         |     "+status[11]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
	}
	public static void Air() 
	{
		System.out.println("\t\t\t\t    _________________________________________________________");
		System.out.println("\t\t\t\t    |                   |                                    |");
        System.out.println("\t\t\t\t    |  Room type : AIR  |       >> Kuti  Dormitory <<        |");
		System.out.println("\t\t\t\t    |___________________|____________________________________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    | ID_ROOM |  FLOOR  |      PRICE/MONTH     |    STATUS   |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+air[0]+"   |    "+floor[1]+"    |         "+a_price[0]+"        |     "+status[12]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+air[1]+"   |    "+floor[1]+"    |         "+a_price[0]+"        |     "+status[13]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+air[2]+"   |    "+floor[1]+"    |         "+a_price[0]+"        |     "+status[14]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+air[3]+"   |    "+floor[1]+"    |         "+a_price[0]+"        |     "+status[15]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+air[4]+"   |    "+floor[1]+"    |         "+a_price[0]+"        |     "+status[16]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+air[5]+"   |    "+floor[1]+"    |         "+a_price[0]+"        |     "+status[17]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+air[6]+"   |    "+floor[2]+"    |        "+a_price[1]+"        |     "+status[18]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+air[7]+"   |    "+floor[2]+"    |        "+a_price[1]+"        |     "+status[19]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+air[8]+"   |    "+floor[2]+"    |        "+a_price[1]+"        |     "+status[20]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+air[9]+"   |    "+floor[2]+"    |        "+a_price[1]+"        |     "+status[21]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+air[10]+"   |    "+floor[2]+"    |        "+a_price[1]+"        |     "+status[22]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+air[11]+"   |    "+floor[2]+"    |        "+a_price[1]+"        |     "+status[23]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+air[12]+"   |    "+floor[4]+"    |        "+a_price[2]+"        |     "+status[24]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+air[13]+"   |    "+floor[4]+"    |        "+a_price[2]+"        |     "+status[25]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+air[14]+"   |    "+floor[4]+"    |        "+a_price[2]+"        |     "+status[26]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+air[15]+"   |    "+floor[4]+"    |        "+a_price[2]+"        |     "+status[27]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+air[16]+"   |    "+floor[4]+"    |        "+a_price[2]+"        |     "+status[28]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+air[17]+"   |    "+floor[4]+"    |        "+a_price[2]+"        |     "+status[29]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
	}
	public static void Suite() 
	{
		System.out.println("\t\t\t\t    _________________________________________________________");
		System.out.println("\t\t\t\t    |                   |                                    |");
        System.out.println("\t\t\t\t    |  Room type: SUITE |       >> Kuti  Dormitory <<        |");
		System.out.println("\t\t\t\t    |___________________|____________________________________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    | ID_ROOM |  FLOOR  |      PRICE/MONTH     |    STATUS   |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+suite[0]+"   |    "+floor[5]+"    |        "+s_price[0]+"        |     "+status[30]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+suite[1]+"   |    "+floor[5]+"    |        "+s_price[0]+"        |     "+status[31]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+suite[2]+"   |    "+floor[5]+"    |        "+s_price[0]+"        |     "+status[32]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+suite[3]+"   |    "+floor[5]+"    |        "+s_price[0]+"        |     "+status[33]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
        System.out.println("\t\t\t\t    |   "+suite[4]+"   |    "+floor[5]+"    |        "+s_price[0]+"        |     "+status[34]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
		System.out.println("\t\t\t\t    |         |         |                      |             |");
		System.out.println("\t\t\t\t    |   "+suite[5]+"   |    "+floor[5]+"    |        "+s_price[0]+"        |     "+status[35]+"    |");
		System.out.println("\t\t\t\t    |_________|_________|______________________|_____________|");
	}
}
