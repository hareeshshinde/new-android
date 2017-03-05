package hareesh.com.comm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


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
        startActivityForResult(intnt,4561);
    }

    public void onAndroid(View v)
    {

        Class cls=ProducerActivity.class;
        Intent intnt = new Intent(this,cls);
        Bundle bundle =new Bundle();
        bundle.putString("keyOne","androidOne");
        bundle.putString("keyTwo","androidTwo");
        intnt.putExtras(bundle);

        startActivityForResult(intnt,4561);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode  == 4561) {
            if(resultCode == RESULT_OK) {

                ((TextView)findViewById(R.id.txtharry)).setText(data.getStringExtra(ProducerActivity.KEY_RES));
              /*  Bundle bundle = data.getExtras();
                if(bundle != null)
                    ((TextView)findViewById(R.id.txtRes)).setText(bundle.getString(ProducerActivity.KEY_RES));*/
            }
        }
    }
}
