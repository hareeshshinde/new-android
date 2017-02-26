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
        Button btnsub=(Button) findViewById(R.id.btnsub);
        Button btnmul=(Button) findViewById(R.id.btnmul);
        Button btndiv=(Button) findViewById(R.id.btndiv);

        okbtn.setOnClickListener(this::addnumber);
        btnsub.setOnClickListener(this::subnum);
        btnmul.setOnClickListener(this::mulnum);
        btndiv.setOnClickListener(this::divnum);





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

    public void subnum(View view)
    {
        int n1,n2,sub;
        EditText num1=(EditText) findViewById(R.id.num1);
        EditText num2=(EditText) findViewById(R.id.num2);

        EditText result=(EditText) findViewById(R.id.result);

        n1=Integer.parseInt(num1.getText().toString());
        n2=Integer.parseInt(num2.getText().toString());
        sub = n1 - n2;
        result.setText(Integer.toString(sub));

    }

    public void mulnum(View view)
    {
        int n1,n2,mul;
        EditText num1=(EditText) findViewById(R.id.num1);
        EditText num2=(EditText) findViewById(R.id.num2);

        EditText result=(EditText) findViewById(R.id.result);

        n1=Integer.parseInt(num1.getText().toString());
        n2=Integer.parseInt(num2.getText().toString());
        mul = n1 * n2;
        result.setText(Integer.toString(mul));

    }

    public void divnum(View view)
    {
        int n1,n2,div;
        EditText num1=(EditText) findViewById(R.id.num1);
        EditText num2=(EditText) findViewById(R.id.num2);

        EditText result=(EditText) findViewById(R.id.result);

        n1=Integer.parseInt(num1.getText().toString());
        n2=Integer.parseInt(num2.getText().toString());
        div = n1 / n2;
        result.setText(Integer.toString(div));

    }
}
