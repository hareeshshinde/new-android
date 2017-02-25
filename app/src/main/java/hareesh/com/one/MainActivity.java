package hareesh.com.one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout.LayoutParams paramroot=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout layout=new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(paramroot);

        LinearLayout.LayoutParams paramedt=new LinearLayout.LayoutParams(500,200);
        EditText edttxt=new EditText(this);
        edttxt.setLayoutParams(paramedt);

        LinearLayout.LayoutParams parambtn=new LinearLayout.LayoutParams(500,200);
        Button btn=new Button(this);
        btn.setLayoutParams(parambtn);
        btn.setText("submit");

        layout.addView(edttxt);
        layout.addView(btn);

        setContentView(layout);




    }
}
