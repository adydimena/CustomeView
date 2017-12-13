package com.example.ady.customeview.customeView;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;


import com.example.ady.customeview.R;

import static android.content.ContentValues.TAG;

/**
 * Created by Ady on 12/12/2017.
 */

public class CustomeRectagle extends View{
    int side1;
    int side2;
    int ColorFill;
    int top, left,button,right;
    Context context;
    public CustomeRectagle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.custom_circle,0,0);
        ColorFill= typedArray.getColor(R.styleable.custom_rectangle_ColorFill,0);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(ColorFill);


        canvas.drawRect(0,0,(right*2)/2,(button*2)/2,paint);
    }



    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int desiredWidth = 300;
        int desiredHeight = 300;

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);


        //Measure Width
        if (widthMode == MeasureSpec.EXACTLY) {
            //Must be this size
            right = widthSize;
        } else if (widthMode == MeasureSpec.AT_MOST) {
            //Can't be bigger than...
           right = Math.min(desiredWidth, widthSize);
        } else {
            //Be whatever you want
            right = desiredWidth;
        }
        //Measure Height
        if (heightMode == MeasureSpec.EXACTLY) {
            //Must be this size
            button = heightSize;
        } else if (heightMode == MeasureSpec.AT_MOST) {
            //Can't be bigger than...
            button = Math.min(desiredHeight, heightSize);
        } else {
            //Be whatever you want
            button = desiredHeight;
        }

        Log.d(TAG, "onMeasure: width" + right);
        Log.d(TAG, "onMeasure: height" + button);
        top = 1;
        left = 1;
        setMeasuredDimension(right, button);

    }

}
