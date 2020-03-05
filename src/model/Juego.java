package model;

import java.util.ArrayList;

import processing.core.PApplet;



public class Juego {


	private Invasor [][] invasor;
	private ArrayList<Bala> bala;
	private Hero hero;
	private int row;
	private int col;



	public Juego (PApplet app) {
		this.row=8;
	    this.col=4;

		bala = new ArrayList<Bala>();

		invasor = new Invasor[row][col];
		
		
		hero=new Hero(210, 700, 50, 50,3, app);



	}


	public void drawInvasores(PApplet app) {
		
		


		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				 
                invasor[i][j] = new Invasor (30+(50+30)*i,100+(20+20)*j,30,30,1,app);
                invasor[i][j].pintarInvasor();
            	if (app.frameCount == 250) {
            		  invasor[i][j].movimientoInvasor();
        			
        		}
           
			
///
//			for (int j = 0; j < bala.size(); j++) {
//				Bala b = bala.get(j);

//				if(app.dist(b.getPosX(),b.getPosY(),v.getPosX(),v.getPosY())<100) {
//					invasor.remove(v);
//				}
//			}
		}
		}

	

	
	}


	public void drawBala() {

		
		for (int j = 0; j < bala.size(); j++) {
			Bala b = bala.get(j);
		b.pintarBala();
		b.movimientoBala();
		
		}
		
        }
	
	public void shootBala(PApplet app) {
		bala.add (new Bala(hero.getPosX()+20,hero.getPosY(),10,20,5,app));  
	}

	public void drawHero() {

		hero.pintarHero();
		hero.pintarVida();


	}
	public void movHero() {

		hero.movHeroRight();



	}

	public void movHeroLeft() {

		hero.movHeroLeft();




	}

    public void perderVida(PApplet app) {
    	
//    	for (int i = 0; i < invasor.size(); i++) {
//			Invasor v = invasor.get(i);
//			
//    	if(v.getPosX()==470) {
//    	  
//    	   hero.setVida(-1);
//    	}
//    	}
    }


	public void reinicarOla() {



	}


}
