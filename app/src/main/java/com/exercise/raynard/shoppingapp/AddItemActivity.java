package com.exercise.raynard.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddItemActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM = "com.mmithb.developer.shoppingapp.extra.ITEM";

    private Button btnApple;
    private Button btnCheese;
    private Button btnRice;
    private Button btnPotato;
    private Button btnCorn;
    private Button btnGrape;
    private Button btnBanana;
    private Button btnTomato;
    private Button btnCabbage;
    private Button btnChili;

    private String itemText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

//        ButterKnife.bind(this);
        btnApple = findViewById(R.id.btnApple);
        btnCheese = findViewById(R.id.btnCheese);
        btnRice = findViewById(R.id.btnRice);
        btnPotato = findViewById(R.id.btnPotato);
        btnCorn = findViewById(R.id.btnCorn);
        btnGrape = findViewById(R.id.btnGrape);
        btnBanana = findViewById(R.id.btnBanana);
        btnTomato = findViewById(R.id.btnTomato);
        btnCabbage = findViewById(R.id.btnCabbage);
        btnChili = findViewById(R.id.btnChili);

    }

    public void sendItem(String itemText){
        //BIKIN INTENT BARU (KOSONHG)
        Intent itemIntent = new Intent();
        itemIntent.putExtra(EXTRA_ITEM,itemText);
        setResult(RESULT_OK,itemIntent);
        finish();
    }

    public void addApple(View view) {
        itemText = btnApple.getText().toString();
        sendItem(itemText);
    }

    public void addCheese(View view) {
        itemText = btnCheese.getText().toString();
        sendItem(itemText);
    }

    public void addRice(View view) {
        itemText = btnRice.getText().toString();
        sendItem(itemText);
    }

    public void addPotato(View view) {
        itemText = btnPotato.getText().toString();
        sendItem(itemText);
    }

    public void addCorn(View view) {
        itemText = btnCorn.getText().toString();
        sendItem(itemText);
    }

    public void addGrape(View view) {
        itemText = btnGrape.getText().toString();
        sendItem(itemText);
    }

    public void addBanana(View view) {
        itemText = btnBanana.getText().toString();
        sendItem(itemText);
    }

    public void addTomato(View view) {
        itemText = btnTomato.getText().toString();
        sendItem(itemText);
    }

    public void addCabbage(View view) {
        itemText = btnCabbage.getText().toString();
        sendItem(itemText);
    }

    public void addChili(View view) {
        itemText = btnChili.getText().toString();
        sendItem(itemText);
    }
}
