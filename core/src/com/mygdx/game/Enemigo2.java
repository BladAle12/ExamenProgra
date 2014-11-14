package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Enemigo2 extends Image{

	Enemigo2(Texture text){
		super(text);
		addListener(new EnemigoInput2(this));
	}
	
	public void act(float delta){
		super.act(delta);
		this.setY(this.getY()+3);
	}
}
	