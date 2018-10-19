package fr.imie.BatailleNaval.entities;

import java.util.ArrayList;

public class Joueur {
	
	  private int id;
	  private ArrayList <Default_ship> array_flotte;
	  
	public ArrayList<Default_ship> getarray_flotte() {
		return array_flotte;
	}
	public int getid() {
		return id;
	}
	
	public Joueur(int id, ArrayList<Default_ship> array_flotte) {
		super();
		this.id = id;
		this.array_flotte = array_flotte;
	}
	
}
