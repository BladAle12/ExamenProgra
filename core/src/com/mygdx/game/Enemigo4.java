package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Enemigo4 extends Image{

	Enemigo4(Texture text){
		super(text);
		addListener(new EnemigoInput4(this));
	}
	
	public void act(float delta){
		super.act(delta);
		this.setX(500);
		//this.setY(200);

		this.setX(this.getX()-3);

		//this.setY(this.getY()-3);
	}
}
