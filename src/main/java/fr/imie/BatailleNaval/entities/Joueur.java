package fr.imie.BatailleNaval.entities;

import java.util.ArrayList;

public class Joueur {
	
	  private int id;
	  private ArrayList <Default_ship> arraymap;
	  
	public ArrayList<Default_ship> getarraymap() {
		return arraymap;
	}
	public int getid() {
		return id;
	}
	
	public Joueur(int id, ArrayList<Default_ship> arraymap) {
		super();
		this.id = id;
		this.arraymap = arraymap;
	}
	
}
