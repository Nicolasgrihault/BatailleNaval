/**
 * 
 */
package fr.imie.BatailleNaval.entities;

import java.util.ArrayList;

/**
 * @author NicolasG
 *
 */
public abstract class Default_ship {
	
	private int id;
	private int width;
	private int nb;
	private ArrayList<Case> array_ship;
	
	public int getId() {
		return id;
	}
	public int getWidth() {
		return width;
	}
	public int getNb() {
		return nb;
	}
	public ArrayList<Case> getArray_ship() {
		return array_ship;
	}

	public Default_ship(int id, int width, int nb, ArrayList<Case> array_ship) {
		super();
		this.id = id;
		this.width = width;
		this.nb = nb;
		this.array_ship = array_ship;
	}

}
