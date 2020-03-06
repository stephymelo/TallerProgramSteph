package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Juego {

	private Invasor[][] invasor;
	private ArrayList<Bala> bala;
	private Hero hero;
	private int row;
	private int col;
	private boolean firstRow, secondRow, thirdRow;

	public Juego(PApplet app) {
		this.row = 3;
		this.col = 3;
		firstRow = true;
		secondRow = false;
		thirdRow = false;

		bala = new ArrayList<Bala>();

		invasor = new Invasor[row][col];

		hero = new Hero(210, 700, 50, 50, 3, app);

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				invasor[i][j] = new Invasor(130 + (50 + 50) * i, 100 + (20 + 40) * j, 30, 30, 16, app);
			}
		}

	}

	public void drawInvasores(PApplet app) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				invasor[i][j].pintarInvasor();

				if (app.frameCount % 20 == 0) {
					invasor[i][j].movimientoInvasor();

				}
				

			}
		}
	}

	public void eliminarInvasor(PApplet app) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				for (int k = 0; k < bala.size(); k++) {
					Bala b = bala.get(k);
					
					
					
					
					if (PApplet.dist(b.getPosX(), b.getPosY(), invasor[2][2].getPosX() - 15,
							invasor[2][2].getPosY()) < 100) {
						invasor[2][2].setColor(app.color(0,0,0,1));
					
						if(firstRow=true) {
						
							}
						

					}
					
					
					if (PApplet.dist(b.getPosX(), b.getPosY(), invasor[0][2].getPosX() - 15,
							invasor[0][2].getPosY()) < 100) {
						invasor[0][2].setColor(app.color(0,0,0,1));
					
						if(firstRow=true) {
							
							}
						

					}
					if (PApplet.dist(b.getPosX(), b.getPosY(), invasor[1][2].getPosX() - 15,
							invasor[1][2].getPosY()) < 100&&firstRow==true) {
						invasor[1][2].setColor(app.color(0,0,0,1));
						
				
						
					}
					
					
					
				if(invasor[1][2].getColor()==app.color(0,0,0,1) &&invasor[0][2].getColor()==app.color(0,0,0,1)&&invasor[2][2].getColor()==app.color(0,0,0,1)) {
					
					firstRow=false;
					
					if(firstRow==false) {
					
					if (PApplet.dist(b.getPosX(), b.getPosY(), invasor[1][1].getPosX() - 15,
							invasor[1][1].getPosY()) < 100) {
						invasor[1][1].setColor(app.color(0,0,0,1));
						secondRow=true;

					}
					if (PApplet.dist(b.getPosX(), b.getPosY(), invasor[0][1].getPosX() - 15,
							invasor[0][1].getPosY()) < 100) {
						invasor[0][1].setColor(app.color(0,0,0,1));
						secondRow=true;
					}	
					if (PApplet.dist(b.getPosX(), b.getPosY(), invasor[2][1].getPosX() - 15,
							invasor[2][1].getPosY()) < 100) {
						invasor[2][1].setColor(app.color(0,0,0,1));
						secondRow=true;

					}
					}
					
					}
				if(invasor[2][1].getColor()==app.color(0,0,0,1) &&invasor[1][1].getColor()==app.color(0,0,0,1)&&invasor[0][1].getColor()==app.color(0,0,0,1)) {
					secondRow=false;
					
					if (PApplet.dist(b.getPosX(), b.getPosY(), invasor[1][0].getPosX() - 15,
							invasor[1][0].getPosY()) < 100) {
						invasor[1][0].setColor(app.color(0,0,0,1));
						

					}
					
					if (PApplet.dist(b.getPosX(), b.getPosY(), invasor[0][0].getPosX() - 15,
							invasor[0][0].getPosY()) < 100) {
						invasor[0][0].setColor(app.color(0,0,0,1));
					}
					if (PApplet.dist(b.getPosX(), b.getPosY(), invasor[2][0].getPosX() - 15,
							invasor[2][0].getPosY()) < 100) {
						invasor[2][0].setColor(app.color(0,0,0,1));
					
						

					}
				}
//				if(invasor[2][0].getColor()==app.color(0,0,0,1) &&invasor[0][0].getColor()==app.color(0,0,0,1)&&invasor[1][0].getColor()==app.color(0,0,0,1)) {
//				thirdRow=false;	
//				}
				}
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
	
	
	public void reinicarOla(PApplet app){

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
		if(invasor[i][j].getColor()==app.color(0,0,0,1)&&invasor[i][j].getPosY() + 80 >= 800) {
			invasor[i][j].setPosY(100);
			invasor[i][j].setColor(app.color(255,255,0,300));
			hero.setVida(3);
			
		}
		
		
		
		
			}
		}
	}

	public void shootBala(PApplet app) {
		bala.add(new Bala(hero.getPosX() + 20, hero.getPosY(), 10, 20, 5, app));
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

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				if (invasor[i][j].getPosY() + 80 >= 800&&invasor[i][j].getColor()==app.color(255,255,0,300)) {
					hero.perderVida();

				}
			}
		}
	}

	

}
