package com.mygdx.game;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class EnemigoInput extends InputListener{
	
	Enemigo enemigo;
	
	EnemigoInput(Enemigo ene){
		super();
		enemigo = ene;
	
	}
	
	
	
	

	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer,
			int button) {
		// TODO Auto-generated method stub
		System.out.println("Touch Down");
		enemigo.remove();
		return super.touchDown(event, x, y, pointer, button);
	}
	
	@Override
	public void touchUp(InputEvent event, float x, float y, int pointer,
			int button) {
		// TODO Auto-generated method stub
		System.out.println("Touch Up");
		super.touchUp(event, x, y, pointer, button);
	}
}
