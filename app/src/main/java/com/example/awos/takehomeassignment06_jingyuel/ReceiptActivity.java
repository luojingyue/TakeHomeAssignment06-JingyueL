package com.example.awos.takehomeassignment06_jingyuel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiptActivity extends AppCompatActivity {
    private String finalMessage;
    private double amount;
    private double tipPercentage;
    private double taxPercentage;
    private double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);
        TextView showArea=(TextView)findViewById(R.id.show_area);
        setTitle("Your Receipt");
        Intent intent=getIntent();
        amount=intent.getDoubleExtra("total",0);
        taxPercentage=intent.getDoubleExtra("tax",0);
        tipPercentage=intent.getDoubleExtra("tip",0);
        total=amount*(1+taxPercentage+tipPercentage);
        finalMessage="Total: "+amount;
        finalMessage+="\nSales Tax:"+(taxPercentage*amount);
        finalMessage+="\nTip: "+(tipPercentage*amount);
        finalMessage+="\nGrand Total: "+total;
        showArea.setText(finalMessage);


    }
}