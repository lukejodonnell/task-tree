package task.tree;

public class ChildTask extends Task {
	
	private Task parentTask;
	
	public Task getParentTask() {
		return parentTask;
	}



	public void setParentTask(Task parentTask) {
		this.parentTask = parentTask;
	}

	ChildTask(Task parentTask) {
		this.parentTask = parentTask;
		// TODO Auto-generated constructor stub
	}

	public ChildTask(String name, Task parentTask, int fiveMinuteChunks, boolean done) {
		super(name, fiveMinuteChunks, done);
		this.parentTask = parentTask;
	}

	public ChildTask(String name, Task parentTask, int fiveMinuteChunks) {
		super(name, fiveMinuteChunks);
		this.parentTask = parentTask;
	}

	public ChildTask(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
