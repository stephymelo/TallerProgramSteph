package model;

import processing.core.PApplet;

public class Bala extends Personaje {

	Bala(int posX, int posY, int tamX, int tamY,int vel,PApplet app) {
		super(posX, posY, tamX, tamY,vel,app);
		
	}
	
	
	public void pintarBala() {
		app.fill(222,0,0);
		app.rect(posX, posY, tamX, tamY);
		
	}
	
	public void movimientoBala() {
		
		posY+=vel;
		
	}

}
