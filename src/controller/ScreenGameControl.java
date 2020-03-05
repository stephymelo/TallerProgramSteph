package controller;

import model.Juego;
import processing.core.PApplet;






public class ScreenGameControl extends PApplet{
	private Juego juego;



	public ScreenGameControl(PApplet app) {
		juego= new Juego(app);

	}



	public void dibujarEnemigos (PApplet app) {
		juego.drawInvasores(app);

	}


	public void dibujarHero () {

		juego.drawHero();


	}
	public void movHero() {

		juego.movHero();



	}

	public void movHeroLeft() {

		juego.movHeroLeft();



	}



	public void dibujarBala() {
		juego.drawBala();

	}
	public void drawShoot(PApplet app) {
		juego.shootBala(app);

	}








}
