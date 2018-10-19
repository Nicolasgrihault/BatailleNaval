package fr.imie.BatailleNaval.entities.ship;

import java.util.ArrayList;

import fr.imie.BatailleNaval.entities.Case;
import fr.imie.BatailleNaval.entities.Default_ship;

public class Porte_avion extends Default_ship {
	public Porte_avion  (int id, int width, int nb, ArrayList<Case> array_ship){
		super(4,6,1,array_ship);
	}
}
