package task.tree;
import java.util.Scanner;

public class CLIBot 
{
	private String[] command = { "exit" , "testing", "list", "help" };
	private Scanner scanner = new Scanner(System.in);
	
	public int getCommandIndex(String input)
	{
//		System.out.println("got " + input + " now getting index at line 11");
		for (int i=0; i<command.length; i++)
		{
//			System.out.println("testing " + i + " which is " + command[i]);
			if (input.equals(command[i]))
			{
//				System.out.println("got " + i + " returning");
				return i;
			}
		}
		return -1;
	}
	
	public void executeCommand(int i)
	{
		if(i==-1)
		{
			System.out.println("Got the error thing");
			this.prompt();
		}
		
		if(i==0)
		{
			System.out.println("Bye Bye Boi!!");
		}
		
		if(i==1)
		{
			System.out.println("I am getting testy myself >:(");
			this.prompt();
		}
		
		if(i==2)
		{
			System.out.println("you can say:");
			for (String str : command)
			{
				System.out.println(str);
			}
			this.prompt();
		}
		
		if(i==3)
		{
			System.out.println("you need help? Me too pal... Me too.");
			this.prompt();
		}
	}
	
	public void prompt()
	{
		System.out.println("type <list> for list of commands, <help> if you need help:");
		String input = scanner.nextLine();
		this.executeCommand(this.getCommandIndex(input));
		
	}
	
	public void start()
	{
		System.out.println("Starting CLI BOT");
		this.prompt();
	}
	
//	CLIBot(Scanner scanner)
//	{
//		this.scanner = scanner;
//	}

}
