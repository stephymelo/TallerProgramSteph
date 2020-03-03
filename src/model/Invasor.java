package model;

import processing.core.PApplet;

public class Invasor extends Personaje {
	private PApplet app;

	Invasor(int posX, int posY, int tamX, int tamY,int vel,PApplet app) {
		super(posX, posY,tamX,tamY,vel,app);
		
	}
	
	
	
	
	public void pintarInvasor() {
		app.fill(0,255,0);
		app.rect(posX, posY, tamX, tamY);
		
		
	}
	
     public void movimientoInvasor() {
    	 
    	 
		
	}
	
	
	
}
