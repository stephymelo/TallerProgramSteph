package model;

import processing.core.PApplet;

public class Invasor extends Personaje {
	
	private int color;
	

	Invasor(int posX, int posY, int tamX, int tamY,int vel,PApplet app) {
		super(posX, posY,tamX,tamY,vel,app);
		this.color=app.color(255,255,0,300);
		
	}
	
	
	
	
	public void pintarInvasor() {
		this.app.fill(color);
		this.app.noStroke();
		this.app.rect(posX, posY, tamX, tamY);
		
		
	}
	
     public void movimientoInvasor() {
    	 posY+=vel;

		
	}




	public int getColor() {
		return color;
	}




	public void setColor(int color) {
		this.color = color;
	}
	
	
	
}
