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
		ChatBot2 chatBot2 = new ChatBot2();
		CompatibilityBot CompatabilityBot = new CompatibilityBot();
		Daddybot Daddybot = new Daddybot();
		

		Scanner in = new Scanner (System.in);
		System.out.println("Welcome to the chatbot, nice to meet you.");
		String statement = in.nextLine();


		while (!statement.equals("Bye"))
		{
			//Use Logic to control which chatbot is handling the conversation\
            Scanner select = new Scanner(System.in);
            String Sanjay = select.nextLine();
            System.out.println("Do you want to talk about compatibility, relationship goals, or talk to your dad?(Please type in compatibility, goals, or dad)");

            if(  Sanjay.equals("dad"))
            {
                Daddybot.chatLoop(statement);


                statement = in.nextLine();

            }
            if(  Sanjay.equals("compatibility"))
            {
                CompatabilityBot.chatLoop(statement);


                statement = in.nextLine();

            }
            if(  Sanjay.equals("goals"))
            {
                ChatBot2.chatLoop(statement);


                statement = in.nextLine();

            }
            //This example has only chatbot1


		}
	}

}
