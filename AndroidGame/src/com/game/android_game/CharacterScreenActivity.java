package com.game.android_game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.game.android_game.core.*;

public class CharacterScreenActivity extends Activity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.characterselect);
    }
	
	public void onSquareSelect(View v) {
		Toast.makeText( this, "selected square", Toast.LENGTH_LONG ).show();
		CoreGame.userCharacter = "square";
		Intent intent = new Intent(this, GameActivity.class);
		startActivity(intent);
	}
	
	public void onTriangleSelect(View v){
		Toast.makeText( this, "selected triangle", Toast.LENGTH_LONG ).show();
		CoreGame.userCharacter = "triangle";
		Intent intent = new Intent(this, GameActivity.class);
		startActivity(intent);
	}
	
	public void onCircleSelect(View v){
		Toast.makeText( this, "selected circle", Toast.LENGTH_LONG ).show();
		CoreGame.userCharacter = "circle";
		Intent intent = new Intent(this, GameActivity.class);
		startActivity(intent);
	}
}
