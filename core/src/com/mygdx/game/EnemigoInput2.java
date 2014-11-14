package com.mygdx.game;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class EnemigoInput2 extends InputListener{
	
	Enemigo2 enemigo2;
	
	EnemigoInput2(Enemigo2 ene2 ){
		super();
		enemigo2 = ene2;
	
	}
	
	
	

	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer,
			int button) {
		// TODO Auto-generated method stub
		System.out.println("Touch Down");
		enemigo2.remove();
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
