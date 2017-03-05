package hareesh.com.comm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnmango=(Button)findViewById(R.id.btnmango);
        btnmango.setOnClickListener(this::onMango);

        Button btand=(Button)findViewById(R.id.btnandroid);
        btand.setOnClickListener(this::onAndroid);


    }

    public void onMango(View v)
    {
        Class cls=ProducerActivity.class;
        Intent intnt = new Intent(this,cls);
        Bundle bundle =new Bundle();
        bundle.putString("keyOne","mangoOne");
        bundle.putString("keyTwo","mangoTwo");
        intnt.putExtras(bundle);
        startActivity(intnt);
    }

    public void onAndroid(View v)
    {

        Class cls=ProducerActivity.class;
        Intent intnt = new Intent(this,cls);
        Bundle bundle =new Bundle();
        bundle.putString("keyOne","androidOne");
        bundle.putString("keyTwo","androidTwo");
        intnt.putExtras(bundle);

        startActivity(intnt);
    }
}
