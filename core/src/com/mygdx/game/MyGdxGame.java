package com.mygdx.game;


import com.badlogic.gdx.ApplicationAdapter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.audio.*;

public class MyGdxGame extends ApplicationAdapter {
	
	SpriteBatch batch;	
	//private Sound sound;
	Stage stage,splash;
	Enemigo enemigo;
	Texture imag,img2;
	Enemigo2 enemigo2;
	int posx = 10, posy = 1, posy2 = 1;
	boolean mov1 = true, mov2= true, mov3= true;

	Enemigo3 enemigo3;
	Enemigo4 enemigo4;
	int frame=0;
	static boolean entro=false, cambiar;
	@Override
	public void create () {
		batch = new SpriteBatch();
		Image sp = new Image(new Texture("splash.jpg"));
		imag = new Texture("Fondo.jpg");
		Image fondo = new Image(imag);
		img2 = new Texture("cara.png");
		//sound = Gdx.audio.newSound(Gdx.files.internal("dont.mp3"));
		
		
		sp.setHeight(500);
		sp.setWidth(650);
		
		fondo.setHeight(500);
		fondo.setWidth(650);
		
		stage = new Stage();
		splash=new Stage();
		
		stage.addActor(fondo);
		splash.addActor(sp);
				
		Gdx.input.setInputProcessor(stage);
		agregarEnemigo();
	}

	public void agregarEnemigo(){
		Texture enemy = new Texture("p1.png");
		Texture enem = new Texture("p2.png");
		Texture ene = new Texture("cara.png");
		Texture en = new Texture("Spider.png");
		enemigo = new Enemigo(enemy);
		enemigo2 = new Enemigo2(enem);
		enemigo3 = new Enemigo3(ene);
		enemigo4 = new Enemigo4(en);
		
		stage.addActor(enemigo);
		stage.addActor(enemigo2);
		stage.addActor(enemigo3);
		stage.addActor(enemigo4);
		
	}
	
	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 150, 255, 100);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.draw();
		stage.act();
		splash.draw();
		splash.act();
		
		batch.begin();
		batch.draw(img2, posx, posy);
		batch.end();
		
		if(Gdx.input.justTouched()){
			entro = true;
		}
		if(entro){
			stage.draw();
			stage.act();
		}
		
		
		if(frame % 150==0){
			agregarEnemigo();	
		
		}
		frame++;
	
		
		if(posy < 500 && mov1==true){
			posy++;
			}else{
				mov1 = false;
				posy--;
			}
		
		
		
		if (posy2 < 200 && mov2 == true){
			posy2++;
			}
		else{
				mov2 = false;
				posy2--;
			}
		
		if(posy2==1){
				mov2 = true;
		}
		
		if(posx<500 && mov3 == true){
			posx+=1;
			}else{
			posx-=1;
			mov3 = false;
		}
		if(posx == 300){
			mov3 = true;
		}

	}
	
}
