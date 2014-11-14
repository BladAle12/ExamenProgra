package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


public class Enemigo3 extends Image{

	Enemigo3(Texture text){
		super(text);
		addListener(new EnemigoInput3(this));
	}
	
	public void act(float delta){
		super.act(delta);
		
		this.setY(this.getY()+5);
		this.setX(this.getX()+3);
	}
}