/**
 * 
 */
package fr.imie.BatailleNaval.entities;

/**
 * @author NicolasG
 *
 */
public abstract class Default_ship {
	private int Id;
	private int Width;
	private int Nb;
	
	public int getId() {
		return Id;
	}
	public int getWidth() {
		return Width;
	}
	public int getNb() {
		return Nb;
	}
	
	private Default_ship (int Id, int Width, int Nb) {
		this.Id = Id;
		this.Width = Width;
		this.Nb = Nb;
	}
}
