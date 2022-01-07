import java.util.*;
import java.util.Scanner;
class Room extends Data_Room
{
	public static Scanner inp = new Scanner(System.in);
	public static int id_room;
	public static String nameUser;
	public static Data_Room dtr = new Data_Room();
	public static void fRoom() 
	{	
		System.out.print("\n\t\t\t\t    Enter your name :");nameUser=inp.nextLine();
		Data_Room.Fan();
		System.out.println("\n\t\t\t\t    Choose the room you want");
		System.out.print("\t\t\t\t    ID_ROOM : ");id_room=inp.nextInt();
		boolean found=false;
		for(int n : dtr.fan )
		{	
			if(n == id_room)
			{
				found = true;	
			    break;
			}
		}
		if(found)
			confirm.fan();
		else
			error.er_fRoom();
	}
	public static void aRoom() 
	{	
		System.out.print("\n\t\t\t\t    Enter your name :");nameUser=inp.nextLine();
		Data_Room.Air();
		System.out.println("\n\t\t\t\t    Choose the room you want");
		System.out.print("\t\t\t\t    ID_ROOM : ");id_room=inp.nextInt();	
		boolean found=false;
		for(int n : dtr.air )
		{	
			if(n == id_room)
			{
				found = true;	
			    break;
			}
		}
		if(found)
			confirm.air();
		else
			error.er_aRoom();
	}
	public static void sRoom() 
	{	
		System.out.print("\n\t\t\t\t    Enter your name :");nameUser=inp.nextLine();
		Data_Room.Suite();
		System.out.println("\n\t\t\t\t    Choose the room you want");
		System.out.print("\t\t\t\t    ID_ROOM : ");id_room=inp.nextInt();	
		boolean found=false;
		for(int n : dtr.suite )
		{	
			if(n == id_room)
			{
				found = true;	
			    break;
			}
		}
		if(found)
			confirm.suite();
		else
			error.er_sRoom();
	}
}
