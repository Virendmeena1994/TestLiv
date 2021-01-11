package com.virend.sir.wao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ShowMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);
    }


    public void showData(String message){

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
