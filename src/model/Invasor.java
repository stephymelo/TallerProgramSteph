package model;

import processing.core.PApplet;

public class Invasor extends Personaje {
	

	Invasor(int posX, int posY, int tamX, int tamY,int vel,PApplet app) {
		super(posX, posY,tamX,tamY,vel,app);
		
	}
	
	
	
	
	public void pintarInvasor() {
		this.app.fill(0,255,0);
		this.app.rect(posX, posY, tamX, tamY);
		
		
	}
	
     public void movimientoInvasor() {
    	 posY+=vel;
    	 
//    	 if (app.frameCount == 100) {
//    		 posX+=vel;
//    		 
//    	 }
    	 
    	 
		
	}
	
	
	
}
