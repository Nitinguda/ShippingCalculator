package edu.niu.cs.z1760203.shippingcalculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HelpActivity extends Activity {

    //defining the onCreate method
    //Called when the activity is first created.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }//onCreate ends here

    //defining the method to go back to the home page

    public void goBack( View v)
    {
        finish();
    }

}//activity ends
