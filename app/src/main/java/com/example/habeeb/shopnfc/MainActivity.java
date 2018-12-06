package com.example.habeeb.shopnfc;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity   {


    NfcAdapter mNfcAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1,b2;
        b1= (Button) findViewById(R.id.button5);
        b2= (Button) findViewById(R.id.button6);



        b2.setOnClickListener(v -> {
            Intent intent2 = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intent2);
        });
        b1.setOnClickListener(v -> {
           Intent intent1 = new Intent(MainActivity.this,function_screen.class);
           startActivity(intent1);
        });
        //mNfcAdapter = NfcAdapter.getDefaultAdapter(this);




    }


}
