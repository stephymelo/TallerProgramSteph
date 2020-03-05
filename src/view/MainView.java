package view;

import processing.core.PApplet;

//extend Thread libreria ...
//sprits movimiento imagenes

public class MainView extends PApplet {

	private int pantalla;
	private ScreenOneView screenOView;
	private ScreenGameView screenGView;
	private ScreenGameoverView screenGOView;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.MainView");
	}


	public void settings() {
		size(500,800);
		pantalla=0;

		//



	}


	public void setup() {

		screenOView = new ScreenOneView(this);
		screenGView = new ScreenGameView(this);
		screenGOView = new ScreenGameoverView(this);
		

	}



	public void draw() {
		background(0);


		switch (pantalla) {

		case 0:

			screenOView.drawScreen();

			break;
		case 1:

			screenGView.drawScreen();
			break;

		case 2:

			screenGOView.drawScreen();
			break;



		}


	}




	public void mouseClicked() {

		if (dist(mouseX,mouseY,screenOView.getPosXRect()+100,screenOView.getPosYRect())<100) {
			pantalla=1;
		}

	}

	public void keyPressed() {

		screenGView.getMovRight();
		screenGView.getMovLeft();
		switch(key) {

		case 'a':
		case 'A':
			screenGView.setMovRight(true);





			break;

		case 'd':
		case 'D':


			screenGView.setMovLeft(true);


			break;
		case ' ':
			screenGView.drawShooter();
			
		}



	}
	public void keyReleased() {
		switch(key) {

		case 'a':
		case 'A':

			screenGView.setMovRight(false);



			break;

		case 'd':
		case 'D':

			screenGView.setMovLeft(false);



			break;
		
		}
	}
}
