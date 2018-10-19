package fr.imie.BatailleNaval.entities.ship;

import java.util.ArrayList;

import fr.imie.BatailleNaval.entities.Case;
import fr.imie.BatailleNaval.entities.Default_ship;

public class Destroyer extends Default_ship {
	
	public static final int destroyer_nb = 2; 
	
	public Destroyer  (int id, int width, int nb, ArrayList<Case> array_ship){
		super(2,3,array_ship);
	}
}
