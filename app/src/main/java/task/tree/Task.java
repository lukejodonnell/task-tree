package task.tree;

public class Task {
	private String name;
	private Task parentTask;
	private int fiveMinuteChunks;
	private boolean done;
	private int numberOfChildren;
	
	
	
	
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



	public Task getParentTask() {
		return parentTask;
	}



	public void setParentTask(Task parentTask) {
		this.parentTask = parentTask;
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
	
	public String summary()
	{
		return "this task is named " + this.getName() + " and it is a child of the task named " + this.getParentTask().getName();
	}



	Task(String name, Task parentTask, int fiveMinuteChunks, boolean done)
	{
		this.name = name;
		this.parentTask = parentTask;
		this.fiveMinuteChunks = fiveMinuteChunks;
		this.done = done;
	}
	
	Task(String name, Task parentTask, int fiveMinuteChunks)
	{
		this(name, parentTask, fiveMinuteChunks, false);
	}
	
	Task(Task parentTask)
	{
		this("unnamed", parentTask, 0, false);
	}
	
	Task(String name)
	{
		//This should only be used to make a root task
		this.name = name;
	}

}
