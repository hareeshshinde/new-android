package hareesh.com.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnrotate).setOnClickListener(v -> anim(R.anim.rotate));
    }
    private void anim(int res)
    {
        Animation animation = AnimationUtils.loadAnimation(this , res);
        findViewById(R.id.imgrotate).startAnimation(animation);
    }
}
