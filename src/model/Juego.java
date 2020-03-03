package model;

import java.util.ArrayList;

import processing.core.PApplet;



public class Juego {


	private ArrayList<Invasor> invasor;
	private ArrayList<Bala> bala;
	private Hero hero;

	

	public Juego (PApplet app) {
		
		bala = new ArrayList<Bala>();
		
		invasor = new ArrayList <Invasor>();

	

		hero=new Hero(210, 700, 50, 50,3, app);



	}


	public void drawInvasores(PApplet app) {


		for (int i = 0; i < invasor.size(); i++) {
			Invasor v = invasor.get(i);
			v.movimientoInvasor();
			v.pintarInvasor();
		}
		if (app.frameCount == 250) {
		invasor.add(new Invasor(40,40,30,30,1,app));
		}
		
	}
	public void drawBala(PApplet app) {

		Bala bala = new Bala(hero.getPosX(),hero.getPosY(),10,20,5,app);
		bala.pintarBala();
		bala.movimientoBala();
		this.bala.add(bala);

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




	public void reinicarOla() {



	}


}
