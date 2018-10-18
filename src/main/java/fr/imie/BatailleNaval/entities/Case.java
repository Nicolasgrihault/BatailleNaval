package fr.imie.BatailleNaval.entities;

public class Case {
	private int X;
	private int Y;
	private int Contenu;
	public int getX() {
		return X;
	}
	public int getY() {
		return Y;
	}
	public int getContenu() {
		return Contenu;
	}
	public Case (int X, int Y, int Contenu) {
		this.X = X;
		this.Y = Y;
		this.Contenu = Contenu;
	}
}
