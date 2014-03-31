package com.pesit.newproject;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
@SuppressLint("NewApi")
public class Map extends FragmentActivity implements OnCameraChangeListener{
	GoogleMap map;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		
		map = ((SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map1)).getMap();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map, menu);
		return true;
	}
	@Override
	public void onCameraChange(CameraPosition position)
	{
		System.out.println("lat="+position.target.latitude);
		System.out.println("lng="+position.target.longitude);
		Toast.makeText( getApplicationContext(), String.valueOf(position.target.latitude), Toast.LENGTH_SHORT).show();
		
	}
}
