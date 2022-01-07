import java.util.*;
import java.util.Scanner;
class User_login
{
	public static Scanner inp = new Scanner(System.in);
	public static User[] users = new User[37];
	public static window w = new window();
    public static String password;
	public static String username;
	public static void LoginSession()
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\t\t\t\t                      _______________________");
		System.out.println("\t\t\t\t                                             ");
		System.out.println("\t\t\t\t                               LOGIN         ");
		System.out.println("\t\t\t\t                      _______________________");
		System.out.print("\n\t\t\t\t                        Username: ");username = inp.nextLine();
		System.out.print("\t\t\t\t                        Password: ");password = inp.nextLine();
		System.out.println("\t\t\t\t                      _______________________");
		SeedUser();
		Verification();
	}
	public static void Verification()
	{
		boolean found=false;
		for(User user : users )
		{	
			if(password.equals(user.password) && username.equals(user.username))
			{
				found = true;	
			    break;
			}
		}
		if(found)
			Pass();
		else
			Fail();
	}
	public static void Pass()
	{
		switch(password)
		{
			case "1234" : w.goAdmin();break;
			default : w.member();break;
		}
	}
	public static void Fail()
	{
		System.out.println("Login Not Success");
	}
	class User 
	{
        public int userId;
        public String username;
        public String password;

		User(int paramId, String paramUsername, String paramPassword){
            userId = paramId;
            username = paramUsername;
            password = paramPassword;
		}
	}
	public static void SeedUser()
	{
		User_login db = new User_login();
		//admin
		users[0] = db.new User(1, "admin", "1234");
		//fan
        users[1] = db.new User(2, "F101", "1111");
        users[2] = db.new User(3, "F102", "1111");
        users[3] = db.new User(4, "F103", "1111");
        users[4] = db.new User(5, "F104", "1111");
		users[5] = db.new User(6, "F105", "1111");
		users[6] = db.new User(7, "F106", "1111");
		users[7] = db.new User(8, "F401", "4444");
        users[8] = db.new User(9, "F402", "4444");
        users[9] = db.new User(10, "F403", "4444");
        users[10] = db.new User(11, "F404", "4444");
		users[11] = db.new User(12, "F405", "4444");
		users[12] = db.new User(13, "F406", "4444");
		//air
		users[13] = db.new User(14, "A201", "2222");
        users[14] = db.new User(15, "A202", "2222");
        users[15] = db.new User(16, "A203", "2222");
        users[16] = db.new User(17, "A204", "2222");
		users[17] = db.new User(18, "A205", "2222");
		users[18] = db.new User(19, "A206", "2222");
		users[19] = db.new User(20, "A301", "3333");
		users[20] = db.new User(21, "A302", "3333");
        users[21] = db.new User(22, "A303", "3333");
        users[22] = db.new User(23, "A304", "3333");
        users[23] = db.new User(24, "A305", "3333");
		users[24] = db.new User(25, "A306", "3333");
		users[25] = db.new User(26, "A501", "5555");
		users[26] = db.new User(27, "A502", "5555");
		users[27] = db.new User(28, "A503", "5555");
		users[28] = db.new User(29, "A504", "5555");
		users[29] = db.new User(30, "A505", "5555");
		users[30] = db.new User(31, "A506", "5555");
        //suite
		users[31] = db.new User(32, "S601", "6666");
        users[32] = db.new User(33, "S602", "6666");
		users[33] = db.new User(34, "S603", "6666");
        users[34] = db.new User(35, "S604", "6666");
		users[35] = db.new User(36, "S605", "6666");
        users[36] = db.new User(37, "S606", "6666");
       

	}
}

