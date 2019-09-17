
public class Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kevin();
		owen();
		colton();

	}
	public static void greetingPara() {
		System.out.println("Hello!\nI hope that the beginning of Autumn is treating you well.");
	}
	public static void endingPara() {
		System.out.println("\"Hope we can see each other soon again! Would be great.\nLooking forward to your reply.\n\nSincerely,\nJonah\n\n");
	}
	public static void friendLetter() {
		greetingPara();
		System.out.println("How has the school year been going for you?\nThe beginning of the school year has been going well for me");
		System.out.println("I've been quite busy with school, mainly World History and Biology, however, I have a period 0 class that is "
				+ "very interesting and fun. \nThere's so may ways to solve a simple problem. I feel that it's a great way to begin the day.\n");
	}
	public static void kevin() {
		System.out.println("Dear Kevin,\n"); //Aviation friend
		friendLetter();
		System.out.println("The A concourse at PDX is going to be demolished in November this year, which is very sad.");
		System.out.println("Do you want to go spot near that terminal again before it gets torn down? Maybe even take a quick trip up to Paine"
				+ "and go out of the terminal.");
		endingPara();
	}
	public static void owen() {
		System.out.println("Dear Owen,\n"); //Music Friend
		friendLetter();
		System.out.println("I've almost completed Chopin's revolutionary etude and possibly starting Rachmaninoff's Prelude in C Sharp Minor");
		System.out.println("I'm very excited about starting that piece as it is one of my favorites, and I've heard it is one of your favorites as well.");
		System.out.println("Have you started anything new recently?");
		endingPara();
	}
	public static void colton() { //old swim friend
		System.out.println("Dear Colton,\n");
		friendLetter();
		System.out.println("Swim season has restarted, and we are training for shortcourse here. The team's feels "
				+ "more different once you left.");
		System.out.println("I'm hoping I can drop more time in my 500 freestyle and 200 freestyle. Maybe we'll see each other at HS meets.");
		endingPara();
	}

}
