package com.example.asgmtproduct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;

public class SingleProdActivity extends AppCompatActivity {
    EditText edittext;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_prod);


//
////        if (WomenProdActivity.WomenProd1.Clicked) {
//            Intent intent = getIntent();
//            String message = intent.getStringExtra(WomenProdActivity.EXTRA_MESSAGE);
//            TextView textview = findViewById(R.id.txtDesc);
//            textview.setText(message);
////        }
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.send_message, Toast.LENGTH_SHORT);
        toast.show();
        edittext=findViewById(R.id.txtComment);
        edittext.setText("");
    }
}