package com.yanjiabin.multifunctionproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img);
//        setAlpha();
        setRotation();
    }

    private void setRotation() {
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360,  //从哪旋转，旋转多少度
                Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF,
                1.0f);
        rotateAnimation.setDuration(2000);
        rotateAnimation.setFillAfter(true);
        img.startAnimation(rotateAnimation);
    }

    public void setAlpha(){
        AlphaAnimation alphaAnimation = new AlphaAnimation(0,0.8f);
        alphaAnimation.setDuration(2000);
        alphaAnimation.setFillAfter(true);
        img.startAnimation(alphaAnimation);
    }
}
