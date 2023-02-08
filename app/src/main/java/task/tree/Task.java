package task.tree;

public class Task {
	private String name;
	private int fiveMinuteChunks;
	private boolean done;
	private int numberOfChildren;
	private ChildTask[] children;
	
	
	
	
	public int getNumberOfChildren() {
		return numberOfChildren;
	}



	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getFiveMinuteChunks() {
		return fiveMinuteChunks;
	}



	public void setFiveMinuteChunks(int fiveMinuteChunks) {
		this.fiveMinuteChunks = fiveMinuteChunks;
	}



	public boolean isDone() {
		return done;
	}



	public void setDone(boolean done) {
		this.done = done;
	}
	
	
	
	public Task[] getChildren() {
		return children;
	}



	public void setChildren(ChildTask[] children) {
		this.children = children;
	}
	
	public void updateNumberOfChildren()
	{
		this.numberOfChildren = this.children.length;
	}
	
	public String nameWithChildren()
	{
		if(this.numberOfChildren == 0)
		{
			return this.summary() + " and I have no children";
		}
		else
		{
			return this.summary() + " and my children are:";
			
		}
	}

	
	public String summary()
	{
		return "this task is named " + this.name;
	}



	Task(String name, int fiveMinuteChunks, boolean done)
	{
		this.name = name;
		this.fiveMinuteChunks = fiveMinuteChunks;
		this.done = done;
	}
	
	Task(String name, int fiveMinuteChunks)
	{
		this.name = name;
		this.fiveMinuteChunks = fiveMinuteChunks;
	}



	Task(String name)
	{
		//This should only be used to make a root task
		this.name = name;
	}
	
	Task()
	{
		this.name = "unnamed";
		this.fiveMinuteChunks = 6;
		this.done = false;
	}
	

}
