package com.example.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText gold_val;
    private EditText silver_val;
    private EditText stocks_val;
    private EditText cih_and_bank;
    private EditText loans_given;
    private EditText future_use_cash;

    private EditText borrowed_money;
    private EditText taxes_and_bills;

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gold_val=(EditText) findViewById(R.id.gold_val);
        silver_val=(EditText) findViewById(R.id.silver_val);
        stocks_val=(EditText) findViewById(R.id.stocks_val);
        cih_and_bank=(EditText) findViewById(R.id.cih_and_bank);
        loans_given=(EditText) findViewById(R.id.loans_given);
        future_use_cash=(EditText) findViewById(R.id.future_use_cash);

        borrowed_money=(EditText) findViewById(R.id.borrowed_money);
        taxes_and_bills=(EditText) findViewById(R.id.taxes_and_bills);

        result=(TextView) findViewById(R.id.result);
    }

    public void calculateZakat(View v) {
        String gold_valStr = gold_val.getText().toString();
        String silver_valStr = silver_val.getText().toString();
        String stock_valStr = stocks_val.getText().toString();
        String cih_and_bankStr = cih_and_bank.getText().toString();
        String loans_givenStr = loans_given.getText().toString();
        String future_use_cashStr = future_use_cash.getText().toString();

        String borrowed_moneyStr = borrowed_money.getText().toString();
        String taxes_and_billsStr = taxes_and_bills.getText().toString();

        if (gold_valStr != null && !"".equals(gold_valStr) && silver_valStr != null && !"".equals(silver_valStr) && stock_valStr != null && !"".equals(stock_valStr) && cih_and_bankStr != null && !"".equals(cih_and_bankStr) && loans_givenStr != null && !"".equals(loans_givenStr) && future_use_cashStr != null && !"".equals(future_use_cashStr) && borrowed_moneyStr != null && !"".equals(borrowed_moneyStr) && taxes_and_billsStr != null && !"".equals(taxes_and_billsStr)) {
            float goldValue = Float.parseFloat(gold_valStr);
            float silverValue = Float.parseFloat(silver_valStr);
            float stockValue = Float.parseFloat(stock_valStr);
            float cihbValue = Float.parseFloat(cih_and_bankStr);
            float loanValue = Float.parseFloat(loans_givenStr);
            float fcValue = Float.parseFloat(future_use_cashStr);

            float bmValue = Float.parseFloat(borrowed_moneyStr);
            float tbValue = Float.parseFloat(taxes_and_billsStr);

            float zakat = (goldValue+silverValue+stockValue+cihbValue+loanValue+fcValue-bmValue-tbValue)*0.025f;

            displayZakat(zakat);
        }
    }

    private void displayZakat(float zakat) {
        String zakatLabel="Your Payable Zakat: "+zakat;
        result.setText(zakatLabel);
    }
}