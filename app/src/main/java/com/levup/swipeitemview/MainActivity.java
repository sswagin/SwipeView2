package com.levup.swipeitemview;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.levup.library.view.SwipeItemView;

public class MainActivity extends AppCompatActivity {

    private SwipeItemView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (SwipeItemView) findViewById(R.id.customView);

        View topView = new View(this);

        ViewCompat.setBackground(topView, new ColorDrawable(Color.GREEN));
        view.setTopContent(topView);

        View bottomView = new View(this);
        ViewCompat.setBackground(bottomView, new ColorDrawable(Color.RED));
        view.setBottomContent(bottomView);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        view.dispatchTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
