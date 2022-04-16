/*
 * Author       Padmaja
 * Date :       4/14/2022
 * Description:  1. Generate email with following syntax firstname.lastname@deaprtment.company.com
 *                2.determine the department (sales,development,accounting),if none leave blank
 *                3.Generate random string for a password
 *                4.Have set methods to change password,set mailbox capacity, and define alternate email address
 *                5. Have get methods display name,mail and mailbox capacity
 */
public class EmailApp {
public static void main(String[] main) {
	
	Email email_1 = new Email("Padmaja", "Lanka");
	
	
	email_1.setAlternateEmail("jam@gmail.com");
	System.out.println(email_1.getAlternateEmail());
	
	System.out.println(email_1.showInfo());
	
	
	
	
	
	
	
	
	
}
}
