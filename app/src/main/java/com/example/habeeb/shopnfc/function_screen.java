package com.example.habeeb.shopnfc;

import android.content.Intent;
import android.nfc.NfcAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class function_screen extends AppCompatActivity {
    NfcAdapter mNfcAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function_screen);
        ImageButton bt1,bt2;
        bt1= (ImageButton) findViewById(R.id.button3);
        bt2= (ImageButton) findViewById(R.id.button4);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mNfcAdapter!=null && mNfcAdapter.isEnabled())
                {
                    Intent intent3=new Intent(function_screen.this,cartscreen.class);
                    startActivity(intent3);
                }
                else
                {
                    Toast.makeText(function_screen.this, "Sorry!, NFC Not available", Toast.LENGTH_SHORT).show();

                }


            }
        });
        mNfcAdapter = NfcAdapter.getDefaultAdapter(this);



bt1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(mNfcAdapter!=null && mNfcAdapter.isEnabled())
        {
            Toast.makeText(function_screen.this, "NFC available", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(function_screen.this, "nfc Not available", Toast.LENGTH_SHORT).show();

        }

    }
});

    }
}
