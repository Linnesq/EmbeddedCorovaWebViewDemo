package uk.co.richardgilmour.embeddedcorovawebviewdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NativeActivity extends Activity implements OnClickListener {
	
	private Button start_cordova_activity_btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_native);
		start_cordova_activity_btn = (Button) findViewById(R.id.invoke_cordova_activity_btn);
		start_cordova_activity_btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		if (view.getId() == R.id.invoke_cordova_activity_btn){
			startCordovaActivity();
		}
	}

	private void startCordovaActivity() {
		Intent intent = new Intent(getApplicationContext(), CordovaActivity.class);
		startActivity(intent);		
	}
}
