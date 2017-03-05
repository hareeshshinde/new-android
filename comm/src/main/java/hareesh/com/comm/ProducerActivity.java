package hareesh.com.comm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class ProducerActivity extends AppCompatActivity {
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

    }
}
