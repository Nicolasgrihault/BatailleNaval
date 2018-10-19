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
public class Corvette extends Default_ship {
	
	public static final int corvette_nb = 1; 
	
	public Corvette (int id, int width, int nb, ArrayList<Case> array_ship){
		super(1,1,array_ship);
	}

}
