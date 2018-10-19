/**
 * 
 */
package fr.imie.BatailleNaval.manager;

import java.util.ArrayList;

import fr.imie.BatailleNaval.entities.Default_ship;
import fr.imie.BatailleNaval.entities.Joueur;
import fr.imie.BatailleNaval.entities.Map;
import fr.imie.BatailleNaval.entities.ship.Corvette;
import fr.imie.BatailleNaval.entities.ship.Croiseur;
import fr.imie.BatailleNaval.entities.ship.Destroyer;
import fr.imie.BatailleNaval.entities.ship.Porte_avion;

/**
 * @author NicolasG
 *
 */
public class MapManager {

	private Corvette corvette;
	private Destroyer destroyer;
	private Croiseur croiseur;
	private Porte_avion porte_avion;
	private Map map;
	private Joueur ;
	private Joueur 
	
	/*public int TestPlaceBateau () {
		private int x;
		private int y;
		private int direction;
		private int i;
		private boolean flag;
		
		boolean flag = true;
		
	}*/
	
	public ArrayList<Default_ship> PlaceBateau(Joueur joueur){
		private int i;
		for (i=1; i < corvette.getNb(); i++) {
			TestPlaceBateau();
		}
		for (i=1; i < destroyer.getNb(); i++) {
			TestPlaceBateau();
		}
		for (i=1; i < croiseur.getNb(); i++) {
			TestPlaceBateau();
		}
		for (i=1; i < porte_avion.getNb(); i++) {
			TestPlaceBateau();
		}
	}
	
	
}
