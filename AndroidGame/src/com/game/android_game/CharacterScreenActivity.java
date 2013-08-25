package com.game.android_game;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CharacterScreenActivity extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.characterselect);
    }
	
	public void onCharacterSelect(View v) {
		Toast.makeText( this, "awefawefawef", Toast.LENGTH_LONG ).show();
		System.out.print( this );
	}
}
