package tools;

public interface IOuvrier {
	public String getName();
	public void Work(int x, int y);
	public void Eat(int x, int y);
	public void Sleep(int x, int y);
	public void Other(int x, int y);
	public void affect();
	public void setTask(ITask task1);
	public void setDay(IDay day);
}
