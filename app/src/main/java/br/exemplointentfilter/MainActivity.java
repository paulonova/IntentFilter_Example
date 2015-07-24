package br.exemplointentfilter;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void triggerScreenAction(View view){
		Intent intent = new Intent("SCREEN_ACTION");
		startActivity(intent);
	}
	
	public void triggerScreenActionCategory(View view){
		Intent intent = new Intent("SCREEN_ACTION");
		intent.addCategory("CATEGORY_SCREEN");
		startActivity(intent);
	}
	
	public void openNavigator(View view){
		
		Uri uri = Uri.parse("https://www.google.se/");
		
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		
		startActivity(intent);
	}
}
