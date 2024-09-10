package com.srijan.empmgmt;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;

import java.util.Objects;

import br.com.simplepass.loadingbutton.customViews.CircularProgressImageButton;

public class Login extends AppCompatActivity {

    AnimationDrawable animationDrawable;
    ConstraintLayout constraintLayout;
    CircularProgressImageButton btn;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        constraintLayout=findViewById(R.id.containerLogin);
        btn=findViewById(R.id.login);

    }
    public void doLogin(View v){
        //todo pass login fields!
        btn.startAnimation();
        new Handler().postDelayed(()-> {
            btn.stopAnimation();
            finish();
        },2000);
    }
}
