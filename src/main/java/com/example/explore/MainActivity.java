package com.example.explore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_street, btn_market;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_market= (Button)findViewById(R.id.market);
        btn_street= (Button)findViewById(R.id.street);

        btn_market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMarketActivity();
            }
        });

        btn_street.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStreetActivity();
            }
        });
    }

    public  void openMarketActivity(){
        Intent intend= new Intent(this, market.class);
        startActivity(intend);

    }

    public  void  openStreetActivity(){

        Intent intend= new Intent(this, street.class);
        startActivity(intend);
    }
}
