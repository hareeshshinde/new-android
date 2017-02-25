package hareesh.com.myappwithxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static final String TAG =MainActivity.class.getCanonicalName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edttxt = (EditText) findViewById(R.id.txtuname);
        EditText textpsswd = (EditText) findViewById(R.id.paasswd);
        Button btnsubmit = (Button) findViewById(R.id.button);
        btnsubmit.setOnClickListener(new Click());


    }

    private class Click implements View.OnClickListener {

        public void onClick(View v) {
            EditText edttxt = (EditText) findViewById(R.id.txtuname);
            String data = edttxt.getText().toString();
            edttxt.setText(data.toUpperCase());
            Log.i(TAG,data);

        }

    }

    }

