package com.example.parix.travelcalculate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Parix on 3/11/2016.
 */
public class MainActivity extends Activity {


    private Button btnNew;
    private Button btnExisting;
    private Button btnCurrent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        btnCurrent = (Button) findViewById(R.id.btnCurrent);
        btnCurrent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 =  new Intent(getApplicationContext(),CurrentTravel.class);
                startActivity(in1);
            }
        });

    }


}
