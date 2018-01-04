package app;

import tools.Employee;
import tools.IActivite;
import tools.IDay;

public class ListActivities {
	private Employee ouvier;
	private IActivite activite;
	private int debut;
	private int fin;
	private IDay day;
	
	public ListActivities(Employee peter, IActivite activite, int debut, int fin) {
		this.ouvier = peter;
		this.activite = activite;
		this.debut = debut;
		this.fin = fin;
	}
	
	public ListActivities(Employee ouvier, IActivite activite, int debut, int fin, IDay day) {
		this.ouvier = ouvier;
		this.activite = activite;
		this.debut = debut;
		this.fin = fin;
		this.day = day;
	}
	
	public void affiche(){
		System.out.println("Ouvrier de nom "+this.ouvier.getName()+ 
				" a "+activite.getNameActivity()+" de "+debut+"h "+"à "+fin+"h");
		
	}
	
	public Employee getOuvier() {
		return ouvier;
	}

	public void setOuvier(Ouvrier ouvier) {
		this.ouvier = ouvier;
	}

	public int getDebut() {
		return debut;
	}

	public void setDebut(int debut) {
		this.debut = debut;
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	
}
