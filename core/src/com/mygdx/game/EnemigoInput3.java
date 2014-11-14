package com.mygdx.game;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class EnemigoInput3 extends InputListener{
	
	Enemigo3 enemigo3;
	
	EnemigoInput3(Enemigo3 ene3 ){
		super();
		enemigo3 = ene3;
	
	}
	
	
	




	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer,
			int button) {
		// TODO Auto-generated method stub
		System.out.println("Touch Down");
		enemigo3.remove();
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