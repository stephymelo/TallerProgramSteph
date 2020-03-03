package model;



import processing.core.*;

public class Hero extends Personaje{
	
	private int vida;
	private boolean moverDerecha;
	private boolean moverIzquierda;
	
	

	Hero(int posX, int posY, int tamX, int tamY,int vel,PApplet app) {
		super(posX,posY,tamX,tamY,vel,app);
		this.app = app;
	
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;
		this.vida=3;
		this.moverDerecha=false;
		this.moverIzquierda=false;
		
		
		
	
		
//		this.posX=300;
//		this.posY=300;
//		this.tamX=50;
//		this.tamY=50;
		
	}
	
	

	public void pintarHero() {
		this.app.fill(255);
        this.app.rect(posX,posY,tamX,tamY);
		
	}
	
	public void pintarVida() {
		app.fill(255);
		app.textSize(20);
		app.text(vida+" vidas",400,50);
		
	}
	
	
	
	public void movHeroRight() {
		posX-=vel;
		if(posX<=0) {
			posX+=vel;
		}
	}
	
	public void movHeroLeft() {
		posX+=vel;
		if(posX>=450) {
			posX-=vel;
		}
	}
	
//     public void movimientoHero() {
//    	 
//    	 if (moverDerecha==true) {
//    		 posY+=2;
//    	 }
//    	 if (moverIzquierda==true) {
//    		 posY-=2;
//    	 }
//    	 
//    	 
//		
//	}
     
	
     public void disparar () {
    	 
    	 
     }







     
     
     
     
     



	public boolean isMoverDerecha() {
		return moverDerecha;
	}










	public void setMoverDerecha(boolean moverDerecha) {
		this.moverDerecha = moverDerecha;
	}










	public boolean isMoverIzquierda() {
		return moverIzquierda;
	}










	public void setMoverIzquierda(boolean moverIzquierda) {
		this.moverIzquierda = moverIzquierda;
	}
     
     
     

}
