package com.lids.barscanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//ZXing imports
import com.google.zxing.integration.android.IntentIntegrator;

public class BarMain extends AppCompatActivity implements View.OnClickListener {

    //BarMain widgets
    private Button scanBtn, sendBtn;
    private TextView formatTxt, contentTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_main);

        //Instantiate BarMain widgets
        scanBtn = (Button) findViewById(R.id.scan_button);
        sendBtn = (Button) findViewById(R.id.send_button);
        formatTxt = (TextView) findViewById(R.id.scan_format);
        contentTxt = (TextView) findViewById(R.id.scan_content);

        //Set listener for buttons
        scanBtn.setOnClickListener(this);
        sendBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //If scan_button is clicked, begin scanning
        if (v.getId() == R.id.scan_button) {
            IntentIntegrator scanIntegrator = new IntentIntegrator(this);
            scanIntegrator.initiateScan(); //TODO: Scan only for book formats using args
        }


        //If send_button is clicked, send what's in the scan_content TextView
        else if(v.getId()==R.id.send_button){
            String isbn = contentTxt.getText().toString();
            // If the TextView is empty, warn the user and do nothing
            // Else there is something to send, so send it.
            if(isbn.equals("")){
                Toast noTextWarning = Toast.makeText(getApplicationContext(), "Nothing to send!", Toast.LENGTH_SHORT);
                noTextWarning.show();
            }
            else {
                //HttpPOSTRequest(isbn);
            }
        }
    }
}
