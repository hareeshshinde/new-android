package hareesh.com.sbts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView web=(WebView) findViewById(R.id.sbtsweb);
        WebSettings webset=web.getSettings();
        webset.setJavaScriptEnabled(true);
        web.loadUrl("http://silverbelltreeschool.edu.in/index.php");
        web.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {

        if(web.canGoBack())
        {
            web.goBack();
        }
        else
        {
            super.onBackPressed();
        }

    }
}
