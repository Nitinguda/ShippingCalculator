package edu.niu.cs.z1760203.shippingcalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends Activity {


    //data memebers

    private ShipItem itemShipped;
    private EditText weightET;
    private TextView baseCostTV, addedCostTV, totslCostTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    itemShipped = new ShipItem();

        //connect text and screen items

        weightET = (EditText) findViewById(R.id.weighttxt);
        baseCostTV = (TextView)findViewById(R.id.baseCost);
        addedCostTV = (TextView) findViewById(R.id.additionalCost);
        totslCostTV = (TextView)findViewById(R.id.totalCost);

        //set up listener for Edittext

        weightET.addTextChangedListener(weightTextWatcher);


    }

    private TextWatcher weightTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try{
                itemShipped.setWeight(Integer.parseInt(s.toString()));
            }

            catch(NumberFormatException e){
                itemShipped.setWeight(0);
            }

            displayResult();

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };


    private  void displayResult()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        baseCostTV.setText("$" + df.format(itemShipped.getBaseCost()));
        addedCostTV.setText("$" + df.format(itemShipped.getAddedCost()));
        totslCostTV.setText("$" + df.format(itemShipped.getTotalCost()));

    }

    public void showHelp( View v)
    {
        Intent helpIntent = new Intent(MainActivity.this, HelpActivity.class);
        startActivity(helpIntent);
    }




}
