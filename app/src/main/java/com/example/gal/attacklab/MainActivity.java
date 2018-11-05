package com.example.gal.attacklab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button switchToCamera;
    private void onButton()
    {
        switchToCamera = (Button)findViewById(R.id.btnCam);
        switchToCamera.setOnClickListener(new View.OnClickListener()
                              {
                                  @Override
                                  public void onClick(View v)
                                  {
                                      Intent i = new Intent("com.example.gal.attacklab.CameraActivity");
                                      startActivity(i);
                                  }
                              }
        );
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButton();
    }
}
