package hareesh.com.addnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1=(EditText) findViewById(R.id.num1);
        EditText num2=(EditText) findViewById(R.id.num2);
        EditText result=(EditText) findViewById(R.id.result);
        Button okbtn=(Button) findViewById(R.id.btnok);

        okbtn.setOnClickListener(this::addnumber);




    }


    public void addnumber(View view)
    {
        int n1,n2,sum;
        EditText num1=(EditText) findViewById(R.id.num1);
        EditText num2=(EditText) findViewById(R.id.num2);
        EditText result=(EditText) findViewById(R.id.result);

        n1=Integer.parseInt(num1.getText().toString());
        n2=Integer.parseInt(num2.getText().toString());
        sum = n1 + n2;
        result.setText(Integer.toString(sum));







    }
}
