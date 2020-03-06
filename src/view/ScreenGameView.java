package view;

import controller.ScreenGameControl;
import processing.core.PApplet;

public class ScreenGameView extends PApplet {

	private PApplet app;
	private model.Juego game;
	private ScreenGameControl screenGameControl;
	private boolean movRight;
	private boolean movLeft;




	public ScreenGameView(PApplet app) {
		this.app=app;
		screenGameControl=new ScreenGameControl(app);
		movRight=false;
		movLeft=false;


	}



	public void drawScreen() {
		
		screenGameControl.dibujarHero();
		
		if (movRight==true) {
			screenGameControl.movHero();
		}
		if (movLeft==true) {
			screenGameControl.movHeroLeft();
		}

    screenGameControl.dibujarEnemigos(app);

	screenGameControl.dibujarBala();
	screenGameControl.perderVida(app);
	screenGameControl.pantallaUno(app);


	}
	

	public void drawLose(PApplet app) {
		



	}
	
	public void drawShooter() {
		screenGameControl.drawShoot(app);
	}



	public boolean getMovRight() {
		return movRight;
	}



	public void setMovRight(boolean movRight) {
		this.movRight = movRight;
	}



	public boolean getMovLeft() {
		return movLeft;
	}



	public void setMovLeft(boolean movLeft) {
		this.movLeft = movLeft;
	}




}
