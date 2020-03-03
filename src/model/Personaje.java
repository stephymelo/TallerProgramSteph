package model;

import processing.core.PApplet;


abstract class Personaje  {


	protected int posX;
	protected int posY;
	protected int velX;
	protected int velY;
	protected int vel;
	protected int tamX;
	protected int tamY;
	protected PApplet app;
	

	Personaje(int posX,int posY, int tamX, int tamY,int vel, PApplet app){
		this.app = app;
		this.posX=posX;
		this.posY=posY;
		this.velX=velX;
		this.velY=velY;
		this.tamX=tamX;
		this.tamY=tamY;
		this.vel=vel;
	}
	

  

	public void movimiento() {
	
	
	}
	
	
	

	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}


	public int getVelX() {
		return velX;
	}


	public void setVelX(int velX) {
		this.velX = velX;
	}


	public int getVelY() {
		return velY;
	}


	public void setVelY(int velY) {
		this.velY = velY;
	}


	public int getTamX() {
		return tamX;
	}


	public void setTamX(int tamX) {
		this.tamX = tamX;
	}


	public int getTamY() {
		return tamY;
	}


	public void setTamY(int tamY) {
		this.tamY = tamY;
	}
	
	public int getVel() {
		return vel;
	}


	public void setVel(int vel) {
		this.vel = vel;
	}
	
	
}
