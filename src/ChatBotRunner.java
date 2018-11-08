import java.util.Scanner;

/**
 * A simple class to run our chatbot teams.
 * @author Brooklyn Tech CS Department
 * @version September 2018
 */
public class ChatBotRunner
{

	/**
	 * Create instances of each chatbot, give it user input, and print its replies. Switch chatbot responses based on which chatbot the user is speaking too.
	 */
	public static void main(String[] args)
	{
		DoctorLoveBot doctorlovebot = new DoctorLoveBot();
		CompatibilityBot compatibilityBot = new CompatibilityBot();
		Daddybot daddybot = new Daddybot();
		

		Scanner in = new Scanner (System.in);
		System.out.println("Welcome to the chatbot, nice to meet you.");
		String statement = in.nextLine();
        Scanner select = new Scanner(System.in);
       	System.out.println("Do you want to talk about compatibility, relationship goals, or talk to your dad?(Please type in compatibility, goals, or dad)");
        String Sanjay = select.nextLine();


		while (!statement.equals("Bye"))
		{
			//Use Logic to control which chatbot is handling the conversation\


            if(  Sanjay.equals("dad"))
            {
                daddybot.chatLoop(statement);


                statement = in.nextLine();

            }
            if(  Sanjay.equals("compatibility"))
            {
                compatibilityBot.chatLoop(statement);


                statement = in.nextLine();

            }
            if(  Sanjay.equals("goals"))
            {
                chatBot2.chatLoop(statement);


                statement = in.nextLine();

            }
            //This example has only chatbot1


		}
	}

}
