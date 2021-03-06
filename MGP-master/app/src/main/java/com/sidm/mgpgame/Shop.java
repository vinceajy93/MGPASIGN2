package com.sidm.mgpgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class Shop extends Activity implements OnClickListener {

    private Button btn_level1;
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);// hide title
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //hide top bar


        setContentView(R.layout.shop);

        btn_level1 = (Button) findViewById(R.id.btn_lv1);
        btn_level1.setOnClickListener(this);

        btn_back = (Button) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent();

        if (v == btn_level1) {
            intent.setClass(this, Gamepage.class);
            finish();
        }
        else if (v == btn_back){
            intent.setClass(this, Homepage.class);
            finish();
        }
        startActivity(intent);
        onDestroy();
    }

    //pause
    protected void onPause() {
        super.onPause();
    }

    //stop application
    protected void onStop() {
        super.onStop();
    }

    //destroy when not in use
    protected void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        Intent intent = new Intent();
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {
            intent.setClass(this, Homepage.class);
        }
        finish();
        return super.onKeyDown(keyCode, event);
    }
}
