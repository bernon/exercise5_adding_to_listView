package com.example.exercise5_adding_to_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class second_activity extends AppCompatActivity {
    EditText et;
    Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        et = (EditText) findViewById(R.id.et);
        btn_add = (Button) findViewById(R.id.btn);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "dataaa";

               /* Intent passdata_intent = new Intent(this, activity_main.class);
                passdata_intent.putExtra("firstdata", data);

                startActivity(passdata_intent);*/
            }
        });
    }
}
