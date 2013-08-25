package com.game.android_game;

import android.app.Activity;
import android.os.Bundle;

public class GameActivity extends Activity {
	//Sprite userSprite = new Sprite(x, y, textureRegion, vertexBufferObjectManager);
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
    }
}
