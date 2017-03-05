package hareesh.com.comm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ProducerActivity extends AppCompatActivity {
    public static final String KEY_RES = "result";
    protected static final String TAG= ProducerActivity.class.getCanonicalName();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producer);

        Intent intresponcible=getIntent();
        Bundle bundle=intresponcible.getExtras();
        if(bundle!= null) {
            String one = bundle.getString("keyOne");
            String two = bundle.getString("keyTwo");
            ((RadioButton)findViewById(R.id.radiored)).setText(one);
            ((RadioButton)findViewById(R.id.radioyellow)).setText(two);


        }

        Button btnbk= (Button)findViewById(R.id.btnback);
        btnbk.setOnClickListener(this::onBack);


    }

    private void onBack(View view)
    {

        Intent intent=new Intent();
        Bundle bundle=new Bundle();
        bundle.putString(KEY_RES,getSelectedText());
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);

        finish();
    }

    private String getSelectedText()
    {

       int id= ((RadioGroup)findViewById(R.id.radiogrp)).getCheckedRadioButtonId();
        return ((RadioButton)findViewById(id)).getText().toString();

    }
}
