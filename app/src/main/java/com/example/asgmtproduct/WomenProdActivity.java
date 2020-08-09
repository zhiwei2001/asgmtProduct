package com.example.asgmtproduct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WomenProdActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.example.asgmtproduct.extra.MESSAGE";

    private TextView nameWomenProd1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_prod);



    }
//    public void WomenProd1(View view) {
//
//        Intent intent = new Intent(this, SingleProdActivity.class);
//                    String message = nameWomenProd1.getText().toString();
//                    intent.putExtra(EXTRA_MESSAGE, message);
//                    startActivity(intent);
//
//    }
    public void WomenProd2(View view) {

        boolean checked = ((Button) view).isClickable();

        switch (view.getId()) {
            case R.id.womenprod2:
                if (checked)
                    startActivity(new Intent(this,SingleProdActivity.class));
                break;

            default:

                break;
        }
    }



}