import java.util.Scanner;

/*
 * Author       Padmaja
 * Date :       4/14/2022
 * Description:  1. Generate email with following syntax firstname.lastname@deaprtment.company.com
 *                2.determine the department (sales,development,accounting),if none leave blank
 *                3.Generate random string for a password
 *                4.Have set methods to change password,set mailbox capacity, and define alternate email address
 *                5. Have get methods display name,mail and mailbox capacity
 */


public class Email {

	private String firstName;
	private  String lastName;
	private String password;
	private String email;
	private String department;
	private int mailboxcapacity = 500;
	private String alternateEmail;
	private String companySuffix = "anycompany.com";
	private int defaultPasswordlength= 10;

	// constructor to receive the first name and last name
	public Email(String firstName, String lasttName) {
		super();
		this.firstName = firstName;
		this.lastName = lasttName;
		//System.out.println("email created: " +this.firstName +" " + this.lastName );

		//call a method asking for the department -return the department
		this.department = setDepartment();
		//System.out.println("Department:   "  + this.department);


		// call a method that returns random passwords
		this.password= randomPassword(defaultPasswordlength);
		System.out.println("password is: "   + this.password);

		email = firstName.toLowerCase()+ "." + lastName.toLowerCase() + "@" + department + "."  + companySuffix;
		//System.out.println("Your email is: " + email);
	}


	// ask for the department	 
	private String setDepartment() {
		System.out.println("New worker:"+ firstName +  " . department codes \n1 for Sales\n2 for Development\n3 for accounting\n0 for none");

		Scanner input = new Scanner(System.in);
		int deprt_choice = input.nextInt();
		if(deprt_choice ==1) {
			return "sales";

		}else if (deprt_choice ==2) {

			return "dev";
		}else if (deprt_choice ==3) {
			return "acct";
		}else {

			return " ";
		}
	}


	//Generate random password

	private  String  randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPRSTUVWXYZ0123456789!@#$&";
		char[] password = new char[length];

		for(int i = 0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i]= passwordSet.charAt(rand);
		}
		return new String(password);

	}
	//set the mailbox capacity
	public void setmailboxcapacity(int capacity) {
		this.mailboxcapacity = capacity;


	}
	//set the alternate email
	public void setalternateEmail1(String altemail) {
		this.alternateEmail = altemail;

	}

	//change the password


	public void changePassword(String password) {
		this.password = password;

	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the alternateEmail
	 */
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	/**
	 * @param alternateEmail the alternateEmail to set
	 */
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	/**
	 * @return the mailboxcapacity
	 */
	public int getMailboxcapacity() {
		return mailboxcapacity;
	}

	public String getpassword() {
		return password;
	}

	/**
	 * @param mailboxcapacity the mailboxcapacity to set
	 */
	public void setMailboxcapacity(int mailboxcapacity) {
		this.mailboxcapacity = mailboxcapacity;
	}


	public String showInfo() {

		return "Display Name:" + firstName+ " "+ lastName  +" "+
				"\nCompanyEmail:"+ email + " "+
				"\nmailbox Capacity:" + mailboxcapacity + "mb";


	}


}
