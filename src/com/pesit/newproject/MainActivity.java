package com.pesit.newproject;





import java.io.IOException;
import java.util.List;
import java.util.Locale;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.os.StrictMode;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.view.Menu;
import android.view.View;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.Button;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

@SuppressLint("NewApi")
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

		StrictMode.setThreadPolicy(policy); 
      
         Button b=(Button) findViewById(R.id.next);
         b.setOnClickListener(new OnClickListener() {
        	 
				@Override
				public void onClick(View arg0) {
					Intent n = new Intent(MainActivity.this,Map.class);		
					startActivity(n);
				
	
				}
	 
			});
         
	 
		
    }
    
}