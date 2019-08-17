package com.example.debarghya.splashing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreenActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splashscreenmaker);

        final ImageView imageView=(ImageView)findViewById(R.id.ImageView);
        final Animation a1= AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
        final Animation a2= AnimationUtils.loadAnimation(getBaseContext(),R.anim.antirotate);

        imageView.startAnimation(a2);
        a2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
               imageView.startAnimation(a1);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        a1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                Intent i=new Intent(getBaseContext(),MainActivity.class);
                startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

}