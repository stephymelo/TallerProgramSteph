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
		juego.eliminarInvasor(app);

	}


	public void dibujarHero () {

		juego.drawHero();
		


	}
	public void perderVida(PApplet app) {
		juego.perderVida(app);
	}
	public void pantallaUno(PApplet app) {
		juego.reinicarOla(app);
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
