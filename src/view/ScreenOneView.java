package view;

import processing.core.PApplet;

public class ScreenOneView extends PApplet {
	
	
	private int posXRect;
	private int posYRect;
	private int tamXRect;
	private int tamYRect;
	private PApplet app;
	

	public ScreenOneView(PApplet app) {
		this.app=app;
		this.posXRect=150;
		this.posYRect=500;
		this.tamXRect=200;
		this.tamYRect=100;
	}
	

	
	public void drawScreen() {
		app.fill(255);
		app.textSize(50);
		app.text("SPACE INVADERS",50,200);
		drawButton();
		
	}
	
	private void drawButton() {
		app.fill(255,0,0);
		app.rect(posXRect,posYRect,tamXRect,tamYRect);
	}

	
	
	
	
	
	
	
	
	


	public int getPosXRect() {
		return posXRect;
	}



	public void setPosXRect(int posXRect) {
		this.posXRect = posXRect;
	}



	public int getPosYRect() {
		return posYRect;
	}



	public void setPosYRect(int posYRect) {
		this.posYRect = posYRect;
	}



	public int getTamXRect() {
		return tamXRect;
	}



	public void setTamXRect(int tamXRect) {
		this.tamXRect = tamXRect;
	}



	public int getTamYRect() {
		return tamYRect;
	}



	public void setTamYRect(int tamYRect) {
		this.tamYRect = tamYRect;
	}



	public PApplet getApp() {
		return app;
	}



	public void setApp(PApplet app) {
		this.app = app;
	}
	
	
	
	
}
