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
	public Croiseur  (int id, int width, int nb, ArrayList<Case> array_ship){
		super(3,4,2,array_ship);
	}
}
