package task.tree;
import java.util.ArrayList;

public class TaskTree {
	
	ArrayList<ChildTask> tal = new ArrayList<ChildTask>();
	RootTask rt;
	

	public void addTask(ChildTask t)
	{
		tal.add(t);
	}
	
	public ChildTask getTask(int index)
	{
		return tal.get(index);
	}
	
	public void updateRealationships()
	{
		ChildTaskArray rootChildren = new ChildTaskArray();
		for(ChildTask ct : tal)
		{
			if(ct.getParentTask() == rt)
			{
				rootChildren.add(ct);
			}
		}
//		I will be shocked if this works
		rt.setChildren(rootChildren.toArray());
		for(ChildTask cts : tal)
		{
			ChildTaskArray childArrayList = new ChildTaskArray();
			for(ChildTask ct : tal)
			{
				if(ct.getParentTask() == cts)
				{
					childArrayList.add(cts);
				}
			}
			cts.setChildren((ChildTask[]) childArrayList.toArray());
		}
		rt.updateNumberOfChildren();
		for(ChildTask ct : tal)
		{
			ct.updateNumberOfChildren();
		}
	}
	
	public ChildTask returnTaskWithName(String name)
	{
		for(ChildTask t : tal)
		{
			if(t.getName() == name)
			{
				return t;
			}
		}
		return null;
	}
	
	public String returnHTMLOutline()
	{
		this.updateRealationships();
		
		StringBuilder str = new StringBuilder("<html>");
		
		return "Urm ur purce ur purpur";
	}
	
//	public void generateRoot()
//	{
//		this.addTask(new Task("root"));
//	}
	
	public int numberOfTasks()
	{
		return tal.size();
	}
	
	TaskTree()
	{
		this.rt = new RootTask();
	}
	
	TaskTree(String str)
	{
		if(str == "the dumb way")
		{
			System.out.println("this doesn't work anymore but you are still using it because you suck at programming");
//			this.generateRoot();
		}
	}
	
	TaskTree(RootTask root)
	{
		this.rt = root;
	}

}
