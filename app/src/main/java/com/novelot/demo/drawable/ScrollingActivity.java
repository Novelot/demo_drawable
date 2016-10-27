package com.novelot.demo.drawable;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class ScrollingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_scrolling);

        //
        clip();
        //
        findViewById(R.id.v_selector).setSelected(true);
    }

    //Clip Demo
    private ImageView ivClip;
    public int mDrawableLevel = 0;

    private void clip() {
        Button btnClip = (Button) findViewById(R.id.btnClip);
        ivClip = (ImageView) findViewById(R.id.ivClip);
        btnClip.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (mDrawableLevel >= 10000) {
                    mDrawableLevel = 0;
                }
                mDrawableLevel += 1000;

                Drawable drawable = ivClip.getDrawable();
                drawable.setLevel(mDrawableLevel);
            }
        });
    }

}
