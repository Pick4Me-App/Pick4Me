package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= (Button) findViewById(R.id.password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPassword();
            }
        });

        btn=(Button) findViewById((R.id.registration));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openResgistration();
            }
        });

    }

    public void openPassword()
    {
        Intent intent = new Intent(this,password.class );
        startActivity(intent);
    }

    public void openResgistration()
    {
        Intent intas = new Intent(this,registration.class);
        startActivity(intas);
    }
}


