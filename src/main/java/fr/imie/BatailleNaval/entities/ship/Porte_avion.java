package fr.imie.BatailleNaval.entities.ship;

import java.util.ArrayList;

import fr.imie.BatailleNaval.entities.Case;
import fr.imie.BatailleNaval.entities.Default_ship;

public class Porte_avion extends Default_ship {
	
	public static final int porte_avion_nb = 2; 
	
	public Porte_avion  (int id, int width, int nb, ArrayList<Case> array_ship){
		super(4,6,array_ship);
	}
}
