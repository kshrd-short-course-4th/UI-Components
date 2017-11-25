package com.example.rathana.constraintlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvMessage=findViewById(R.id.tvMessage);
        Button btnLogin=findViewById(R.id.btnClick);
        //btnLogin.setOnClickListener(this);
        tvMessage.setText("Hello");

        Button btnOk=findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "Button OK clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId() ){
            case R.id.btnClick :{
                //Toast.makeText(SecondActivity.this, "Button Login is clicked", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }

    public void onLogin(View v){
        Toast.makeText(SecondActivity.this, "Button Login is clicked", Toast.LENGTH_SHORT).show();
    }
}
