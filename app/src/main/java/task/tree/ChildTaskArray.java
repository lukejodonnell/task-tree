package task.tree;

//Screw all of you I know this is dumb but I am dumb and I am just stressed out and I want to cry but I can't

public class ChildTaskArray {
	ChildTask[] cta = {};
	
	public void add(ChildTask ct)
	{
		int n = cta.length;
		ChildTask[] ctaHolder = new ChildTask[n + 1];
		for(int i=0; i<n; i++)
		{
			ctaHolder[i] = cta[i];
		}
		ctaHolder[n] = ct;
		
		cta = ctaHolder;
	}
	
	public ChildTask[] toArray()
	{
		return this.cta;
	}

}
