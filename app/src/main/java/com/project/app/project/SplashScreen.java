package com.project.app.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_3_wsd);
        TextView user = findViewById(R.id.user);
        TextView admin = findViewById(R.id.admin);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  =  new Intent(SplashScreen.this,UserRegistration.class);
                startActivity(i);
            }
        });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  =  new Intent(SplashScreen.this,AdminRegistration.class);
                startActivity(i);
            }
        });
    }
}
