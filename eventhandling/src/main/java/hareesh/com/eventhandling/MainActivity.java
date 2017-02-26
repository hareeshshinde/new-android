package hareesh.com.eventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnupper =(Button) findViewById(R.id.btnupper);
        Button btnlower =(Button) findViewById(R.id.btnlower);
        //btnupper.setOnClickListener(new Click());
       /* btnupper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText edtAnyName = (EditText) findViewById(R.id.textname);
                String data = edtAnyName.getText().toString();
                edtAnyName.setText(data.toUpperCase());
            }
        });


        btnlower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText edtAnyName = (EditText) findViewById(R.id.textname);
                String data = edtAnyName.getText().toString();
                edtAnyName.setText(data.toLowerCase());
            }
        });*/


        /*btnupper.setOnClickListener(view ->{makeUpperCase(view);});
        btnlower.setOnClickListener(view ->{makeLowerCase(view);});*/
        btnupper.setOnClickListener(this::makeUpperCase);
        btnlower.setOnClickListener(this::makeLowerCase);

    }


    public void makeUpperCase(View view){
        EditText edtAnyName = (EditText) findViewById(R.id.textname);
        String data = edtAnyName.getText().toString();
        edtAnyName.setText(data.toUpperCase());
    }
    public void makeLowerCase(View view){
        EditText edtAnyName = (EditText) findViewById(R.id.textname);
        String data = edtAnyName.getText().toString();
        edtAnyName.setText(data.toLowerCase());
    }
}
