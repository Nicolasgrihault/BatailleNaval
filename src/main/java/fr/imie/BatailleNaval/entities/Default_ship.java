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
	private ArrayList<Case> array_ship;
	
	public int getId() {
		return id;
	}
	public int getWidth() {
		return width;
	}
	public ArrayList<Case> getArray_ship() {
		return array_ship;
	}

	public Default_ship(int id, int width, ArrayList<Case> array_ship) {
		super();
		this.id = id;
		this.width = width;
		this.array_ship = array_ship;
	}

}
