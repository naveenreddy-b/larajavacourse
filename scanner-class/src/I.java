import java.util.Scanner;
class I
{
	public static void main(String[] args) 
	{
		System.out.println("please enter student information:");
		Scanner sc = new Scanner(System.in);

		System.out.println("please enter student roll number:");
		int roll_number = sc.nextInt();

		System.out.println("please enter student first_last name:");
		String first_last_name = sc.next();
		sc.nextLine();

		System.out.println("please enter student initials:");
		char initials = sc.next().charAt(0);

		System.out.println("please enter student age:");
		int age = sc.nextInt();


		System.out.println("please enter student enrolled course:");
		String course = sc.next();

		System.out.println("please enter student skills:");
		String skills = sc.next();

		System.out.println("please enter student total fee:");
		double fees = sc.nextDouble();

		System.out.println("please enter student job offer status:");
		boolean job_offer = sc.nextBoolean();

		System.out.println("------------------------");


		System.out.println("\nstudent details :" + "\nroll_number:" + roll_number 
			+ "\nfirst_last_name:" + first_last_name + "\ninitials:"  + initials
			+ "\nage:" + age + "\ncourse:" + course + "\nskills" + skills + "\nfees:"
		    + fees + "\njob_offer" + job_offer);

	}
}
