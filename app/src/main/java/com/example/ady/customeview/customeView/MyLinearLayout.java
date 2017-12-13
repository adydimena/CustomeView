package com.example.ady.customeview.customeView;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ady.customeview.R;

import static android.content.ContentValues.TAG;

/**
 * Created by Ady on 12/12/2017.
 */

public class MyLinearLayout extends LinearLayout {
    Context context;


    public MyLinearLayout(Context context) {
        super(context);

    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOrientation(LinearLayout.VERTICAL);
        init(context);
    }
    private void init(Context context) {
        final Display display = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();

    }

}
