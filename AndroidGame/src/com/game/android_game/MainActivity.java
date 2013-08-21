package com.game.android_game;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onClickGame(View v) {
    	Toast.makeText(this, "User will now select their character", Toast.LENGTH_LONG).show();
    	Intent intent = new Intent(this, CharacterScreenActivity.class);
    	startActivity(intent);
    	}

    	public void onClickHowto(View v) {
    	  Toast.makeText(this, "You clicked on Howto!", Toast.LENGTH_LONG).show();
    	  Intent intent = new Intent(this, HowtoActivity.class);
    	  startActivity(intent);
    	}

    	public void onClickCredits(View v) {
    	  Toast.makeText(this, "You clicked on Credits!", Toast.LENGTH_LONG) .show();
    	  Intent intent = new Intent(this, CreditsActivity.class);
    	  startActivity(intent);
    	}
    
}
