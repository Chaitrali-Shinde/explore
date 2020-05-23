package com.example.explore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_street, btn_market, btn_pinkFood, btn_pinkMarket, btn_delhiFood, btn_DelhiMarket;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_market= (Button)findViewById(R.id.market);
        btn_street= (Button)findViewById(R.id.street);

        btn_pinkMarket= (Button)findViewById(R.id.pinkmarket);
        btn_pinkFood= (Button)findViewById(R.id.pinkfood);

        btn_DelhiMarket= (Button)findViewById(R.id.delhimarket);
        btn_delhiFood= (Button)findViewById(R.id.delhifood);

        btn_market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMarketActivity();
            }
        });

        btn_street.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFoodActivity();
            }
        });

        btn_pinkMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPinkMarketActivity();
            }
        });

        btn_pinkFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPinkFoodActivity();
            }
        });

        btn_DelhiMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDelhiMarketActivity();
            }
        });

        btn_delhiFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDelhiFoodActivity();
            }
        });


    }

    public  void openMarketActivity(){
        Intent intend= new Intent(this, market.class);
        startActivity(intend);

    }

    public  void  openFoodActivity(){

        Intent intend= new Intent(this, street.class);
        startActivity(intend);
    }

    public  void openPinkMarketActivity(){
        Intent intend= new Intent(this, pinkstreet.class);
        startActivity(intend);

    }

    public  void  openPinkFoodActivity() {

        Intent intend = new Intent(this, pinkfood.class);
        startActivity(intend);

    }

    public  void openDelhiMarketActivity(){
        Intent intend= new Intent(this, delhistreet.class);
        startActivity(intend);

    }

    public  void  openDelhiFoodActivity(){

        Intent intend= new Intent(this, delhifood.class);
        startActivity(intend);
    }
}
