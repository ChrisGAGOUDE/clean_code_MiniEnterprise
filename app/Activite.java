package app;

import tools.IActivite;

public class Activite implements IActivite{
	
	private String activite;
	private int debut;
	private int fin;
		
	public Activite(String activite){
		this.activite = activite;
	}
	
	public String getActivite(){return activite; }
	
	public int getDebut(){return debut; }
	
	public int getFin(){return fin; }

	@Override
	public String getNameActivity() {
		return this.activite;
	}

}
