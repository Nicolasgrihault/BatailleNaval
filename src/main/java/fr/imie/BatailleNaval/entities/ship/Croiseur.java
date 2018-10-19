/**
 * 
 */
package fr.imie.BatailleNaval.entities.ship;

import java.util.ArrayList;

import fr.imie.BatailleNaval.entities.Case;
import fr.imie.BatailleNaval.entities.Default_ship;

/**
 * @author NicolasG
 *
 */
public class Croiseur extends Default_ship {
	
	public static final int croiseur_nb = 2; 
	
	public Croiseur  (int id, int width, int nb, ArrayList<Case> array_ship){
		super(3,4,array_ship);
	}
}
