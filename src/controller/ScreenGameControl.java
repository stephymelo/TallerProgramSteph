package controller;

import model.Juego;
import processing.core.PApplet;






public class ScreenGameControl extends PApplet{
	private Juego juego;



	public ScreenGameControl(PApplet app) {
		juego= new Juego(app);

	}



	public void dibujarEnemigos () {

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



	public void dibujarBala(PApplet app) {
		juego.drawBala(app);

	}








}
