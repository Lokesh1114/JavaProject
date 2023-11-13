import java.io.*;
import java.text.*;
import java.util.*;

class Main {
	double balance = 10000;
	static Scanner in = new Scanner(System.in);
	static int otp = 1000 + (int) (Math.random() * 8999);
	static Main obj = new Main();
	static String name = "LOKESH@SIDDULA";
	static int pin = 1234;
	private String num = "9700124578";
	private String pass = "Lokesh@123";

	void setNum(String num) {
		this.num = num;
	}

	String getNum() {
		return num;
	}

	void setPass(String pass) {
		this.pass = pass;
	}

	String getPass() {
		return pass;
	}

	void setpin(int pin) {
		this.pin = pin;
	}

	static String[] arguments = {};
	public static String Bold = "\u001B[1m";
	public static String Line = "\u001B[4m";
	public static String Font = "\u001B[3m";
	public static String BG = "\u001B[102m";
	public static String ANSI_RESET = "\u001B[0m";
	public static String ANSI_BLACK = "\u001B[30m";
	public static String ANSI_RED = "\u001B[31m";
	public static String ANSI_GREEN = "\u001B[32m";
	public static String ANSI_YELLOW = "\u001B[33m";
	public static String ANSI_BLUE = "\u001B[34m";
	public static String ANSI_PURPLE = "\u001B[35m";
	public static String ANSI_CYAN = "\u001B[36m";
	public static String ANSI_WHITE = "\u001B[37m";

	public static void main(String[] arg) {
		open();
		intro();
		System.out.printf(ANSI_RESET);
		Login();
		mainMenu();
	}

	static void mainMenu() {
		m1();
		System.out.printf(ANSI_RESET + "%70s%n",
				Bold + ANSI_BLUE + "\t\t\t* * * * * *  * \t\t " + Bold + ANSI_YELLOW + "*  * * * * * * *  \t " + Bold
						+ ANSI_GREEN + "*  * * * * * *  \t " + Bold + ANSI_PURPLE + "* * * * * * * *");
		System.out.printf(ANSI_RESET + "%20s%n",
				Bold + ANSI_BLUE + "\t\t\t*  ( $ _ $ ) * \t\t " + Bold + ANSI_YELLOW + "*  ( > . < )   *  \t " + Bold
						+ ANSI_GREEN + "*  ( 0 . 0 ) *  \t " + Bold + ANSI_PURPLE + "" + Bold + ANSI_PURPLE
						+ "*   ><(((o>   *");
		System.out.printf(ANSI_RESET + "%20s%n",
				Bold + ANSI_BLUE + "\t\t\t*    o<_>o   * \t\t " + Bold + ANSI_YELLOW + "*   -------    *  \t " + Bold
						+ ANSI_GREEN + "*  --------- *  \t " + Bold + ANSI_PURPLE + "*   -------   *");
		System.out.printf(ANSI_RESET + "%20s%n",
				Bold + ANSI_BLUE + "\t\t\t*   TO $END  * \t\t " + Bold + ANSI_YELLOW + "*  | 0 . 0 |   *  \t " + Bold
						+ ANSI_GREEN + "*  $ $ $ $ $ *  \t " + Bold + ANSI_PURPLE + "" + Bold + ANSI_PURPLE
						+ "*   } o : |   *");
		System.out.printf(ANSI_RESET + "%20s%n",
				Bold + ANSI_BLUE + "\t\t\t*    (/OR)   * \t\t " + Bold + ANSI_YELLOW + "*  ---------   *  \t " + Bold
						+ ANSI_GREEN + "*    FOR     *  \t " + Bold + ANSI_PURPLE + "*     FOR     *");
		System.out.printf(ANSI_RESET + "%20s%n",
				Bold + ANSI_BLUE + "\t\t\t*  TO FETCH  * \t\t " + Bold + ANSI_YELLOW + "*     FOR      *  \t " + Bold
						+ ANSI_GREEN + "*  #TICKET#  *  \t " + Bold + ANSI_PURPLE + "" + Bold + ANSI_PURPLE
						+ "*    FOOD &   *");
		System.out.printf(ANSI_RESET + "%20s%n",
				Bold + ANSI_BLUE + "\t\t\t*  BALANCE$  * \t\t " + Bold + ANSI_YELLOW + "*   SHOPPING   *  \t " + Bold
						+ ANSI_GREEN + "*  BOOKING   *  \t " + Bold + ANSI_PURPLE + "*  RESTAURENT *");
		System.out.printf(ANSI_RESET + "%20s%n",
				Bold + ANSI_BLUE + "\t\t\t* ->ENTER 1  * \t\t " + Bold + ANSI_YELLOW + "*  ->ENTER 2   *  \t " + Bold
						+ ANSI_GREEN + "* ->ENTER 3  *  \t " + Bold + ANSI_PURPLE + "*  ->ENTER 4  *");
		System.out.printf(ANSI_RESET + "%20s%n",
				Bold + ANSI_BLUE + "\t\t\t*            * \t\t " + Bold + ANSI_YELLOW + "*              *  \t " + Bold
						+ ANSI_GREEN + "*            *  \t " + Bold + ANSI_PURPLE + "*             *");
		System.out.printf(ANSI_RESET + "%20s%n",
				Bold + ANSI_BLUE + "\t\t\t* * * * *  * * \t\t " + Bold + ANSI_YELLOW + "* * * * * * *  *  \t " + Bold
						+ ANSI_GREEN + "* * * * * *  *  \t " + Bold + ANSI_PURPLE + "* * * * * * * *");
		System.out.println();
		System.out.println(Bold + ANSI_RED + "\t\t\t\t\t\t\t * * * * * * * * * * * * * * * * * * * * ");
		System.out.println(Bold + ANSI_RED + "\t\t\t\t\t\t\t *                                     * ");
		System.out.println(Bold + ANSI_RED + "\t\t\t\t\t\t\t *              ( .0 0. )              * ");
		System.out.println(Bold + ANSI_RED + "\t\t\t\t\t\t\t *               :(---):               * ");
		System.out.println(Bold + ANSI_RED + "\t\t\t\t\t\t\t *                                     * ");
		System.out.println(Bold + ANSI_RED + "\t\t\t\t\t\t\t *        ENTER ANY NUMBER TO EXIT     * ");
		System.out.println(Bold + ANSI_RED + "\t\t\t\t\t\t\t *                                     * ");
		System.out.println(Bold + ANSI_RED + "\t\t\t\t\t\t\t * * * * * * * * * * * * * * * * * * * * ");
		int selector = in.nextInt();
		System.out.println(Bold + ANSI_GREEN + "\t\t\t\t\tplease wait..");
		m1();
		if (selector == 1) {
			E.main(arguments);
		} else if (selector == 2) {
			Shopping.main(arguments);
		} else if (selector == 3) {
			System.out.printf("%92s%n", Line + Bold + Font + ANSI_PURPLE + "ENTER");
			System.out.println();
			System.out.printf(ANSI_RESET + "%97s%n",
					Line + Bold + Font + ANSI_BLUE + "\t\t1--->FOR HYDERABAD METRO TICKET BOOKING");
			System.out.println();
			System.out.printf(ANSI_RESET + "%97s%n",
					Line + Bold + Font + ANSI_YELLOW + "\t2--->FOR BUS TICKET BOOKING");
			System.out.println();
			System.out.printf(ANSI_RESET + "%97s%n",
					Line + Bold + Font + ANSI_YELLOW + "\t3--->FOR TRAIN TICKET BOOKING");
			System.out.println();
			System.out.printf(ANSI_RESET + "%99s%n", Line + Bold + Font + ANSI_RED + "\tANY NUMBER--->TO EXIT");
			System.out.println();
			int x = in.nextInt();
			System.out.println();
			if (x == 1) {
				MetroTicketBooking.main(arguments);
			} else if (x == 2) {
				User.main(arguments);
			} else if (x == 3) {

				Login.main(arguments);
			}

		} else if (selector == 4) {
			Restuarent.main(arguments);
		} else {
			System.out.println(Font + ANSI_CYAN + Bold + "\t\t\t\t\t---------------------------------------");
			System.out.println(Font + ANSI_GREEN + Bold + "\t\t\t\t\t*******Thank You For VISITING :)*******");
			System.out.println(Font + ANSI_CYAN + Bold + "\t\t\t\t\t---------------------------------------");
			System.exit(0);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	static void intro() {
		System.out.printf("%90s%n", Line + Bold + Font + "WELCOME TO");
		System.out.println();
		m1();
		System.out.printf(ANSI_RESET + Bold + ANSI_RED + " \t\t\t\t\t* * * * * *  *          * ");
		System.out.println();
		m1();
		System.out.printf(Bold + ANSI_RED + " \t\t\t\t\t*             *        *  ");
		System.out.println();
		m1();
		System.out.printf(Bold + ANSI_RED + " \t\t\t\t\t*              *      *   * * * *    * *    *      *");
		System.out.println();
		m1();
		System.out.printf(Bold + ANSI_RED + " \t\t\t\t\t*               *    *    *     *   *   *     *  *");
		System.out.println();
		m1();
		System.out.printf(Bold + ANSI_RED + " \t\t\t\t\t*                *  *     * * * *  * * * *      *");
		System.out.println();
		m1();
		System.out.printf(Bold + ANSI_RED + " \t\t\t\t\t* * * * * *        *      *       *       *     *");
		m1();
		System.out.println();
	}

	static void m1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

	static void open() {
		System.out.println();
		System.out.println();
		System.out.printf(ANSI_RESET + "%80s%n", Bold + ANSI_RED + "*  *  *  *  *");
		System.out.printf(ANSI_RESET + "%80s%n", Bold + ANSI_RED + "*    C V    *");
		System.out.printf(ANSI_RESET + "%80s%n", Bold + ANSI_RED + "*    ---    *");
		System.out.printf(ANSI_RESET + "%80s%n", Bold + ANSI_RED + "*   P A Y   *");
		System.out.printf(ANSI_RESET + "%80s%n", Bold + ANSI_RED + "*   -----   *");
		System.out.printf(ANSI_RESET + "%80s%n", Bold + ANSI_RED + "*    $ $    *");
		System.out.printf(ANSI_RESET + "%80s%n", Bold + ANSI_RED + "*  *  *  *  *");
		System.out.println();
		System.out.printf("%93s%n", Line + Bold + Font + ANSI_BLUE + "ENTER ANY NUMBER" + ANSI_RESET);
		int n = in.nextInt();

	}

	public static void SignIn() {
		System.out.printf(ANSI_RESET + "%85s%n",
				Bold + Font + ANSI_BLUE + Line + "\t\t\t\t@------>ENTER YOUR MOBILE NUMBER<--------@");
		System.out.println();
		String num = in.next();
		System.out.printf(ANSI_RESET + "%85s%n",
				Bold + Font + ANSI_YELLOW + Line + "\t\t\t@------>ENTER YOUR PASSWORD<----------@");
		System.out.println();
		String pass = in.next();
		System.out.println(Bold + Font + ANSI_PURPLE + "\t\t\t\t\tplease wait..");
		System.out.println();
		System.out.println();
		m1();
		if (num.equals(obj.getNum()) && pass.equals(obj.getPass())) {
			System.out.println();
			System.out.printf(ANSI_RESET + "%85s%n",
					Bold + Font + ANSI_WHITE + Line + "\t\t\t\t\t\t@---------->WELCOME " + Font + ANSI_GREEN + obj.name
							+ " " + Font + ANSI_WHITE + "<--------------@" + ANSI_RESET);
			System.out.println();
			System.out.println();

		} else {
			System.out.printf(ANSI_RESET + "%85s%n",
					Bold + Font + ANSI_RED + Line + "\t\t\t\t\t@---------->WRONG CREDENTIALS<------------@");
			System.out.println();
			System.out.println();
			System.out.printf(ANSI_RESET + "%73s%n",
					Line + Bold + Font + ANSI_WHITE + "\t\t\t\t\t\t1--->TO SEE YOUR MOBILE NUMBER & TRY AGAIN");
			System.out.println();
			System.out.println();
			System.out.printf(ANSI_RESET + "%73s%n",
					Line + Bold + Font + ANSI_PURPLE + "\t\t\t\t2--->TO RESET & TRY AGAIN");
			System.out.println();
			System.out.println();
			System.out.printf(ANSI_RESET + "%76s%n", Line + Bold + Font + ANSI_RED + "\t\t\tANY NUMBER--->TO EXIT");
			System.out.println();
			int s = in.nextInt();
			System.out.println(Bold + Font + ANSI_PURPLE + "\t\t\t\t\tplease wait..");
			System.out.println();
			System.out.println();
			m1();
			if (s == 1) {
				System.out.println(ANSI_RESET + Bold + Font + ANSI_CYAN
						+ "\t\t\t\t\t\t-----------------------------------------------");
				System.out.println(ANSI_RESET + Bold + Font + ANSI_YELLOW + "\t\t\t\t\t\t     YOUR MOBILE NUMBER---> "
						+ obj.getNum());
				System.out.println(ANSI_RESET + Bold + Font + ANSI_CYAN
						+ "\t\t\t\t\t\t-----------------------------------------------");
				System.out.println();
				SignIn();
			} else if (s == 2) {
				validate();
				int OTP = in.nextInt();
				System.out.printf(ANSI_RESET + "%80s%n", Bold + Font + ANSI_WHITE + "\tPlease Wait...");
				System.out.println();
				System.out.println();
				m1();
				if (OTP == otp) {
					System.out.printf(ANSI_RESET + "%85s%n",
							Bold + Font + ANSI_GREEN + Line + "\t\t\t\t@------>VALID OTP<--------@");
					System.out.println();
					System.out.printf(ANSI_RESET + "%85s%n",
							Bold + Font + ANSI_BLUE + Line + "\t\t\t\t@------>ENTER YOUR NEW MOBILE NUMBER<--------@");
					System.out.println();
					obj.setNum(in.next());
					System.out.printf(ANSI_RESET + "%85s%n",
							Bold + Font + ANSI_YELLOW + Line + "\t\t\t\t@------>ENTER YOUR NEW PASSWORD<----------@");
					System.out.println();
					obj.setPass(in.next());
					System.out.println(Bold + Font + ANSI_PURPLE + "\t\t\t\t\tplease wait..");
					System.out.println();
					m1();
					System.out.println(Bold + Font + ANSI_PURPLE + Line
							+ "\t\t\t\t\t\t@=====DETAILS UPDATED SUCCESSFULLY=========@");
					System.out.println();
					System.out.println();
					System.out.println(Bold + Font + ANSI_GREEN + Line
							+ "\t\t\t\t\t\t@-------------------NOW SIGN IN--------------@");
					System.out.println();
					SignIn();
				} else {
					System.out.printf(ANSI_RESET + "%85s%n",
							Bold + Font + ANSI_WHITE + Line + "\t\t\t@------>INVALID OTP<----------@");
					System.out.println();
					System.out.printf(ANSI_RESET + "%85s%n",
							Bold + Font + ANSI_WHITE + Line + "\t\t\t\tENTER 1--->TO SignIn Again 2----->EXIT");
					System.out.println();
					int k = in.nextInt();
					if (k == 1)
						SignIn();
					else {
						System.out.println();
						System.out.println(
								Font + ANSI_WHITE + Bold + "\t\t\t\t\t*******Thank You For VISITING :)*******");
						System.exit(0);
					}

				}
			} else {
				System.out.println();
				System.out.println(Font + ANSI_WHITE + Bold + "\t\t\t\t\t*******Thank You For VISITING :)*******");
				System.exit(0);
			}
		}
	}

	static void validate() {
		System.out.printf(ANSI_RESET + "%85s%n", Bold + Font + ANSI_WHITE + Line
				+ "\t\t\t\t\t@---------->ENTER YOUR REGESTERD MOBILE NUMBER<------------@");
		System.out.println();
		String num = in.next();
		System.out.println("\t\t\t\t\tplease wait..");
		System.out.println();
		m1();
		if (num.equals(obj.getNum())) {
			System.out.println();
			System.out.printf(ANSI_RESET + "%85s%n", Bold + Font + ANSI_WHITE + "\tYOUR OTP IS------->" + otp);
			System.out.println();
		} else {
			System.out.printf(ANSI_RESET + "%85s%n", Bold + Font + ANSI_RED + Line + "\t\tWRONG MOBILE NUMBER");
			System.out.println();
			System.out.printf(ANSI_RESET + "%85s%n", Bold + Font + ANSI_WHITE + Line + "\t\tENTER 1.TRY AGAIN 2.EXIT");
			int o = in.nextInt();
			if (o == 1)
				validate();
			else {
				System.out.println();
				System.out.println(Font + ANSI_WHITE + Bold + "\t\t\t\t\t*******Thank You For VISITING :)*******");
				System.exit(0);
			}
		}
	}

	static void signUp() {
		System.out.printf(ANSI_RESET + "%85s%n",
				Bold + Font + ANSI_PURPLE + Line + "\t\t\t@------>ENTER YOUR USERNAME<--------@");
		System.out.println();
		String name = in.next();
		if (name.length() >= 5 && name.length() <= 20 && name.contains("@") && !(name.contains(" "))) {
			Main.name = name;
			System.out.println();
			System.out.printf(ANSI_RESET + "%88s%n",
					Bold + Font + ANSI_GREEN + Line + "\t\t\t@------>ENTER YOUR MOBILE NUMBER<--------@");
			String num = in.next();
			if (num.length() == 10) {
				obj.setNum(num);
				System.out.println();
				System.out.printf(ANSI_RESET + "%70s%n",
						Bold + Font + ANSI_WHITE + Line + "\t\t\t\t\t@------>ENTER YOUR PASSWORD<----------@");
				System.out.println();
				String pass = in.next();
				if ((pass.length() > 5 && pass.length() <= 10) && pass.contains("@") || pass.contains("$")
						|| pass.contains("#") || pass.contains("&") || pass.contains("^") || pass.contains("%")
						|| pass.contains("!") || pass.contains("$") || pass.contains("*") && !(pass.contains(" "))) {
					obj.setPass(pass);
					System.out.println();
					System.out.println();
					System.out.printf(ANSI_RESET + "%80s%n", Bold + Font + ANSI_CYAN + "Please Wait...");
					System.out.println();
					m1();
					System.out.printf(ANSI_RESET + "%99s%n", Bold + Font + ANSI_WHITE
							+ "\t\t\t--->YOUR CREDENTIALS ADDED SUCCESSFULLY<---->NOW SIGNIN<-----");
					System.out.println();
					SignIn();
					System.out.println();
				} else {
					System.out.println();
					System.out.println(
							"\t\t(RANGE 5 TO 10 CHARACTERS WITH SPECIAL CHARACTERS(!,@,#,$,%,^,&,*) WITHOUT SPACE)Invalid Input Try Again");
					System.out.println();
					Main.signUp();
				}
			} else {
				System.out.println();
				System.out.println("\t\t\t\t\t(MUST BE 10 DIGITS)Invalid Input Try Again");
				System.out.println();
				Main.signUp();
			}

		} else {
			System.out.println();
			System.out.println("\t\t(IN BETWEEN 5 TO 20 CHARACTERS & CONTAINS '@' & NO SPACE)Invalid Input Try Again");
			System.out.println();
			Main.signUp();
		}

	}

	static void Login() {
		m1();
		System.out.println();
		System.out.printf("%92s%n", ANSI_RESET + Bold + Font + ANSI_PURPLE + "ENTER");
		System.out.println();
		System.out.printf(ANSI_RESET + "%97s%n", Line + Bold + Font + ANSI_BLUE + "1--->TO SIGNIN");
		System.out.println();
		System.out.printf(ANSI_RESET + "%97s%n", Line + Bold + Font + ANSI_YELLOW + "2--->TO SIGNUP");
		System.out.println();
		System.out.printf(ANSI_RESET + "%99s%n", Line + Bold + Font + ANSI_RED + "ANY NUMBER--->TO EXIT");
		System.out.println();
		int s = in.nextInt();
		System.out.println();
		System.out.printf(ANSI_RESET + "%80s%n", Bold + Font + ANSI_CYAN + "Please Wait...");
		System.out.println();
		m1();
		if (s == 1) {
			SignIn();
		} else if (s == 2) {
			Main.signUp();
		} else
			System.exit(0);

	}
}

class Shopping extends Main {
	static SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");

	static Date date = new Date();

	static String dt = sd.format(date);
	static Shopping Sobj = new Shopping();
	static private String phoneno = obj.getNum();
	static private int pin = Main.pin;
	static private String password = obj.getPass();
	static double ShoppingBill = 0;
	static String Sitems = "";
	static int pay = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(ANSI_RESET + ANSI_BLUE + Font + Bold
				+ "\t\t\t\t\t-----------------------------------------------------------------------------");
		System.out.println(ANSI_RESET + ANSI_YELLOW + Font + Bold
				+ "\t\t\t\t\t***____****....     Hello!! So many THINGS Waiting for You.!.!.!--****____****");
		System.out.println(ANSI_RESET + ANSI_BLUE + Font + Bold
				+ "\t\t\t\t\t-----------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t--++**--++**--++**   Please select what you want From the MENU.......@!!!  :)");
		System.out.println(ANSI_RESET + ANSI_WHITE + Font + Bold
				+ "\t\t\t\t\t-----------------------------------------------------------------------------");
		System.out.println();
		menu();
		if (ShoppingBill > 0 && pay == 0) {
			m1();
			pay();
		}
		m1();
		System.out.println();
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t........Have a Nice Day.......");
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\t******* SEE YOU AGAIN *******");
		System.out.println();
		Sitems = "";
		ShoppingBill = 0;
		mainMenu();
	}

	static void pay() {
		m1();
		System.out.println(Sitems);
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);
		System.out.println();
		System.out.println(ANSI_YELLOW + "\t\t\t\t\tBill You Made :----->" + ShoppingBill);
		System.out.println();
		double GST = ShoppingBill * 0.12;
		System.out.printf(ANSI_BLUE + "\t\t\t\t\tGST MODI MADE:---------> " + "%.2f", GST);
		System.out.println();
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\t----------------------------------------------");
		System.out.println();
		System.out.printf(ANSI_RED + "\t\t\t\t\tPAYABLE AMOUNT  : " + "%.2f", (ShoppingBill + GST));
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\t----------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\tEnter 1 to pay----------------------------:)");
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\tEnter 2 to Navigate To the menu bar-----  :)");
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\tEnter 3 to Main Menu---------------------------:)");
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\tEnter ANY NUMBER to EXIT---------------------------:)");
		System.out.println();
		int pay = sc.nextInt();
		if (pay == 1) {
			pin();

		} else if (pay == 2) {
			System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
			m1();
			menu();
		} else if (pay == 3) {
			System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
			m1();
			Sitems = "";
			ShoppingBill = 0;
			mainMenu();
		} else {
			System.out.println(ANSI_PURPLE + "\t\t\t\t\tplease wait..");
			m1();
			System.out.println(ANSI_CYAN + "\t\t\t\t\tOk You may Exit Now....{-:");
			System.exit(0);
		}
	}

	static void pin() {
		if (ShoppingBill <= obj.balance) {
			m1();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t*-*-*-*-*...Please Enter Your Pin...*-*-*-*-*");
			int PIN = sc.nextInt();
			m1();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t\tPlease Wait...");
			m1();
			if (PIN == pin) {
				obj.balance = obj.balance - ShoppingBill;
				m1();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t-*-*-*-*..You Did Payment Successfully..*-*-*-*-");
				System.out.println();
				m1();
				System.out.println(
						ANSI_BLUE + "\t\t\t\t\t--------..Balance amount in your Account-----Rs/-:" + obj.balance);
				System.out.println();
				m1();
				System.out.println(ANSI_CYAN + "\t\t\t\t\t*******Thank You For Purchasing*******");
				System.out.println();
				System.out.println();
				System.out.println();
				m1();
				System.out.println(ANSI_BLUE
						+ "\t\t\t\t\t##########################################################################");
				System.out.println(
						ANSI_YELLOW + "\t\t\t\t\t----Now You Are Redirecting to the Main Menu Of The Application----");
				System.out.println(ANSI_BLUE
						+ "\t\t\t\t\t###########################################################################");
				System.out.println("\t\t\t\t\t.......................................................................");
				System.out.println();
				System.out.println();
				System.out.println();
				Sitems = "";
				ShoppingBill = 0;
				mainMenu();
			} else {
				m1();
				m1();
				System.out.println(ANSI_RED + "\t\t\t\t\t__~~~~___Sorry Invalid Pin___~~~___");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t:::::--  To Re-Enter Your pin press 1  *-*-*-*....");
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t:::::--To Reset Your pin press 2---*-*-*-*....");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\t:::::--To Restart Shopping press 3---*-*-*-*....");
				System.out.println();
				System.out.println(ANSI_CYAN + "\t\t\t\t\t:::::--To EXIT FROM Shopping press 4---*-*-*-*....");
				System.out.println();
				System.out.println(ANSI_RED
						+ "\t\t\t\t\t---If You Enter Invalid Number Then You Will Navigate to the Exit Page---");
				System.out.println();
				int pp = sc.nextInt();
				System.out.println(ANSI_WHITE + "\t\t\t\t\tPlease Wait...");
				m1();
				if (pp == 1)
					pin();
				else if (pp == 2)
					reset();
				else if (pp == 3)
					menu();
				else if (pp == 4) {
					Sitems = "";
					ShoppingBill = 0;
					mainMenu();
				} else {
					System.out.println(ANSI_CYAN + "\t\t\t\t\tOk----You May Exit Now");
					System.exit(0);
				}
			}
		} else {
			System.out.println();
			System.out.println(ANSI_CYAN + "\t\t\t\t\tINSUFFICIENT BLANACE SHOP AGAIN ");
			System.out.println();
			ShoppingBill = 0;
			Sitems = "";
			m1();
			menu();
		}
	}

	static void reset() {
		m1();
		System.out.println(ANSI_WHITE + "\t\t\t\t\t----Enter Your Mobile Number----");
		System.out.println();
		String MN = sc.next();
		if (MN.equals(obj.getNum())) {
			int otp = 1000 + (int) (Math.random() * 8999);
			m1();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\tYour otp is...." + otp);
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\tPlease Enter OTP to Reset Your PIN");
			int OTP = sc.nextInt();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPlease Wait...");
			m1();
			System.out.println();
			if (OTP == otp) {
				System.out.println(ANSI_GREEN + "\t\t\t\t\tVALID OTP :)");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\t..||..||      To See Your PIN Press 1  !!!!");
				System.out.println();
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t!!!!!!!!     To Reset Your Pin Press 2 !!!");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t::     To Restart Shopping press 3---*-*-*-*....");
				System.out.println();
				System.out.println(ANSI_RED + "\t\t\t\t\t::     To EXIT FROM Shopping press 4---*-*-*-*....");
				System.out.println();
				System.out.println(ANSI_PURPLE
						+ "\t\t\t\t\t   --If You Enter Invalid Number Now You Will Be Navigate To The Exit Page--");
				System.out.println();
				int oo = sc.nextInt();
				System.out.println(ANSI_GREEN + "\t\t\t\t\tPlease Wait...");
				m1();
				System.out.println();
				if (oo == 1) {
					System.out.println(Sobj.getter());
					pin();
				} else if (oo == 2) {
					System.out.println(ANSI_WHITE + "\t\t\t\t\t****------   Enter New PIN   -----****");
					System.out.println();
					Sobj.setter(sc.nextInt());
					m1();
					System.out.println(ANSI_PURPLE + "\t\t\t\t\t*****   Your PIN Updated Successfully  *****");
					System.out.println();
					m1();
					System.out.println(ANSI_BLUE + "\t\t\t\t\t   ---You Have to Process The Payment Now----");
					System.out.println();
					pin();
				} else if (oo == 3) {
					Sitems = "";
					ShoppingBill = 0;
					menu();
				} else if (oo == 4) {
					Sitems = "";
					ShoppingBill = 0;
					mainMenu();
				} else {
					m1();
					System.out.println(ANSI_GREEN + "\t\t\t\t\tYou May Exit Now.....");
					System.exit(0);
				}
			} else {
				m1();
				System.out.println(ANSI_RED + "\t\t\t\t\t---~~   You Entered Invalid OTP------");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t-   To Re-genarate OTP press 1-----");
				System.out.println();
				System.out.println(ANSI_RED + "\t\t\t\t\t If You want To Exit Press Any Number--");
				int rg = sc.nextInt();
				if (rg == 1)
					reset();
				else {
					m1();
					System.out.println("\t\t\t\t\t------You May Exit Now------");
					System.exit(0);

				}

			}
		} else {
			m1();
			System.out.println(ANSI_RED + "\t\t\t\t\t*'    Invalid Mobile Number  '*");
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t  To Re-Enter Mobile Number press 1");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t::-   To Restart Shopping press 2   ---*-*-*-*....");
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t:--    To EXIT FROM Shopping press 3   ---*-*-*-*....");
			System.out.println();
			System.out.println(ANSI_PURPLE
					+ "\t\t\t\t\t--If You Enter Invalid Number Now You Will Be Navigate To The Exit Page--");
			System.out.println();
			int mm = sc.nextInt();
			if (mm == 1)
				reset();
			else if (mm == 2) {
				menu();
			} else if (mm == 3) {
				Sitems = "";
				ShoppingBill = 0;
				mainMenu();
			} else {
				m1();
				System.out.println(ANSI_RED + "\t\t\t\t\tYou May Exit Now.....");
				System.exit(0);
			}
		}
	}

	void setter(int pin1) {
		this.pin = pin1;
	}

	int getter() {
		return pin;
	}

	static void menu() {
		System.out.println(ANSI_RESET + ANSI_CYAN + Bold + Font + "\t\t\t\t\t\tEnter :**--:");
		System.out.println();
		System.out.println(ANSI_RESET + ANSI_YELLOW + Bold + Font + "\t\t\t\t\t\t-+*.+*.+*.-- 1.For Cloths...__..__ ");
		System.out.println();
		System.out.println(ANSI_RESET + ANSI_GREEN + Bold + Font + "\t\t\t\t\t\t-+*.+*.+*.-- 2 For Gadgets...__..__ ");
		System.out.println();
		System.out.println(
				ANSI_PURPLE + Bold + Font + "\t\t\t\t\t\t-+*.+*.+*.-- 3 For Home Electrical Appliances__...__..__ ");
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\t\t<~~~~~~~~ENTER ANY NUMBER TO EXIT FROM SHOPPING---->");
		System.out.println();
		int item = sc.nextInt();
		System.out.println(ANSI_GREEN + "\t\t\t\t\tPlease Wait...");
		m1();
		System.out.println();
		if (item == 1) {
			cloths();
			System.out.println(
					ANSI_CYAN + "\t\t\t\t\tIf You Want to Shop More press 1 You Will Re-Directed To the Menu bar");
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t---If You want to Stop-.WHOLE SHOPPING.- press Any Number");
			System.out.println();
			int menu1 = sc.nextInt();
			if (menu1 == 1)
				menu();
			else {
				pay();
			}
		} else if (item == 2) {
			ShoppingBill = ShoppingBill + gadgets();
			System.out.println();
			System.out.println(
					ANSI_CYAN + "\t\t\t\t\tIf You Want to Shop More press 1 You Will Re-Directed To the Menu bar");
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t---If You want to Stop-.WHOLE SHOPPING.- press Any Number");
			System.out.println();
			int menu2 = sc.nextInt();
			if (menu2 == 1)
				menu();
			else
				pay();
		} else if (item == 3) {
			ShoppingBill = ShoppingBill + homeElectricalAppliances();
			System.out.println();
			System.out.println(
					ANSI_CYAN + "\t\t\t\t\tIf You Want to Shop More press 1 You Will Re-Directed To the Menu bar");
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t---If You want to Stop-.WHOLE SHOPPING.- press Any Number");
			System.out.println();
			int menu3 = sc.nextInt();
			if (menu3 == 1)
				menu();
			else
				pay();
		} else {

			if (ShoppingBill > 0 && Sitems.length() != 0) {
				pay++;
				pay();
			} else {
				m1();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\tYOU PURCHASED NOTHING...");
				System.out.println();
				System.out.println();
			}
			Sitems = "";
			ShoppingBill = 0;
			mainMenu();
		}

	}

	static void cloths() {
		System.out.println(ANSI_YELLOW + Font + Bold + "\t\t\t\t\tPlease Enter Age : ");
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t-----------------------");
		int age = sc.nextInt();
		if (age <= 12) {
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t 1--->For Girls " + ANSI_BLUE + " 2--->For Boys");
			System.out.println();
			int GB = sc.nextInt();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tHold A Second...");
			System.out.println();
			m1();
			if (GB == 1)
				ShoppingBill = ShoppingBill + girls();
			else if (GB == 2)
				ShoppingBill = ShoppingBill + boys();
			else {
				System.out.println();
				m1();
				System.out.println(ANSI_RED + "\t\t\t\t\tYou Entered Invalid Number To shop again enter 1 ");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t----To navigate to menu bar enter any number------");
				System.out.println();
				System.out.println(ANSI_YELLOW + "\t\t\t\t\tplease wait..");
				m1();
				System.out.println();
				int invalid = sc.nextInt();
				if (invalid == 1)
					cloths();
				else
					menu();
			}
		} else {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t1--->For Women " + ANSI_BLUE + " 2 For Men");
			System.out.println();
			int WM = sc.nextInt();
			System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
			m1();
			System.out.println();
			if (WM == 1)
				ShoppingBill = ShoppingBill + women();
			else if (WM == 2)
				ShoppingBill = ShoppingBill + men();
			else {
				m1();
				System.out.println(ANSI_RED + "\t\t\t\t\t:::::You Entered Invalid Number To shop again enter 1::::)");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t-*-*-*-*-To navigate to menu bar enter any number:::::::");
				System.out.println();
				int invalid1 = sc.nextInt();
				System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
				m1();
				System.out.println();
				if (invalid1 == 1)
					cloths();
				else
					menu();
			}
		}
	}

	static double girls() {
		System.out.println(ANSI_WHITE + "\t\t\t\t\t\tEnter :)");
		System.out.println(ANSI_BLUE + "\t\t\t\t\t\t---------");
		System.out.println();
		System.out.println(ANSI_YELLOW + "\t\t\t\t\t1-->For Half-Sarees");
		System.out.println();
		System.out.println("\t\t\t\t\t2-->For Frocks");
		System.out.println();
		System.out.println("\t\t\t\t\t3-->For Jeans Set");
		System.out.println();
		int dress = sc.nextInt();
		System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
		m1();
		System.out.println();
		switch (dress) {
			case 1:
				m1();
				System.out.println(ANSI_RESET + ANSI_BLUE + Bold
						+ "\t\t\t\t\t-- -- >>>..*****..Here is Your Collection..*****..<<<-- -- ");
				System.out.println(ANSI_YELLOW + Font + Bold
						+ "\t\t\t\t\t-----------------------------------------------------------");
				System.out.println();
				System.out.println(ANSI_RED + "\t\t\t\t\tPress 1 For Red Half Saree-----------Rs/-1200 ");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\tPress 2 For Blue Half Saree----------Rs/-1400 ");
				System.out.println();
				System.out.println(ANSI_YELLOW + "\t\t\t\t\tPress 3 For Yellow Half Saree--------Rs/-1500 ");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\tPress 4 For Pink Half Saree----------Rs/-1000 ");
				System.out.println();
				int HalfSaree = sc.nextInt();
				System.out.println(ANSI_CYAN + "\t\t\t\t\tHold a Second..");
				m1();
				System.out.println();
				if (HalfSaree >= 1 && HalfSaree <= 4) {
					System.out.println(
							ANSI_RESET + ANSI_WHITE + Bold + "\t\t\t\t\tPlease Enter How Many Quantity You Want ... ");
					System.out.println();
					int hsquantity = sc.nextInt();
					System.out.println(ANSI_CYAN + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (hsquantity > 0) {
						if (HalfSaree == 1) {
							Sitems = Sitems + ANSI_RED + "\t\t\t\tGirls Red Half Saree-- -- >\t " + hsquantity
									+ " \t == == \t " + (double) (hsquantity * 1200) + " \n ";
							return 1200 * hsquantity;
						} else if (HalfSaree == 2) {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tGirls Blue Half Saree-- -- >\t " + hsquantity
									+ " \t == == \t " + (double) (hsquantity * 1400) + " \n ";
							return 1400 * hsquantity;
						} else if (HalfSaree == 3) {
							Sitems = Sitems + ANSI_YELLOW + "\t\t\t\tGirls Yellow Half Saree-- -- >\t " + hsquantity
									+ " \t == == \t " + (double) (hsquantity * 1500) + " \n ";
							return 1500 * hsquantity;
						} else {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tGirls pink Half Saree-- -- >\t " + hsquantity
									+ " \t == == \t " + (double) (hsquantity * 1000) + " \n ";
							return 1000 * hsquantity;
						}
					} else {
						m1();
						System.out.println(ANSI_PURPLE
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To SHOP again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_YELLOW
								+ "\t\t\t\t\t--~~-->>..To navigate to MENU bar Enter any number.........::::::");
						int cloths = sc.nextInt();
						System.out.println("\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (cloths == 1) {
							girls();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					m1();
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(
							ANSI_BLUE + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					System.out.println();
					int cloths1 = sc.nextInt();
					System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (cloths1 == 1) {
						girls();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 2:
				System.out.println(
						ANSI_BLUE + Font + Bold + "\t\t\t\t\t-- -- >>>****Here is Your Collection****<<< -- - ");
				System.out
						.println(ANSI_YELLOW + "\t\t\t\t\t-----------------------------------------------------------");
				System.out.println();
				System.out.println(ANSI_WHITE + Font + Bold + "\t\t\t\t\t\t\t\t\tPress ::");
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t\t1-->For Long Green Frock-- -- -- -- -- --Rs / -400 ");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t\t2-->For Long Blue Frock-- -- -- -- -- ---Rs / -300 ");
				System.out.println();
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t\t3-->For Long Yellow Frock-- -- -- -- -- -Rs / -500 ");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\t\t4-->For Long Pink Frock-- -- -- -- -- ---Rs / -600 ");
				int Frock = sc.nextInt();
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
				m1();
				System.out.println();
				if (Frock >= 1 && Frock <= 4) {
					System.out.println(
							ANSI_WHITE + Font + Bold + "\t\t\t\t\tPlease Enter How Many Quantity You Want ... ");
					int Frockquantity = sc.nextInt();
					System.out.println();
					System.out.println("\t\t\t\t\tplease wait..");
					m1();
					if (Frockquantity > 0) {
						if (Frock == 1) {
							Sitems = Sitems + ANSI_GREEN + "\t\t\t\t\tGirls Long Green Frock-- -- >  " + Frockquantity
									+ " \t == == \t " + (double) (Frockquantity * 400) + " \n ";
							return 400 * Frockquantity;
						} else if (Frock == 2) {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tGirls Long Blue Frock-- -- >  " + Frockquantity
									+ " \t == == \t " + (double) (Frockquantity * 300) + " \n ";
							return 300 * Frockquantity;
						} else if (Frock == 3) {
							Sitems = Sitems + ANSI_YELLOW + "\t\t\t\t\tGirls Long Yellow Frock-- -- >  " + Frockquantity
									+ " \t == == \t " + (double) (Frockquantity * 500) + " \n ";
							return 500 * Frockquantity;
						} else {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tGirls Long Pink Frock-- -- >  " + Frockquantity
									+ " \t == == \t " + (double) (Frockquantity * 600) + " \n ";
							return 600 * Frockquantity;
						}
					} else {
						System.out.println();
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_BLUE
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int cloths2 = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (cloths2 == 1) {
							girls();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println();
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(
							ANSI_BLUE + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					System.out.println();
					int cloths3 = sc.nextInt();
					System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (cloths3 == 1) {
						girls();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 3:
				System.out.println(
						ANSI_BLUE + Font + Bold + "\t\t\t\t\t-- -- >>>****Here is Your Collection****<<< -- -");
				System.out
						.println(ANSI_YELLOW + "\t\t\t\t\t-----------------------------------------------------------");
				System.out.println();
				System.out.println(ANSI_WHITE + Font + Bold + "\t\t\t\t\t\t\tPress ::");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t1 Blue Pant-White Top-- -- -- -- -- --Rs / -400 ");
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t2 For Black pant-Red Shirt-- -- -- -- Rs / -300 ");
				System.out.println();
				System.out.println(ANSI_CYAN + "\t\t\t\t\t3 For White pant-Blue Top-- -- -- -- -Rs / -500 ");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\t4 For White Pant-Pink Top-- -- -- -- -Rs / -600 ");
				int Jeans = sc.nextInt();
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
				m1();
				System.out.println();
				if (Jeans >= 1 && Jeans <= 4) {
					System.out.println(
							ANSI_WHITE + Font + Bold + "\t\t\t\t\tPlease Enter How Many Quantity You Want ... ");
					int Jeansquantity = sc.nextInt();
					System.out.println();
					if (Jeansquantity > 0) {
						if (Jeans == 1) {

							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tGirls Blue Pant - White Top-- -- >\t  "
									+ Jeansquantity + " \t == == \t " + (double) (Jeansquantity * 400) + " \n ";
							return 400 * Jeansquantity;
						} else if (Jeans == 2) {
							Sitems = Sitems + ANSI_GREEN + "\t\t\t\t\tGirls Black pant - Red Shirt-- -- >\t  "
									+ Jeansquantity + " \t == == \t " + (double) (Jeansquantity * 300) + " \n ";
							return 300 * Jeansquantity;
						} else if (Jeans == 3) {
							Sitems = Sitems + ANSI_CYAN + "\t\t\t\t\tGirls White pant - Blue Top-- -- >\t  "
									+ Jeansquantity + " \t == == \t " + (double) (Jeansquantity * 500) + " \n ";
							return 500 * Jeansquantity;
						} else {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tGirls White Pant - Pink Top-- -- >\t  "
									+ Jeansquantity + " \t == == \t " + (double) (Jeansquantity * 600) + " \n ";
							return 600 * Jeansquantity;
						}
					} else {
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_BLUE
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int cloths4 = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_RED + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (cloths4 == 1) {
							girls();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(ANSI_PURPLE
							+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int cloths5 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_BLUE + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (cloths5 == 1) {
						girls();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			default: {
				System.out.println(
						ANSI_RED + "\t\t\t\t\tYou Entered Invalid Value We are Re - Directing to the Menu Bar ");
				System.out.println();
				menu();
				return 0;
			}
		}
	}

	static double boys() {
		System.out.println(ANSI_BLUE + Font + Bold + "\t\t\t\t\tCheck what you want and please Enter respective value");
		System.out.println(ANSI_GREEN + "\t\t\t\t\t.......................................................");
		System.out.println();
		System.out.println(ANSI_YELLOW + Font + Bold + "\t\t\t\t\t1-----Ethnic Wear  ......................*+*");
		System.out.println();
		System.out.println("\t\t\t\t\t2-----Short Pant and T - Shirt Sets..*+*");
		System.out.println();
		System.out.println("\t\t\t\t\t3-----Jeans Set......................*+*");
		int dress = sc.nextInt();
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
		m1();
		System.out.println();
		switch (dress) {
			case 1:
				System.out.println(ANSI_BLUE + Font + Bold
						+ "\t\t\t\t\t-- -- ....****..>>>Here is Your Collection..****....<<< -- - ");
				System.out.println(
						ANSI_YELLOW + "\t\t\t\t\t---------------------------------------------------------------");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t\t\t\tPress :");
				System.out.println();
				System.out.println(ANSI_YELLOW + Font + Bold
						+ "\t\t\t\t\t1 For Gold bordered Pancha and Yellow Shirt-----Rs/-1200 ");
				System.out.println();
				System.out.println(ANSI_RED + "\t\t\t\t\t2 For Red bordered Pancha and Red Shirt---------Rs/-1400");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t3 For blue bordered Pancha and Blue Shirt-------Rs/-1500 ");
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t4 For black bordered Pancha and Black Shirt-----Rs/-1000 ");
				System.out.println();
				int panchas = sc.nextInt();
				System.out.println("\t\t\t\t\tplease wait..");
				m1();
				System.out.println();
				if (panchas >= 1 && panchas <= 4) {
					System.out.println(
							ANSI_WHITE + Font + Bold + "\t\t\t\t\tPlease Enter How Many Quantity You Want ... ");
					System.out.println();
					int panchasquantity = sc.nextInt();
					System.out.println(ANSI_PURPLE + "\t\t\t\t\tplease wait..");
					m1();
					if (panchasquantity > 0) {
						if (panchas == 1) {
							Sitems = Sitems + ANSI_YELLOW + "\t\tBoys Gold bordered Pancha and Yellow Shirt-- -- >"
									+ panchasquantity + " \t== == \t " + (double) (panchasquantity * 1200) + " \n ";
							return 1200 * panchasquantity;
						} else if (panchas == 2) {
							Sitems = Sitems + ANSI_RED + "\t\tBoys Red bordered Pancha and Red Shirt-- -- > "
									+ panchasquantity + " \t== == \t " + (double) (panchasquantity * 1400) + " \n ";
							return 1400 * panchasquantity;
						} else if (panchas == 3) {
							Sitems = Sitems + ANSI_BLUE + "\t\tBoys Blue bordered Pancha and Blue Shirt-- -- > "
									+ panchasquantity + " \t == == \t " + (double) (panchasquantity * 1500) + " \n ";
							return 1500 * panchasquantity;
						} else {
							Sitems = Sitems + ANSI_GREEN + "\t\ttBoys Black bordered Pancha and Black Shirt-- -- > "
									+ panchasquantity + " \t == == \t " + (double) (panchasquantity * 1000) + " \n ";
							return 1000 * panchasquantity;
						}
					} else {
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_WHITE
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int cloths = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_PURPLE + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (cloths == 1) {
							boys();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(
							ANSI_BLUE + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int cloths1 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_PURPLE + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (cloths1 == 1) {
						boys();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 2:
				System.out.println(ANSI_BLUE + Font + Bold
						+ "\t\t\t\t\t-- -- >>>...****..Here is Your Collection..****...<<< -- -");
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t--------..............----------............-----------");
				System.out.println();
				System.out.println(ANSI_PURPLE + Font + Bold + "\t\t\t\t\t\t\t\tpress :)");
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t1 Short Black pant and White T-Shirt------Rs/-400");
				System.out.println();
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t2 Short Black pant and Yellow T-Shirt-----Rs/-300");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t3 Short Blue pant and White T-Shirt-------Rs/-500 ");
				System.out.println();
				System.out.println(ANSI_RED + "\t\t\t\t\t4 Short White pant and Red T-Shirt--------Rs/-600");
				int Spant = sc.nextInt();
				System.out.println();
				System.out.println("\t\t\t\t\tplease wait..");
				m1();
				System.out.println();
				if (Spant >= 1 && Spant <= 4) {
					System.out.println(
							ANSI_WHITE + Font + Bold + "\t\t\t\t\tPlease Enter How Many Quantity You Want ... ");
					int Spantquantity = sc.nextInt();
					System.out.println();
					if (Spantquantity > 0) {
						if (Spant == 1) {
							Sitems = Sitems + ANSI_GREEN
									+ "\t\t\t\t\tBoys Short Black pant and White T - Shirt-- -- >\t\t " + Spantquantity
									+ " \t == == \t " + (double) (Spantquantity * 400) + " \n ";
							return 400 * Spantquantity;
						} else if (Spant == 2) {
							Sitems = Sitems + ANSI_YELLOW
									+ "\t\t\t\t\tBoys Short Black pant and Yellow T - Shirt-- -- >\t\t" + Spantquantity
									+ " \t == == \t " + (double) (Spantquantity * 300) + " \n ";
							return 300 * Spantquantity;
						} else if (Spant == 3) {
							Sitems = Sitems + ANSI_BLUE
									+ "\t\t\t\t\tBoys Short Blue pant and White T - Shirt-- -- >\t\t " + Spantquantity
									+ " \t == == \t " + (double) (Spantquantity * 500) + " \n ";
							return 500 * Spantquantity;
						} else {
							Sitems = Sitems + ANSI_RED + "\t\t\t\t\tBoys Short White pant and Red T - Shirt-- -- >\t\t "
									+ Spantquantity + " \t == == \t " + (double) (Spantquantity * 600) + " \n ";
							return 600 * Spantquantity;
						}
					} else {
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_GREEN
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int cloths2 = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (cloths2 == 1) {
							boys();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(
							ANSI_BLUE + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int cloths3 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_YELLOW + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (cloths3 == 1) {
						boys();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 3:
				System.out.println(ANSI_BLUE + Font + Bold
						+ "\t\t\t\t\t-- -- >>>...******...Here is Your Collection...******...<<< -- - ");
				System.out.println(
						ANSI_YELLOW + "\t\t\t\t\t--------------------------------------------------------------------");
				System.out.println();
				System.out.println(ANSI_PURPLE + Font + Bold + "\t\t\t\t\t\t\t\tPress  ::");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t1 For Blue Jeans-White T-Shirt ---Rs/-400 ");
				System.out.println();
				System.out.println(ANSI_RED + "\t\t\t\t\t2 For Black Jeans-Red T-Shirt ----Rs/-300 ");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t3 For White Jeans-Blue T-Shirt ---Rs/-500 ");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\t4 For White Jeans-Pink T-Shirt ---Rs/-600 ");
				int Jeans = sc.nextInt();
				if (Jeans >= 1 && Jeans <= 4) {
					System.out.println();
					System.out.println(
							ANSI_WHITE + Font + Bold + "\t\t\t\t\tPlease Enter How Many Quantity You Want ... ");
					int Jeansquantity = sc.nextInt();
					System.out.println();
					if (Jeansquantity > 0) {
						if (Jeans == 1) {
							Sitems = Sitems + ANSI_WHITE + "\t\t\t\t\tBoys Blue Jeans-White T-Shirt-- -- >\t\t "
									+ Jeansquantity + " \t == == \t " + (double) (Jeansquantity * 400) + " \n ";
							return 400 * Jeansquantity;
						} else if (Jeans == 2) {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tBoys Black Jeans-Red T-Shirt-- -- >\t\t\t "
									+ Jeansquantity + " \t == == \t " + (double) (Jeansquantity * 300) + " \n ";
							return 300 * Jeansquantity;
						} else if (Jeans == 3) {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tBoys White Jeans-Blue T-Shirt-- -- >\t\t "
									+ Jeansquantity + " \t == == \t " + (double) (Jeansquantity * 500) + " \n ";
							return 500 * Jeansquantity;
						} else {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tBoys White Jeans-Pink T-Shirt-- -- >\t\t "
									+ Jeansquantity + " \t == == \t " + (double) (Jeansquantity * 600) + " \n ";
							return 600 * Jeansquantity;
						}
					} else {
						System.out.println();
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_CYAN
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int cloths4 = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (cloths4 == 1) {
							boys();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println();
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(
							ANSI_GREEN + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int cloths5 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_PURPLE + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (cloths5 == 1) {
						boys();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			default: {
				System.out.println();
				System.out.println(
						ANSI_RED + "\t\t\t\t\tYou Entered Invalid Value We are Re - Directing to the Menu Bar ");
				System.out.println();
				menu();
				return 0;
			}
		}
	}

	static double women() {
		System.out.println();
		System.out.println(ANSI_WHITE + Font + Bold + "\t\t\t\t\t\t\t\tEnter :");
		System.out.println();
		System.out.println(ANSI_YELLOW + "\t\t\t\t\t1 For Half-Sarees");
		System.out.println();
		System.out.println("\t\t\t\t\t2 For Sarees");
		System.out.println();
		System.out.println("\t\t\t\t\t3 For Jeans Set");
		System.out.println();
		System.out.println("\t\t\t\t\t4 For Night-Wear");
		int Wdress = sc.nextInt();
		System.out.println();
		System.out.println(ANSI_PURPLE + "\t\t\t\t\tplease wait..");
		m1();
		switch (Wdress) {
			case 1:
				System.out.println();
				System.out.println(ANSI_RESET + ANSI_BLUE
						+ "\t\t\t\t\t-- -- >>>..*****..Here is Your Collection..*****..<<<-- -- ");
				System.out
						.println(ANSI_YELLOW + "\t\t\t\t\t-----------------------------------------------------------");
				System.out.println();
				System.out.println(ANSI_RED + Font + Bold + "\t\t\t\t\tPress 1 For Red Half Saree-----------Rs/-2000 ");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\tPress 2 For Blue Half Saree----------Rs/-1400 ");
				System.out.println();
				System.out.println(ANSI_YELLOW + "\t\t\t\t\tPress 3 For Yellow Half Saree--------Rs/-1500 ");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\tPress 4 For Pink Half Saree----------Rs/-1000 ");
				int WHalfSaree = sc.nextInt();
				System.out.println();
				System.out.println("\t\t\t\t\tplease wait");
				m1();
				System.out.println();
				if (WHalfSaree >= 1 && WHalfSaree <= 4) {
					System.out.println();
					System.out
							.println(ANSI_WHITE + Font + Bold + "\t\t\t\t\tPlease Enter How Many Quantity You Want...");
					int Whsquantity = sc.nextInt();
					System.out.println();
					if (Whsquantity > 0) {
						if (WHalfSaree == 1) {
							Sitems = Sitems + ANSI_RED + "\t\t\t\t\tWomens Red Half Saree-- -- >\t\t " + Whsquantity
									+ " \t == == \t " + (double) (Whsquantity * 2000) + " \n ";
							return 2000 * Whsquantity;
						} else if (WHalfSaree == 2) {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tWomens Blue Half Saree-- -- >\t\t " + Whsquantity
									+ " \t == == \t " + (double) (Whsquantity * 1400) + " \n ";
							return 1400 * Whsquantity;
						} else if (WHalfSaree == 3) {
							Sitems = Sitems + ANSI_YELLOW + "\t\t\t\t\tWomens Yellow Half Saree-- -- >\t\t "
									+ Whsquantity + " \t == == \t " + (double) (Whsquantity * 1500) + " \n ";
							return 1500 * Whsquantity;
						} else {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tWomens Pink Half Saree-- -- >\t\t " + Whsquantity
									+ " \t == == \t " + (double) (Whsquantity * 1000) + " \n ";
							return 1000 * Whsquantity;
						}
					} else {
						System.out.println();
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_YELLOW
								+ "\t\t\t\t\t--~~-->>.........To navigate to menu bar Enter any number...................::::::");
						int cloths = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_BLUE + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (cloths == 1) {
							women();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println();
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(ANSI_WHITE
							+ "\t\t\t\t\t--~~-->>............To navigate to menu bar Enter any number................::::::");
					int cloths1 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_PURPLE + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (cloths1 == 1) {
						women();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 2:
				System.out.println();
				System.out.println(ANSI_BLUE + Font + Bold
						+ "\t\t\t\t\t-- -- >>>..*****..Here is Your Collection..*****..<<<-- -- ");
				System.out
						.println(ANSI_YELLOW + "\t\t\t\t\t-----------------------------------------------------------");
				System.out.println(
						ANSI_RED + Font + Bold + Font + Bold + "\t\t\t\t\tPress 1 For Red Saree-----------Rs/-4000 ");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\tPress 2 For Blue Saree----------Rs/-1800 ");
				System.out.println();
				System.out.println(ANSI_YELLOW + "\t\t\t\t\tPress 3 For Yellow Saree--------Rs/-1500 ");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\tPress 4 For Pink Saree----------Rs/-1600 ");
				int WSaree = sc.nextInt();
				System.out.println();
				System.out.println("Please wait...");
				m1();
				System.out.println();
				if (WSaree >= 1 && WSaree <= 4) {
					System.out.println();
					System.out
							.println(ANSI_WHITE + Font + Bold + "\t\t\t\t\tPlease Enter How Many Quantity You Want...");
					int WSareequantity = sc.nextInt();
					System.out.println();
					if (WSareequantity > 0) {
						if (WSaree == 1) {
							Sitems = Sitems + ANSI_RED + "\t\t\t\t\tWomens Red Saree-- -- >\t\t " + WSareequantity
									+ " \t == == \t " + (double) (WSareequantity * 4000) + " \n ";
							return 4000 * WSareequantity;
						} else if (WSaree == 2) {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tWomens Blue Saree-- -- >\t\t " + WSareequantity
									+ " \t == == \t " + (double) (WSareequantity * 1800) + " \n ";
							return 1800 * WSareequantity;
						} else if (WSaree == 3) {
							Sitems = Sitems + ANSI_RED + "\t\t\t\t\tWomens Red Saree-- -- >\t\t " + WSareequantity
									+ " \t == == \t " + (double) (WSareequantity * 1500) + " \n ";
							return 1500 * WSareequantity;
						} else {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tWomens Pink Saree-- -- >\t\t " + WSareequantity
									+ " \t == == \t " + (double) (WSareequantity * 1600) + " \n ";
							return 1600 * WSareequantity;
						}
					} else {
						System.out.println();
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_PURPLE
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int cloths2 = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_BLUE + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (cloths2 == 1) {
							women();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println();
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(ANSI_YELLOW
							+ "\t\t\t\t\t--~~-->>.......To navigate to menu bar Enter any number.........::::::");
					int cloths3 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (cloths3 == 1) {
						women();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 3:
				System.out.println();
				System.out.println(
						ANSI_BLUE + Font + Bold + "\t\t\t\t\t-- -- >>>****Here is Your Collection****<<< -- -");
				System.out
						.println(ANSI_YELLOW + "\t\t\t\t\t-----------------------------------------------------------");
				System.out.println();
				System.out.println(ANSI_CYAN + Font + Bold + "\t\t\t\t\t\tPress ::");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t1 Blue Jeans-White Top-- -- -- -- -- --Rs / -1400 ");
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t2 For Black Jeans-Red Shirt-- -- -- -- Rs / -1300 ");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t3 For White Jeans-Blue Top-- -- -- -- -Rs / -1500 ");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\t4 For White Jeans-Pink Top-- -- -- -- -Rs / -1600 ");
				System.out.println();
				int WJeans = sc.nextInt();
				System.out.println();
				if (WJeans >= 1 && WJeans <= 4) {
					System.out.println();
					System.out
							.println(ANSI_WHITE + Font + Bold + "\t\t\t\t\tPlease Enter How Many Quantity You Want...");
					int WJeansquantity = sc.nextInt();
					System.out.println();
					if (WJeansquantity > 0) {
						if (WJeans == 1) {
							Sitems = Sitems + ANSI_WHITE + "\t\t\t\t\tWomens Blue Jeans-White Top-- -- >\t\t "
									+ WJeansquantity + " \t == == \t " + (double) (WJeansquantity * 1400) + " \n ";
							return 1400 * WJeansquantity;
						} else if (WJeans == 2) {
							Sitems = Sitems + ANSI_RED + "\t\t\t\t\tWomens Black Jeans-Red Top-- -- >\t\t "
									+ WJeansquantity + " \t == == \t " + (double) (WJeansquantity * 1300) + " \n ";
							return 1300 * WJeansquantity;
						} else if (WJeans == 3) {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tWomens White Jeans-Blue Top-- -- >\t\t "
									+ WJeansquantity + " \t == == \t " + (double) (WJeansquantity * 1500) + " \n ";
							return 1500 * WJeansquantity;
						} else {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tWomens White Jeans-Pink Top-- -- >\t\t "
									+ WJeansquantity + " \t == == \t " + (double) (WJeansquantity * 1600) + " \n ";
							return 1600 * WJeansquantity;
						}
					} else {
						System.out.println();
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_BLUE
								+ "\t\t\t\t\t--~~-->>........To navigate to menu bar Enter any number.........::::::");
						int cloths4 = sc.nextInt();
						System.out.println(ANSI_PURPLE + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (cloths4 == 1) {
							women();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println();
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(ANSI_YELLOW
							+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int cloths5 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_PURPLE + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (cloths5 == 1) {
						women();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 4:
				System.out.println();
				System.out.println(
						ANSI_BLUE + Font + Bold + "\t\t\t\t\t-- -- >>>****Here is Your Collection****<<< -- -");
				System.out
						.println(ANSI_YELLOW + "\t\t\t\t\t-----------------------------------------------------------");
				System.out.println();
				System.out.println(ANSI_GREEN + Font + Bold + "\t\t\t\t\t\t\t\tPress ::");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t1 Blue Pant-White Top-- -- -- -- -- --Rs / -2400 ");
				System.out.println();
				System.out.println(ANSI_RED + "\t\t\t\t\t2 For Black Pant-Red Top-- -- -- -- Rs / -2300 ");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t3 For White pant-Blue Top-- -- -- -- -Rs / -1500 ");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\t4 For White Pant-Pink Top-- -- -- -- -Rs / -3600 ");
				int Wnight = sc.nextInt();
				System.out.println();
				if (Wnight >= 1 && Wnight <= 4) {
					System.out.println();
					System.out
							.println(ANSI_WHITE + Font + Bold + "\t\t\t\t\tPlease Enter How Many Quantity You Want...");
					int Wnightquantity = sc.nextInt();
					if (Wnightquantity > 0) {
						if (Wnight == 1) {
							Sitems = Sitems + ANSI_WHITE + "\t\t\t\t\tWomens Night Blue Pant-White Top-- -- >\t "
									+ Wnightquantity + " \t == == \t " + (double) (Wnightquantity * 2400) + " \n ";
							return 2400 * Wnightquantity;
						} else if (Wnight == 2) {
							Sitems = Sitems + ANSI_RED + "\t\t\t\t\tWomens Night Black Pant-Red Top-- -- >\t "
									+ Wnightquantity + " \t == == \t " + (double) (Wnightquantity * 2300) + " \n ";
							return 2300 * Wnightquantity;
						} else if (Wnight == 3) {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tWomens Night White Pant-Blue Top-- -- >\t "
									+ Wnightquantity + " \t == == \t " + (double) (Wnightquantity * 1500) + " \n ";
							return 1500 * Wnightquantity;
						} else {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tWomens Night White Pant-Pink Top-- -- >\t "
									+ Wnightquantity + " \t == == \t " + (double) (Wnightquantity * 3600) + " \n ";
							return 3600 * Wnightquantity;
						}
					} else {
						System.out.println();
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_BLUE
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int cloths6 = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (cloths6 == 1) {
							women();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println();
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(
							ANSI_BLUE + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int cloths7 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_PURPLE + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (cloths7 == 1) {
						women();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			default: {
				System.out
						.println(ANSI_RED + "\t\t\t\t\tYou Entered Invalid Value We are Re-Directing to the Menu Bar");
				menu();
				return 0;
			}
		}
	}

	static double men() {
		System.out
				.println(ANSI_YELLOW + Font + Bold + "\t\t\t\t\tCheck what you want and please Enter respective value");
		System.out.println(ANSI_BLUE + "\t\t\t\t\t.......................................................");
		System.out.println();
		System.out.println(ANSI_YELLOW + "\t\t\t\t\t1-----Mens Ethnic Wear  ......................*+*");
		System.out.println();
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t2-----Short Pant and T - Shirt Sets..*+*");
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\t3-----Jeans Set......................*+*");
		int Mdress = sc.nextInt();
		System.out.println(ANSI_CYAN + "\t\t\t\t\tplease wait..");
		m1();
		System.out.println();
		switch (Mdress) {
			case 1:
				System.out.println(ANSI_BLUE + Font + Bold
						+ "\t\t\t\t\t-- -- ....****..>>>Here is Your Collection..****....<<< -- - ");
				System.out.println(
						ANSI_YELLOW + "\t\t\t\t\t---------------------------------------------------------------");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\tPress :");
				System.out.println();
				System.out.println(ANSI_YELLOW + Font + Bold
						+ "\t\t\t\t\t1 For Gold bordered Pancha and Yellow Shirt-----Rs/-2200 ");
				System.out.println();
				System.out.println(ANSI_RED + "\t\t\t\t\t2 For Red bordered Pancha and Red Shirt---------Rs/-2400");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t3 For blue bordered Pancha and Blue Shirt-------Rs/-3500 ");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t4 For black bordered Pancha and Black Shirt-----Rs/-4000 ");
				int Mpanchas = sc.nextInt();
				System.out.println();
				if (Mpanchas >= 1 && Mpanchas <= 4) {
					System.out
							.println(ANSI_WHITE + Font + Bold + "\t\t\t\t\tPlease Enter How Many Quantity You Want...");
					int Mpanchasquantity = sc.nextInt();
					if (Mpanchasquantity > 0) {
						if (Mpanchas == 1) {
							Sitems = Sitems + ANSI_YELLOW + "\t\tMens Gold bordered Pancha and Yellow Shirt-- -- >"
									+ Mpanchasquantity + " \t== == \t " + (double) (Mpanchasquantity * 2200) + " \n ";
							return 2200 * Mpanchasquantity;
						} else if (Mpanchas == 2) {
							Sitems = Sitems + ANSI_RED + "\t\tMens Red bordered Pancha and Red Shirt-- -- >"
									+ Mpanchasquantity + " \t== == \t " + (double) (Mpanchasquantity * 2400) + " \n ";
							return 2400 * Mpanchasquantity;
						} else if (Mpanchas == 3) {
							Sitems = Sitems + ANSI_BLUE + "\t\tMens Blue bordered Pancha and Blue Shirt-- -- >"
									+ Mpanchasquantity + " \t== == \t " + (double) (Mpanchasquantity * 3500) + " \n ";
							return 3500 * Mpanchasquantity;
						} else {
							Sitems = Sitems + ANSI_GREEN + "\t\tMens Black bordered Pancha and Black Shirt-- -- >"
									+ Mpanchasquantity + " \t== == \t " + (double) (Mpanchasquantity * 4000) + " \n ";
							return 4000 * Mpanchasquantity;
						}
					} else {
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_BLUE
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int cloths = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (cloths == 1) {
							men();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(ANSI_BLUE
							+ "\t\t\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int cloths1 = sc.nextInt();
					System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (cloths1 == 1) {
						men();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 2:
				System.out.println(ANSI_BLUE + Font + Bold
						+ "\t\t\t\t\t-- -- >>>...****..Here is Your Collection..****...<<< -- -");
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t--------..............----------............-----------");
				System.out.println();
				System.out.println(ANSI_GREEN + Font + Bold + "\t\t\t\t\t\t\tPress :");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t1--->Short Black pant and White T-Shirt------Rs/-1400");
				System.out.println();
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t2--->Short Black pant and Yellow T-Shirt-----Rs/-2300");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t3--->Short Blue pant and White T-Shirt-------Rs/-3500 ");
				System.out.println();
				System.out.println(ANSI_RED + "\t\t\t\t\t4--->Short White pant and Red T-Shirt--------Rs/-2600");
				int MSpant = sc.nextInt();
				System.out.println();
				if (MSpant >= 1 && MSpant <= 4) {
					System.out
							.println(ANSI_WHITE + Font + Bold + "\t\t\t\t\tPlease Enter How Many Quantity You Want...");
					int MSpantquantity = sc.nextInt();
					if (MSpantquantity > 0) {
						if (MSpant == 1) {
							Sitems = Sitems + ANSI_WHITE + "\t\t\t\t\tShort Black pant and White T-Shirt-- -- >\t\t"
									+ MSpantquantity + " \t== == \t " + (double) (MSpantquantity * 1400) + " \n ";
							return 1400 * MSpantquantity;
						} else if (MSpant == 2) {
							Sitems = Sitems + ANSI_YELLOW + "\t\t\t\t\tShort Black pant and Yellow T-Shirt-- -- >\t\t"
									+ MSpantquantity + " \t== == \t " + (double) (MSpantquantity * 1400) + " \n ";
							return 1400 * MSpantquantity;
						} else if (MSpant == 3) {
							Sitems = Sitems + ANSI_WHITE + "\t\t\t\t\tShort pant and White T-Shirt-- -- >\t\t"
									+ MSpantquantity + " \t== == \t " + (double) (MSpantquantity * 1400) + " \n ";
							return 1400 * MSpantquantity;
						} else {
							Sitems = Sitems + ANSI_GREEN + "\t\t\t\t\tShort Black pant and White T-Shirt-- -- >\t\t"
									+ MSpantquantity + " \t== == \t " + (double) (MSpantquantity * 1400) + " \n ";
							return 1400 * MSpantquantity;
						}
					} else {
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_BLUE
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int cloths2 = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_PURPLE + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (cloths2 == 1) {
							men();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(
							ANSI_BLUE + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int cloths3 = sc.nextInt();
					System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (cloths3 == 1) {
						men();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 3:
				System.out.println();
				System.out.println(ANSI_WHITE + Font + Bold
						+ "\t\t\t\t\t-- -- >>>...******...Here is Your Collection...******...<<< -- - ");
				System.out.println("\t\t\t\t\t--------------------------------------------------------------------");
				System.out.println(ANSI_YELLOW + Font + Bold + "\t\t\t\t\tPress  ::");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t1 For Blue Jeans-White T-Shirt ---Rs/-4400 ");
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t2 For Black Jeans-Red T-Shirt ----Rs/-4300 ");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t3 For White Jeans-Blue T-Shirt ---Rs/-3500 ");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\t4 For White Jeans-Pink T-Shirt ---Rs/-3600 ");
				int MJeans = sc.nextInt();
				if (MJeans >= 1 && MJeans <= 4) {
					System.out
							.println(ANSI_WHITE + Font + Bold + "\t\t\t\t\tPlease Enter How Many Quantity You Want...");
					int MJeansquantity = sc.nextInt();
					if (MJeansquantity > 0) {
						if (MJeans == 1) {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tMens Blue Jeans-White T-Shirt-- -- >\t\t"
									+ MJeansquantity + " \t== == \t " + (double) (MJeansquantity * 4400) + " \n ";
							return 4400 * MJeansquantity;
						} else if (MJeans == 2) {
							Sitems = Sitems + ANSI_RED + "\t\t\t\t\tMens Black Jeans-Red T-Shirt- -- >\t\t"
									+ MJeansquantity + " \t== == \t " + (double) (MJeansquantity * 4300) + " \n ";
							return 4300 * MJeansquantity;
						} else if (MJeans == 3) {
							Sitems = Sitems + ANSI_WHITE + "\t\t\t\t\tWhite Jeans-Blue T-Shirt-- -- >\t\t"
									+ MJeansquantity + " \t== == \t " + (double) (MJeansquantity * 3500) + " \n ";
							return 3500 * MJeansquantity;
						} else {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tMens White Jeans-Pink T-Shirt-- -- >\t\t"
									+ MJeansquantity + " \t== == \t " + (double) (MJeansquantity * 3600) + " \n ";
							return 3600 * MJeansquantity;
						}
					} else {
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_BLUE
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int cloths4 = sc.nextInt();
						System.out.println(ANSI_CYAN + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (cloths4 == 1) {
							men();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(
							ANSI_BLUE + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int cloths5 = sc.nextInt();
					System.out.println(ANSI_PURPLE + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (cloths5 == 1) {
						men();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			default: {
				System.out
						.println(ANSI_RED + "\t\t\t\t\tYou Entered Invalid Value We are Re-Directing to the Menu Bar");
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
				m1();
				System.out.println();
				menu();
				return 0;
			}
		}
	}

	static double homeElectricalAppliances() {
		System.out.println();
		System.out
				.println(ANSI_RESET + ANSI_GREEN + Bold + Font + "\t\t\t\t\t---...--..--THIS IS THE STOCK--..--..---");
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t****************************************");
		System.out.println(ANSI_BLUE + "\t\t\t\t\t----------------------------------------");
		System.out.println();
		System.out.println(ANSI_CYAN + Font + Bold + "\t\t\t\t\t\t---To Choose ENTER-:-");
		System.out.println();
		System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t--**** 1. For TVs--------------------");
		System.out.println();
		System.out.println(ANSI_YELLOW + "\t\t\t\t\t--**** 2. For Current Cookers--------");
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\t--**** 3. For Fridges----------------");
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\t--**** 4. For Current Stoves---------");
		int HEA = sc.nextInt();
		System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
		m1();
		System.out.println();
		switch (HEA) {
			case 1:
				System.out.println(ANSI_CYAN + Font + Bold + "\t\t\t\t\t---->>> Here is Your Collection <<<---");
				System.out.println(ANSI_YELLOW + Font + Bold + "\t\t\t\t\t--.*+.*+.*+.*+.*+.*+.*+.*+.*+.*+.*.--");
				System.out.println(ANSI_WHITE + "\t\t\t\t\t--------------------------------------");
				System.out.println();
				System.out.println(ANSI_RED + Bold + Font + "\t\t\t\t\t\t\t---PRESS-:-");
				System.out.println(ANSI_GREEN + "\t\t\t\t\t***-1.For Samsung Tv-----------RS/-40000");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t***-2.For Sony Tv--------------Rs/-50000");
				System.out.println();
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t***-3.For LG Tv----------------Rs/-30000");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\t***-4.For OnePlus+ Tv----------Rs/-60000");
				System.out.println();
				System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t-__...___...___...*+*+*...___...___...__-");
				int TV = sc.nextInt();
				if (TV >= 1 && TV <= 4) {
					System.out.println(
							ANSI_WHITE + Bold + Font + "\t\t\t\t\t-----Please Enter How Many Quantity You Want...");
					int TVquantity = sc.nextInt();
					if (TVquantity > 0) {
						if (TV == 1) {
							Sitems = Sitems + ANSI_GREEN + "\t\t\t\t\tSamsung TV- -- >\t" + TVquantity + " \t== == \t "
									+ (double) (TVquantity * 40000) + " \n ";
							return 40000 * TVquantity;
						} else if (TV == 2) {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tSony TV- -- >\t" + TVquantity + " \t== == \t "
									+ (double) (TVquantity * 50000) + " \n ";
							return 50000 * TVquantity;
						} else if (TV == 3) {
							Sitems = Sitems + ANSI_WHITE + "\t\t\t\t\tLG TV- -- >\t" + TVquantity + " \t== == \t "
									+ (double) (TVquantity * 30000) + " \n ";
							return 30000 * TVquantity;
						} else {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tOnePlus+ TV- -- >\t" + TVquantity + " \t== == \t "
									+ (double) (TVquantity * 60000) + " \n ";
							return 60000 * TVquantity;
						}
					} else {
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_GREEN
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int appliances = sc.nextInt();
						System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (appliances == 1) {
							ShoppingBill = ShoppingBill + homeElectricalAppliances();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(
							ANSI_CYAN + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int appliances1 = sc.nextInt();
					System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (appliances1 == 1) {
						ShoppingBill = ShoppingBill + homeElectricalAppliances();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 2:
				System.out.println(ANSI_CYAN + Bold + Font + "\t\t\t\t\t---->>> Here is Your Collection <<<---");
				System.out.println(ANSI_WHITE + "\t\t\t\t\t--.*+.*+.*+.*+.*+.*+.*+.*+.*+.*+.*.--");
				System.out.println(ANSI_PURPLE + "\t\t\t\t\t-------------------------------------------");
				System.out.println();
				System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t\t\t---PRESS-:-");
				System.out.println();
				System.out.println(ANSI_WHITE + Bold + "\t\t\t\t\t***-1.For Pigeon Cooker-----------RS/-6000");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t***-2.For Prestige Cooker---------Rs/-3000");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\t***-3.For Butterfly Cooker--------Rs/-5000");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t-__...___...___...*+*+*...___...___...__-");

				int cooker = sc.nextInt();
				if (cooker >= 1 && cooker < 4) {
					System.out
							.println(ANSI_WHITE + Bold + Font + "\t\t\t\t\tPlease Enter How Many Quantity You Want...");
					int cookerquantity = sc.nextInt();
					if (cookerquantity > 0) {
						if (cooker == 1) {
							Sitems = Sitems + ANSI_YELLOW + "\t\t\t\t\tPigeon Cooker- -- >\t" + cookerquantity
									+ " \t== == \t " + (double) (cookerquantity * 6000) + " \n ";
							return 6000 * cookerquantity;
						} else if (cooker == 2) {
							Sitems = Sitems + ANSI_GREEN + "\t\t\t\t\tPrestige Cooker- -- >\t" + cookerquantity
									+ " \t== == \t " + (double) (cookerquantity * 3000) + " \n ";
							return 3000 * cookerquantity;
						} else {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tButterfly Cooker- -- >\t" + cookerquantity
									+ " \t== == \t " + (double) (cookerquantity * 5000) + " \n ";
							return 5000 * cookerquantity;
						}
					} else {
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_CYAN
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int appliances2 = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (appliances2 == 1) {
							ShoppingBill = ShoppingBill + homeElectricalAppliances();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(ANSI_YELLOW
							+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int appliances3 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (appliances3 == 1) {
						ShoppingBill = ShoppingBill + homeElectricalAppliances();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 3:
				System.out.println(ANSI_CYAN + Bold + Font + "\t\t\t\t\t---->>> Here is Your Collection <<<---");
				System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t--.*+.*+.*+.*+.*+.*+.*+.*+.*+.*+.*.--");
				System.out.println(ANSI_WHITE + "\t\t\t\t\t-------------------------------------------");
				System.out.println();
				System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t---PRESS-:-");
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t***-1.For Blue color Haier Company Fridge------RS/-20000");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t***-2.For Black color Samsung Company----------Rs/-33000");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t***-3.For White color Whirlpool Company--------Rs/-35000");
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t***-4.For Green color Panasonic Company--------Rs/-25000");
				System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t-__...___...___...*+*+*...___...___...__-");

				int Fridge = sc.nextInt();
				if (Fridge >= 1 && Fridge <= 4) {
					System.out.println(
							ANSI_WHITE + Bold + Font + "\t\t\t\t\t---Please Enter How Many Quantity You Want...");
					int Fridgequantity = sc.nextInt();
					if (Fridgequantity > 0) {
						if (Fridge == 1) {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tBlue color Haier Company Fridge- -- >\t"
									+ Fridgequantity + " \t== == \t " + (double) (Fridgequantity * 20000) + " \n ";
							return 20000 * Fridgequantity;
						} else if (Fridge == 2) {
							Sitems = Sitems + ANSI_GREEN + "\t\t\t\t\tBlack color Samsung Company- -- >\t"
									+ Fridgequantity + " \t== == \t " + (double) (Fridgequantity * 33000) + " \n ";
							return 33000 * Fridgequantity;
						} else if (Fridge == 3) {
							Sitems = Sitems + ANSI_WHITE + "\t\t\t\t\tWhite color Whirlpool Company- -- >\t"
									+ Fridgequantity + " \t== == \t " + (double) (Fridgequantity * 35000) + " \n ";
							return 35000 * Fridgequantity;
						} else {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tGreen color Panasonic Company- -- >\t"
									+ Fridgequantity + " \t== == \t " + (double) (Fridgequantity * 25000) + " \n ";
							return 25000 * Fridgequantity;
						}
					} else {
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_BLUE
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						System.out.println();
						int appliances4 = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (appliances4 == 1) {
							ShoppingBill = ShoppingBill + homeElectricalAppliances();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(ANSI_CYAN
							+ "\t\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int appliances5 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (appliances5 == 1) {
						ShoppingBill = ShoppingBill + homeElectricalAppliances();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 4:
				System.out.println();
				System.out.println(ANSI_PURPLE + Bold + Font + "\t\t\t\t\t---->>> Here is Your Collection <<<---");
				System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t\t--.*+.*+.*+.*+.*+.*+.*+.*+.*+.*+.*.--");
				System.out.println(ANSI_WHITE + "\t\t\t\t\t-------------------------------------------");
				System.out.println();
				System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t\t---PRESS-:-");
				System.out.println();
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t***-1.Stove From  CASA APPLIANCESS---------RS/-6000");
				System.out.println();
				System.out.println(ANSI_CYAN + "\t\t\t\t\t***-2.Stove From PHILIPS Viva Collection---Rs/-3000");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t***-3 Stove From Prestige------------------Rs/-5000");
				System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t-__...___...___...*+*+*...___...___...__-");
				int Stove = sc.nextInt();
				System.out.println();
				if (Stove >= 1 && Stove < 3) {
					System.out
							.println(ANSI_WHITE + Bold + Font + "\t\t\t\t\tPlease Enter How Many Quantity You Want...");
					int Stovequantity = sc.nextInt();
					if (Stovequantity > 0) {
						if (Stove == 1) {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tStove From  CASA APPLIANCESS- -- >\t"
									+ Stovequantity + " \t== == \t " + (double) (Stovequantity * 6000) + " \n ";
							return 6000 * Stovequantity;
						} else if (Stove == 2) {
							Sitems = Sitems + ANSI_YELLOW + "\t\t\t\t\tStove From  CASA APPLIANCESS- -- >\t"
									+ Stovequantity + " \t== == \t " + (double) (Stovequantity * 3000) + " \n ";
							return 3000 * Stovequantity;
						} else {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tStove From  CASA APPLIANCESS- -- >\t"
									+ Stovequantity + " \t== == \t " + (double) (Stovequantity * 5000) + " \n ";
							return 5000 * Stovequantity;
						}
					} else {
						System.out.println();
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_GREEN
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int appliances6 = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_YELLOW + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (appliances6 == 1) {
							ShoppingBill = ShoppingBill + homeElectricalAppliances();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(
							ANSI_GREEN + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int appliances7 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_YELLOW + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (appliances7 == 1) {
						ShoppingBill = ShoppingBill + homeElectricalAppliances();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			default: {
				System.out.println(ANSI_RED
						+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
				System.out.println();
				System.out.println(
						ANSI_GREEN + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
				int homeapp = sc.nextInt();
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\tplease wait..");
				m1();
				System.out.println();
				if (homeapp == 1) {
					ShoppingBill = ShoppingBill + homeElectricalAppliances();
					return 0;
				} else {
					menu();
					return 0;
				}
			}
		}
	}

	static double gadgets() {
		System.out.println();
		System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t---->>> THIS IS THE STOCK <<<---");
		System.out.println(ANSI_WHITE + Bold + Font + "\t\t\t\t\t--.*+.*+.*+.*+.*+.*+.*+.*+.*+.*+.*.--");
		System.out.println(ANSI_BLUE + "\t\t\t\t\t-------------------------------------------");
		System.out.println(ANSI_PURPLE + Bold + Font + "\t\t\t\t\t---To Choose Enter-:-");
		System.out.println();
		System.out.println(ANSI_YELLOW + "\t\t\t\t\t***-    1.Mobiles...........");
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\t***-    2.Bluetooths........");
		System.out.println();
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t***-    3.SmartWatchs.......");
		System.out.println();
		System.out.println(ANSI_CYAN + "\t\t\t\t\t***-    4.Laptops............");
		System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t-__...___...___...*+*+*...___...___...__-");
		int gadgets = sc.nextInt();
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
		m1();
		System.out.println();
		switch (gadgets) {
			case 1:
				System.out.println();
				System.out.println(ANSI_PURPLE + Bold + Font + "\t\t\t\t\t---->>> Here is Your Collection <<<---");
				System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t--.*+.*+.*+.*+.*+.*+.*+.*+.*+.*+.*.--");
				System.out.println(ANSI_WHITE + "\t\t\t\t\t-------------------------------------------");
				System.out.println();
				System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t\t\t---PRESS-:-");
				System.out.println();
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t***-1.For MI---------RS/-16000");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t***-2.For Oppo-------Rs/-23000");
				System.out.println();
				System.out.println(ANSI_CYAN + "\t\t\t\t\t***-3.For Vivo-------Rs/-25000");
				System.out.println();
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t***-4.For Oneplus+---Rs/-20000");
				System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t-__...___...___...*+*+*...___...___...__-");
				int Mobile = sc.nextInt();
				System.out.println();
				if (Mobile >= 1 && Mobile <= 4) {
					System.out
							.println(ANSI_WHITE + Bold + Font + "\t\t\t\t\tPlease Enter How Many Quantity You Want...");
					System.out.println();
					int Mobilequantity = sc.nextInt();
					if (Mobilequantity > 0) {
						if (Mobile == 1) {
							Sitems = Sitems + ANSI_YELLOW + "\t\t\t\t\tMI Mobile- -- >\t" + Mobilequantity
									+ " \t== == \t " + (double) (Mobilequantity * 16000) + " \n ";
							return 16000 * Mobilequantity;
						} else if (Mobile == 2) {
							Sitems = Sitems + ANSI_CYAN + "\t\t\t\t\tOppo Mobile- -- >\t" + Mobilequantity
									+ " \t== == \t " + (double) (Mobilequantity * 23000) + " \n ";
							return 23000 * Mobilequantity;
						} else if (Mobile == 3) {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tVivo Mobile- -- >\t" + Mobilequantity
									+ " \t== == \t " + (double) (Mobilequantity * 25000) + " \n ";
							return 25000 * Mobilequantity;
						} else {
							Sitems = Sitems + ANSI_RED + "\t\t\t\t\tOneplus+ Mobile- -- >\t" + Mobilequantity
									+ " \t== == \t " + (double) (Mobilequantity * 20000) + " \n ";
							return 20000 * Mobilequantity;
						}
					} else {
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_BLUE
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int gadgetcall = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_YELLOW + "\t\t\t\t\tplease wait..");
						m1();
						if (gadgetcall == 1) {
							ShoppingBill = ShoppingBill + gadgets();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(
							ANSI_GREEN + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int gadgetcall1 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_BLUE + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (gadgetcall1 == 1) {
						ShoppingBill = ShoppingBill + gadgets();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 2:
				System.out.println(ANSI_RED + Bold + Font + "\t\t\t\t\t---->>> Here is Your Collection <<<---");
				System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t--.*+.*+.*+.*+.*+.*+.*+.*+.*+.*+.*.--");
				System.out.println(ANSI_WHITE + "\t\t\t\t\t-------------------------------------------");
				System.out.println();
				System.out.println(ANSI_PURPLE + Bold + Font + "\t\t\t\t\t\t\t\t---PRESS-:-");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t***-1.For PTrons-----------Rs/-2300");
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t***-2.For Boat Airdopes----Rs/-3500");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t***-3.For Oneplus+---------Rs/-2000");
				System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t-__...___...___...*+*+*...___...___...__-");
				int Bluetooth = sc.nextInt();
				System.out.println();
				if (Bluetooth >= 1 && Bluetooth < 4) {
					System.out.println(
							ANSI_WHITE + Bold + Font + "\t\t\t\t\t\tPlease Enter How Many Quantity You Want...");
					int Bluetoothquantity = sc.nextInt();
					if (Bluetoothquantity > 0) {
						if (Bluetooth == 1) {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tPTrons- -- >\t" + Bluetoothquantity
									+ " \t== == \t " + (double) (Bluetoothquantity * 2300) + " \n ";
							return 2300 * Bluetoothquantity;
						} else if (Bluetooth == 2) {
							Sitems = Sitems + ANSI_RED + "\t\t\t\t\tBoat Airdopes- -- >\t" + Bluetoothquantity
									+ " \t== == \t " + (double) (Bluetoothquantity * 3500) + " \n ";
							return 3500 * Bluetoothquantity;
						} else {
							Sitems = Sitems + ANSI_YELLOW + "\t\t\t\t\tOneplus+ Bluetooth- -- >\t" + Bluetoothquantity
									+ " \t== == \t " + (double) (Bluetoothquantity * 2000) + " \n ";
							return 2000 * Bluetoothquantity;
						}
					} else {
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_BLUE
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int gadgetcall2 = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_YELLOW + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (gadgetcall2 == 1) {
							ShoppingBill = ShoppingBill + gadgets();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(
							ANSI_GREEN + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int gadgetcall3 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_YELLOW + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (gadgetcall3 == 1) {
						gadgets();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 3:
				System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t---->>> Here is Your Collection <<<---");
				System.out.println(ANSI_YELLOW + Bold + Font + "\t\t\t\t\t--.*+.*+.*+.*+.*+.*+.*+.*+.*+.*+.*.--");
				System.out.println(ANSI_WHITE + "\t\t\t\t\t-------------------------------------------");
				System.out.println();
				System.out.println(ANSI_PURPLE + Bold + Font + "\t\t\t\t\t---PRESS-:-");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t***-1.For Boat Xtend Smart Watch------Rs/-5000");
				System.out.println();
				System.out.println(ANSI_RED + "\t\t\t\t\t***-2.For Samsung Smart Watch---------Rs/-3500");
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\t***-3.For Titan Smart 2---------------Rs/-4000");
				System.out.println(ANSI_YELLOW + Bold + Font + "\t\t\t\t\t-__...___...___...*+*+*...___...___...__-");
				int Watch = sc.nextInt();
				System.out.println();
				if (Watch >= 1 && Watch < 4) {
					System.out
							.println(ANSI_WHITE + Bold + Font + "\t\t\t\t\tPlease Enter How Many Quantity You Want...");
					int Watchquantity = sc.nextInt();
					if (Watchquantity > 0) {
						if (Watch == 1) {
							Sitems = Sitems + ANSI_BLUE + "\t\t\t\t\tBoat Xtend Smart Watch- -- >\t" + Watchquantity
									+ " \t== == \t " + (double) (Watchquantity * 5000) + " \n ";
							return 5000 * Watchquantity;
						} else if (Watch == 2) {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tSamsung Smart Watch- -- >\t" + Watchquantity
									+ " \t== == \t " + (double) (Watchquantity * 3500) + " \n ";
							return 3500 * Watchquantity;
						} else {
							Sitems = Sitems + ANSI_GREEN + "\t\t\t\t\tTitan Smart 2- -- >\t" + Watchquantity
									+ " \t== == \t " + (double) (Watchquantity * 4000) + " \n ";
							return 4000 * Watchquantity;
						}
					} else {
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_GREEN
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int gadgetcall4 = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_PURPLE + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (gadgetcall4 == 1) {
							ShoppingBill = ShoppingBill + gadgets();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(
							ANSI_CYAN + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int gadgetcall5 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (gadgetcall5 == 1) {
						ShoppingBill = ShoppingBill + gadgets();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			case 4:
				System.out.println(ANSI_WHITE + Bold + Font + "\t\t\t\t\t---->>> Here is Your Collection <<<---");
				System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t--.*+.*+.*+.*+.*+.*+.*+.*+.*+.*+.*.--");
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t-------------------------------------------");
				System.out.println();
				System.out.println(ANSI_PURPLE + Bold + Font + "\t\t\t\t\t\t\t\t---PRESS-:-");
				System.out.println();
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t***-1.For DELL------Rs/-50000");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t***-2.For HP--------Rs/-55000");
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t***-3.Lenovo--------Rs/-64000");
				System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t-__...___...___...*+*+*...___...___...__-");
				int Laptop = sc.nextInt();
				System.out.println();
				if (Laptop >= 1 && Laptop < 4) {
					System.out
							.println(ANSI_WHITE + Bold + Font + "\t\t\t\t\tPlease Enter How Many Quantity You Want...");
					int Laptopquantity = sc.nextInt();
					if (Laptopquantity > 0) {
						if (Laptop == 1) {
							Sitems = Sitems + ANSI_PURPLE + "\t\t\t\t\tDELL Laptop- -- >\t" + Laptopquantity
									+ " \t== == \t " + (double) (Laptopquantity * 50000) + " \n ";
							return 50000 * Laptopquantity;
						} else if (Laptop == 2) {
							Sitems = Sitems + "\t\t\t\t\tHP Laptop- -- >\t" + Laptopquantity + " \t== == \t "
									+ (double) (Laptopquantity * 55000) + " \n ";
							return 55000 * Laptopquantity;
						} else {
							Sitems = Sitems + "\t\t\t\t\tLenovo Laptop- -- >\t" + Laptopquantity + " \t== == \t "
									+ (double) (Laptopquantity * 64000) + " \n ";
							return 64000 * Laptopquantity;
						}
					} else {
						System.out.println();
						System.out.println(ANSI_RED
								+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
						System.out.println();
						System.out.println(ANSI_GREEN
								+ "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
						int gadgetcall6 = sc.nextInt();
						System.out.println();
						System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
						m1();
						System.out.println();
						if (gadgetcall6 == 1) {
							ShoppingBill = ShoppingBill + gadgets();
							return 0;
						} else {
							menu();
							return 0;
						}
					}
				} else {
					System.out.println();
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
					System.out.println();
					System.out.println(
							ANSI_BLUE + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
					int gadgetcall7 = sc.nextInt();
					System.out.println();
					System.out.println(ANSI_GREEN + "\t\t\t\t\tplease wait..");
					m1();
					System.out.println();
					if (gadgetcall7 == 1) {
						ShoppingBill = ShoppingBill + gadgets();
						return 0;
					} else {
						menu();
						return 0;
					}
				}
			default: {
				System.out.println();
				System.out.println(ANSI_RED
						+ "\t\t\t\t\t--~~-->>..You Entered Invalid Number To shop again in this category enter 1..:::::");
				System.out.println();
				System.out.println(
						ANSI_BLUE + "\t\t\t\t\t--~~-->>..To navigate to menu bar Enter any number.........::::::");
				int gadget = sc.nextInt();
				System.out.println();
				System.out.println(ANSI_WHITE + "\t\t\t\t\tplease wait..");
				m1();
				if (gadget == 1) {
					ShoppingBill = ShoppingBill + gadgets();
					return 0;
				} else {
					menu();
					return 0;
				}
			}
		}
	}
}

class A extends Main {
	static int n;
	static Scanner sc = new Scanner(System.in);
	static SimpleDateFormat sd = new SimpleDateFormat(ANSI_YELLOW + Bold + Font + "yyyy.MM.dd G 'at' HH:mm:ss z");
	static Date date = new Date();
	static String dt = sd.format(date);

	static double transfer1(double amnt1) {
		obj.balance = obj.balance - amnt1;
		int opu = 1000 + (int) (Math.random() * 1000);
		System.out.println(
				ANSI_GREEN + Bold + Font + "\t\t\t\t\t---->> TRANSACTION DONE SUCCESSFULLY ---- DATE : " + (dt));
		System.out.println("");
		System.out.println(
				ANSI_RED + Bold + Font + "\t\t\t\t\t>>> " + amnt1 + " PAYMENT SENT TO xxxxxxxx" + opu + "," + D.tra);
		System.out.println("");
		A.slep();
		System.out.println(
				ANSI_BLUE + Bold + Font + "\t\t\t\t\t---------------------------------------------------------");
		return obj.balance;
	}

	static void displayphn() {
		System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t 1. ---> 8978509858 <---");
		System.out.println("");
		System.out.println("\t\t\t\t\t 2. ---> 9705198299 <---");
		System.out.println("");
		System.out.println("\t\t\t\t\t 3. ---> 7093841978 <---");
		System.out.println("");
		System.out.println("\t\t\t\t\t 4. ---> 8686333753 <---");
		System.out.println("");
		System.out.println("\t\t\t\t\t 5. ---> 9705876737 <---");
		System.out.println("");
		System.out.println("\t\t\t\t\t 6. ---> 6302830594 <---");
		System.out.println("");
		System.out.println("\t\t\t\t\t 7. ---> 9700124578 <---");
		System.out.println("");
		System.out.println("\t\t\t\t\t 8. ---> 9390707796 <---");
		System.out.println("");
		System.out.println("\t\t\t\t\t 9. ---> 7569985117 <---");
		System.out.println("");
		System.out.println("\t\t\t\t\t 10.---> 9133439520 <---");
		System.out.println("");
		System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t 11.---> ENTER NEW NUMBER <---");
		System.out.println("");
		D.display1();

	}

	static void selectun() {
		System.out.println(ANSI_WHITE + Bold + Font + "\t\t\t\t\t---> PLEASE ENTER NEW NUMBER <--- ");
		System.out.println("");
		String a = sc.next();
		if (a.length() == 10) {
			System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t---> PLEASE ENTER THE NAME <--- ");
			System.out.println("");
			String name = sc.next();
			D.tra = name;
			System.out.print(ANSI_YELLOW + Bold + Font + "\t\t\t\t\t---> PLEASE WAIT WE ARE VERIFYING <--- ");
			slep();
			System.out.println();
			B.transfer();
		} else {
			System.out.println(ANSI_RED + Bold + Font + "\t\t\t\t\t---> PLEASE CHECK THE NUMBER <--- ");
			System.out.println("");
			System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t---> PRESS 1 TO RE-ENTER THE NUMBER <--- ");
			System.out.println("");
			System.out.println(ANSI_WHITE + Bold + Font + "\t\t\t\t\t--->PRESS 2 TO SELECT THE TRANSFER MODES <--- ");
			System.out.println();
			System.out.println(ANSI_RED + Bold + Font + "\t\t\t\t\t--->PRESS ANY NUMBER TO MAINMENU<--- ");
			System.out.println();
			int selo = sc.nextInt();
			if (selo == 1) {
				selectun();
			} else if (selo == 2) {
				E.modes();
			} else {
				System.out.println(ANSI_CYAN + Bold + Font + "\t\t\t\t\t---->> THANK YOU <<---- ");
				System.out.println("\t\t\t\t\t-------------------------");
				mainMenu();
			}
		}
	}

	static void slep() {
		try {
			Thread.sleep(1000);
			System.out.print(".");
		} catch (InterruptedException e) {
		}
	}

	static void validate() {
		System.out.println(ANSI_WHITE + Bold + Font + "\t\t\t\t\t----> PLEASE ENTER YOUR MOBILE NUMBER <---- ");
		System.out.println(ANSI_CYAN + Bold + Font + "\t\t\t\t\t---------------------------------------------");
		System.out.println("");
		String num4 = sc.next();
		if (num4.equals(obj.getNum())) {

			System.out.print(ANSI_WHITE + Bold + Font + "\t\t\t\t\tOTP SENDING ");
			slep();
			slep();
			slep();
			System.out.println("");
			int otpc = 1000 + (int) (Math.random() * 1000);
			System.out.println("");
			System.out.println(otpc);
			System.out.println("");
			System.out.println(ANSI_CYAN + Bold + Font + "\t\t\t\t\t---> PLEASE ENTER OTP <---");
			long op1 = sc.nextLong();
			System.out.println("");
			if (otpc == op1) {
				System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t-------> LOGIN SUCCESSFULLY <-------");
				System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t------------------------------------");
				System.out.println("");
				System.out.println(ANSI_WHITE + Bold + Font + "\t\t\t\t\t---> PLEASE ENTER NEW UPI PIN <---");
				int num3 = sc.nextInt();
				B.x.setter(num3);
				System.out.println(B.x.getter());
				System.out
						.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t---> YOUR UPI PIN HAS CHANGED SUCCESSFULLY <---");
				System.out.println("");
				System.out.println("\t\t\t\t\t--- THANK YOU ---");
				System.out.println(
						ANSI_WHITE + Bold + Font + "\t\t\t\t\t-----------------------------------------------");
				E.modes();
			} else {
				System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t<<<INVALID OTP>>>");
				System.out.println("");
				System.out.println(ANSI_RED + Bold + Font + "\t\t\t\t\t--- FAILED ---");
			}
			System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t-------------");
			System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t>>> PRESS 1 TO GO BACK <<< ");
			int p = sc.nextInt();
			if (p == 1) {
				System.out.println("");
				E.modes();
			} else {
				System.out.println("");
				displayphn();
			}
		} else {
			System.out.println(ANSI_RED + Bold + Font + "\t\t\t\t\t---> WRONG NUMBER <---");
			System.out.println("");
			System.out.println(
					ANSI_BLUE + Bold + Font + "\t\t\t\t\t---> PRESS 1 TO ENTER YOUR REGISTERED MOBILE NUMBER <---");
			System.out.println(
					ANSI_RED + Bold + Font + "\t\t\t\t\t---------------------------------------------------------");
			System.out.println(ANSI_BLUE + Bold + Font
					+ "\t\t\t\t\t---> PRESS ANY NUMBER TO SELECT THE MODES OF TRANSACTIONS <---");
			int pr = sc.nextInt();
			{
				if (pr == 1) {
					System.out.println(ANSI_BLUE + Bold + Font
							+ "\t\t\t\t\t--->> PLEASE ENTER YOUR REGISTERED MOBILE NUMBER <<---");
					validate();
				} else {
					E.modes();
				}
			}
		}
	}
}

class B extends A {
	static B x = new B();
	static private int upin = Main.pin;

	void setter(int upin) {
		this.upin = upin;
	}

	int getter() {
		return upin;
	}

	static void transfer() {
		System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t >>> ENTER AMOUNT TO TRANSFER <<<");
		double amnt1 = sc.nextDouble();
		if (amnt1 <= obj.balance) {
			reset();
			System.out.println(
					ANSI_CYAN + Bold + Font + "\t\t\t\t\t---------------------------------------------------------");
			System.out.println(ANSI_RED + Bold + Font + "\t\t\t\t\tREMAINING ACCOUNT BALANCE = " + transfer1(amnt1));
			System.out.println(
					ANSI_WHITE + Bold + Font + "\t\t\t\t\t----------------------------------------------------------");
			System.out.println("");
		} else {
			System.out.println(ANSI_CYAN + Bold + Font + "\t\t\t\t\t --->> PLEASE WAIT ... <<---");
			System.out.println("");
			A.slep();
			System.out.println(ANSI_CYAN + Bold + Font + "\t\t\t\t\t--->> INSUFFICIENT BALANCE <<--- ");
		}

	}

	static void reset() {
		System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t---> PLEASE ENTER UPI PIN NUMBER <---");
		System.out.println("\t\t\t\t\t---------------------------------------------------------");
		int un = sc.nextInt();
		System.out.println(ANSI_YELLOW + Bold + Font
				+ "\t\t\t\t\t >>> PLEASE WAIT WHILE YOUR TRANSACTION IS BEING PROCESSESING <<< ");
		System.out.println("");
		slep();
		slep();
		slep();
		if (un == upin) {
			System.out.println(ANSI_CYAN + Bold + Font + "\t\t\t\t\t --->> PLEASE WAIT ... <<---");
			System.out.println("");
		} else {
			System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t INVALID UPI PIN");
			System.out.println("");
			System.out.println(ANSI_YELLOW + Bold + Font + "\t\t\t\t\t PRESS 1 TO RE-ENTER UPI PIN NUMBER");
			System.out.println("");
			System.out.println(ANSI_RED + Bold + Font + "\t\t\t\t\t PRESS 2 TO RE-SET UPI PIN NUMBER");
			System.out.println("");
			System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t PRESS ANY NUMBER TO ENTER MAIN MENU");
			int rs = sc.nextInt();
			if (rs == 1) {
				reset();
			} else if (rs == 2) {
				System.out.println(ANSI_GREEN + Bold + Font
						+ "\t\t\t\t\t >>> PLEASE ENTER YOUR REGISTERED MOBILE NUMBER TO RESET YOUR PIN >>>");
				System.out.println("");
				validate();
			} else {
				Main.mainMenu();
			}
		}
	}

	static void checkbalance() {
		System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t--->> PLEASE ENTER UPI PIN NUMBER <<---");
		int un = sc.nextInt();
		System.out.println("");
		if (un == upin) {
			System.out
					.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t---> PLEASE WAIT WE ARE FETCHING THE BALANCE <---");
			A.slep();
			System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t-------------------------------------------------");
			System.out.println(ANSI_RED + Bold + Font + "\t\t\t\t\tACCOUNT BALANCE = " + obj.balance);
			System.out.println("");
			System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t-------------------------------------------------");
		} else {
			System.out.println(ANSI_RED + Bold + Font + "\t\t\t\t\t---> INVALID UPI PIN NUMBER <--- ");
			System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t----------------------------------");
			System.out.println(ANSI_RED + Bold + Font + "\t\t\t\t\t---> PRESS 1 TO RE-ENTER YOUR PIN NUMBER<--- ");
			System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t--------------------------------------------");
			System.out
					.println(ANSI_RED + Bold + Font + "\t\t\t\t\t---> PRESS ANY NUMBER TO RE-SET YOUR PIN NUMBER<--- ");
			int pinn = sc.nextInt();
			System.out.println("\t\t\t\t\t-----------------------------------------------------------------------");
			if (pinn == 1) {
				System.out.println("");
				checkbalance();
			} else {
				System.out.println(ANSI_WHITE + Bold + Font + "\t\t\t\t\t--> PLEASE WAIT ,...PROCESSING ");
				System.out.println("");
				A.slep();
				System.out.println(ANSI_RED + Bold + Font
						+ "\t\t\t\t\t>>> PLEASE ENTER YOUR REGISTERED MOBILE NUMBER TO RESET YOUR PIN >>>");
				System.out.println("");
				System.out.println("\t\t\t\t\t---> PLEASE ENTER YOUR MOBILE NUMBER <---");
				validate();
			}
		}
	}
}

class C extends B {
	static void perform() {
		System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t>>> PLEASE SELECT THE MOBILE NUMBER <<< ");
		System.out.println("");
		A.displayphn();
		System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t-----------------------------------------------");
		System.out.println(ANSI_YELLOW + Bold + Font
				+ "\t\t\t\t\t>>><> PRESS 1 TO DO ONE MORE TRANSACTION ANY NUMBER TO MAIN MENU<><<<");
		System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t-----------------------------------------------");
		int n = sc.nextInt();
		if (n == 1) {
			E.modes();
		} else {
			System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t------- THANK YOU! -------");
			System.out.println();
			mainMenu();
		}

	}

	static void perform1() {
		checkbalance();
		System.out.println(ANSI_RED + Bold + Font
				+ "\t\t\t\t\t>>><> PRESS 1 TO DO ONE MORE TRANSACTION ANY NUMBER TO MAIN MENU<><<<");
		int n = sc.nextInt();
		if (n == 1) {
			E.modes();
		} else {
			System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t------- THANKYOU! -------");
			System.out.println();
			mainMenu();
		}
	}
}

class D extends C {
	static String tra;

	static void display() {
		int s = sc.nextInt();
		switch (s) {
			case 1:
				perform();
				break;
			case 2:
				perform1();
				break;
			case 3:
				System.out.println(ANSI_YELLOW + Bold + Font + "\t\t\t\t\t--------------------------------------");
				System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t-----> * THANK YOU FOR VISITING US * <-----");
				System.out.println(ANSI_YELLOW + Bold + Font + "\t\t\t\t\t---------------------------------------");
				mainMenu();
				break;
			default:
				System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t<<< INVALID STATEMENT >>>");
				System.out.println("");
				System.out.println("\t\t\t\t\t>>> PRESS 1 TO GO BACK <<< ");
				int o = sc.nextInt();
				if (o == 1) {
					E.modes();
				} else {
					System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t---> THANK YOU <--- ");
				}
		}
	}

	static void display1() {
		int sel = sc.nextInt();
		switch (sel) {
			case 1:
				System.out.println(ANSI_PURPLE + Bold + Font + "\t\t\t\t\t---> SAI CHARAN #BRO ---> UNION BANK <---");
				tra = "SAI CHARAN #BRO";
				System.out.println("");
				transfer();
				break;
			case 2:
				System.out.println("\t\t\t\t\t---> CV #SIR ---> STATE BANK <---");
				tra = "CV #SIR";
				System.out.println("");
				transfer();
				break;
			case 3:
				System.out.println("\t\t\t\t\t---> PHANI KUMAR #SIR ---> KOTAK BANK <---");
				tra = "PHANI KUMAR #SIR";
				System.out.println("");
				transfer();
				break;
			case 4:
				System.out.println("\t\t\t\t\t---> VENKATESH KUMAR TALUPURU ---> HDFC BANK <---");
				tra = "VENKATESH KUMAR TALUPURU";
				System.out.println("");
				transfer();
				break;
			case 5:
				System.out.println("\t\t\t\t\t---> YASHWANTH ANKALA ---> KOTAK BANK <---");
				tra = "YASHWANTH ANKALA";
				System.out.println("");
				transfer();
				break;
			case 6:
				System.out.println("\t\t\t\t\t---> DURGA PRASAD KONDA ---> UNION BANK <---");
				tra = "DURGA PRASAD KONDA";
				System.out.println("");
				transfer();
				break;
			case 7:
				System.out.println("\t\t\t\t\t---> LOKESH SIDDULA ---> HDFC BANK <---");
				tra = "LOKESH SIIDULA";
				System.out.println("");
				transfer();
				break;
			case 8:
				System.out.println("\t\t\t\t\t---> NAGA PRASAD JADDU ---> HDFC BANK <---");
				tra = "NAGA PRASAD JADDU";
				System.out.println("");
				transfer();
				break;
			case 9:
				System.out.println("\t\t\t\t\t---> PAVAN KUMAR CHITTI ---> BANK OF BARODA <---");
				tra = "PAVAN KUAMR CHITTI";
				System.out.println("");
				transfer();
				break;
			case 10:
				System.out.println("\t\t\t\t\t--->  VENKATESHWARLU BONTHA ---> BANK OF BARODA <---");
				tra = "VENKATESHWARLU BONTHA";
				System.out.println("");
				transfer();
				break;
			case 11:
				selectun();
				break;
			default:
				System.out.println(ANSI_RED + Bold + Font + "\t\t\t\t\t<<< INVALID NUMBER >>> ");
				System.out.println("");
				System.out.println(ANSI_WHITE + Bold + Font + "\t\t\t\t\t<----- PRESS 1 TO DISLAY THE NUMBERS ---->");
				System.out.println(
						ANSI_WHITE + Bold + Font + "\t\t\t\t\t<----- PRESS ANY NUMBER TO DISLAY THE NUMBERS ---->");
				System.out.println("");
				int dp = sc.nextInt();
				if (dp == 1) {
					System.out.println(
							ANSI_YELLOW + Bold + Font + "\t\t\t\t\tPLEASE WAIT , WE ARE FETCHING THE DETAILS....");
					System.out.println("");
					A.slep();
					displayphn();
				} else {
					System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t<<< TO SELECT THE MODES >>> ");
					E.modes();
				}
		}

	}
}

class E extends D {
	public static void main(String[] args) {
		System.out.println(ANSI_YELLOW + Bold + Font + "\t\t\t\t\t\t\t----------------------------------------");
		System.out.println(ANSI_BLUE + Bold + Font + "\t\t\t\t\t\t\t*************---WELCOME---*************");
		System.out.println(ANSI_YELLOW + Bold + Font + "\t\t\t\t\t\t\t----------------------------------------");
		System.out.println("");
		System.out.println("");
		modes();
	}

	static void modes() {
		System.out.println(ANSI_CYAN + Bold + Font + "\t\t\t\t\t1. ---> TO TRANSFER THE AMOUNT <---");
		System.out.println("");
		System.out.println(ANSI_GREEN + Bold + Font + "\t\t\t\t\t2. ---> TO CHECK THE BALANCE <---");
		System.out.println("");
		System.out.println(ANSI_RED + Bold + Font + "\t\t\t\t\t3. ---> TO EXIT <---");
		System.out.println("");
		System.out.println(ANSI_WHITE + Bold + Font + "\t\t\t\t\t---> PRESS ANY ABOVE NUMBER TO PERFORM OPERATIONS <---"
				+ ANSI_RESET);
		display();
	}
}

class Restuarent extends Main {
	static int c = 0;
	static String od = "";
	static Scanner sc = new Scanner(System.in);
	static double bill = 0;

	static double vegNoodles(int quan) {
		return quan * 160;
	}

	static double vegFriedRice(int quan) {
		return quan * 170;
	}

	static double vegPaneerBiryani(int quan) {
		return quan * 180;
	}

	static double vegMushroomBiryani(int quan) {
		return quan * 190;
	}

	static double vegDumBiryani(int quan) {
		return quan * 110;
	}

	static double chickenBiryani(int quan) {
		return quan * 120;
	}

	static double muttonBiryani(int quan) {
		return quan * 150;
	}

	static double fishBiryani(int quan) {
		return quan * 140;
	}

	static double eggBiryani(int quan) {
		return quan * 100;
	}

	static double chickenManchuria(int quan) {
		return quan * 110;
	}

	static double chicken65(int quan) {
		return quan * 150;
	}

	static double chickenSpringRoll(int quan) {
		return quan * 120;
	}

	static double chickenLollipop(int quan) {
		return quan * 100;
	}

	static double chickenMajestic(int quan) {
		return quan * 140;
	}

	static double thumsup(int quan) {
		return quan * 25;
	}

	static double sprite(int quan) {
		return quan * 25;
	}

	static double maaza(int quan) {
		return quan * 30;
	}

	static double sevenup(int quan) {
		return quan * 20;
	}

	static void vegItems() {
		System.out.println(ANSI_BLUE + "\t\t\t\t\t\t\tVeg Items");
		System.out.println(ANSI_WHITE + "\t\t\t\t\t----------------------------");
		System.out.println(ANSI_PURPLE + "\t\t\t\t\tVeg Noodles\t\t----->160/-");
		System.out.println();
		System.out.println("\t\t\t\t\tVeg Fried Rice\t\t----->170/-");
		System.out.println();
		System.out.println("\t\t\t\t\tVeg Paneer Biryani\t----->180/-");
		System.out.println();
		System.out.println("\t\t\t\t\tVeg Mushroom Biryani\t----->190/-");
		System.out.println();
		System.out.println("\t\t\t\t\tVeg Dum Biryani\t\t----->110/-");
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\t----------------------------");

		System.out.println(ANSI_CYAN + "\t\t\t\t\tPRESS 1 FOR Veg Noodles");
		System.out.println();
		System.out.println("\t\t\t\t\tPRESS 2 FOR Veg Fried Rice");
		System.out.println();
		System.out.println("\t\t\t\t\tPRESS 3 FOR Veg Paneer Biryani");
		System.out.println();
		System.out.println("\t\t\t\t\tPRESS 4 FOR Veg Mushroom Biryani");
		System.out.println();
		System.out.println("\t\t\t\t\tPRESS 5 FOR Veg Dum Biryani");
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\tPRESS ANY NUMBER TO EXIT TO MENU");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tveg noodles -" + q + " :	---->Rs-" + q * 160 + "\n";
			bill = bill + vegNoodles(q);
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill");
				menu();
			}
		} else if (n == 2) {
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tveg fried rice -" + q + " :	---->Rs-" + q * 170 + "\n";
			bill = bill + vegFriedRice(q);
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else if (n == 3) {
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tveg paneer biryani -" + q + " :	---->Rs-" + q * 180 + "\n";
			bill = bill + vegPaneerBiryani(q);
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else if (n == 4) {
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tveg mushroom biryani -" + q + " :---->Rs-" + q * 190 + "\n";
			bill = bill + vegMushroomBiryani(q);
			System.out.println();
			System.out.println(ANSI_CYAN + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else if (n == 5) {
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tveg dum biryani -" + q + " :	---->Rs-" + q * 110 + "\n";
			bill = bill + vegDumBiryani(q);
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else {
			System.out.println();
			System.out.println();
			menu();
		}
	}

	static void NonvegItems() {
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\t\t\tNonveg Items");
		System.out.println(ANSI_YELLOW + "\t\t\t\t\t----------------------------");
		System.out.println(ANSI_BLUE + "\t\t\t\t\tChicken Biryani 	-----> 120/-");
		System.out.println();
		System.out.println("\t\t\t\t\tMutton Biryani  	-----> 150/-");
		System.out.println();
		System.out.println("\t\t\t\t\tFish Biryani    	-----> 140/-");
		System.out.println();
		System.out.println("\t\t\t\t\tEgg Biryani     	-----> 100/-");
		System.out.println(ANSI_YELLOW + "\t\t\t\t\t----------------------------");
		System.out.println(ANSI_CYAN + "\t\t\t\t\tPRESS 1 FOR Chicken Biryani");
		System.out.println();
		System.out.println("\t\t\t\t\tPRESS 2 FOR Mutton Biryani");
		System.out.println();
		System.out.println("\t\t\t\t\tPRESS 3 FOR Fish Biryani");
		System.out.println();
		System.out.println("\t\t\t\t\tPRESS 4 FOR Egg Biryani");
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\tPRESS ANY NUMBER FOR EXIT TO MENU");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tchicken biryani -" + q + " :	---->Rs-" + q * 120 + "\n";
			bill = bill + chickenBiryani(q);
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else if (n == 2) {
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tmutton biryani -" + q + " :	---->Rs-" + q * 150 + "\n";
			bill = bill + muttonBiryani(q);
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else if (n == 3) {
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tfish biryani -" + q + " :	---->Rs-" + q * 140 + "\n";
			bill = bill + fishBiryani(q);
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else if (n == 4) {
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "egg biryani -" + q + " :	---->Rs-" + q * 100 + "\n";
			bill = bill + eggBiryani(q);
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else {
			System.out.println();
			System.out.println();
			menu();
		}
	}

	static void Starters() {
		System.out.println();
		System.out.println(ANSI_YELLOW + "\t\t\t\t\t\t\tStarters");
		System.out.println(ANSI_CYAN + "\t\t\t\t\t----------------------------");
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\tChicken Manchuria      -----> 110/-");
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\tChicken 65             -----> 150/-");
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\tChicken Spring Roll    -----> 120/-");
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\tChiclen Lollipop       -----> 100/-");
		System.out.println();
		System.out.println(ANSI_PURPLE + "\t\t\t\t\tChicken Majestic   	   -----> 140/-");
		System.out.println(ANSI_CYAN + "\t\t\t\t\t----------------------------");
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\tPRESS 1 FOR Chicken Manchuri");
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\tPRESS 2 FOR Chicken 65");
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\tPRESS 3 FOR Chickern Spring Roll");
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\tPRESS 4 FOR Chiclen Lollipop");
		System.out.println();
		System.out.println(ANSI_PURPLE + "\t\t\t\t\tPRESS 5 FOR Chicken Majestic");
		System.out.println();
		System.out.println(ANSI_CYAN + "\t\t\t\t\tPRESS ANY NUMBER FOR EXIT TO MENU");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println();
			System.out.println(ANSI_CYAN + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tchicken manchuria -" + q + " :	---->Rs-" + q * 110 + "\n";
			bill = bill + chickenManchuria(q);
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else if (n == 2) {
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tchicken65 -" + q + " :		---->Rs-" + q * 150 + "\n";
			bill = bill + chicken65(q);
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else if (n == 3) {
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tchicken spring roll -" + q + " :---->Rs-" + q * 120 + "\n";
			bill = bill + chickenSpringRoll(q);
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill");
				menu();
			}
		} else if (n == 4) {
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tchicken lollipop -" + q + " :	---->Rs-" + q * 100 + "\n";
			bill = bill + chickenLollipop(q);
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else if (n == 5) {
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tchicken majestic -" + q + " :	---->Rs-" + q * 140 + "\n";
			bill = bill + chickenMajestic(q);
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else {
			System.out.println();
			System.out.println();
			menu();
		}
	}

	static void Drinks() {
		System.out.println();
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t\t\tDrinks");
		System.out.println(ANSI_WHITE + "\t\t\t\t\t----------------------------");
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\tThumsUp      -----> 25/-");
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\tSprite       -----> 25/-");
		System.out.println();
		System.out.println(ANSI_YELLOW + "\t\t\t\t\tMaaza        -----> 30/-");
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\tsevenup      -----> 20/-");
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\t----------------------------");
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\tPRESS 1 FOR ThumsUp");
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\tPRESS 2 FOR Sprite");
		System.out.println();
		System.out.println(ANSI_YELLOW + "\t\t\t\t\tPRESS 3 FOR Maaza");
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\tPRESS 4 FOR sevenup");
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\tPRESS 5 FOR EXIT TO MENU");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tthumsup -" + q + " :		---->Rs-" + q * 25 + "\n";
			bill = bill + thumsup(q);
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the BillWe Redirecting to Menu");
				menu();
			}
		} else if (n == 2) {
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tsprite -" + q + " :		---->Rs-" + q * 25 + "\n";
			bill = bill + sprite(q);
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else if (n == 3) {
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tmaaza -" + q + " :		---->Rs-" + q * 30 + "\n";
			bill = bill + maaza(q);
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else if (n == 4) {
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\tSELECT QUANTITY");
			int q = sc.nextInt();
			od = od + "\t\t\t\t\tsevenup -" + q + " :		---->Rs-" + q * 20 + "\n";
			bill = bill + sevenup(q);
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPRESS 1 TO  ORDER MORE & PRESS ANY NUMBER  FOR BILLING");
			int a = sc.nextInt();
			if (a == 1) {
				menu();
			} else {
				if (bill > 0)
					billing(bill);
				else
					bill = 0;
				od = "";
				System.out
						.println("\t\t\t\t\tYou Ordered Nothing,You dont need to Pay the Bill We Redirecting to Menu");
				menu();
			}
		} else {
			System.out.println();
			System.out.println();
			menu();
		}

	}

	static void menu() {
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\tPRESS 1 FOR Veg Items");
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\tPRESS 2 FOR Nonveg Items");
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\tPRESS 3 FOR Starters");
		System.out.println();
		System.out.println(ANSI_PURPLE + "\t\t\t\t\tPRESS 4 FOR Drinks");
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\tPRESS 5 FOR EXIT");
		int n = sc.nextInt();
		if (n == 1) {
			vegItems();
		} else if (n == 2) {
			NonvegItems();
		} else if (n == 3) {
			Starters();
		} else if (n == 4) {
			Drinks();
		} else {
			if (bill > 0) {
				c++;
				billing(bill);
			}
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t@***************THANK YOU*************@");
			System.out.println();
			bill = 0;
			od = "";
			mainMenu();
		}
	}

	static void billing(double b) {
		System.out.println();
		System.out.println(od);
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\tTOTAL AMOUNT	---> " + b);
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\tPRESS 1 FOR PAY");
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\tPRESS 2 ORDER AGAIN");
		System.out.println();
		System.out.println(ANSI_PURPLE + "\t\t\t\t\tPRESS 3 FOR EXIT FROM RESTAURANT");
		System.out.println();
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println(ANSI_BLUE + "\t\t\t\t\tENTER YOUR PIN ---> ");
			int p = in.nextInt();
			System.out.println("\t\t\t\t\tPlease Wait...");
			m1();
			System.out.println();
			if (p == Main.pin) {
				System.out.println(ANSI_GREEN + "\t\t\t\t\t*********TRANSACTION DONE SUCCESFULLY*********");
				System.out.println();
				System.out.println(
						ANSI_BLUE + "\t\t\t\t\t*********REMAINING AMOUNT--> " + (obj.balance = obj.balance - b));
				System.out.println();
				System.out.println();
				System.out.println("\t\t\t\t\t1 TO ORDER AGAIN");
				System.out.println("\t\t\t\t\t ANY NUMBER TO EXIT FROM RESTAURANT");
				int e = in.nextInt();
				if (e == 1) {
					bill = 0;
					od = "";
					menu();
				} else {
					bill = 0;
					od = "";
					mainMenu();
				}
			} else {
				System.out.println(ANSI_RED + "\t\t\t\t\t*********WRONG PIN*********");
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t 1 TO TRY AGAIN");
				System.out.println("\t\t\t\t\t 2 TO RESET PIN");
				System.out.println("\t\t\t\t\t 3 TO ORDER AGAIN");
				System.out.println("\t\t\t\t\t ANY NUMBER TO EXIT FROM RESTAURANT");
				System.out.println();
				int J = in.nextInt();
				System.out.println("\t\t\t\t\tPlease Wait...");
				m1();
				System.out.println();
				if (J == 1) {
					billing(bill);
				} else if (J == 2) {
					System.out.println("\t\t\t\t\tEnter your mobile number");
					String mn = in.next();
					System.out.println("\t\t\t\t\tEnter your password");
					String pass = in.next();
					if ((mn.equals(obj.getNum())) && (pass.equals(obj.getPass()))) {
						System.out.println("\t\t\t\t\tEnter your new pin");
						int pin = in.nextInt();
						obj.setpin(pin);
						System.out.println("\t\t\t\t\t 1 T0 REPAY");
						System.out.println("\t\t\t\t\t 2 T0 ORDER AGAIN");
						System.out.println("\t\t\t\t\t ANY NUMBER TO EXIT FROM RESTAURANT");
						int v = in.nextInt();
						System.out.println("\t\t\t\t\tPlease Wait...");
						m1();
						if (v == 1) {
							billing(bill);
						} else if (v == 2) {
							menu();
						} else {
							bill = 0;
							od = "";
							mainMenu();
						}
					} else {
						System.out.print("\t\t\t\t\tWrong Credentials");
						System.out.println();
						System.out.println("\t\t\t\t\t 1 TO REPAY");
						System.out.println("\t\t\t\t\t 2 TO ORDER AGAIN");
						System.out.println("\t\t\t\t\t ANY NUMBER TO EXIT FROM RESTAURANT");
						int f = in.nextInt();
						if (f == 1) {
							System.out.println("\t\t\t\t\tPlease Wait...");
							m1();
							billing(bill);
						} else if (f == 2) {
							bill = 0;
							od = "";
							menu();
						} else {
							bill = 0;
							od = "";
							mainMenu();
						}
					}

				} else if (J == 3) {
					menu();
				} else if (J == 4) {
					bill = 0;
					od = "";
					mainMenu();
				} else {
					System.out.println(ANSI_PURPLE + "\t\t\t\t\t@***************THANK YOU*************@");
					System.out.println();
					System.out.println();
					bill = 0;
					od = "";
					mainMenu();

				}
			}

		} else if (n == 2) {
			menu();
		} else {
			bill = 0;
			od = "";
			mainMenu();
		}

	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\t\t-------@****************************@-------");
		System.out.println();
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t\t-------@Welcome to our CV Restaurant@-------");
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\t\t-------@****************************@-------");
		System.out.println();
		System.out.println();
		menu();
		System.out.println(ANSI_GREEN + "\t\t\t\t\t@***************THANK YOU*************@");
	}
}

class MetroTicketBooking extends Main {
	static Scanner sc = new Scanner(System.in);
	static double bilm;
	static int p = 1000 + (int) (Math.random() * 8999);
	static SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");

	static Date date = new Date();

	static String dt = sd.format(date);

	static double NU(int q) {
		return q * 35;
	}

	static double HS(int q) {
		return q * 55;
	}

	static double TA(int q) {
		return q * 75;
	}

	static double BP(int q) {
		return q * 95;
	}

	static double HR(int q) {
		return q * 45;
	}

	static double LK(int q) {
		return q * 55;
	}

	static double MS(int q) {
		return q * 65;
	}

	static double AN(int q) {
		return q * 75;
	}

	static double PD(int q) {
		return q * 85;
	}

	static double JM(int q) {
		return q * 35;
	}

	static double JS(int q) {
		return q * 95;
	}

	static double RG(int q) {
		return q * 85;
	}

	static double SM(int q) {
		return q * 65;
	}

	static double PN(int q) {
		return q * 25;
	}

	static double CM(int q) {
		return q * 55;
	}

	static void lbNagarList() {
		System.out.println(Bold + Font + ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 1 FOR LB NAGAR TO KPHB");
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 2 FOR MALAKPET TO SR NAGAR");
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 3 FOR ASSEMBLY TO NAMPALLY");
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 4 FOR PUNJAGUTTA TO DILSUKNAGAR");
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 5 FOR JNTU TO MIYAPUR");
		System.out.println();
		int l = sc.nextInt();
		if (l == 1) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - LB NAGAR - - - - - > TO - KPHB");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  55/- ");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + LK(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : MIYAPUR");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : LB NAGAR");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tTO              : KPHB");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else if (l == 2) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - MALAKPET - - - - - > TO - SR NAGAR");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  65/- ");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + MS(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : MIYAPUR");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : MALAKPET");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tTO              : SR NAGAR");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else if (l == 3) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - ASSEMBLY - - - - - > TO - NAMPALLY");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  75/- ");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + AN(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : MIYAPUR");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : ASSEMBLY");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tTO              : NAMPALLY");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else if (l == 4) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - PUNJAGUTTA - - - - - > TO - DILSUKNAGAR");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  /- 85");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + PD(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : MIYAPUR");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : PUNJAGUTTA");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tTO              : DILSUKNAGAR");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else if (l == 5) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - JNTU - - - - - > TO - MIYAPUR");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  35/- ");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + JM(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : MIYAPUR");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : JNTU");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tTO              : MIYAPUR");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else {
			System.out.println(
					ANSI_GREEN
							+ "t\t\t\t\t- - - - - - YOU ENTERED IMPROPER SOURCE AND DESTINATION STATIONS- - - - - -");
			System.out.println();
			System.out.println(
					ANSI_GREEN
							+ "t\t\t\t\t- - - > PRESS 1 TO SELECT PROPER SOURCE AND DESTINATION FROM AVAILABLE LIST");
			System.out.println();
			System.out.println(ANSI_GREEN
					+ "t\t\t\t\t- - - > PRESS 2 TO CHOOSE OTHER METRO LINE AND THEN TO SELECT SOURCE AND DESTINATION STATIONS");
			System.out.println();
			System.out.println(ANSI_GREEN
					+ "t\t\t\t\t- - - > PRESS ANY OTHER NUMBER TO EXIT FROM THE PORTAL AND TO REDIRECT TO MAIN MENU");
			System.out.println();
			int m = sc.nextInt();
			System.out.println();
			if (m == 1) {
				m1();
				System.out.println();
				lbNagarList();
				System.out.println();
			} else if (m == 2) {
				m1();
				System.out.println();
				list();
				System.out.println();
			} else {
				System.out.println(ANSI_BLUE + "t\t\t\t\tPLEASE WAIT...YOU ARE REDIRECTING TO MAIN MENU - - -");
				System.out.println();
				m1();
				bilm = 0;
				mainMenu();
				System.out.println();
				System.out.println();
				System.out.println();
			}
		}
	}

	static void raidurgList() {
		System.out.println(Bold + Font + ANSI_RED + "\t\t\t\t\t- - - > PRESS 1 FOR NAGOLE TO UPPAL");
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\t- - - > PRESS 2 FOR HABSIGUDA TO SECUNDERABAD EAST");
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\t- - - > PRESS 3 FOR TARNAKA  TO AMEERPET");
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\t- - - > PRESS 4 FOR BEGUMPET TO PEDDHAMMA GUDI");
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\t- - - > PRESS 5 FOR HITECH CITY TO RAIDURG");
		System.out.println();
		int r = sc.nextInt();
		if (r == 1) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - NAGOLE - - - - - > TO - UPPAL");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  35/- ");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + NU(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : RAIDURG");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : NAGOLE");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tTO              : UPPAL");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else if (r == 2) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - HABSIGUDA - - - - - > TO - SECENDARABAD EAST");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  55/- ");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + HS(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : RAIDURG");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : HABSIGUDA");

			System.out.println();

			System.out.println(ANSI_GREEN + "\t\t\t\t\tTO              : SECENDARABAD EAST");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else if (r == 3) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - TARNAKA - - - - - > TO - AMEERPET");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  75/- ");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + TA(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : RAIDURG");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : TARNAKA");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tTO              : AMEERPET");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else if (r == 4) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - BEGUMPET - - - - - > TO - PEDDHAMMA GUDI");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  95/- ");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + BP(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : RAIDURG");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : BEGUMPET");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tTO              : PEDDHAMMA GUDI");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t--------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t--------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else if (r == 5) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - HITECH CITY - - - - - > TO - RAIDURG");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  45/- ");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + HR(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : RAIDURG");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : HITECH CITY");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tTO              : RAIDURG");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else {
			System.out.println(
					ANSI_GREEN
							+ "t\t\t\t\t- - - - - - YOU ENTERED IMPROPER SOURCE AND DESTINATION STATIONS- - - - - -");
			System.out.println();
			System.out.println(
					ANSI_GREEN
							+ "t\t\t\t\t- - - > PRESS 1 TO SELECT PROPER SOURCE AND DESTINATION FROM AVAILABLE LIST");
			System.out.println();
			System.out.println(ANSI_GREEN
					+ "t\t\t\t\t- - - > PRESS 2 TO CHOOSE OTHER METRO LINE AND THEN TO SELECT SOURCE AND DESTINATION STATIONS");
			System.out.println();
			System.out.println(ANSI_GREEN
					+ "t\t\t\t\t- - - > PRESS ANY OTHER NUMBER TO EXIT FROM THE PORTAL AND TO REDIRECT TO MAIN MENU");
			System.out.println();
			int m = sc.nextInt();
			System.out.println();
			if (m == 1) {
				m1();
				System.out.println();
				raidurgList();
				System.out.println();
			} else if (m == 2) {
				m1();
				System.out.println();
				list();
				System.out.println();
			} else {
				System.out.println(ANSI_BLUE + "t\t\t\t\tPLEASE WAIT...YOU ARE REDIRECTING TO MAIN MENU - - -");
				System.out.println();
				m1();
				bilm = 0;
				mainMenu();
				System.out.println();
				System.out.println();
				System.out.println();
			}
		}
	}

	static void mgbsList() {
		System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 1 FOR JBS TO SECUNDERABAD WEST");
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 2 FOR RTC X ROADS TO GANDHI HOSPITAL");
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 3 FOR SULTAN BAZAR TO MUSHEERABAD");
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 4 FOR PARADE GROUND TO NARAYANAGUDA");
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 5 FOR CHIKKADPALLY TO MGBS");
		System.out.println();
		int mm = sc.nextInt();
		if (mm == 1) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - JBS - - - - - > TO - SECUNDERABAD WEST");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  95/- ");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + JS(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : MGBS");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : JBS");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tTO              : SECUNDERABAD WEST");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else if (mm == 2) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - RTC X ROADS - - - - - > TO - GANDHI HOSPITAL");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  85/- ");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + RG(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : MGBS");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : RTC X ROADS");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tTO              : GANDHI HOSPITAL");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else if (mm == 3) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - SULTAN BAZAR - - - - - > TO - MUSHEERABAD");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  65/- ");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + SM(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : MGBS");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : SULTAN BAZAR");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tTO              : MUSHEERABAD");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else if (mm == 4) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - PARADE GROUND - - - - - > TO - NARAYANAGUDA");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  25/- ");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + PN(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : MGBS");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : PARADE GROUND");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tTO              : NARAYANAGUDA");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else if (mm == 5) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t\tFROM - CHIKKADPALLY - - - - - > TO - MGBS");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t\tTICKET PRICE  :  55/- ");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NO OF TICKETS < - - -");
			System.out.println();
			int t = sc.nextInt();
			bilm = bilm + CM(t);
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_BLUE + "\t\t\t\t\tPLATFORM NUMBER - 1");
			System.out.println();

			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tDATE/TIME       : " + dt);

			System.out.println();

			System.out.println(ANSI_PURPLE + "\t\t\t\t\tTRAIN NAME     : MGBS");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tFROM             : CHIKKADPALLY");

			System.out.println();

			System.out.println(ANSI_BLUE + "\t\t\t\t\tTO              : MGBS");

			System.out.println();

			billing(bilm);

			System.out.println();

			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();

			System.out.println(ANSI_WHITE + "\t\t\t\t\tTICKET NO       : " + p + ".10.116.345");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t----------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPLEASE RETAIN TILL THE END OF THE JOURNEY!");
			System.out.println();
			System.out.println();
			System.out.println(ANSI_RESET + ANSI_RED + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println();
			System.out.println();
			payment();
			System.out.println();
		} else {
			System.out.println(
					ANSI_GREEN + "\t\t\t\t\t- - - - - - YOU ENTERED IMPROPER SOURCE AND DESTINATION - - - - - -");
			System.out.println();
			System.out.println(
					ANSI_GREEN
							+ "\t\t\t\t\t- - - > PRESS 1 TO SELECT PROPER SOURCE AND DESTINATION FROM AVAILABLE LIST");
			System.out.println();
			System.out.println(ANSI_GREEN
					+ "\t\t\t\t\t- - - > PRESS 2 TO CHOOSE OTHER METRO LINE TO SELECT SOURCE AND DESTINATION");
			System.out.println();
			System.out.println(ANSI_GREEN
					+ "\t\t\t\t\t- - - > PRESS ANY OTHER NUMBER TO EXIT FROM THE PORTAL AND TO REDIRECT TO MAIN MENU");
			System.out.println();
			int m = sc.nextInt();
			System.out.println();
			if (m == 1) {
				m1();
				mgbsList();
			} else if (m == 2) {
				m1();
				System.out.println();
				list();
				System.out.println();
			} else {
				System.out.println(ANSI_BLUE + "t\t\t\t\tPLEASE WAIT...YOU ARE REDIRECTING TO MAIN MENU - - -");
				System.out.println();
				m1();
				bilm = 0;
				mainMenu();
				System.out.println();
				System.out.println();
				System.out.println();
			}
		}
	}

	static void list() {
		System.out.println(ANSI_RED + "\t\t\t\t\t- - - > PRESS 1 FOR MIYAPUR TO LB NAGAR METRO LINE...RED LINE");
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 2 FOR NAGOLE TO RAIDURG METRO LINE...BLUE LINE");
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 3 FOR JBS TO MGBS METRO LINE...GREEN LINE");
		System.out.println();
		int n = sc.nextInt();
		System.out.println();
		if (n == 1) {
			System.out.println(ANSI_RED + "\t\t\t\t\t* * * * * * * WELCOME TO RAIDURG METRO LINE * * * * * *");
			System.out.println();
			lbNagarList();
			System.out.println();
			payment();
			System.out.println();
		} else if (n == 2) {
			System.out.println(ANSI_BLUE + "\t\t\t\t\t* * * * * * * WELCOME TO LB NAGAR METRO LINE * * * * * *");
			System.out.println();
			raidurgList();
			System.out.println();
			payment();
			System.out.println();
		} else if (n == 3) {
			System.out.println(ANSI_GREEN + "\t\t\t\t\t* * * * * * * WELCOME TO MGBS METRO LINE * * * * * *");
			System.out.println();
			mgbsList();
			System.out.println();
			payment();
			System.out.println();
		} else {
			System.out.println(ANSI_RED + "\t\t\t\t\tYOU HAVE CHOOSEN IMPROPER METRO LINE NAME");
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\tPRESS 1 TO START YOUR METRO TICKET BOOKING PROCESS AGAIN");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tPRESS ANY OTHER NUMBER TO REDIRECT TO MAIN MENU");
			System.out.println();
			bilm = 0;
			int ii = sc.nextInt();
			System.out.println();
			if (ii == 1) {
				m1();
				list();
				System.out.println();
			} else {
				System.out.println(ANSI_BLUE + "t\t\t\t\tPLEASE WAIT...YOU ARE REDIRECTING TO MAIN MENU - - -");
				System.out.println();
				m1();
				mainMenu();
				System.out.println();
				System.out.println();
				System.out.println();
			}
		}
	}

	static void billing(double bilm)

	{

		System.out.printf(ANSI_BLUE + "\t\t\t\t\tTOTAL AMOUNT    : " + "%.2f", bilm);

		System.out.println();
		System.out.println();
		double gst = bilm * 0.1;

		System.out.printf(ANSI_BLUE + "\t\t\t\t\tGST             : " + "%.2f", gst);
		System.out.println();
		System.out.println();

		System.out.println(ANSI_PURPLE + "\t\t\t\t\t----------------------------------");

		System.out.println();
		System.out.printf(ANSI_RED + "\t\t\t\t\tPAYABLE AMOUNT  : " + "%.2f", (bilm + gst));

		System.out.println();
		System.out.println();
	}

	static void validate() {
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t- - - > ENTER OTP < - - -");
		System.out.println();
		int n = sc.nextInt();
		System.out.println();
		if (n == otp) {
			System.out.println(ANSI_WHITE + "\t\t\t\t\t.....PLEASE WAIT...VALIDATING OTP");
			System.out.println();
			m1();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t% - - - OTP VALIDATION IS SUCCESSFULL - - - %");
			System.out.println();
			System.out.println(
					ANSI_YELLOW + "\t\t\t\t\t- - - > PRESS 1 TO SEE YOUR PIN AND THEN TO START PAYMENT PROCESS");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 2 TO RESET YOUR PIN");
			System.out.println();
			int k = sc.nextInt();
			System.out.println();
			if (k == 1) {
				System.out.println(obj.pin);
				System.out.println();
			} else if (k == 2) {
				System.out.print(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER YOUR NEW PIN");
				System.out.println();
				obj.setpin(sc.nextInt());
				System.out.println();
			}
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 1 TO PROCEED TO PAYMENT");
			System.out.println();
			System.out.println(
					ANSI_PURPLE
							+ "\t\t\t\t\t- - - > PRESS ANY OTHER NUMBER TO EXIT FROM THE PORTAL AND TO REDIRECT TO MAIN MENU");
			System.out.println();
			int p = sc.nextInt();
			System.out.println();
			if (p == 1) {
				System.out.println(
						ANSI_BLUE + "\t\t\t\t\t.....PLEASE WAIT...YOU ARE REDIRECTING TO PAYMENT PROCESS.....");
				m1();
				System.out.println();
				System.out.println(
						ANSI_PURPLE + "\t\t\t\t\t- - - PLEASE ENTER YOUR CREDENTIALS AND START PAYMENT PROCESS - - -");
				System.out.println();
				payment();
			} else {
				System.out.print(ANSI_RED + "\t\t\t\t\t!.....LOGIN UNSUCCESSFULL.....!");
				System.out.println();
				System.out.println();
			}
		} else {
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t- - - YOU ENTERED WRONG OTP - - - ");
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 1 TO ENTER OTP AGAIN");
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t- - - > PRESS ANY OTHER NUMBER TO REDIRECT TO MAIN MENU");
			System.out.println();
			int v = sc.nextInt();
			if (v == 1) {
				validate();
			} else {
				System.out.println(ANSI_RED + "\t\t\t\t\t\t!.....LOGIN UNSUCCESSFULL.....!");
				System.out.println();
				System.out.println(ANSI_PURPLE + "\t\t\t\t\tPLEASE WAIT... YOU ARE REDIRECTING TO MAIN MENU");
				System.out.println();
				System.out.println();
				System.out.println();
				m1();
				bilm = 0;
				mainMenu();
			}
		}
	}

	static void payment() {
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t- - - $ PLEASE PROCEED WITH ONLINE PAYMENT $ - - -");
		System.out.println();
		System.out.println();
		System.out.println(ANSI_YELLOW + "\t\t\t\t\t- - - > PRESS 1 TO START ONLINE TRANSACTION");
		System.out.println();
		int nt = sc.nextInt();
		System.out.println();
		if (nt == 1) {
			System.out.println(ANSI_RED + "\t\t\t\t\t- - - > PLEASE ENTER PHONE NUMBER");
			System.out.println();
			String ns = sc.next();
			System.out.println();
			if (obj.getNum().equals(ns)) {
				System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PLEASE ENTER UPI PIN");
				System.out.println();
				int ps = sc.nextInt();
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t- - PLEASE WAIT...VALIDATING PIN NUMBER - -");
				System.out.println();
				m1();
				System.out.println();
				if (ps == Main.pin) {
					System.out.println(ANSI_YELLOW + "\t\t\t\t\t- - - - VALIDATION COMPLETED SUCCESSFULLY - - - - -");
					System.out.println();
					System.out.println();
					System.out.println(ANSI_GREEN + "\t\t\t\t\t* - - - - - - - * PAYMENT SUCCESSFULL * - - - - - -*");
					System.out.println();
					System.out.println();
					System.out.println(ANSI_YELLOW + "\t\t\t\t\t* - < > - - - - * HAPPY JOURNEY * - - - < >- *");
					System.out.println();
					System.out.println();
					System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 1 TO BOOK TICKET AGAIN");
					System.out.println();
					System.out.println();
					System.out.println(ANSI_RED + "\t\t\t\t\t- - - > PRESS ANY OTHER NUMBER TO REDIRECT TO MAIN MENU");
					System.out.println();
					int ii = sc.nextInt();
					if (ii == 1) {
						m1();
						list();
					} else {
						System.out.println(ANSI_BLUE + "t\t\t\t\tPLEASE WAIT...YOU ARE REDIRECTING TO MAIN MENU - - -");
						System.out.println();
						System.out.println();
						m1();
						bilm = 0;
						mainMenu();
						System.out.println();
						System.out.println();
						System.out.println();
					}
				} else {
					System.out.println(ANSI_RED + "\t\t\t\t\t- - - OOPS!...INVALID PIN NUMBER - - - ");
					System.out.println();
					System.out.println();
					System.out.println(ANSI_BLUE
							+ "\t\t\t\t\t- - - > PRESS 1 TO RE-ENTER PIN NUMBER AGAIN AND TO START PAYMENT PROCESS");
					System.out.println();
					System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 2 TO RESET PIN NUMBER");
					System.out.println();
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t- - - > PRESS ANY OTHER NUMBER TO STOP YOUR PAYMENT PROCESS AND TO REDIRECT TO MAIN MENU");
					int op = sc.nextInt();
					if (op == 1) {
						m1();
						payment();
						System.out.println();
					} else if (op == 2) {
						System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > ENTER PHONE NUMBER");
						System.out.println();
						System.out.println();
						String pn = sc.next();
						System.out.println();
						if (obj.getNum().equals(pn)) {
							System.out.println(ANSI_WHITE
									+ "\t\t\t\t\t- - PLEASE WAIT...OTP IS BEING SENT TO YOUR PHONE NUMBER - -");
							System.out.println();
							m1();
							System.out.println();
							otp = 1000 + (int) (Math.random() * 8999);
							System.out.println(ANSI_PURPLE + "\t\t\t\tOTP is " + otp);
							System.out.println();
							System.out.println(ANSI_RESET + Bold + Font + ANSI_CYAN + "\t\t\t\t\tPLEASE WAIT...");
							m1();
							validate();
							System.out.println();
						} else {
							System.out.print(ANSI_RED
									+ "\t\t\t\t\tYOU ENTERED WRONG PHONE NUMBER...");
							System.out.println();
							System.out.println(ANSI_GREEN
									+ "\t\t\t\t\t- - - > PRESS 1 TO SEE YOUR PHONE NUMBER AND THEN TO START PAYMENT PROCESS");
							System.out.println();
							System.out.println(ANSI_RED
									+ "\t\t\t\t\t- - - > PRESS ANY OTHER NUMBER TO STOP YOUR PAYMENT PROCESS AND REDIRECT TO MAIN MENU");
							System.out.println();
							System.out.println();
							int an = sc.nextInt();
							System.out.println();
							if (an == 1) {
								System.out.println(ANSI_RESET + Bold + Font + ANSI_CYAN
										+ "\t\t\t\t\t\t-----------------------------------------------");
								System.out.println(ANSI_RESET + Bold + Font + ANSI_YELLOW
										+ "\t\t\t\t\t\t     YOUR MOBILE NUMBER - - - > "
										+ obj.getNum());
								System.out.println(ANSI_RESET + Bold + Font + ANSI_CYAN
										+ "\t\t\t\t\t\t-----------------------------------------------");
								System.out.println();
								System.out.println(ANSI_RESET + Bold + Font + ANSI_CYAN + "\t\t\t\t\tPLEASE WAIT...");
								System.out.println();
								m1();
								System.out.println();
								payment();
								System.out.println();
							} else {
								m1();
								bilm = 0;
								mainMenu();
								System.out.println();
								System.out.println();
								System.out.println();
							}
						}
					} else {
						System.out.println(ANSI_RED + "\t\t\t\t\t$ - - - $ OOPS!... PAYMENT UNSUCCESSFULL $ - - - $!");
						System.out.println();
						System.out.println(ANSI_BLUE + "\t\t\t\tPLEASE WAIT...YOU ARE REDIRECTING TO MAIN MENU - - -");
						m1();
						bilm = 0;
						mainMenu();
						System.out.println();
						System.out.println();
						System.out.println();
					}
				}
			} else {
				System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - OOPS!...INVALID MOBILE NUMBER - - -");
				System.out.println();
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 1 TO REDIRECT TO PAYMENT PROCESS");
				System.out.println();
				System.out.println(ANSI_GREEN
						+ "\t\t\t\t\t- - - > PRESS 2 TO SEE YOUR MOBILE NUMBER AND THEN TO START PAYMENT PROCESS");
				System.out.println();
				System.out.println(ANSI_RED
						+ "\t\t\t\t\t- - - > PRESS ANY NUMBER TO STOP YOUR PAYMENT PROCESS AND REDIRECT TO MAIN MENU");
				System.out.println();
				int on = sc.nextInt();
				System.out.println();
				if (on == 1) {
					m1();
					payment();
					System.out.println();
				} else if (on == 2) {
					System.out.println(ANSI_RESET + Bold + Font + ANSI_CYAN
							+ "\t\t\t\t\t\t-----------------------------------------------");
					System.out.println(
							ANSI_RESET + Bold + Font + ANSI_YELLOW + "\t\t\t\t\t\t     YOUR MOBILE NUMBER - - - > "
									+ obj.getNum());
					System.out.println(ANSI_RESET + Bold + Font + ANSI_CYAN
							+ "\t\t\t\t\t\t-----------------------------------------------");
					System.out.println();
					System.out.println(ANSI_RESET + Bold + Font + ANSI_YELLOW + "\t\t\t\t\tPLEASE WAIT...");
					System.out.println();
					m1();
					System.out.println();
					payment();
					System.out.println();
				} else {
					System.out.println(ANSI_YELLOW + "\t\t\t\t\t$ - - $ OOPS!...PAYMENT UNSUCCESSFULL $ - - $");
					System.out.println();
					System.out.println(ANSI_BLUE + "\t\t\t\tPLEASE WAIT...YOU ARE REDIRECTING TO MAIN MENU - - -");
					m1();
					bilm = 0;
					mainMenu();
				}
			}
		} else {
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - PLEASE SELECT PROPER OPTION - - -");
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 1 TO REDIRECT TO PAYMENT OPTION");
			System.out.println();
			System.out.println(ANSI_RED
					+ "\t\t\t\t\t- - - > PRESS ANY NUMBER TO STOP YOUR PAYMENT PROCESS AND TO REDIRECT TO MAIN MENU");
			System.out.println();
			int ot = sc.nextInt();
			System.out.println();
			if (ot == 1) {
				m1();
				payment();
			} else {
				System.out.println(ANSI_RED + "\t\t\t\t\t$ - - $ OOPS!...PAYMENT UNSUCCESSFULL $ - - $");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\tPLEASE WAIT...YOU ARE REDIRECTING TO MAIN MENU - - -");
				m1();
				bilm = 0;
				mainMenu();
			}
		}
	}

	public static void main(String[] args)

	{

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(
				ANSI_RESET + Bold + Font + ANSI_YELLOW
						+ "\t\t\t\t\t*----------- WELCOME TO CV METRO TICKET BOOKING -----------*");

		System.out.println();

		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\t*------------------ @@@ " + Main.name.toUpperCase()
				+ " @@@ --------------------*");

		System.out.println();

		System.out.println();
		System.out.println();
		System.out.println(ANSI_BLUE + "\t\t\t\t\t*----------- PLEASE SELECT YOUR METRO LINE NAME -----------*");

		System.out.println();

		list();

		System.out.println();
		System.out.println(Line + "\t\t\t\t\t- - - <>- - <> - - THANK YOU FOR YOUR VISIT - - <> - - <> - - -");
		System.out.println();
		System.out.println();
		System.out.println();
	}

}

class BTR extends Main {
	static Scanner sc = new Scanner(System.in);
	static double bil;
	static int q = 148 + (int) (Math.random() * 100);
	static int n = 10 + (int) (Math.random() * 90);

	static double acCoach(int b) {
		return b * n;
	}

	static double sleeperCoach(int b) {
		return b * n;
	}

	static double seatersCoach(int b) {
		return b * n;
	}

	static void seat(int s) {

		if (s == 1) {
			System.out.println(ANSI_BLUE + "\t\t\t\t\t*-----PLEASE ENTER PASSENGER DETAILS-----*");
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t----> ENTER NAME <---");
			System.out.println();
			String n11 = sc.next();
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t---> ENTER AGE <---");
			System.out.println();
			int a11 = sc.nextInt();
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t---> ENTER GENDER <---");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - PLEASE ENTER PROPER GENDER - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF MALE.....PRESS ->M - - - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF FEMALE...PRESS ->F - - - -");
			System.out.println();
			char g11 = sc.next().charAt(0);
			System.out.println();
			System.out.println();
			System.out.println(ANSI_CYAN + "\t\t\t\t\t#-----PASSENGER DETAILS-----#");
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\tNAME     : " + n11.toUpperCase());
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tAGE      : " + a11);
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\tGENDER   : " + g11);
			System.out.println();
			System.out.println(ANSI_CYAN + "\t\t\t\t\tSEAT NO  : " + q);
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t* - - - * - - - * - - - * - - - * - - -* - - - *");
			System.out.println();
			System.out.println();

		} else if (s == 2) {
			System.out.println(ANSI_GREEN + "\t\t\t\t\t*-----PLEASE ENTER PASSENGER 1 DETAILS-----*");
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NAME");
			System.out.println();
			String n21 = sc.next();
			System.out.println(ANSI_CYAN + "\t\t\t\t\t- - - > ENTER AGE");
			System.out.println();
			int a21 = sc.nextInt();
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t- - - > ENTER GENDER");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - PLEASE ENTER PROPER GENDER - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF MALE.....PRESS ->M - - - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF FEMALE...PRESS ->F - - - -");
			System.out.println();
			char g21 = sc.next().charAt(0);
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t*-----PLEASE ENTER PASSENGER 2 DETAILS-----*");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > ENTER NAME");
			System.out.println();
			String n22 = sc.next();
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t- - - > ENTER AGE");
			System.out.println();
			int a22 = sc.nextInt();
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t- - - > ENTER GENDER");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - PLEASE ENTER PROPER GENDER - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF MALE.....PRESS ->M - - - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF FEMALE...PRESS ->F - - - -");
			System.out.println();
			char g22 = sc.next().charAt(0);
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t#-----PASSENGER 1 DETAILS-----#");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tNAME     : " + n21.toUpperCase());
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\tAGE      : " + a21);
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\tGENDER   : " + g21);
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\tSEAT NO  : " + q);
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t#-----PASSENGER 2 DETAILS-----#");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tNAME     : " + n22.toUpperCase());
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\tAGE      : " + a22);
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\tGENDER   : " + g22);
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t* - - - * - - - * - - - * - - - * - - -* - - - *");
			System.out.println();
			System.out.println();

		} else if (s == 3) {
			System.out.println(ANSI_GREEN + "\t\t\t\t\t*-----PLEASE ENTER PASSENGER 1 DETAILS-----*");
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NAME");
			System.out.println();
			String n31 = sc.next();
			System.out.println(ANSI_CYAN + "\t\t\t\t\t- - - > ENTER AGE");
			System.out.println();
			int a31 = sc.nextInt();
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t- - - > ENTER GENDER");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - PLEASE ENTER PROPER GENDER - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF MALE.....PRESS ->M - - - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF FEMALE...PRESS ->F - - - -");
			System.out.println();
			char g31 = sc.next().charAt(0);
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t*-----PLEASE ENTER PASSENGER 2 DETAILS-----*");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > ENTER NAME");
			System.out.println();
			String n32 = sc.next();
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t- - - > ENTER AGE");
			System.out.println();
			int a32 = sc.nextInt();
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t- - - > ENTER GENDER");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - PLEASE ENTER PROPER GENDER - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF MALE.....PRESS ->M - - - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF FEMALE...PRESS ->F - - - -");
			System.out.println();
			char g32 = sc.next().charAt(0);
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t*-----PLEASE ENTER PASSENGER 3 DETAILS-----*");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > ENTER NAME");
			System.out.println();
			String n33 = sc.next();
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t- - - > ENTER AGE");
			System.out.println();
			int a33 = sc.nextInt();
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t- - - > ENTER GENDER");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - PLEASE ENTER PROPER GENDER - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF MALE.....PRESS ->M - - - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF FEMALE...PRESS ->F - - - -");
			System.out.println();
			char g33 = sc.next().charAt(0);
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t#-----PASSENGER 1 DETAILS-----#");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tNAME     : " + n31.toUpperCase());
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\tAGE      : " + a31);
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\tGENDER   : " + g31);
			System.out.println();
			System.out.println(ANSI_CYAN + "\t\t\t\t\tSEAT NO  : " + q);
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t- - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t#-----PASSENGER 2 DETAILS-----#");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tNAME     : " + n32.toUpperCase());
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\tAGE      : " + a32);
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\tGENDER   : " + g32);
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\tSEAT NO  : " + (q + 3));
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t#-----PASSENGER 3 DETAILS-----#");
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\tNAME     : " + n33.toUpperCase());
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tAGE      : " + a33);
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\tGENDER   : " + g33);
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\tSEAT NO  : " + (q + 5));
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t* - - - * - - - * - - - * - - - * - - -* - - - *");
			System.out.println();
			System.out.println();

		} else if (s == 4) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t*-----PLEASE ENTER PASSENGER 1 DETAILS-----*");
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NAME");
			System.out.println();
			String n41 = sc.next();
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t- - - > ENTER AGE");
			System.out.println();
			int a41 = sc.nextInt();
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - > ENTER GENDER");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - PLEASE ENTER PROPER GENDER - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF MALE.....PRESS ->M - - - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF FEMALE...PRESS ->F - - - -");
			System.out.println();
			char g41 = sc.next().charAt(0);
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t*-----PLEASE ENTER PASSENGER 2 DETAILS-----*");
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NAME");
			System.out.println();
			String n42 = sc.next();
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - > ENTER AGE");
			System.out.println();
			int a42 = sc.nextInt();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > ENTER GENDER");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - PLEASE ENTER PROPER GENDER - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF MALE.....PRESS ->M - - - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF FEMALE...PRESS ->F - - - -");
			System.out.println();
			char g42 = sc.next().charAt(0);
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t*-----PLEASE ENTER PASSENGER 3 DETAILS-----*");
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER NAME");
			System.out.println();
			String n43 = sc.next();
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t- - - > ENTER AGE");
			System.out.println();
			int a43 = sc.nextInt();
			System.out.println();
			System.out.println(ANSI_CYAN + "\t\t\t\t\t- - - > ENTER GENDER");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - PLEASE ENTER PROPER GENDER - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF MALE.....PRESS ->M - - - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF FEMALE...PRESS ->F - - - -");
			System.out.println();
			char g43 = sc.next().charAt(0);
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t*-----PLEASE ENTER PASSENGER 4 DETAILS-----*");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t- - - > ENTER NAME");
			System.out.println();
			String n44 = sc.next();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER AGE");
			System.out.println();
			int a44 = sc.nextInt();
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - > ENTER GENDER");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - PLEASE ENTER PROPER GENDER - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF MALE.....PRESS ->M - - - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -  - IF FEMALE...PRESS ->F - - - -");
			System.out.println();
			char g44 = sc.next().charAt(0);
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t#-----PASSENGER 1 DETAILS-----#");
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\tNAME     : " + n41.toUpperCase());
			System.out.println();
			System.out.println("\t\t\t\t\tAGE      : " + a41);
			System.out.println();
			System.out.println("\t\t\t\t\tGENDER   : " + g41);
			System.out.println();
			System.out.println("\t\t\t\t\tSEAT N0  : " + q);
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t#-----PASSENGER 2 DETAILS-----#");
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\tNAME     : " + n42.toUpperCase());
			System.out.println();
			System.out.println("\t\t\t\t\tAGE      : " + a42);
			System.out.println();
			System.out.println("\t\t\t\t\tGENDER   : " + g42);
			System.out.println();
			System.out.println("\t\t\t\t\tSEAT NO  : " + (q + 3));
			System.out.println();
			System.out.println(ANSI_CYAN + "\t\t\t\t\t- - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t#-----PASSENGER 3 DETAILS-----#");
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\tNAME     : " + n43.toUpperCase());
			System.out.println();
			System.out.println("\t\t\t\t\tAGE      : " + a43);
			System.out.println();
			System.out.println("\t\t\t\t\tGENDER   : " + g43);
			System.out.println();
			System.out.println("\t\t\t\t\tSEAT NO  : " + (q + 5));
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t- - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t#-----PASSENGER 4 DETAILS-----#");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tNAME     : " + n44.toUpperCase());
			System.out.println();
			System.out.println("\t\t\t\t\tAGE      : " + a44);
			System.out.println();
			System.out.println("\t\t\t\t\tGENDER   : " + g44);
			System.out.println();
			System.out.println("\t\t\t\t\tSEAT NO  : " + (q + 2));
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t* - - - * - - - * - - - * - - - * - - -* - - - *");
			System.out.println();
			System.out.println();

		} else {
			System.out.println(ANSI_RED + "\t\t\t\t\t**---NUMBER OF SEATS EXCEEDED THAN AVAILABLE---**");
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - > PRESS 1 TO SELECT FROM AVAILABLE NUMBER OF SEATS");
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - > PRESS ANY OTHER NUMBER TO REDIRECT TO MAIN MENU");
			System.out.println();
			int nn = sc.nextInt();
			System.out.println();
			if (nn == 1) {
				System.out.println("PLEASE WAIT...");
				m1();
				coach();
			} else {
				System.out.println("PLEASE WAIT...");
				m1();
				bil = 0;
				mainMenu();
			}
		}
	}

	static void coach() {
		System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 1 FOR AC COACH");
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - > PRESS 2 FOR SLEEPERS COACH");
		System.out.println();
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t- - - > PRESS 3 FOR SEATERS COACH");
		System.out.println();
		int c = sc.nextInt();
		System.out.println();
		if (c == 1) {
			System.out.println(ANSI_RED + "\t\t\t\t\t---> ENTER NO OF SEATS <---");
			System.out.println();
			int s = sc.nextInt();
			System.out.println();
			seat(s);
			bil = bil + acCoach(n);
			billing(bil);
		} else if (c == 2) {
			System.out.println(ANSI_CYAN + "\t\t\t\t\t---> ENTER NO OF SEATS <---");
			System.out.println();
			int s = sc.nextInt();
			System.out.println();
			seat(s);
			bil = bil + sleeperCoach(n);
			billing(bil);
		} else if (c == 3) {
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t---> ENTER NO OF SEATS <---");
			System.out.println();
			int s = sc.nextInt();
			System.out.println();
			seat(s);
			bil = bil + seatersCoach(n);
			billing(bil);
		} else {
			System.out.println(ANSI_RED + "\t\t\t\t\t- - - YOU SELECTED IMPROPER COACH - - -");
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t- - -> PRESS 1 TO AGAIN SELECT THE COACH TYPE");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -> PRESS ANY OTHER NUMBER TO REDIRECT TO MAIN MENU");
			System.out.println();
			int in = sc.nextInt();
			System.out.println();
			if (in == 1) {
				System.out.println("PLEASE WAIT...");
				m1();
				coach();
			} else {
				System.out.println("PLEASE WAIT...");
				m1();
				bil = 0;
				mainMenu();
			}
		}
	}

	static void billing(double b) {
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t$$$ ----- PAYMENT DETAILS -----$$$");
		System.out.println();
		System.out.printf(ANSI_GREEN + "\t\t\t\t\tTOTAL AMOUNT             : " + "%.2f", b);
		System.out.println();
		System.out.println();
		double gst = b * 0.15;
		System.out.printf(ANSI_YELLOW + "\t\t\t\t\tGST                      : " + "%.2f", gst);
		System.out.println();
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\t-----------------------------------------");
		System.out.println();
		System.out.printf(ANSI_YELLOW + "\t\t\t\t\tTOTAL PAYABLE AMOUNT     : " + "%.2f", (b + gst));
		System.out.println();
		System.out.println();
		System.out.println(ANSI_WHITE + "\t\t\t\t\t-----------------------------------------");
		System.out.println();
	}
}

class A1 extends BTR {
	static Scanner sc = new Scanner(System.in);
	static SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
	static Date date = new Date();

	static String dt = sd.format(date);

	static double garuda(int b) {
		return b * 555;
	}

	static double rajadhani(int b) {
		return b * 450;
	}

	static double superLuxury(int b) {
		return b * 380;
	}

	static double deluxe(int b) {
		return b * 300;
	}

	static void list() {
		System.out.println(ANSI_YELLOW + "\t\t\t\t\t@------- YOU CAN START YOUR BUS SEAT RESERVATION PROCESS ------@");
		System.out.println();
		System.out.println();
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t*------------ PLEASE ENTER YOUR SOURCE STATION ----------------*");

		System.out.println();
		String ss = sc.next();
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\t*---------- PLEASE ENTER YOUR DESTINATION STATION -------------*");

		System.out.println();
		String ds = sc.next();
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\t\t\t@ - - - @ PLEASE SELECT YOUR TRAVELLING BUS TYPE @ - - - @ ");
		System.out.println();
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t- - - > Press 1 for GARUDA");
		System.out.println();
		System.out.println(ANSI_CYAN + "\t\t\t\t\t- - - > press 2 for RAJADHANI");
		System.out.println();
		System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > Press 3 for SUPER LUXURY");
		System.out.println();
		System.out.println(ANSI_YELLOW + "\t\t\t\t\t- - - > Press 4 for DELUXE");
		System.out.println();
		int d = sc.nextInt();
		System.out.println();
		if (d == 1) {
			coach();
			System.out.println();
			System.out.println(ANSI_CYAN + "\t\t\t\t\tBUS NO        : TS 29Z 1019");
			System.out.println();
			System.out.println("\t\t\t\t\tBUS NAME      : GARUDA");
			System.out.println();
			System.out.println("\t\t\t\t\tSOURCE        : " + ss.toUpperCase());
			System.out.println();
			System.out.println("\t\t\t\t\tDESTINATION   : " + ds.toUpperCase());
			System.out.println();
			System.out.println();
			System.out.println("\t\t\t\t\tBOOKING TIME  : " + dt);
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t* - - - * - - - * - - - * - - - * - - -* - - - *");
			System.out.println();
			System.out.println();
		} else if (d == 2) {
			coach();
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\tBUS NO       : TS 53Z 1209");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tBUS NAME     : RAJADHANI");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tSOURCE       : " + ss.toUpperCase());
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tDESTINATION  : " + ds.toUpperCase());
			System.out.println();
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\tBOOKING TIME : " + dt);
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t* - - - * - - - * - - - * - - - * - - -* - - - *");
			System.out.println();
			System.out.println();

		} else if (d == 3) {

			coach();
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\tBUS NO       : TS 23Z 9853");
			System.out.println();
			System.out.println("\t\t\t\t\tBUS NAME     : SUPER LUXURY");
			System.out.println();
			System.out.println("\t\t\t\t\tSOURCE       : " + ss.toUpperCase());
			System.out.println();
			System.out.println("\t\t\t\t\tDESTINATION  : " + ds.toUpperCase());
			System.out.println();
			System.out.println();
			System.out.println("\t\t\t\t\tBOOKING TIME : " + dt);
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t* - - - * - - - * - - - * - - - * - - -* - - - *");
			System.out.println();
			System.out.println();
		} else if (d == 4) {
			coach();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\tBUS NO       : TS 64Z 5634");
			System.out.println();
			System.out.println("\t\t\t\t\tBUS NAME     : DELUXE Expresss");
			System.out.println();
			System.out.println("\t\t\t\t\tSOURCE       : " + ss.toUpperCase());
			System.out.println();
			System.out.println("\t\t\t\t\tDESTINATION  : " + ds.toUpperCase());
			System.out.println();
			System.out.println();
			System.out.println("\t\t\t\t\tBOOKING TIME : " + dt);
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t* - - - * - - - * - - - * - - - * - - -* - - - *");
			System.out.println();
			System.out.println();

		} else {
			System.out.println(ANSI_RED + "\t\t\t\t\t- - - OOPS!...YOU ENTERED INCORRECT OPTION - - - ");
			System.out.println();
			System.out.println(ANSI_BLUE
					+ "\t\t\t\t\t- - -> PRESS 1 TO LOGIN AGAIN AND SELECT THE TRAVELLING BUS TYPE FROM THE AVAILABLE LIST");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - -> PRESS ANY OTHER NUMBER TO REDIRECT TO MAIN MENU");
			System.out.println();
			int ii = sc.nextInt();
			System.out.println();
			if (ii == 1) {
				System.out.println("PLEASE WAIT...");
				m1();
				list();
			} else {
				System.out.println("PLEASE WAIT...");
				m1();
				bil = 0;
				mainMenu();
			}
		}
	}
}

class User extends A {
	static Scanner sc = new Scanner(System.in);

	static void validate() {
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t- - - > ENTER OTP < - - -");
		System.out.println();
		int n = sc.nextInt();
		System.out.println();
		if (n == otp) {
			System.out.println(ANSI_WHITE + "\t\t\t\t\t.....PLEASE WAIT...VALIDATING OTP");
			System.out.println();
			m1();
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t% - - - OTP VALIDATION IS SUCCESSFULL - - - %");
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t- - - > PRESS 1 TO SEE YOUR PASSWORD");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 2 TO RESET YOUR PASSWORD");
			System.out.println();
			int k = sc.nextInt();
			System.out.println();
			if (k == 1) {
				System.out.println(obj.getPass());
				System.out.println();
			} else if (k == 2) {
				System.out.print(ANSI_BLUE + "\t\t\t\t\t- - - > ENTER YOUR NEW PASSWORD");
				System.out.println();
				obj.setPass(sc.next());
				System.out.println();
			}
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 1 TO LOGIN AGAIN");
			System.out.println();
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t- - - > PRESS ANY NUMBER TO EXIT THE PORTAL");
			System.out.println();
			int p = sc.nextInt();
			System.out.println();
			if (p == 1) {
				System.out.println(ANSI_BLUE + "\t\t\t\t\t.....PLEASE WAIT...YOU ARE REDIRECTING TO LOGIN PAGE.....");
				m1();
				System.out.println();
				System.out.println(
						ANSI_PURPLE + "\t\t\t\t\t- - - PLEASE ENTER YOUR DETAILS AND START LOGIN PROCESS - - -");
				System.out.println();
				login();
			} else {
				System.out.print(ANSI_RED + "\t\t\t\t\t!.....LOGIN UNSUCCESSFULL.....!");
				System.out.println();
				System.out.println();
			}
		} else {
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t- - - YOU ENTERED WRONG OTP - - - ");
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 1 TO ENTER OTP AGAIN");
			System.out.println();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 2 TO LOGIN AGAIN");
			System.out.println();
			System.out.println(ANSI_YELLOW + "\t\t\t\t\t- - - > PRESS ANY OTHER NUMBER TO REDIRECT TO MAIN MENU");
			System.out.println();
			int v = sc.nextInt();
			if (v == 1) {
				validate();
			} else if (v == 2) {
				System.out
						.println(ANSI_WHITE + "\t\t\t\t\t......PLEASE WAIT...YOU ARE REDIRECTING TO LOGIN PAGE......");
				m1();
				System.out.println();
				System.out.println(
						ANSI_BLUE + "\t\t\t\t\t- - - PLEASE ENTER YOUR DETAILS AND START TICKET BOOKING PROCESS- - -");
				login();
			} else {
				System.out.println(ANSI_RED + "\t\t\t\t\t\t!.....LOGIN UNSUCCESSFULL.....!");
				System.out.println();
				System.out.println("PLEASE WAIT... YOU ARE REDIRECTING TO MAIN MENU");
				m1();
				mainMenu();
			}
		}
	}

	static int login() {
		System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - > PLEASE ENTER YOUR USER NAME");
		System.out.println();
		String un = sc.next();
		System.out.println();
		if (Main.name.equals(un)) {
			System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PLEASE ENTER YOUR PASSWORD");
			System.out.println();
			String pd = sc.next();
			if (obj.getPass().equals(pd)) {
				System.out.println(ANSI_WHITE + "\t\t\t\t\t\t\t!.....* LOGIN SUCCESSFULL *.....!");
				System.out.println();
				System.out.println();
				System.out.println("PLEASE WAIT...");
				m1();
				return 1;
			} else {
				System.out.println(ANSI_RED + "\t\t\t\t\t- - - OOPS!... INCORRECT PASSWORD - - -");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 1 TO LOGIN AGAIN");
				System.out.println();
				System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 2 TO RESET PASSWORD USING PHONE NUMBER");
				System.out.println();
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t- - - > PRESS ANY OTHER NUMBER TO REDIRECT TO MAIN MENU");
				System.out.println();
				int r = sc.nextInt();
				System.out.println();
				if (r == 1) {
					System.out.println("PLEASE WAIT...");
					m1();
					login();
				} else if (r == 2) {
					System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > ENTER PHONE NUMBER");
					System.out.println();
					String ph = sc.next();
					System.out.println();
					if (obj.getNum().equals(ph)) {
						System.out.println(
								ANSI_WHITE + "\t\t\t\t\t- - PLEASE WAIT...OTP IS BEING SENT TO YOUR PHONE NUMBER - -");
						System.out.println();
						m1();
						System.out.println();
						otp = 1000 + (int) (Math.random() * 8999);
						System.out.println(ANSI_PURPLE + "\t\t\t\tOTP is " + otp);
						System.out.println();
						System.out.println("PLEASE WAIT...");
						m1();
						validate();
						return 0;
					} else {
						System.out.print(
								ANSI_RED + "\t\t\t\t\tYOU ENTERED WRONG PHONE NUMBER...PLEASE RECHECK AND LOGIN AGAIN");
						System.out.println();
						System.out.println();
						m1();
						login();
					}
				} else {
					System.out.println(ANSI_RED + "\t\t\t\t\t\t!.....LOGIN UNSUCCESSFULL.....!");
					System.out.println();
					return 0;
				}
			}
		} else {
			System.out.println(ANSI_RED + "\t\t\t\t\t- - - OOPS!---INVALID USERNAME - - -");
			System.out.println();
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 1 TO LOGIN AGAIN");
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - > PRESS ANY OTHER NUMBER TO REDIRECT TO MAIN MENU");
			System.out.println();
			int l = sc.nextInt();
			System.out.println();
			if (l == 1) {
				System.out.println(ANSI_BLUE + "\t\t\t\t\t.....PLEASE WAIT...YOU ARE REDIRECTING TO LOGIN PAGE.....");
				System.out.println();
				m1();
				login();
				A1.list();
				payment();
			} else if (l == 2) {
				System.out.println(ANSI_RED + "\t\t\t\t\t\t!.....LOGIN UNSUCCESSFULL.....!");
				System.out.println();
				m1();
				return 0;
			}
		}
		return 0;

	}

	static void payment() {
		System.out.println(ANSI_PURPLE + "\t\t\t\t\t- - - - - PLEASE PROCEED WITH ONLENE PAYMENT - - - - -");
		System.out.println();
		System.out.println(ANSI_YELLOW + "\t\t\t\t\t- - - > PRESS 1 TO START ONLINE TRANSACTION");
		System.out.println();
		int nt = sc.nextInt();
		System.out.println();
		if (nt == 1) {
			System.out.println(ANSI_RED + "\t\t\t\t\t- - - > PLEASE ENTER PHONE NUMBER");
			System.out.println();
			String ns = sc.next();
			System.out.println();
			if (obj.getNum().equals(ns)) {
				System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PLEASE ENTER UPI PIN");
				System.out.println();
				int pn = sc.nextInt();
				System.out.println();
				System.out.println(ANSI_GREEN + "- - PLEASE WAIT...VALIDATING PIN NUMBER - -");
				System.out.println();
				m1();
				System.out.println();
				if (Main.pin == pn) {
					System.out.println(ANSI_YELLOW + "\t\t\t\t\t- - - - VALIDATION COMPLETED SUCCESSFULLY - - - - -");
					System.out.println();
					System.out.println();
					System.out.println(ANSI_BLUE + "\t\t\t\t\t* - - - * YOUR TICKET BOOKED SUCCESSFULLY * - - - *");
					System.out.println();
					System.out.println(ANSI_GREEN + "\t\t\t\t\t* - - - - - - - * HAPPY JOURNEY * - - - - - - - - *");
					System.out.println();
					m1();
					System.out.println(ANSI_YELLOW + "\t\t\t\t\t- - - > PRESS 1 TO BOOK BUS TICKET AGAIN");
					System.out.println();
					System.out.println(ANSI_YELLOW + "\t\t\t\t\t- - - > ANY OTHER NUMBER TO REDIRECT TO MAIN MENU");
					System.out.println();
					BTR.bil = 0;
					int ab = sc.nextInt();
					if (ab == 1) {
						m1();
						A1.list();
						payment();
					} else {
						System.out.println("PLEASE WAIT... YOU ARE REDIRECTING TO MAIN MENU");
						m1();
						BTR.bil = 0;
						mainMenu();
					}
				} else {
					System.out.println(ANSI_RED + "\t\t\t\t\t- - - OOPS!... INVALID PIN NUMBER - - - ");
					System.out.println();
					System.out.println();
					System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 1 TO RESET PIN NUMBER AND PAY AGAIN");
					System.out.println();
					System.out.println(ANSI_YELLOW + "\t\t\t\t\t- - - > PRESS 2 TO REDIRECT TO PAYMENT OPTION");
					System.out.println();
					System.out.println(ANSI_RED
							+ "\t\t\t\t\t- - - > PRESS ANY NUMBER TO STOP YOUR PAYMENT PROCESS AND TO REDIRECT TO MAIN MENU");
					int op = sc.nextInt();
					System.out.println();
					if (op == 1) {
						System.out.println("ENTER NEW PIN NUMBER");
						System.out.println();
						int rp = sc.nextInt();
						System.out.println();
						Main.pin = rp;
						System.out.println();
						payment();
					} else if (op == 2) {
						m1();
						payment();
					} else {
						System.out.println(ANSI_RED + "\t\t\t\t\t$ - - $ OOPS!...PAYMENT UNSUCCESSFULL $ - - $!");
						System.out.println();
						System.out.println("PLEASE WAIT... YOU ARE REDIRECTING TO MAIN MENU");
						m1();
						BTR.bil = 0;
						mainMenu();
					}
				}
			} else {
				System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - OOPS!...INVALID MOBILE NUMBER - - -");
				System.out.println();
				System.out.println(ANSI_GREEN + "\t\t\t\t\t- - - > PRESS 1 TO REDIRECT TO PAYMENT OPTION");
				System.out.println();
				System.out.println(ANSI_RED
						+ "\t\t\t\t\t- - - > PRESS ANY NUMBER TO STOP YOUR PAYMENT PROCESS AND REDIRECT TO MAIN MENU");
				System.out.println();
				int on = sc.nextInt();
				System.out.println();
				if (on == 1) {
					m1();
					payment();
				} else {
					System.out.println(ANSI_YELLOW + "\t\t\t\t\t$ - - $ OOPS!...PAYMENT UNSUCCESSFULL $ - - $");
					System.out.println();
					System.out.println("PLEASE WAIT... YOU ARE REDIRECTING TO MAIN MENU");
					m1();
					BTR.bil = 0;
					mainMenu();
				}
			}
		} else {
			System.out.println(ANSI_BLUE + "\t\t\t\t\t- - - > PRESS 1 TO REDIRECT TO PAYMENT OPTION");
			System.out.println();
			System.out.println(ANSI_RED + "\t\t\t\t\t- - - > PRESS ANY NUMBER TO STOP YOUR PAYMENT PROCESS");
			System.out.println();
			int ot = sc.nextInt();
			System.out.println();
			if (ot == 1) {
				m1();
				payment();
			} else {
				System.out.println(ANSI_RED + "\t\t\t\t\t$ - - $ OOPS!...PAYMENT UNSUCCESSFULL $ - - $");
				System.out.println();
				System.out.println("PLEASE WAIT... YOU ARE REDIRECTING TO MAIN MENU");
				m1();
				BTR.bil = 0;
				mainMenu();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println();
		System.out.println(
				ANSI_RESET + ANSI_YELLOW + "\t\t\t\t\t*----------- WELCOME TO TSRTC BUS SEAT RESERVATION -----------*");
		System.out.println();
		System.out.println();
		System.out.println();
		int k = login();
		if (k == 1) {
			m1();
			A1.list();
			m1();
			payment();
			System.out.println(ANSI_GREEN + "\t\t\t\t\t*............THANK YOU FOR YOUR VISIT.............*");
			System.out.println();
			System.out.println(ANSI_WHITE + "\t\t\t\t\t*................HAVE A NICE DAY..................*");
			System.out.println();
		} else {
			System.out.println(ANSI_BLUE + "\t\t\t\t\t*............THANK YOU FOR YOUR VISIT.............*");
			System.out.println();
			System.out.println(Line + ANSI_PURPLE + "\t\t\t\t\t*................HAVE A NICE DAY..................*");
			System.out.println();
			System.out.println("\t\t\t\t\tPLEASE WAIT... YOU ARE REDIRECTING TO MAIN MENU");
			System.out.println();
			m1();
			BTR.bil = 0;
			mainMenu();
		}

	}
}

class Reserv extends Main {
	static double Tbill = 0;
	static Scanner sc = new Scanner(System.in);
	static int q = 148 + (int) (Math.random() * 100);
	static int m = 400 + (int) (Math.random() * 599);

	static double AC(int b) {
		return b * m;
	}

	static double Sleeper(int b) {
		return b * m;
	}

	static double Seater(int b) {
		return b * m;
	}

	static String x = "";

	static void seat(int n) {

		if (n == 1) {

			System.out.println("\t\t\t\t\t " + ANSI_RED + " ->>> Please Enter Passenger 1 details <<<-\n");

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your name");
			System.out.println(ANSI_BLUE);
			String p1 = sc.next();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Age");
			System.out.println(ANSI_BLUE);
			int a1 = sc.nextInt();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Gender(M/F)");
			System.out.println(ANSI_BLUE);
			char g1 = sc.next().charAt(0);
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Name	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + p1);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Age	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + a1);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Gender	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + g1);

			System.out.println(ANSI_PURPLE);

			x = x + ANSI_RED + "\t\t\t\t\t Name	 : " + ANSI_BLUE + " " + p1 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Age	 : " + ANSI_BLUE + " " + a1 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Gender	 : " + ANSI_BLUE + " " + g1 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Seat no : " + ANSI_BLUE + " " + q + "\n\n\n";

		} else if (n == 2) {

			System.out.println("\t\t\t\t\t " + ANSI_RED + " ->>> Please Enter Passenger 1 details <<<-\n");

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your name");
			System.out.println(ANSI_BLUE);
			String p1 = sc.next();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Age");
			System.out.println(ANSI_BLUE);
			int a1 = sc.nextInt();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Gender(M/F)");
			System.out.println(ANSI_BLUE);
			char g1 = sc.next().charAt(0);

			System.out.println("\t\t\t\t\t " + ANSI_RED + "Name	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + p1);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Age	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + a1);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Gender	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + g1);
			System.out.println();

			System.out.println("\t\t\t\t\t " + ANSI_RED + " ->>> Please Enter Passenger 2 details <<<-\n");

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your name");
			System.out.println(ANSI_BLUE);
			String p2 = sc.next();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Age");
			System.out.println(ANSI_BLUE);
			int a2 = sc.nextInt();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Gender(M/F)");
			System.out.println(ANSI_BLUE);
			char g2 = sc.next().charAt(0);

			System.out.println("\t\t\t\t\t " + ANSI_RED + "Name	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + p2);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Age	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + a2);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Gender	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + g2);
			System.out.println();
			System.out.println(ANSI_PURPLE);

			x = x + ANSI_RED + "\t\t\t\t\t Name	 : " + ANSI_BLUE + " " + p1 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Age	 : " + ANSI_BLUE + " " + a1 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Gender	 : " + ANSI_BLUE + " " + g1 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Seat no : " + ANSI_BLUE + " " + q + "\n\n\n";

			x = x + ANSI_RED + "\t\t\t\t\t Name	 : " + ANSI_BLUE + " " + p2 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Age	 : " + ANSI_BLUE + " " + a2 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Gender	 : " + ANSI_BLUE + " " + g2 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Seat no : " + ANSI_BLUE + " " + (q + 3) + "\n\n\n";

		} else if (n == 3) {
			System.out.println("\t\t\t\t\t " + ANSI_RED + " ->>> Please Enter Passenger 1 details <<<-\n");

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your name");
			System.out.println(ANSI_BLUE);
			String p1 = sc.next();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Age");
			System.out.println(ANSI_BLUE);
			int a1 = sc.nextInt();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Gender(M/F)");
			System.out.println(ANSI_BLUE);
			char g1 = sc.next().charAt(0);

			System.out.println("\t\t\t\t\t " + ANSI_RED + "Name	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + p1);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Age	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + a1);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Gender	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + g1);

			System.out.println("\t\t\t\t\t " + ANSI_RED + "Please Enter Passenger 2 details <<--\n");

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your name");
			System.out.println(ANSI_BLUE);
			String p2 = sc.next();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Age");
			System.out.println(ANSI_BLUE);
			int a2 = sc.nextInt();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Gender(M/F)");
			System.out.println(ANSI_BLUE);
			char g2 = sc.next().charAt(0);

			System.out.println("\t\t\t\t\t " + ANSI_RED + "Name	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + p2);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Age	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + a2);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Gender	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + g2);
			System.out.println();

			System.out.println("\t\t\t\t\t " + ANSI_RED + " ->>> Please Enter Passenger 3 details <<<-\n");

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your name");
			System.out.println(ANSI_BLUE);
			String p3 = sc.next();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Age");
			System.out.println(ANSI_BLUE);
			int a3 = sc.nextInt();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Gender(M/F)");
			System.out.println(ANSI_BLUE);
			char g3 = sc.next().charAt(0);

			System.out.println("\t\t\t\t\t " + ANSI_RED + "Name	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + p3);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Age	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + a3);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Gender	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + g3);
			System.out.println();
			System.out.println(ANSI_PURPLE);

			x = x + ANSI_RED + "\t\t\t\t\t Name	 : " + ANSI_BLUE + " " + p1 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Age	 : " + ANSI_BLUE + " " + a1 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Gender	 : " + ANSI_BLUE + " " + g1 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Seat no : " + ANSI_BLUE + " " + q + "\n\n\n";

			x = x + ANSI_RED + "\t\t\t\t\t Name	 : " + ANSI_BLUE + " " + p2 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Age	 : " + ANSI_BLUE + " " + a2 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Gender	 : " + ANSI_BLUE + " " + g2 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Seat no : " + ANSI_BLUE + " " + (q + 3) + "\n\n\n";

			x = x + ANSI_RED + "\t\t\t\t\t Name	 : " + ANSI_BLUE + " " + p3 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Age	 : " + ANSI_BLUE + " " + a3 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Gender	 : " + ANSI_BLUE + " " + g3 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Seat no : " + ANSI_BLUE + " " + (q + 5) + "\n\n\n";
		}

		else if (n == 4) {
			System.out.println("\t\t\t\t\t " + ANSI_RED + " ->>> Please Enter Passenger 1 details <<<-\n");

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your name");
			System.out.println(ANSI_BLUE);
			String p1 = sc.next();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Age");
			System.out.println(ANSI_BLUE);
			int a1 = sc.nextInt();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Gender(M/F)");
			System.out.println(ANSI_BLUE);
			char g1 = sc.next().charAt(0);

			System.out.println("\t\t\t\t\t " + ANSI_RED + "Name	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + p1);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Age	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + a1);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Gender	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + g1);
			System.out.println();

			System.out.println("\t\t\t\t\t " + ANSI_RED + " ->>> Please Enter Passenger 2 details <<<-\n");

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your name");
			System.out.println(ANSI_BLUE);
			String p2 = sc.next();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Age");
			System.out.println(ANSI_BLUE);
			int a2 = sc.nextInt();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Gender(M/F)");
			System.out.println(ANSI_BLUE);
			char g2 = sc.next().charAt(0);

			System.out.println("\t\t\t\t\t " + ANSI_RED + "Name	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + p2);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Age	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + a2);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Gender	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + g2);
			System.out.println();

			System.out.println("\t\t\t\t\t " + ANSI_RED + " ->>> Please Enter Passenger 3 details <<<-\n");

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t *^* ENTER YOUR NAME *^* ");
			System.out.println(ANSI_BLUE);
			String p3 = sc.next();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t *^* Enter your Age *^* ");
			System.out.println(ANSI_BLUE);
			int a3 = sc.nextInt();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t *^* ENTER YOUR GENDER(M/F) *^*");
			System.out.println(ANSI_BLUE);
			char g3 = sc.next().charAt(0);

			System.out.println("\t\t\t\t\t " + ANSI_RED + "Name	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + p3);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Age	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + a3);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Gender	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + g3);
			System.out.println();

			System.out.println("\t\t\t\t\t " + ANSI_RED + " ->>> Please Enter Passenger 4 details <<<-\n");

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t *^* ENTER YOUR NAME *^* ");
			System.out.println(ANSI_BLUE);
			String p4 = sc.next();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Age");
			System.out.println(ANSI_BLUE);
			int a4 = sc.nextInt();

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t Enter your Gender(M/F)");
			System.out.println(ANSI_BLUE);
			char g4 = sc.next().charAt(0);

			System.out.println("\t\t\t\t\t " + ANSI_RED + "Name	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + p4);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Age	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + a4);
			System.out.println();
			System.out.println("\t\t\t\t\t " + ANSI_RED + "Gender	" + ANSI_WHITE + ": " + ANSI_BLUE + " " + g4);
			System.out.println();
			System.out.println();

			System.out.println();
			System.out.println(ANSI_PURPLE);

			x = x + ANSI_RED + "\t\t\t\t\t Name	 : " + ANSI_BLUE + " " + p1 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Age	 : " + ANSI_BLUE + " " + a1 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Gender	 : " + ANSI_BLUE + " " + g1 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Seat no : " + ANSI_BLUE + " " + q + "\n\n\n";

			x = x + ANSI_RED + "\t\t\t\t\t Name	 : " + ANSI_BLUE + " " + p2 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Age	 : " + ANSI_BLUE + " " + a2 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Gender	 : " + ANSI_BLUE + " " + g2 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Seat no : " + ANSI_BLUE + " " + (q + 3) + "\n\n\n";

			x = x + ANSI_RED + "\t\t\t\t\t Name	 : " + ANSI_BLUE + " " + p3 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Age	 : " + ANSI_BLUE + " " + a3 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Gender	 : " + ANSI_BLUE + " " + g3 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Seat no : " + ANSI_BLUE + " " + (q + 5) + "\n\n\n";

			x = x + ANSI_RED + "\t\t\t\t\t Name	 : " + ANSI_BLUE + " " + p4 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Age	 : " + ANSI_BLUE + " " + a4 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Gender	 : " + ANSI_BLUE + " " + g4 + "\n";
			x = x + ANSI_RED + "\t\t\t\t\t Seat no :" + ANSI_BLUE + " " + (q + 6) + "\n\n\n";
		} else {
			System.out.println("\t\t\t\t\tExceed Seat no");
			System.out.println();
			System.out.println("\t\t\t\t\t press 1 for seat registration \n\t\t\t\t\t press any number for Menu back");

			int un = sc.nextInt();
			if (un == 1) {
				int en = sc.nextInt();
				seat(en);
			} else {
				A2.List();
			}

		}
	}

	static void res() {

		System.out.println(ANSI_RESET);
		System.out.println(ANSI_WHITE + "\t\t\t\t\t  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println(ANSI_RED + "\t\t\t\t\t |     <-_->      SELECT YOUR COACH        <-_->     | ");
		System.out.println(ANSI_BLUE + "\t\t\t\t\t |     <-_->      PRESS 1 FOR A.C          <-_->     | ");
		System.out.println(ANSI_BLUE + "\t\t\t\t\t |     <-_->      PRESS 2 FOR SLEEPER      <-_->     | ");
		System.out.println(ANSI_BLUE + "\t\t\t\t\t |     <-_->      PRESS 3 FOR 2-SEATER     <-_->     | ");
		System.out.println(ANSI_WHITE + "\t\t\t\t\t  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");

		System.out.println(ANSI_GREEN);
		System.out.println(Line);

		int k = sc.nextInt();
		if (k == 1) {
			System.out.println("\t\t\t\t\t *^* ENTER NO OF SEATS *^*");
			int n = sc.nextInt();
			seat(n);
			Login.Login();
			Tbill = Tbill + AC(n);
			Billing(Tbill);
		}

		else if (k == 2) {
			System.out.println("\t\t\t\t\t *^* ENTER NO OF SEATS *^*");
			int n = sc.nextInt();
			seat(n);
			Login.Login();
			Tbill = Tbill + Sleeper(n);
			Billing(Tbill);
		}

		else if (k == 3) {
			System.out.println("\t\t\t\t\t *^* ENTER NO OF SEATS *^*");
			int n = sc.nextInt();
			seat(n);
			Login.Login();
			Tbill = Tbill + Seater(n);
			Billing(Tbill);

		} else {
			System.out.println("\t\t\t\t\t ENTER INVALID COACH NUMBER");
			System.out.println();
			System.out.println("\t\t\t\t\t PRESS 1 FOR MENU \n \t\t\t\t\t PRESS ANY NUMBER TO SELECT COACH NUMBER");
			int ks = sc.nextInt();
			if (ks == 1) {
				A2.List();
			} else
				res();
		}

	}

	static void Billing(double b) {
		System.out.println(ANSI_BLUE + "\t\t\t\t\t Total Bill     	:" + b);
		double gst = b * 0.25;
		System.out.println("\t\t\t\t\t GST AMOUNT IS	: " + gst);
		System.out.println("\t\t\t\t\t TOTAL PAYBLE AMOUNT :" + (b + gst));
	}
}

class A2 extends Reserv {

	static Scanner sc = new Scanner(System.in);
	static double Tbill = 0;

	static double Konark(int b) {
		return b * 65;
	}

	static double Golconda(int b) {
		return b * 45;
	}

	static double Vande(int b) {
		return b * 500;
	}

	static double Godavari(int b) {
		return b * 80;
	}

	static void List() {
		System.out.println(ANSI_RESET + ANSI_WHITE + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * *");
		System.out.println(ANSI_RED + "\t\t\t\t\t*       ----->SOURCE LIST<-----       *");
		System.out.println(ANSI_WHITE + "\t\t\t\t\t* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  *");
		System.out.println(ANSI_WHITE + "\t\t\t\t\t*                                     *");
		System.out.println(ANSI_BLUE + "\t\t\t\t\t*         --->Warangal<---            *");
		System.out.println(ANSI_WHITE + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * *");
		System.out.println(ANSI_BLUE + "\t\t\t\t\t*           --->GOA<---               *");
		System.out.println(ANSI_WHITE + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * *");
		System.out.println(ANSI_BLUE + "\t\t\t\t\t*         --->Hyderabad<---           *");
		System.out.println(ANSI_WHITE + "\t\t\t\t\t*                                     *");
		System.out.println(ANSI_WHITE + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * *");

		/*
		 * System.out.println(ANSI_RED+"\t\t\t\t\tChoose your Source List");
		 * System.out.println(ANSI_BLUE+"\t\t\t\t\t	Warangal");
		 * System.out.println(ANSI_BLUE+"\t\t\t\t\t	Hyderabad");
		 * System.out.println(ANSI_BLUE+"\t\t\t\t\t	GOA");
		 */

		System.out.println(ANSI_GREEN);
		String sn = sc.next();

		if (sn.equalsIgnoreCase("Warangal") || sn.equalsIgnoreCase("Hyderabad") || sn.equalsIgnoreCase("GOA")) {

			System.out.println(ANSI_WHITE + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * *");
			System.out.println(ANSI_RED + "\t\t\t\t\t*      ----->DESTINATION LIST<-----   *");
			System.out.println(ANSI_WHITE + "\t\t\t\t\t* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  *");
			System.out.println(ANSI_WHITE + "\t\t\t\t\t*                                     *");
			System.out.println(ANSI_BLUE + "\t\t\t\t\t*          --->Kazipet<---            *");
			System.out.println(ANSI_WHITE + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * *");
			System.out.println(ANSI_BLUE + "\t\t\t\t\t*         --->Vijayawada<---          *");
			System.out.println(ANSI_WHITE + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * *");
			System.out.println(ANSI_BLUE + "\t\t\t\t\t*         --->Tirupathi<---           *");
			System.out.println(ANSI_WHITE + "\t\t\t\t\t*                                     *");
			System.out.println(ANSI_WHITE + "\t\t\t\t\t* * * * * * * * * * * * * * * * * * * *");

			/*
			 * System.out.println(ANSI_RED+"\t\t\t\t\t Choose your Destination point");
			 * System.out.println(ANSI_BLUE+"\t\t\t\t\t Kazipet");
			 * System.out.println(ANSI_BLUE+"\t\t\t\t\t Vijayawada");
			 * System.out.println(ANSI_BLUE+"\t\t\t\t\t Tirupati");
			 */

			System.out.println(ANSI_GREEN);
			String dn = sc.next();

			if (dn.equalsIgnoreCase("Kazipet") || dn.equalsIgnoreCase("Vijayawada")
					|| dn.equalsIgnoreCase("Tirupati")) {

				System.out.println(ANSI_RESET + " " + ANSI_WHITE
						+ "\t\t\t\t\t  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
				System.out.println(
						ANSI_BLUE + "\t\t\t\t\t |     >>-_-<<    (*_*) SELECT YOUR TRAIN (*_*)    >>-_-<<     | ");
				System.out.println(
						ANSI_BLUE + "\t\t\t\t\t |     >>-_-<<      PRESS 1 FOR KONARK EXPRESS     >>-_-<<     | ");
				System.out.println(
						ANSI_BLUE + "\t\t\t\t\t |     >>-_-<<      PRESS 2 FOR GOLCONDA EXPRESS   >>-_-<<     | ");
				System.out.println(
						ANSI_BLUE + "\t\t\t\t\t |     >>-_-<<      PRESS 3 FOR VANDE BHARAT       >>-_-<<     | ");
				System.out.println(
						ANSI_BLUE + "\t\t\t\t\t |     >>-_-<<      PRESS 4 FOR GODAVARI           >>-_-<<     | ");
				System.out.println(
						ANSI_WHITE + "\t\t\t\t\t  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
				System.out.println(Line);

				System.out.println(ANSI_WHITE);
				int d = sc.nextInt();
				if (d == 1) {
					res();

					System.out.println();
					System.out.println();
					System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - - - - - - - - - - - - - - ");
					System.out.println(ANSI_RED + "\t\t\t\t\t |Source      : " + sn + "        |");
					System.out.println(ANSI_RED + "\t\t\t\t\t | Destination : " + dn + "        |");
					System.out.println();
					System.out.println();
					System.out.println(ANSI_GREEN + " " + Reserv.x);
					System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - - - - - - - - - - - - - - ");
					System.out.println();
					System.out.println(Line);

				} else if (d == 2) {
					res();

					System.out.println();
					System.out.println(ANSI_RESET);
					System.out.println(
							ANSI_BLUE + "\t\t\t\t\t  Train no: 17202                    Train Name: Golconda Express");
					System.out.println(ANSI_BLUE + "\t\t\t\t\t  Timings: 12:30 pm to 3:00pm        Duration: 2hr30min");

					System.out.println();
					System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - - - - - - - - - - - - - - ");
					System.out.println(ANSI_RED + "\t\t\t\t\tSource      : " + sn);
					System.out.println(ANSI_RED + "\t\t\t\t\tDestination : " + dn);

					System.out.println(ANSI_GREEN + " " + Reserv.x);
					System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - - - - - - - - - - - - - - ");
					System.out.println(Line);

				} else if (d == 3) {

					res();
					System.out.println();
					System.out.println(ANSI_RESET);
					System.out.println(ANSI_BLUE
							+ "\t\t\t\t\t Train no: 20834                    Train Name:  Vishakaptanam vande Bharat semi-speed ");
					System.out.println(
							ANSI_BLUE + "\t\t\t\t\t Timings: 3:00 pm to 4:35pm         Duration: 1hrs 35minutes");

					System.out.println();
					System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - - - - - - - - - - - - - - ");
					System.out.println(ANSI_RED + "\t\t\t\t\tSource      : " + sn);
					System.out.println(ANSI_RED + "\t\t\t\t\tDestination : " + dn);

					System.out.println(ANSI_GREEN + " " + Reserv.x);
					System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - - - - - - - - - - - - - - ");
					System.out.println(Line);

				} else if (d == 4) {

					res();
					System.out.println();
					System.out.println(ANSI_RESET);
					System.out.println(
							ANSI_BLUE + "\t\t\t\t\t Train no: 17621                    Train Name:  GODAVARI EXPRESS ");
					System.out.println(ANSI_BLUE + "\t\t\t\t\t Timings: 6:00 pm to 8:00pm         Duration: 2hrs");

					System.out.println();
					System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - - - - - - - - - - - - - - ");
					System.out.println(ANSI_RED + "\t\t\t\t\tSource      : " + sn);
					System.out.println(ANSI_RED + "\t\t\t\t\tDestination : " + dn);

					System.out.println(ANSI_GREEN + " " + Reserv.x);
					System.out.println(ANSI_WHITE + "\t\t\t\t\t- - - - - - - - - - - - - - - - ");
					System.out.println(Line);

				} else {
					System.out.println(ANSI_YELLOW + "\t\t\t\t\t >>> INVALID NUMBER <<<");
					System.out.println();
					System.out.println(ANSI_CYAN + "\t\t\t\t\t >>>-_-<<< REDIRECTING TO MENU >>>-_-<<<");
					System.out.println();

					List();
				}
			} else {
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t >>> INVALID DESTINATION POINT <<< ");
				System.out.println();
				System.out.println(ANSI_CYAN + "\t\t\t\t\t >>> REDIRECTING TO MENU <<<");
				System.out.println();
				List();
			}
		} else {
			System.out.println("\t\t\t\t\t >> INVALID SOURCE POINT <<");
			System.out.println();
			System.out.println("\t\t\t\t\t >> REDIRECTING TO MENU <<");
			System.out.println();
			List();
		}
	}
}

class Login extends A2 {

	static void payment() {

		System.out.println(ANSI_PURPLE + " " + Bold + "\t\t\t\t\t >> PLEASE SELECT YOUR PAYMENT OPTION <<");
		System.out.println();
		System.out.println(ANSI_CYAN + "\t\t\t\t\t >>> PRESS 1 FOR NUMBER TRANSFER <<< ");
		System.out.println(ANSI_CYAN + "\t\t\t\t\t >>> PRESS ANY NUMBER REDIRECT TO MONEY TRANSFER <<<");
		int nt = sc.nextInt();
		if (nt == 1) {
			System.out.println(ANSI_PURPLE + "\t\t\t\t\t >>> PLEASE ENTER THE NUMBER <<< ");
			System.out.println(ANSI_YELLOW);
			String ns = sc.next();
			if (obj.getNum().equals(ns)) {
				System.out.println(ANSI_PURPLE + " " + Font + "\t\t\t\t\t >>> PLEASE ENTER YOUR UPI PIN <<<");
				System.out.println(ANSI_YELLOW);
				int pn = sc.nextInt();
				if (Main.pin == (pn)) {
					System.out.println(ANSI_PURPLE + "\t\t\t\t\t $$$$> YOUR PAYMENT HAS BEEEN SUCCESSFULL <$$$$");
					System.out.println();
					System.out.println();
				} else {
					System.out.println(ANSI_CYAN + "\t\t\t\t\t >>> INVALID NUMBER <<<");
					System.out.println(ANSI_CYAN
							+ "\t\t\t\t\t >>> PRESS 1 FOR REDIRECT TO PAYMENT \n \t\t\t\t\t >>> PRESS ANY NUMBER FOR MENU <<<");

					System.out.println(ANSI_YELLOW);
					int rn = sc.nextInt();
					if (rn == 1) {
						payment();
					} else {
						List();
					}
				}
			} else {
				System.out.println(ANSI_CYAN + "\t\t\t\t\t >>> INVALID NUMBER <<<");
				System.out.println(ANSI_CYAN
						+ "\t\t\t\t\t >>> PRESS 1 FOR REDIRECT TO PAYMENT \n \t\t\t\t\t >>> PRESS ANY NUMBER FOR MENU <<<");

				System.out.println(ANSI_YELLOW);
				int rn = sc.nextInt();
				if (rn == 1) {
					payment();
				} else {
					List();
				}
			}
		} else {
			System.out.println(ANSI_CYAN + "\t\t\t\t\t >>> INVALID NUMBER <<<");
			System.out.println(ANSI_CYAN
					+ "\t\t\t\t\t >>> PRESS 1 FOR REDIRECT TO PAYMENT \n \t\t\t\t\t >>> PRESS ANY NUMBER FOR MENU <<<");

			System.out.println(ANSI_YELLOW);
			int rn = sc.nextInt();
			if (rn == 1) {
				payment();
			} else {
				List();
			}
		}

	}

	static void Login() {
		System.out.println(ANSI_YELLOW + "\t\t\t\t\t >>> " + ANSI_BLUE + " " + Bold + " PLEASE ENTER YOUR USERNAME "
				+ ANSI_YELLOW + "<<< ");
		System.out.println(ANSI_WHITE);
		String un = sc.next();
		if (Main.name.equals(un)) {

			System.out.println(ANSI_YELLOW + ">>> " + ANSI_BLUE + " " + Bold + "\t\t\t\t\t PLEASE ENTER YOUR PASSWORD "
					+ ANSI_YELLOW + "<<< ");

			System.out.println(ANSI_YELLOW + "\t\t\t\t\t >>> PLEASE ENTER YOUR PASSWORD <<<");
			System.out.println(ANSI_WHITE);
			String pd = sc.next();
			if (obj.getPass().equals(pd)) {
				int k = 1000 + (int) (Math.random() * 8999); // verifaciation for not a System
				System.out.println(k);
				System.out.println(ANSI_YELLOW + "\t\t\t\t\tplease Enter OTP");
				System.out.println(ANSI_WHITE);
				int q = sc.nextInt();
				if (k == q) {
					payment();
				} else {
					System.out.print(ANSI_YELLOW + "\t\t\t\t\t Invalid Number");
				}
			} else {
				System.out.println(ANSI_YELLOW + "\t\t\t\t\t To Rest password press 1");
				System.out.println(ANSI_WHITE);
				int y = sc.nextInt();
				if (y == 1) {
					obj.setPass(sc.next());
					System.out.print(obj.getPass());
					Login();
				} else {
					System.out.println(ANSI_YELLOW);
					System.out.println("\t\t\t\t\t >> ENTER INVALID OPTION <<<");
					Login();
				}
			}
		} else {
			System.out.println(ANSI_BLUE + "\t\t\t\t\t >> INVALID USER NAME << ");
			// System.out.println (ANSI_PURPLE+"\t\t\t\t\t >> REDIRECTING TO LOGIN PAGE");
			System.out.println();
			System.out.println(
					"\t\t\t\t\t >>Press 1 for REDIRECTING TO LOGIN PAGE <<\n\t\t\t\t\t >> PRESS ANY NUMBER TO MENU <<");
			int sdc = sc.nextInt();
			if (sdc == 1) {
				Login();
			} else {
				A2.List();
			}

		}
	}

	public static void main(String[] args) {

		A2.List();
		System.out.println();
		System.out.println();
		System.out.println(
				ANSI_RED + "\t\t\t\t\tREMAINING AMOUNT : " + ANSI_BLUE + " " + (obj.balance = obj.balance - Tbill));
		Tbill = 0;
		System.out.println(ANSI_CYAN
				+ "\t\t\t\t\t >>> PRESS 1 FOR REDIRECT TO PAYMENT \n \t\t\t\t\t >>> PRESS ANY NUMBER FOR MENU <<<");
		int rns = sc.nextInt();
		if (rns == 1) {
			A2.List();
		} else
			Main.mainMenu();
	}
}