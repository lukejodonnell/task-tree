package task.tree;
import java.util.ArrayList;
import java.util.Scanner;

public class CLIBot 
{
	private String[] command = { "exit" , "testing", "list", "help", "add", "count", "barf", "update tree" };
	private Scanner scanner = new Scanner(System.in);
	private TaskTree ta = new TaskTree();
	
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
	
	public void addTask()
	{
		System.out.println("What is this tasks name?");
		String taskName = scanner.nextLine();
		ChildTask t = new ChildTask(taskName);
		System.out.println("what is the name of the parent task?");
		String parentName = scanner.nextLine();
		t.setParentTask(ta.returnTaskWithName(parentName));
		ta.addTask(t);
	}
	
	public void count()
	{
		System.out.println("there are " + ta.numberOfTasks() + " tasks in this tree");
	}
	
	public void barf()
	{
		int count = ta.numberOfTasks();
		System.out.println("number of tasks to print: " + count);
		for(int i=0; i<count; i++)
		{
			if(ta.getTask(i).getName() != "root")
			{
				System.out.println("Task " + i + ": "  + ta.getTask(i).summary());	
			}
		}
		System.out.println("and that's it");
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
		
		if(i==4)
		{
			System.out.println("you have cosen to add a task to the tree");
			this.addTask();
			this.prompt();
		}
		
		if(i==5)
		{
			System.out.println("You want to know how many tasks are in the tree?");
			this.count();
			this.prompt();
		}
		
		if(i==6)
		{
			System.out.println("Ah you the whole tree in no order at all");
			this.barf();
			this.prompt();
		}
		
		if(i==7)
		{
			System.out.println("updating tree gosh I suck at programming");
			this.ta.updateRealationships();
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
